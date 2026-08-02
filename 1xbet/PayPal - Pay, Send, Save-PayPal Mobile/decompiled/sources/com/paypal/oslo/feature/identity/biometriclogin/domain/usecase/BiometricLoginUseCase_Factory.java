package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

/* loaded from: classes12.dex */
public final class BiometricLoginUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> getInputSizeshNQ4ISI;

    private BiometricLoginUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> provider7) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> provider7) {
        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase newInstance(com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository, com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper biometricKeyWrapper, com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator biometricAuthenticator, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations authKeyOperations) {
        return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase(biometricEligibilityRepository, biometricKeyWrapper, biometricAuthenticator, deviceBindingTokenStorage, loginUseCase, base64Encoder, authKeyOperations);
    }
}
