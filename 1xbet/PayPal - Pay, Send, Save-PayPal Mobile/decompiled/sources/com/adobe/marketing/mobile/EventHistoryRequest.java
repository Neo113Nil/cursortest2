package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public class EventHistoryRequest {
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    public EventHistoryRequest(java.util.Map<java.lang.String, java.lang.Object> map, long j, long j2) {
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = j2;
    }

    public long getMaskAsDecimalHash() {
        return com.adobe.marketing.mobile.internal.util.MapUtilsKt.convertMapToFnv1aHash(this.getHighSpeedVideoFpsRangesFor, null);
    }

    public long getFromDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public long getToDate() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
