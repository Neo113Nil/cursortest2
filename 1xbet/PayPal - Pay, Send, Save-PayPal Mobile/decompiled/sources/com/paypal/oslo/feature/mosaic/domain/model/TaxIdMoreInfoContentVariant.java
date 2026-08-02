package com.paypal.oslo.feature.mosaic.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;", "", "<init>", "(Ljava/lang/String;)V", "SSN_CIP_V1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxIdMoreInfoContentVariant {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant SSN_CIP_V1;
    private static final /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant[] getHighResolutionOutputSizeshNQ4ISI;

    private TaxIdMoreInfoContentVariant(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant taxIdMoreInfoContentVariant = new com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant("SSN_CIP_V1");
        SSN_CIP_V1 = taxIdMoreInfoContentVariant;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant[] taxIdMoreInfoContentVariantArr = {taxIdMoreInfoContentVariant};
        getHighResolutionOutputSizeshNQ4ISI = taxIdMoreInfoContentVariantArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(taxIdMoreInfoContentVariantArr);
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant[] values() {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
