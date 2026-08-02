package com.payair.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/payair/model/RegistrationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "REGISTERED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, "LOGOUT", "UNSUPPORTED_VERSION_DETECTED"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegistrationStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.payair.model.RegistrationStatus[] $VALUES;
    public static final com.payair.model.RegistrationStatus REGISTERED = new com.payair.model.RegistrationStatus("REGISTERED", 0);
    public static final com.payair.model.RegistrationStatus SESSION_EXPIRED = new com.payair.model.RegistrationStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, 1);
    public static final com.payair.model.RegistrationStatus LOGOUT = new com.payair.model.RegistrationStatus("LOGOUT", 2);
    public static final com.payair.model.RegistrationStatus UNSUPPORTED_VERSION_DETECTED = new com.payair.model.RegistrationStatus("UNSUPPORTED_VERSION_DETECTED", 3);

    static {
        com.payair.model.RegistrationStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    private RegistrationStatus(java.lang.String str, int i) {
    }

    public static com.payair.model.RegistrationStatus[] values() {
        return (com.payair.model.RegistrationStatus[]) $VALUES.clone();
    }

    public static com.payair.model.RegistrationStatus valueOf(java.lang.String str) {
        return (com.payair.model.RegistrationStatus) java.lang.Enum.valueOf(com.payair.model.RegistrationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.model.RegistrationStatus> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.payair.model.RegistrationStatus[] $values() {
        return new com.payair.model.RegistrationStatus[]{REGISTERED, SESSION_EXPIRED, LOGOUT, UNSUPPORTED_VERSION_DETECTED};
    }
}
