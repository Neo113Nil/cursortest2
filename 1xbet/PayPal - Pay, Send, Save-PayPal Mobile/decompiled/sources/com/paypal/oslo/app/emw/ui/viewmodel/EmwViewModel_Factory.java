package com.paypal.oslo.app.emw.ui.viewmodel;

/* loaded from: classes10.dex */
public final class EmwViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighSpeedVideoSizes;

    private EmwViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider3) {
        return new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel newInstance(com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase, com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel(webAuthSessionAuthorizationUseCase, identitySession, webEnvironmentProvider);
    }
}
