package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public enum TokenRepersoStatus {
    NOT_MIGRATED(0),
    REPERSO_INITIATED(1),
    PENDING_NOTIFICATION(2),
    CALL_REPERSO(3),
    ERROR_IN_REPERSO(4),
    COMPLETED_REPERSO(5),
    NO_MIGRATION(6);

    private static final java.util.HashMap<java.lang.Integer, com.visa.cbp.sdk.facade.TokenRepersoStatus> mapping = new java.util.HashMap<>();
    private final int value;

    static {
        for (com.visa.cbp.sdk.facade.TokenRepersoStatus tokenRepersoStatus : values()) {
            mapping.put(java.lang.Integer.valueOf(tokenRepersoStatus.getValue()), tokenRepersoStatus);
        }
    }

    TokenRepersoStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public static com.visa.cbp.sdk.facade.TokenRepersoStatus get(int i) {
        return mapping.get(java.lang.Integer.valueOf(i));
    }
}
