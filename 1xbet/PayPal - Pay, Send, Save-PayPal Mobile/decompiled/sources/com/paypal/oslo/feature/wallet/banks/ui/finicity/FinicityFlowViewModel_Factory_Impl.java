package com.paypal.oslo.feature.wallet.banks.ui.finicity;

/* loaded from: classes15.dex */
public final class FinicityFlowViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private FinicityFlowViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory c0442FinicityFlowViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0442FinicityFlowViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str5, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str, str2, str3, str4, integrationType, str5, addFIFlow, externalBankAccessAction, str6, instantBankConfirmationBankDetails);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory c0442FinicityFlowViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel_Factory_Impl(c0442FinicityFlowViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.finicity.C0442FinicityFlowViewModel_Factory c0442FinicityFlowViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel_Factory_Impl(c0442FinicityFlowViewModel_Factory));
    }
}
