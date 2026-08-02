package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/TokenServiceProvider;", "", "<init>", "(Ljava/lang/String;I)V", "MDES", "VTS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TokenServiceProvider {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider MDES;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider VTS;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider[] getHighSpeedVideoFpsRanges;

    private TokenServiceProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider("MDES", 0);
        MDES = tokenServiceProvider;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider("VTS", 1);
        VTS = tokenServiceProvider2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider tokenServiceProvider3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider("UNKNOWN", 2);
        UNKNOWN = tokenServiceProvider3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider[] tokenServiceProviderArr = {tokenServiceProvider, tokenServiceProvider2, tokenServiceProvider3};
        getHighSpeedVideoFpsRanges = tokenServiceProviderArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(tokenServiceProviderArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.TokenServiceProvider> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
