package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "GIPHY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MdaProvider {
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.MdaProvider[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.MdaProvider GIPHY;
    public static final com.paypal.oslo.feature.p2p.domain.model.MdaProvider PAYPAL;
    public static final com.paypal.oslo.feature.p2p.domain.model.MdaProvider UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private MdaProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider = new com.paypal.oslo.feature.p2p.domain.model.MdaProvider("PAYPAL", 0);
        PAYPAL = mdaProvider;
        com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider2 = new com.paypal.oslo.feature.p2p.domain.model.MdaProvider("GIPHY", 1);
        GIPHY = mdaProvider2;
        com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider3 = new com.paypal.oslo.feature.p2p.domain.model.MdaProvider("UNKNOWN", 2);
        UNKNOWN = mdaProvider3;
        com.paypal.oslo.feature.p2p.domain.model.MdaProvider[] mdaProviderArr = {mdaProvider, mdaProvider2, mdaProvider3};
        Camera2StreamConfigurationMap = mdaProviderArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(mdaProviderArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.MdaProvider[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.MdaProvider[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.MdaProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.MdaProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.MdaProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.MdaProvider> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
