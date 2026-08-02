package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "toMoney", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Money;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanCurrencyExchangeMapperKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.Money toMoney(com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment p2PMoneyFragment) {
        java.lang.String value = p2PMoneyFragment != null ? p2PMoneyFragment.getValue() : null;
        if (value == null) {
            value = "";
        }
        java.lang.Object currencyCode = p2PMoneyFragment != null ? p2PMoneyFragment.getCurrencyCode() : null;
        java.lang.String str = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
        return new com.paypal.oslo.feature.p2p.domain.model.Money(value, str != null ? str : "");
    }
}
