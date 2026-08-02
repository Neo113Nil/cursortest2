package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public abstract class Guideline extends androidx.constraintlayout.core.dsl.Helper {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;

    Guideline(java.lang.String str) {
        super(str, new androidx.constraintlayout.core.dsl.Helper.HelperType(""));
        this.getHighSpeedVideoFpsRanges = Integer.MIN_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
    }

    public int getStart() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setStart(int i) {
        this.getHighSpeedVideoFpsRanges = i;
        this.configMap.put(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges));
    }

    public int getEnd() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setEnd(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.configMap.put("end", java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public float getPercent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPercent(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.configMap.put("percent", java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor));
    }
}
