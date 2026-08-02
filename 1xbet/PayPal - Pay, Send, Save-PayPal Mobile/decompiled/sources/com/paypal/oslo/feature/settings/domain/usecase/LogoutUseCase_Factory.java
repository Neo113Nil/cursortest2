package com.paypal.oslo.feature.settings.domain.usecase;

/* loaded from: classes14.dex */
public final class LogoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.session.LogoutCoordinator> getHighResolutionOutputSizeshNQ4ISI;

    private LogoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.session.LogoutCoordinator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.session.LogoutCoordinator> provider) {
        return new com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase newInstance(com.paypal.oslo.core.session.LogoutCoordinator logoutCoordinator) {
        return new com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase(logoutCoordinator);
    }
}
