package com.paypal.oslo.feature.taptopay.data.payair.register;

/* loaded from: classes15.dex */
public final class AuthTokenImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> Camera2StreamConfigurationMap;

    private AuthTokenImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl newInstance(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl(tokenProvider);
    }
}
