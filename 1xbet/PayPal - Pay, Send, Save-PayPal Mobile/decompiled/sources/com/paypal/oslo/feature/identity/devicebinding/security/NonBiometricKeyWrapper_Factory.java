package com.paypal.oslo.feature.identity.devicebinding.security;

/* loaded from: classes12.dex */
public final class NonBiometricKeyWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> getHighSpeedVideoFpsRangesFor;

    private NonBiometricKeyWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> provider) {
        return new com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper newInstance(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        return new com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper(authSecureKeyWrapper);
    }
}
