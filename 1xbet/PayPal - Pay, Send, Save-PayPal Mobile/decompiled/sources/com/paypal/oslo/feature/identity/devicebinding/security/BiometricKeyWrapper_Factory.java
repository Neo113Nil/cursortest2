package com.paypal.oslo.feature.identity.devicebinding.security;

/* loaded from: classes12.dex */
public final class BiometricKeyWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> Camera2StreamConfigurationMap;

    private BiometricKeyWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        return new com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper newInstance(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        return new com.paypal.oslo.feature.identity.devicebinding.security.BiometricKeyWrapper(authSecureKeyWrapper);
    }
}
