package com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase;

/* loaded from: classes13.dex */
public final class PasswordRecoveryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator> getHighSpeedVideoSizes;

    private PasswordRecoveryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator> provider2) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase newInstance(com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository passwordRecoveryRepository, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator passwordValidator) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase(passwordRecoveryRepository, passwordValidator);
    }
}
