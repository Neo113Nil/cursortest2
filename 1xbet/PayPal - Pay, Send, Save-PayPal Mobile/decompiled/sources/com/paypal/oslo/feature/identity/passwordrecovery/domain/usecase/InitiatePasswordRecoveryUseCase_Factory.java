package com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase;

/* loaded from: classes13.dex */
public final class InitiatePasswordRecoveryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> Camera2StreamConfigurationMap;

    private InitiatePasswordRecoveryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> provider) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase newInstance(com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository passwordRecoveryRepository) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase(passwordRecoveryRepository);
    }
}
