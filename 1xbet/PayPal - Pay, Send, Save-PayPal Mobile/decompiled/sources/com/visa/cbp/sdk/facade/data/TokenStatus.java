package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum TokenStatus {
    ACTIVE(com.payair.model.TokenStatusKt.TOKEN_ACTIVE),
    RESUME("RESUME"),
    SUSPENDED("SUSPENDED"),
    OBSOLETE("OBSOLETE"),
    DELETED(com.payair.model.TokenStatusKt.TOKEN_DELETED),
    NOT_FOUND(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND);

    private static final java.util.HashMap<java.lang.String, com.visa.cbp.sdk.facade.data.TokenStatus> mapping = new java.util.HashMap<>();
    private java.lang.String value;

    static {
        for (com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus : values()) {
            mapping.put(tokenStatus.getValue(), tokenStatus);
        }
    }

    TokenStatus(java.lang.String str) {
        this.value = str;
    }

    public static com.visa.cbp.sdk.facade.data.TokenStatus getTokenStatus(java.lang.String str) {
        return mapping.get(str);
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
