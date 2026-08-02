package com.paypal.oslo.feature.identity.llslogin.domain.usecase;

/* loaded from: classes12.dex */
public final class LLSLoginUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> getOutputFormats;

    private LLSLoginUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getInputFormats = provider2;
        this.getOutputFormats = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getOutputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker> provider7) {
        return new com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase newInstance(com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository lLSEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper nonBiometricKeyWrapper, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder, com.paypal.oslo.feature.identity.foundation.security.AuthKeyOperations authKeyOperations, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker) {
        return new com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase(lLSEligibilityRepository, nonBiometricKeyWrapper, deviceBindingTokenStorage, loginUseCase, base64Encoder, authKeyOperations, identityAnalyticsTracker);
    }
}
