package com.paypal.oslo.core.persistence.encryption;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/TagSize;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "bits", com.visa.cbp.getEncExpo.warmup, "getBits", "()I", "BITS_128", "BITS_120", "BITS_112", "BITS_104", "BITS_96"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TagSize {
    public static final com.paypal.oslo.core.persistence.encryption.TagSize BITS_104;
    public static final com.paypal.oslo.core.persistence.encryption.TagSize BITS_112;
    public static final com.paypal.oslo.core.persistence.encryption.TagSize BITS_120;
    public static final com.paypal.oslo.core.persistence.encryption.TagSize BITS_128;
    public static final com.paypal.oslo.core.persistence.encryption.TagSize BITS_96;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.persistence.encryption.TagSize[] getHighSpeedVideoFpsRangesFor;
    private final int bits;

    private TagSize(java.lang.String str, int i, int i2) {
        this.bits = i2;
    }

    public final int getBits() {
        return this.bits;
    }

    static {
        com.paypal.oslo.core.persistence.encryption.TagSize tagSize = new com.paypal.oslo.core.persistence.encryption.TagSize("BITS_128", 0, 128);
        BITS_128 = tagSize;
        com.paypal.oslo.core.persistence.encryption.TagSize tagSize2 = new com.paypal.oslo.core.persistence.encryption.TagSize("BITS_120", 1, 120);
        BITS_120 = tagSize2;
        com.paypal.oslo.core.persistence.encryption.TagSize tagSize3 = new com.paypal.oslo.core.persistence.encryption.TagSize("BITS_112", 2, 112);
        BITS_112 = tagSize3;
        com.paypal.oslo.core.persistence.encryption.TagSize tagSize4 = new com.paypal.oslo.core.persistence.encryption.TagSize("BITS_104", 3, 104);
        BITS_104 = tagSize4;
        com.paypal.oslo.core.persistence.encryption.TagSize tagSize5 = new com.paypal.oslo.core.persistence.encryption.TagSize("BITS_96", 4, 96);
        BITS_96 = tagSize5;
        com.paypal.oslo.core.persistence.encryption.TagSize[] tagSizeArr = {tagSize, tagSize2, tagSize3, tagSize4, tagSize5};
        getHighSpeedVideoFpsRangesFor = tagSizeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tagSizeArr);
    }

    public static com.paypal.oslo.core.persistence.encryption.TagSize[] values() {
        return (com.paypal.oslo.core.persistence.encryption.TagSize[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.persistence.encryption.TagSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.persistence.encryption.TagSize) java.lang.Enum.valueOf(com.paypal.oslo.core.persistence.encryption.TagSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.persistence.encryption.TagSize> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
