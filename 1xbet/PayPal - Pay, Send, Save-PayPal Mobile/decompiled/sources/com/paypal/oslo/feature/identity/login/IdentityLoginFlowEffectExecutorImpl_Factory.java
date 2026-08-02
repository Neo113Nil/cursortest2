package com.paypal.oslo.feature.identity.login;

/* loaded from: classes12.dex */
public final class IdentityLoginFlowEffectExecutorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ActivityProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> getHighSpeedVideoSizes;

    private IdentityLoginFlowEffectExecutorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ActivityProvider> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ActivityProvider> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl newInstance(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase, com.paypal.oslo.feature.identity.login.ActivityProvider activityProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl(biometricLoginUseCase, passkeyLoginUseCase, verifyCredentialUseCase, activityProvider, appNavigator);
    }
}
