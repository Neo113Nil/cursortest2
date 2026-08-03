package com.fyber.inneractive.sdk.external;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_FILL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class InneractiveErrorCode {
    private static final /* synthetic */ com.fyber.inneractive.sdk.external.InneractiveErrorCode[] $VALUES;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode CANCELLED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode CONNECTION_ERROR;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode CONNECTION_TIMEOUT;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode ERROR_CONFIGURATION_MISMATCH;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode ERROR_CONFIGURATION_NO_SUCH_SPOT;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode IAB_TCF_PURPOSE_1_DISABLED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode INVALID_INPUT;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode IN_FLIGHT_TIMEOUT;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode LOAD_TIMEOUT;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode NATIVE_ADS_NOT_SUPPORTED_FOR_OS;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode NATIVE_AD_FAILED_TO_LOAD;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode NON_SECURE_CONTENT_DETECTED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode NO_FILL;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SDK_INTERNAL_ERROR;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SDK_NOT_INITIALIZED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SERVER_INTERNAL_ERROR;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SERVER_INVALID_RESPONSE;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode SPOT_DISABLED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode UNKNOWN_APP_ID;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode UNSPECIFIED;
    public static final com.fyber.inneractive.sdk.external.InneractiveErrorCode UNSUPPORTED_SPOT;
    private final java.lang.String message;
    private final com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable metricable;
    private final com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable timeMetricable;

    public enum Metricable {
        INCLUDED_IN_FAILED_METRICS,
        EXCLUDED_IN_FAILED_METRICS
    }

    static {
        com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable metricable = com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable.EXCLUDED_IN_FAILED_METRICS;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("NO_FILL", 0, "No Ad Found", metricable, metricable);
        NO_FILL = inneractiveErrorCode;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable metricable2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode2 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SERVER_INTERNAL_ERROR", 1, "Server Internal Error", metricable, metricable2);
        SERVER_INTERNAL_ERROR = inneractiveErrorCode2;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode3 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SERVER_INVALID_RESPONSE", 2, "Failed Due To Invalid Server Response", metricable2, metricable2);
        SERVER_INVALID_RESPONSE = inneractiveErrorCode3;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode4 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SDK_INTERNAL_ERROR", 3, "SDK Internal Error", metricable2, metricable2);
        SDK_INTERNAL_ERROR = inneractiveErrorCode4;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode5 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("CANCELLED", 4, "Ad Request Was Cancelled", metricable2, metricable2);
        CANCELLED = inneractiveErrorCode5;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode6 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("CONNECTION_TIMEOUT", 5, "Connection Timed Out", metricable2, metricable);
        CONNECTION_TIMEOUT = inneractiveErrorCode6;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode7 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("CONNECTION_ERROR", 6, "Network Connection Error", metricable2, metricable2);
        CONNECTION_ERROR = inneractiveErrorCode7;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode8 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("LOAD_TIMEOUT", 7, "Failed Due To load timeout", metricable2, metricable);
        LOAD_TIMEOUT = inneractiveErrorCode8;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode9 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("IN_FLIGHT_TIMEOUT", 8, "Failed Due To in flight timeout", metricable2, metricable);
        IN_FLIGHT_TIMEOUT = inneractiveErrorCode9;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode10 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("UNKNOWN_APP_ID", 9, "Unknown App ID", metricable2, metricable2);
        UNKNOWN_APP_ID = inneractiveErrorCode10;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode11 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("INVALID_INPUT", 10, "User Entered Invalid Input", metricable, metricable2);
        INVALID_INPUT = inneractiveErrorCode11;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode12 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED", 11, "Native Video Not Supported", metricable2, metricable2);
        ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED = inneractiveErrorCode12;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode13 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("NATIVE_ADS_NOT_SUPPORTED_FOR_OS", 12, "Native ads not supported for this Android version", metricable2, metricable2);
        NATIVE_ADS_NOT_SUPPORTED_FOR_OS = inneractiveErrorCode13;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode14 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("ERROR_CONFIGURATION_MISMATCH", 13, "Internal Configuration Error", metricable2, metricable2);
        ERROR_CONFIGURATION_MISMATCH = inneractiveErrorCode14;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode15 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("ERROR_CONFIGURATION_NO_SUCH_SPOT", 14, "Invalid spot supplied", metricable, metricable);
        ERROR_CONFIGURATION_NO_SUCH_SPOT = inneractiveErrorCode15;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode16 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SPOT_DISABLED", 15, "Selected spot is not active", metricable2, metricable2);
        SPOT_DISABLED = inneractiveErrorCode16;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode17 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("UNSUPPORTED_SPOT", 16, "Unsupported Spot", metricable2, metricable2);
        UNSUPPORTED_SPOT = inneractiveErrorCode17;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode18 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("NON_SECURE_CONTENT_DETECTED", 17, "Non secure content detected", metricable2, metricable2);
        NON_SECURE_CONTENT_DETECTED = inneractiveErrorCode18;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode19 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("UNSPECIFIED", 18, "Unspecified Error.", metricable2, metricable2);
        UNSPECIFIED = inneractiveErrorCode19;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode20 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SDK_NOT_INITIALIZED", 19, "SDK was not initialized. Did you forget to call InneractiveAdManager.init(...)?", metricable2, metricable2);
        SDK_NOT_INITIALIZED = inneractiveErrorCode20;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode21 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("SDK_NOT_INITIALIZED_OR_CONFIG_ERROR", 20, "Invalid App Id", metricable, metricable);
        SDK_NOT_INITIALIZED_OR_CONFIG_ERROR = inneractiveErrorCode21;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode22 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("IAB_TCF_PURPOSE_1_DISABLED", 21, "IAB TCF Purpose no.1 is disabled", metricable, metricable);
        IAB_TCF_PURPOSE_1_DISABLED = inneractiveErrorCode22;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode23 = new com.fyber.inneractive.sdk.external.InneractiveErrorCode("NATIVE_AD_FAILED_TO_LOAD", 22, "Native ad failed to load", metricable, metricable);
        NATIVE_AD_FAILED_TO_LOAD = inneractiveErrorCode23;
        $VALUES = new com.fyber.inneractive.sdk.external.InneractiveErrorCode[]{inneractiveErrorCode, inneractiveErrorCode2, inneractiveErrorCode3, inneractiveErrorCode4, inneractiveErrorCode5, inneractiveErrorCode6, inneractiveErrorCode7, inneractiveErrorCode8, inneractiveErrorCode9, inneractiveErrorCode10, inneractiveErrorCode11, inneractiveErrorCode12, inneractiveErrorCode13, inneractiveErrorCode14, inneractiveErrorCode15, inneractiveErrorCode16, inneractiveErrorCode17, inneractiveErrorCode18, inneractiveErrorCode19, inneractiveErrorCode20, inneractiveErrorCode21, inneractiveErrorCode22, inneractiveErrorCode23};
    }

    public InneractiveErrorCode(java.lang.String str, int i, java.lang.String str2, com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable metricable, com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable metricable2) {
        this.message = str2;
        this.metricable = metricable;
        this.timeMetricable = metricable2;
    }

    public static com.fyber.inneractive.sdk.external.InneractiveErrorCode valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.external.InneractiveErrorCode) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.external.InneractiveErrorCode.class, str);
    }

    public static com.fyber.inneractive.sdk.external.InneractiveErrorCode[] values() {
        return (com.fyber.inneractive.sdk.external.InneractiveErrorCode[]) $VALUES.clone();
    }

    public com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable getMetricable() {
        return this.metricable;
    }

    public boolean shouldSendTimeMetric() {
        return this.timeMetricable == com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.message;
    }
}
