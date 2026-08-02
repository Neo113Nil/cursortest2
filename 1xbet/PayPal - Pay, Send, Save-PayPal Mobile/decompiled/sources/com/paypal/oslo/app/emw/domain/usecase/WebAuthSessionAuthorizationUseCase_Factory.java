package com.paypal.oslo.app.emw.domain.usecase;

/* loaded from: classes10.dex */
public final class WebAuthSessionAuthorizationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.ValidateURLUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.app.emw.domain.repository.WebAuthSessionRepository> getHighResolutionOutputSizeshNQ4ISI;

    private WebAuthSessionAuthorizationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.ValidateURLUseCase> provider, dagger.internal.Provider<com.paypal.oslo.app.emw.domain.repository.WebAuthSessionRepository> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.app.emw.domain.usecase.ValidateURLUseCase> provider, dagger.internal.Provider<com.paypal.oslo.app.emw.domain.repository.WebAuthSessionRepository> provider2) {
        return new com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase newInstance(com.paypal.oslo.app.emw.domain.usecase.ValidateURLUseCase validateURLUseCase, com.paypal.oslo.app.emw.domain.repository.WebAuthSessionRepository webAuthSessionRepository) {
        return new com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase(validateURLUseCase, webAuthSessionRepository);
    }
}
