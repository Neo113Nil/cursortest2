package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Barrier extends androidx.constraintlayout.core.dsl.Helper {
    private int Camera2StreamConfigurationMap;
    private java.util.ArrayList<androidx.constraintlayout.core.dsl.Ref> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.dsl.Constraint.Side getHighSpeedVideoFpsRangesFor;

    public Barrier(java.lang.String str) {
        super(str, new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.BARRIER)));
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
    }

    public Barrier(java.lang.String str, java.lang.String str2) {
        super(str, new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.BARRIER)), str2);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.configMap = convertConfigToMap();
        if (this.configMap.containsKey("contains")) {
            androidx.constraintlayout.core.dsl.Ref.addStringToReferences(this.configMap.get("contains"), this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public androidx.constraintlayout.core.dsl.Constraint.Side getDirection() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDirection(androidx.constraintlayout.core.dsl.Constraint.Side side) {
        this.getHighSpeedVideoFpsRangesFor = side;
        this.configMap.put("direction", sideMap.get(side));
    }

    public int getMargin() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setMargin(int i) {
        this.Camera2StreamConfigurationMap = i;
        this.configMap.put("margin", java.lang.String.valueOf(i));
    }

    public java.lang.String referencesToString() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator<androidx.constraintlayout.core.dsl.Ref> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public androidx.constraintlayout.core.dsl.Barrier addReference(androidx.constraintlayout.core.dsl.Ref ref) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public androidx.constraintlayout.core.dsl.Barrier addReference(java.lang.String str) {
        return addReference(androidx.constraintlayout.core.dsl.Ref.parseStringToRef(str));
    }
}
