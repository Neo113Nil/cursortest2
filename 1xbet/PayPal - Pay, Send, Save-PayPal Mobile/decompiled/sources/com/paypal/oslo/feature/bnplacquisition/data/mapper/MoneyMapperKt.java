package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "toMoney", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoneyMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money toMoney(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
        java.lang.Object currencyCode = bnplAcquisitionMoneyFragment.getCurrencyCode();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null, bnplAcquisitionMoneyFragment.getValue());
    }
}
