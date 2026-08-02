package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

/* loaded from: classes12.dex */
public final class CheckBiometricLoginEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> getHighSpeedVideoSizes;

    private CheckBiometricLoginEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider2) {
        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase newInstance(com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository) {
        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.CheckBiometricLoginEligibilityUseCase(getRememberedUserUseCase, biometricEligibilityRepository);
    }
}
