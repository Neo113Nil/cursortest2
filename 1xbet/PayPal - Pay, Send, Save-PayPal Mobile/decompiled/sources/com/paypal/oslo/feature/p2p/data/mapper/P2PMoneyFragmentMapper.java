package com.paypal.oslo.feature.p2p.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/P2PMoneyFragmentMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/Money;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PMoneyFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Money;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class P2PMoneyFragmentMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment, com.paypal.oslo.feature.p2p.domain.model.Money> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public P2PMoneyFragmentMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.Money map(com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment input) {
        java.lang.Object currencyCode;
        java.lang.String str = null;
        java.lang.String value = input != null ? input.getValue() : null;
        if (value == null) {
            value = "";
        }
        if (input != null && (currencyCode = input.getCurrencyCode()) != null) {
            str = currencyCode.toString();
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Money(value, str != null ? str : "");
    }
}
