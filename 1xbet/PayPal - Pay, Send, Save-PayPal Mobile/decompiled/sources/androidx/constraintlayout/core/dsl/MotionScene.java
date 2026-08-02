package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class MotionScene {
    java.util.ArrayList<androidx.constraintlayout.core.dsl.Transition> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.constraintlayout.core.dsl.ConstraintSet> getHighSpeedVideoSizes = new java.util.ArrayList<>();

    public void addTransition(androidx.constraintlayout.core.dsl.Transition transition) {
        this.getHighSpeedVideoFpsRanges.add(transition);
    }

    public void addConstraintSet(androidx.constraintlayout.core.dsl.ConstraintSet constraintSet) {
        this.getHighSpeedVideoSizes.add(constraintSet);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\n");
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            sb.append("Transitions:{\n");
            java.util.Iterator<androidx.constraintlayout.core.dsl.Transition> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            java.util.Iterator<androidx.constraintlayout.core.dsl.ConstraintSet> it2 = this.getHighSpeedVideoSizes.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
