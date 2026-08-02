package com.paypal.oslo.feature.identity.login.data;

/* loaded from: classes12.dex */
public final class AuthenticationInputFactoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoSizes;

    private AuthenticationInputFactoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        return new com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl newInstance(com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig) {
        return new com.paypal.oslo.feature.identity.login.data.AuthenticationInputFactoryImpl(authenticationConfig);
    }
}
