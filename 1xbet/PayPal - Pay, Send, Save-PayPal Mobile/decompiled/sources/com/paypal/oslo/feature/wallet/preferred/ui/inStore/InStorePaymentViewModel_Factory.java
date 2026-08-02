package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

/* loaded from: classes16.dex */
public final class InStorePaymentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private InStorePaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase> provider3) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.GetInstorePaymentDataUseCase getInstorePaymentDataUseCase, com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase updateInstorePaymentPreferenceUseCase) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentViewModel(appNavigator, getInstorePaymentDataUseCase, updateInstorePaymentPreferenceUseCase);
    }
}
