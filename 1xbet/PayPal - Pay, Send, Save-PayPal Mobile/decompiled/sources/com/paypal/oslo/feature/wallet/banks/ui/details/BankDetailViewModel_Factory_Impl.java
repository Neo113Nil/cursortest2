package com.paypal.oslo.feature.wallet.banks.ui.details;

/* loaded from: classes15.dex */
public final class BankDetailViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private BankDetailViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory c0440BankDetailViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0440BankDetailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel create(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory c0440BankDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel_Factory_Impl(c0440BankDetailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.details.C0440BankDetailViewModel_Factory c0440BankDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel_Factory_Impl(c0440BankDetailViewModel_Factory));
    }
}
