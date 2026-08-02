package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment$CurrencyExchange;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment$CurrencyExchange;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlanCurrencyExchangeMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.CurrencyExchange, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PlanCurrencyExchangeMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange map(com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.CurrencyExchange input) {
        if (input == null) {
            return null;
        }
        com.paypal.oslo.feature.p2p.domain.model.Money money = com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapperKt.toMoney(input.getAmountFrom().getP2PMoneyFragment());
        com.paypal.oslo.feature.p2p.domain.model.Money money2 = com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapperKt.toMoney(input.getAmountTo().getP2PMoneyFragment());
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.ExchangeRate exchangeRate = input.getExchangeRate();
        com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate2 = new com.paypal.oslo.feature.p2p.domain.model.ExchangeRate(com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapperKt.toMoney(exchangeRate.getFromCurrency().getP2PMoneyFragment()), com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapperKt.toMoney(exchangeRate.getToCurrency().getP2PMoneyFragment()));
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.OnFiatCurrencyExchange onFiatCurrencyExchange = input.getOnFiatCurrencyExchange();
        return new com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange(money, money2, exchangeRate2, onFiatCurrencyExchange != null ? onFiatCurrencyExchange.getFxQuoteId() : null);
    }
}
