package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "toMoney", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoneyMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money toMoney(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
        if (bnplServicingMoneyFragment == null) {
            return null;
        }
        java.lang.String obj = bnplServicingMoneyFragment.getCurrencyCode().toString();
        if (kotlin.text.StringsKt.isBlank(obj) || kotlin.text.StringsKt.isBlank(bnplServicingMoneyFragment.getValue())) {
            return null;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(obj, bnplServicingMoneyFragment.getValue());
    }
}
