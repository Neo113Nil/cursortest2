package com.paypal.oslo.downloads.api.validation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/downloads/api/validation/SecurityLevel;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INSECURE", "PARTIAL", "SECURE", "HIGH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecurityLevel {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.downloads.api.validation.SecurityLevel HIGH;
    public static final com.paypal.oslo.downloads.api.validation.SecurityLevel INSECURE;
    public static final com.paypal.oslo.downloads.api.validation.SecurityLevel PARTIAL;
    public static final com.paypal.oslo.downloads.api.validation.SecurityLevel SECURE;
    public static final com.paypal.oslo.downloads.api.validation.SecurityLevel UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.downloads.api.validation.SecurityLevel[] getHighResolutionOutputSizeshNQ4ISI;

    private SecurityLevel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel = new com.paypal.oslo.downloads.api.validation.SecurityLevel("UNKNOWN", 0);
        UNKNOWN = securityLevel;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel2 = new com.paypal.oslo.downloads.api.validation.SecurityLevel("INSECURE", 1);
        INSECURE = securityLevel2;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel3 = new com.paypal.oslo.downloads.api.validation.SecurityLevel("PARTIAL", 2);
        PARTIAL = securityLevel3;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel4 = new com.paypal.oslo.downloads.api.validation.SecurityLevel("SECURE", 3);
        SECURE = securityLevel4;
        com.paypal.oslo.downloads.api.validation.SecurityLevel securityLevel5 = new com.paypal.oslo.downloads.api.validation.SecurityLevel("HIGH", 4);
        HIGH = securityLevel5;
        com.paypal.oslo.downloads.api.validation.SecurityLevel[] securityLevelArr = {securityLevel, securityLevel2, securityLevel3, securityLevel4, securityLevel5};
        getHighResolutionOutputSizeshNQ4ISI = securityLevelArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(securityLevelArr);
    }

    public static com.paypal.oslo.downloads.api.validation.SecurityLevel[] values() {
        return (com.paypal.oslo.downloads.api.validation.SecurityLevel[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.downloads.api.validation.SecurityLevel valueOf(java.lang.String str) {
        return (com.paypal.oslo.downloads.api.validation.SecurityLevel) java.lang.Enum.valueOf(com.paypal.oslo.downloads.api.validation.SecurityLevel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.downloads.api.validation.SecurityLevel> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
