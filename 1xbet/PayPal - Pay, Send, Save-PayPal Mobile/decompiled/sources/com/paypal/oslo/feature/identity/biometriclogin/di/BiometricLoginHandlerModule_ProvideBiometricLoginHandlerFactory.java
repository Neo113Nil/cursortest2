package com.paypal.oslo.feature.identity.biometriclogin.di;

/* loaded from: classes12.dex */
public final class BiometricLoginHandlerModule_ProvideBiometricLoginHandlerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> getHighSpeedVideoFpsRangesFor;

    private BiometricLoginHandlerModule_ProvideBiometricLoginHandlerFactory(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler get() {
        return provideBiometricLoginHandler(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginHandlerModule_ProvideBiometricLoginHandlerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase> provider) {
        return new com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginHandlerModule_ProvideBiometricLoginHandlerFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler provideBiometricLoginHandler(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase) {
        return (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.biometriclogin.di.BiometricLoginHandlerModule.INSTANCE.provideBiometricLoginHandler(biometricLoginUseCase));
    }
}
