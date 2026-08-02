package com.paypal.android.threeds.security;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/android/threeds/security/EncryptionAlgorithm;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "EC", "RSA"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EncryptionAlgorithm {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.android.threeds.security.EncryptionAlgorithm EC;
    public static final com.paypal.android.threeds.security.EncryptionAlgorithm RSA;
    private static final /* synthetic */ com.paypal.android.threeds.security.EncryptionAlgorithm[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private EncryptionAlgorithm(java.lang.String str, int i, java.lang.String str2) {
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    static {
        com.paypal.android.threeds.security.EncryptionAlgorithm encryptionAlgorithm = new com.paypal.android.threeds.security.EncryptionAlgorithm("EC", 0, "EC");
        EC = encryptionAlgorithm;
        com.paypal.android.threeds.security.EncryptionAlgorithm encryptionAlgorithm2 = new com.paypal.android.threeds.security.EncryptionAlgorithm("RSA", 1, "RSA");
        RSA = encryptionAlgorithm2;
        com.paypal.android.threeds.security.EncryptionAlgorithm[] encryptionAlgorithmArr = {encryptionAlgorithm, encryptionAlgorithm2};
        getHighSpeedVideoSizes = encryptionAlgorithmArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(encryptionAlgorithmArr);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.android.threeds.security.EncryptionAlgorithm[] values() {
        return (com.paypal.android.threeds.security.EncryptionAlgorithm[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.android.threeds.security.EncryptionAlgorithm valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.security.EncryptionAlgorithm) java.lang.Enum.valueOf(com.paypal.android.threeds.security.EncryptionAlgorithm.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.security.EncryptionAlgorithm> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
