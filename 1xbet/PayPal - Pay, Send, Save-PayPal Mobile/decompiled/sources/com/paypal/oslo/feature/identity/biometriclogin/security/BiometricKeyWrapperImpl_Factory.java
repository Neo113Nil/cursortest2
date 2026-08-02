package com.paypal.oslo.feature.identity.biometriclogin.security;

/* loaded from: classes12.dex */
public final class BiometricKeyWrapperImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> getHighSpeedVideoFpsRangesFor;

    private BiometricKeyWrapperImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        return new com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl newInstance(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        return new com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl(authSecureKeyWrapper);
    }
}
