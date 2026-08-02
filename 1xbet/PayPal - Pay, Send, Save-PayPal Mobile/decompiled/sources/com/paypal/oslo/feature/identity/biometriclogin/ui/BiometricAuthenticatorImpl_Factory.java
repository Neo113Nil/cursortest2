package com.paypal.oslo.feature.identity.biometriclogin.ui;

/* loaded from: classes12.dex */
public final class BiometricAuthenticatorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager> getHighSpeedVideoFpsRanges;

    private BiometricAuthenticatorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager> provider) {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl newInstance(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager biometricPromptManager) {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl(biometricPromptManager);
    }
}
