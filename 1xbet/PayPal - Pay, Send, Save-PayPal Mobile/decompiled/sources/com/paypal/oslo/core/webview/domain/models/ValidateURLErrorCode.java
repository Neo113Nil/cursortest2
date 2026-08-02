package com.paypal.oslo.core.webview.domain.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "MALFORMED_URL", "NON_HTTPS_SCHEME", "EMBEDDED_CREDENTIALS", "EXPLICIT_PORT", "MALFORMED_HOST", "HOST_NOT_ALLOWED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidateURLErrorCode {
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode EMBEDDED_CREDENTIALS;
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode EXPLICIT_PORT;
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode HOST_NOT_ALLOWED;
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode MALFORMED_HOST;
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode MALFORMED_URL;
    public static final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode NON_HTTPS_SCHEME;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode[] getHighSpeedVideoFpsRangesFor;

    private ValidateURLErrorCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("MALFORMED_URL", 0);
        MALFORMED_URL = validateURLErrorCode;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode2 = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("NON_HTTPS_SCHEME", 1);
        NON_HTTPS_SCHEME = validateURLErrorCode2;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode3 = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("EMBEDDED_CREDENTIALS", 2);
        EMBEDDED_CREDENTIALS = validateURLErrorCode3;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode4 = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("EXPLICIT_PORT", 3);
        EXPLICIT_PORT = validateURLErrorCode4;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode5 = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("MALFORMED_HOST", 4);
        MALFORMED_HOST = validateURLErrorCode5;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode6 = new com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode("HOST_NOT_ALLOWED", 5);
        HOST_NOT_ALLOWED = validateURLErrorCode6;
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode[] validateURLErrorCodeArr = {validateURLErrorCode, validateURLErrorCode2, validateURLErrorCode3, validateURLErrorCode4, validateURLErrorCode5, validateURLErrorCode6};
        getHighSpeedVideoFpsRangesFor = validateURLErrorCodeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(validateURLErrorCodeArr);
    }

    public static com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode[] values() {
        return (com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
