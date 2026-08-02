package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/FxQuoteMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FxQuote;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "Lcom/paypal/oslo/feature/p2p/data/mapper/P2PMoneyFragmentMapper;", "moneyMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/P2PMoneyFragmentMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFxQuoteQuery$FxQuote;)Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/P2PMoneyFragmentMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FxQuoteMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote, com.paypal.oslo.feature.p2p.domain.model.FxQuote> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public FxQuoteMapper(com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper p2PMoneyFragmentMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PMoneyFragmentMapper, "");
        this.Camera2StreamConfigurationMap = p2PMoneyFragmentMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.FxQuote map(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String fxQuoteId = input.getFxQuoteId();
        com.paypal.oslo.feature.p2p.domain.model.Money map = this.Camera2StreamConfigurationMap.map(input.getAmountFrom().getP2PMoneyFragment());
        com.paypal.oslo.feature.p2p.domain.model.Money map2 = this.Camera2StreamConfigurationMap.map(input.getAmountTo().getP2PMoneyFragment());
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.ExchangeRate exchangeRate = input.getExchangeRate();
        return new com.paypal.oslo.feature.p2p.domain.model.FxQuote(fxQuoteId, map, map2, new com.paypal.oslo.feature.p2p.domain.model.ExchangeRate(this.Camera2StreamConfigurationMap.map(exchangeRate.getFromCurrency().getP2PMoneyFragment()), this.Camera2StreamConfigurationMap.map(exchangeRate.getToCurrency().getP2PMoneyFragment())), null, 16, null);
    }
}
