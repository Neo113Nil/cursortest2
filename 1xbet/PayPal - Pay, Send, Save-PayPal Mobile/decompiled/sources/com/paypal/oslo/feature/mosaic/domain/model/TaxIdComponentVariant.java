package com.paypal.oslo.feature.mosaic.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdComponentVariant;", "", "<init>", "(Ljava/lang/String;I)V", "DROPDOWN", "INLINE_TOGGLE", "SINGLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxIdComponentVariant {
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant DROPDOWN;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant INLINE_TOGGLE;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant SINGLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant[] getHighSpeedVideoSizes;

    private TaxIdComponentVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant taxIdComponentVariant = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant("DROPDOWN", 0);
        DROPDOWN = taxIdComponentVariant;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant taxIdComponentVariant2 = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant("INLINE_TOGGLE", 1);
        INLINE_TOGGLE = taxIdComponentVariant2;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant taxIdComponentVariant3 = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant("SINGLE", 2);
        SINGLE = taxIdComponentVariant3;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant[] taxIdComponentVariantArr = {taxIdComponentVariant, taxIdComponentVariant2, taxIdComponentVariant3};
        getHighSpeedVideoSizes = taxIdComponentVariantArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(taxIdComponentVariantArr);
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant[] values() {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
