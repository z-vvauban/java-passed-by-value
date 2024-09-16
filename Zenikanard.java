/**
 * https://javachallengers.com/dragon-warrior-reference-java-challenge
 */
public class Zenikanard {

    public static void main(String[] args) {
        //Mutable
        StringBuilder zenikanardProfession = new StringBuilder("Developer");
        //Immutable
        String zenikanardSkill = "Java";

        changeZenikanardClass(zenikanardProfession,zenikanardSkill);

        System.out.println("Zenikanard="+ zenikanardProfession+ " Skill="+zenikanardSkill);
    }

    private static void changeZenikanardClass(StringBuilder zenikanardProfession, String skill) {
        //Object is mutable, so the real object will be changed
        zenikanardProfession.append("Lead");
        //Object is immutable, so the real object will not be changed
        skill = skill+" 23";

        //We pass null to the variables, but not to the objects
        //The objects will remain the same as long as they are still accessible externally
        // --in this case through the main method.
        // And, although the local variables will be null, nothing will happen to the objects
        skill=null;
        zenikanardProfession=null;
    }
}
