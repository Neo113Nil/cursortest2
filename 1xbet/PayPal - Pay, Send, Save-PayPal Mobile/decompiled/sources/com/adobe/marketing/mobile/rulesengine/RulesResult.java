package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class RulesResult {
    public static final com.adobe.marketing.mobile.rulesengine.RulesResult SUCCESS = new com.adobe.marketing.mobile.rulesengine.RulesResult();
    private final java.lang.String Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType getHighSpeedVideoFpsRangesFor;

    public enum FailureType {
        UNKNOWN,
        CONDITION_FAILED,
        TYPE_MISMATCHED,
        MISSING_OPERATOR,
        INVALID_OPERAND
    }

    public RulesResult(com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType failureType, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = failureType;
    }

    public boolean isSuccess() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getFailureMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.adobe.marketing.mobile.rulesengine.RulesResult.FailureType getFailureType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private RulesResult() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
    }
}
