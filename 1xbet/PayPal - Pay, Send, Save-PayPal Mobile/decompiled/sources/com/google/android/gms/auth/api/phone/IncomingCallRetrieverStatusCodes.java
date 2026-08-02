package com.google.android.gms.auth.api.phone;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n"}, d2 = {"Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverStatusCodes;", "Lcom/google/android/gms/common/api/CommonStatusCodes;", "<init>", "()V", "", "statusCode", "", "getVerificationStatusCodeString", "(I)Ljava/lang/String;", "CONCURRENT_REQUESTS", com.visa.cbp.getEncExpo.warmup, "IN_EMERGENCY_CALL", "API_UNAVAILABLE", "RATE_LIMIT_REACHED", "TELEPHONY_FEATURE_UNAVAILABLE", "INVALID_PHONE_NUMBER_RANGE", "USER_CONSENT_DENIED", "FAILURE_OTHER"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IncomingCallRetrieverStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int API_UNAVAILABLE = 53003;
    public static final int CONCURRENT_REQUESTS = 53001;
    public static final int FAILURE_OTHER = 53008;
    public static final com.google.android.gms.auth.api.phone.IncomingCallRetrieverStatusCodes INSTANCE = new com.google.android.gms.auth.api.phone.IncomingCallRetrieverStatusCodes();
    public static final int INVALID_PHONE_NUMBER_RANGE = 53006;
    public static final int IN_EMERGENCY_CALL = 53002;
    public static final int RATE_LIMIT_REACHED = 53004;
    public static final int TELEPHONY_FEATURE_UNAVAILABLE = 53005;
    public static final int USER_CONSENT_DENIED = 53007;

    private IncomingCallRetrieverStatusCodes() {
    }

    public final java.lang.String getVerificationStatusCodeString(int statusCode) {
        switch (statusCode) {
            case CONCURRENT_REQUESTS /* 53001 */:
                return "ERROR_REASON_CONCURRENT_REQUESTS";
            case IN_EMERGENCY_CALL /* 53002 */:
                return "ERROR_REASON_IN_EMERGENCY_CALL";
            case API_UNAVAILABLE /* 53003 */:
                return "API_NOT_AVAILABLE";
            case RATE_LIMIT_REACHED /* 53004 */:
                return "ERROR_REASON_RATE_LIMIT_REACHED";
            case TELEPHONY_FEATURE_UNAVAILABLE /* 53005 */:
                return "TELEPHONY_FEATURE_UNAVAILABLE";
            case INVALID_PHONE_NUMBER_RANGE /* 53006 */:
                return "INVALID_PHONE_NUMBER_RANGE";
            case USER_CONSENT_DENIED /* 53007 */:
                return "USER_CONSENT_DENIED";
            case FAILURE_OTHER /* 53008 */:
                return "FAILURE_OTHER";
            default:
                java.lang.String statusCodeString = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(statusCode);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(statusCodeString, "");
                return statusCodeString;
        }
    }
}
