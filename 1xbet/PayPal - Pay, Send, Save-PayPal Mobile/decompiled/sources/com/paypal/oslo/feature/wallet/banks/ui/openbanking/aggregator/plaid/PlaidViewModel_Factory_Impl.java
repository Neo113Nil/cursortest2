package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

/* loaded from: classes15.dex */
public final class PlaidViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory getHighSpeedVideoSizes;

    private PlaidViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory c0444PlaidViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0444PlaidViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel create(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2) {
        return this.getHighSpeedVideoSizes.get(addFIFlow, externalBankAccessAction, str, instantBankConfirmationBankDetails, str2);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory c0444PlaidViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel_Factory_Impl(c0444PlaidViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.C0444PlaidViewModel_Factory c0444PlaidViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel_Factory_Impl(c0444PlaidViewModel_Factory));
    }
}
