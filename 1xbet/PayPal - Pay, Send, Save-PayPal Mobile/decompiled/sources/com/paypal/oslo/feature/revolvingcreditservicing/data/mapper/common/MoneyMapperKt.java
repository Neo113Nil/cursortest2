package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "toCurrencyAmount", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount toCurrencyAmount(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(revolvingCreditMoneyFragment.getCurrencyCode().toString(), revolvingCreditMoneyFragment.getValue());
    }
}
