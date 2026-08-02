package com.paypal.oslo.feature.identity.passwordlogin.domain.usecase;

/* loaded from: classes12.dex */
public final class PasswordUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> getHighSpeedVideoFpsRangesFor;

    private PasswordUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider) {
        return new com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase newInstance(com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase) {
        return new com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase(loginUseCase);
    }
}
