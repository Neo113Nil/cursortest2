package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

/* loaded from: classes13.dex */
public final class AuthenticationResultProcessor_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private AuthenticationResultProcessor_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor newInstance(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase buildAuthenticationResultFromAuthResponseUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor(buildAuthenticationResultFromAuthResponseUseCase, appSwitchSession, checkoutLogger);
    }
}
