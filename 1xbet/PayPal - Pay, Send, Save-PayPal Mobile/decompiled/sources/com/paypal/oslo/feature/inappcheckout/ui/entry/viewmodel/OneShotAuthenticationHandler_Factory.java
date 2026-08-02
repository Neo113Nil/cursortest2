package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

/* loaded from: classes13.dex */
public final class OneShotAuthenticationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoSizes;

    private OneShotAuthenticationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetOneShotCheckoutUrlUseCase getOneShotCheckoutUrlUseCase, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler(getOneShotCheckoutUrlUseCase, getCheckoutPreferencesUseCase, appSwitchSession, checkoutLogger);
    }
}
