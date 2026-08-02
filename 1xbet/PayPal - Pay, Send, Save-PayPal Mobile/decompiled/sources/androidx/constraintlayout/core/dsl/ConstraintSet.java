package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class ConstraintSet {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    java.util.ArrayList<androidx.constraintlayout.core.dsl.Constraint> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.constraintlayout.core.dsl.Helper> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();

    public ConstraintSet(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public void add(androidx.constraintlayout.core.dsl.Constraint constraint) {
        this.getHighSpeedVideoFpsRanges.add(constraint);
    }

    public void add(androidx.constraintlayout.core.dsl.Helper helper) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(helper);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(":{\n");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            java.util.Iterator<androidx.constraintlayout.core.dsl.Constraint> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            java.util.Iterator<androidx.constraintlayout.core.dsl.Helper> it2 = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
        }
        sb2.append("},\n");
        return sb2.toString();
    }
}
