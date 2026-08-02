package com.paypal.oslo.feature.identity.foundation.security;

/* loaded from: classes12.dex */
public final class AuthSecureKeyWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> Camera2StreamConfigurationMap;

    private AuthSecureKeyWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.Base64Encoder> provider) {
        return new com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper newInstance(com.paypal.oslo.feature.identity.shared.domain.Base64Encoder base64Encoder) {
        return new com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper(base64Encoder);
    }
}
