package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "ISSUER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConversionProvider {
    public static final com.paypal.oslo.feature.p2p.domain.model.ConversionProvider ISSUER;
    public static final com.paypal.oslo.feature.p2p.domain.model.ConversionProvider PAYPAL;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ConversionProvider[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ConversionProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider = new com.paypal.oslo.feature.p2p.domain.model.ConversionProvider("PAYPAL", 0);
        PAYPAL = conversionProvider;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider2 = new com.paypal.oslo.feature.p2p.domain.model.ConversionProvider("ISSUER", 1);
        ISSUER = conversionProvider2;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider[] conversionProviderArr = {conversionProvider, conversionProvider2};
        getHighResolutionOutputSizeshNQ4ISI = conversionProviderArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(conversionProviderArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ConversionProvider[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ConversionProvider[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ConversionProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ConversionProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ConversionProvider> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
