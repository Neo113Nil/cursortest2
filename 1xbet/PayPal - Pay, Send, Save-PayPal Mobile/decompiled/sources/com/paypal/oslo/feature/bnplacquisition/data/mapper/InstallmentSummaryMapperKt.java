package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InstallmentSummary;", "toInStoreVccDetailsInstallmentSummary", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InstallmentSummary;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentSummaryMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary toInStoreVccDetailsInstallmentSummary(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionInstallmentSummaryFragment, "");
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionInstallmentSummaryFragment.getInstallmentAmount().getBnplAcquisitionMoneyFragment());
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.Companion companion = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.InstallmentFrequency.INSTANCE;
        java.lang.Object installmentFrequency = bnplAcquisitionInstallmentSummaryFragment.getInstallmentFrequency();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InstallmentSummary(money, companion.fromString(installmentFrequency instanceof java.lang.String ? (java.lang.String) installmentFrequency : null), java.lang.String.valueOf(bnplAcquisitionInstallmentSummaryFragment.getTotalInstallmentsCount()));
    }
}
