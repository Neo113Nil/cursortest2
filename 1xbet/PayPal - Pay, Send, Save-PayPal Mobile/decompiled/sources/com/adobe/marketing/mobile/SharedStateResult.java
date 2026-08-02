package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public class SharedStateResult {
    private final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.SharedStateStatus getHighSpeedVideoFpsRangesFor;

    public SharedStateResult(com.adobe.marketing.mobile.SharedStateStatus sharedStateStatus, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.getHighSpeedVideoFpsRangesFor = sharedStateStatus;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public com.adobe.marketing.mobile.SharedStateStatus getStatus() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
