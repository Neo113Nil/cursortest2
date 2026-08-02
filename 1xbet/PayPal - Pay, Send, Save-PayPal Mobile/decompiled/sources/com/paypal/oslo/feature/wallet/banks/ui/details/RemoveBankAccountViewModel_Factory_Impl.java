package com.paypal.oslo.feature.wallet.banks.ui.details;

/* loaded from: classes15.dex */
public final class RemoveBankAccountViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory Camera2StreamConfigurationMap;

    private RemoveBankAccountViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory c0441RemoveBankAccountViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0441RemoveBankAccountViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.Factory
    public final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel create(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.Factory> create(com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory c0441RemoveBankAccountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel_Factory_Impl(c0441RemoveBankAccountViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.banks.ui.details.C0441RemoveBankAccountViewModel_Factory c0441RemoveBankAccountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel_Factory_Impl(c0441RemoveBankAccountViewModel_Factory));
    }
}
