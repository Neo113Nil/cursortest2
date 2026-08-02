package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class ProcessOneShotAuthenticationDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;

    private ProcessOneShotAuthenticationDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase(appSwitchSession);
    }
}
