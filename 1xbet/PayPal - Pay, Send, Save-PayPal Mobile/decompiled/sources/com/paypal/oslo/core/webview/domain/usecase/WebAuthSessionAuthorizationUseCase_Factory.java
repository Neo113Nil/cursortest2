package com.paypal.oslo.core.webview.domain.usecase;

/* loaded from: classes10.dex */
public final class WebAuthSessionAuthorizationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository> getHighSpeedVideoFpsRanges;

    private WebAuthSessionAuthorizationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository> provider2) {
        return new com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase newInstance(com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase validateURLUseCase, com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository webAuthSessionRepository) {
        return new com.paypal.oslo.core.webview.domain.usecase.WebAuthSessionAuthorizationUseCase(validateURLUseCase, webAuthSessionRepository);
    }
}
