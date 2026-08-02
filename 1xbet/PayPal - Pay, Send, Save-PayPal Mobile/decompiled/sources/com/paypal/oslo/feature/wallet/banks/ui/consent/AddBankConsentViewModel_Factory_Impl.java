package com.paypal.oslo.feature.wallet.banks.ui.consent;

/* loaded from: classes15.dex */
public final class AddBankConsentViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory getHighSpeedVideoSizes;

    private AddBankConsentViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory c0439AddBankConsentViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0439AddBankConsentViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel create(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams) {
        return this.getHighSpeedVideoSizes.get(addBankConsentFlowContentId, instantBankConfirmationAggregatorParams);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory c0439AddBankConsentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel_Factory_Impl(c0439AddBankConsentViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.consent.C0439AddBankConsentViewModel_Factory c0439AddBankConsentViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel_Factory_Impl(c0439AddBankConsentViewModel_Factory));
    }
}
