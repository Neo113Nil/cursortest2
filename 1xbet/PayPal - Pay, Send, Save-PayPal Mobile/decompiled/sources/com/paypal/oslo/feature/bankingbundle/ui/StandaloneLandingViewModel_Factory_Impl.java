package com.paypal.oslo.feature.bankingbundle.ui;

/* loaded from: classes11.dex */
public final class StandaloneLandingViewModel_Factory_Impl implements com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory {
    private final com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory Camera2StreamConfigurationMap;

    private StandaloneLandingViewModel_Factory_Impl(com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory c0307StandaloneLandingViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0307StandaloneLandingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory
    public final com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel create(boolean z) {
        return this.Camera2StreamConfigurationMap.get(z);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory> create(com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory c0307StandaloneLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel_Factory_Impl(c0307StandaloneLandingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.bankingbundle.ui.C0307StandaloneLandingViewModel_Factory c0307StandaloneLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.bankingbundle.ui.StandaloneLandingViewModel_Factory_Impl(c0307StandaloneLandingViewModel_Factory));
    }
}
