package com.paypal.oslo.feature.wallet.preferred.ui.online;

/* loaded from: classes16.dex */
public final class OnlinePaymentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase> getHighSpeedVideoFpsRanges;

    private OnlinePaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase> provider3) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase getOnlinePaymentDataUseCase, com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase updatePaymentPreferenceUseCase) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel(appNavigator, getOnlinePaymentDataUseCase, updatePaymentPreferenceUseCase);
    }
}
