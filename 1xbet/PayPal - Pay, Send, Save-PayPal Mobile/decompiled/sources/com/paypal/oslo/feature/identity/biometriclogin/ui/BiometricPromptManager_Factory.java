package com.paypal.oslo.feature.identity.biometriclogin.ui;

/* loaded from: classes12.dex */
public final class BiometricPromptManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory> getHighSpeedVideoSizes;

    private BiometricPromptManager_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory> provider) {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager newInstance(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory biometricPromptFactory) {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptManager(biometricPromptFactory);
    }
}
