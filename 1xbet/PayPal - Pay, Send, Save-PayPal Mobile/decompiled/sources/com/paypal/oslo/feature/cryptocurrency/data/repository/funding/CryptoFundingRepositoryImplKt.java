package com.paypal.oslo.feature.cryptocurrency.data.repository.funding;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFundingRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction access$toGraphQL(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction) {
        int i = com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[cryptoTradeAction.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction.BUY;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTradeAction.SELL;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
