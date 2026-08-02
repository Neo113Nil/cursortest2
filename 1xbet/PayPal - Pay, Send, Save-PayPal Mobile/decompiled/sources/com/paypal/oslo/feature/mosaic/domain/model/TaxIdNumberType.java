package com.paypal.oslo.feature.mosaic.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "", "<init>", "(Ljava/lang/String;I)V", "ITIN", "SSN4", "SSN9"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxIdNumberType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType ITIN;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType SSN4;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType SSN9;
    private static final /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType[] getHighSpeedVideoFpsRanges;

    private TaxIdNumberType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType("ITIN", 0);
        ITIN = taxIdNumberType;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType2 = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType("SSN4", 1);
        SSN4 = taxIdNumberType2;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType3 = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType("SSN9", 2);
        SSN9 = taxIdNumberType3;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType[] taxIdNumberTypeArr = {taxIdNumberType, taxIdNumberType2, taxIdNumberType3};
        getHighSpeedVideoFpsRanges = taxIdNumberTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxIdNumberTypeArr);
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType[] values() {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) java.lang.Enum.valueOf(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
