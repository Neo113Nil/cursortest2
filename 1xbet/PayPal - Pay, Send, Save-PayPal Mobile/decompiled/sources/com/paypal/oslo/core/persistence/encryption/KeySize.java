package com.paypal.oslo.core.persistence.encryption;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/KeySize;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "bits", com.visa.cbp.getEncExpo.warmup, "getBits", "()I", "BITS_128", "BITS_192", "BITS_256"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KeySize {
    public static final com.paypal.oslo.core.persistence.encryption.KeySize BITS_128;
    public static final com.paypal.oslo.core.persistence.encryption.KeySize BITS_192;
    public static final com.paypal.oslo.core.persistence.encryption.KeySize BITS_256;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.persistence.encryption.KeySize[] getHighSpeedVideoFpsRanges;
    private final int bits;

    private KeySize(java.lang.String str, int i, int i2) {
        this.bits = i2;
    }

    public final int getBits() {
        return this.bits;
    }

    static {
        com.paypal.oslo.core.persistence.encryption.KeySize keySize = new com.paypal.oslo.core.persistence.encryption.KeySize("BITS_128", 0, 128);
        BITS_128 = keySize;
        com.paypal.oslo.core.persistence.encryption.KeySize keySize2 = new com.paypal.oslo.core.persistence.encryption.KeySize("BITS_192", 1, 192);
        BITS_192 = keySize2;
        com.paypal.oslo.core.persistence.encryption.KeySize keySize3 = new com.paypal.oslo.core.persistence.encryption.KeySize("BITS_256", 2, 256);
        BITS_256 = keySize3;
        com.paypal.oslo.core.persistence.encryption.KeySize[] keySizeArr = {keySize, keySize2, keySize3};
        getHighSpeedVideoFpsRanges = keySizeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(keySizeArr);
    }

    public static com.paypal.oslo.core.persistence.encryption.KeySize[] values() {
        return (com.paypal.oslo.core.persistence.encryption.KeySize[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.persistence.encryption.KeySize valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.persistence.encryption.KeySize) java.lang.Enum.valueOf(com.paypal.oslo.core.persistence.encryption.KeySize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.persistence.encryption.KeySize> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
