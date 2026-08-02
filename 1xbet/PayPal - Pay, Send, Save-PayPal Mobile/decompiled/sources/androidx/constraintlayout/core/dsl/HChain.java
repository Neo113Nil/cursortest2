package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class HChain extends androidx.constraintlayout.core.dsl.Chain {
    private androidx.constraintlayout.core.dsl.HChain.HAnchor Camera2StreamConfigurationMap;
    private androidx.constraintlayout.core.dsl.HChain.HAnchor getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.dsl.HChain.HAnchor getHighSpeedVideoFpsRangesFor;
    private androidx.constraintlayout.core.dsl.HChain.HAnchor getHighSpeedVideoSizes;

    public class HAnchor extends androidx.constraintlayout.core.dsl.Chain.Anchor {
        HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide hSide) {
            super(androidx.constraintlayout.core.dsl.Constraint.Side.valueOf(hSide.name()));
        }
    }

    public HChain(java.lang.String str) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.LEFT);
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.RIGHT);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.START);
        this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.END);
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.HORIZONTAL_CHAIN));
    }

    public HChain(java.lang.String str, java.lang.String str2) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.LEFT);
        this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.RIGHT);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.START);
        this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.dsl.HChain.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.END);
        this.config = str2;
        this.type = new androidx.constraintlayout.core.dsl.Helper.HelperType(typeMap.get(androidx.constraintlayout.core.dsl.Helper.Type.HORIZONTAL_CHAIN));
        this.configMap = convertConfigToMap();
        if (this.configMap.containsKey("contains")) {
            androidx.constraintlayout.core.dsl.Ref.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }

    public androidx.constraintlayout.core.dsl.HChain.HAnchor getLeft() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToLeft(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, this.getHighResolutionOutputSizeshNQ4ISI.toString());
    }

    public androidx.constraintlayout.core.dsl.HChain.HAnchor getRight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToRight(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, this.getHighSpeedVideoFpsRangesFor.toString());
    }

    public androidx.constraintlayout.core.dsl.HChain.HAnchor getStart() {
        return this.getHighSpeedVideoSizes;
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToStart(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, this.getHighSpeedVideoSizes.toString());
    }

    public androidx.constraintlayout.core.dsl.HChain.HAnchor getEnd() {
        return this.Camera2StreamConfigurationMap;
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToEnd(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges = i2;
        this.configMap.put("end", this.Camera2StreamConfigurationMap.toString());
    }
}
