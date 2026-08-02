package com.adobe.marketing.mobile.launch.rulesengine.download;

/* loaded from: classes7.dex */
public class RulesLoadResult {
    private final com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public enum Reason {
        INVALID_SOURCE,
        ZIP_EXTRACTION_FAILED,
        CANNOT_CREATE_TEMP_DIR,
        CANNOT_STORE_IN_TEMP_DIR,
        NOT_MODIFIED,
        NO_DATA,
        SUCCESS
    }

    public RulesLoadResult(java.lang.String str, com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason reason) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = reason;
    }

    public java.lang.String getData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult.Reason getReason() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
