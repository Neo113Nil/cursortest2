package com.paypal.oslo.core.webview.ui.viewmodel;

/* loaded from: classes10.dex */
public final class SecureWebViewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.SecureWebViewAppConfig> getHighSpeedVideoFpsRanges;

    private SecureWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.webview.config.SecureWebViewAppConfig> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.webview.config.SecureWebViewAppConfig> provider3) {
        return new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel newInstance(com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase, com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase validateURLUseCase, com.paypal.oslo.core.webview.config.SecureWebViewAppConfig secureWebViewAppConfig) {
        return new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel(webAuthSessionAuthorizationUseCase, validateURLUseCase, secureWebViewAppConfig);
    }
}
