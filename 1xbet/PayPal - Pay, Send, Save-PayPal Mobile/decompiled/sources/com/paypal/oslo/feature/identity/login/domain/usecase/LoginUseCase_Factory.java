package com.paypal.oslo.feature.identity.login.domain.usecase;

/* loaded from: classes12.dex */
public final class LoginUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository> getHighResolutionOutputSizeshNQ4ISI;

    private LoginUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository> provider) {
        return new com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase newInstance(com.paypal.oslo.feature.identity.login.domain.repository.LoginRepository loginRepository) {
        return new com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase(loginRepository);
    }
}
