package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class VChain extends androidx.constraintlayout.core.dsl.Chain {
    private androidx.constraintlayout.core.dsl.VChain.VAnchor getHighSpeedVideoFpsRanges;
    private androidx.constraintlayout.core.dsl.VChain.VAnchor getHighSpeedVideoFpsRangesFor;
    private androidx.constraintlayout.core.dsl.VChain.VAnchor getHighSpeedVideoSizes;

    public class VAnchor extends androidx.constraintlayout.core.dsl.Chain.Anchor {
        VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide vSide) {
            super(androidx.constraintlayout.core.dsl.Constraint.Side.valueOf(vSide.name()));
        }
    }

    public VChain(java.lang.String str) {
        super(str);
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.TOP);
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BOTTOM);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BASELINE);
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_CHAIN));
    }

    public VChain(java.lang.String str, java.lang.String str2) {
        super(str);
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.TOP);
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BOTTOM);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.dsl.VChain.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BASELINE);
        this.config = str2;
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.VERTICAL_CHAIN));
        this.configMap = convertConfigToMap();
        if (this.configMap.containsKey("contains")) {
            androidx.constraintlayout.core.dsl.Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }

    public androidx.constraintlayout.core.dsl.VChain.VAnchor getTop() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToTop(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, this.getHighSpeedVideoFpsRanges.toString());
    }

    public androidx.constraintlayout.core.dsl.VChain.VAnchor getBottom() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToBottom(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, this.getHighSpeedVideoFpsRangesFor.toString());
    }

    public androidx.constraintlayout.core.dsl.VChain.VAnchor getBaseline() {
        return this.getHighSpeedVideoSizes;
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put("baseline", this.getHighSpeedVideoSizes.toString());
    }
}
