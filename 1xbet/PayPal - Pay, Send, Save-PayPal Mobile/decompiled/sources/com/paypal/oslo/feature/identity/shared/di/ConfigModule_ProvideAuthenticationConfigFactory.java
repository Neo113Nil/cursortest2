package com.paypal.oslo.feature.identity.shared.di;

/* loaded from: classes5.dex */
public final class ConfigModule_ProvideAuthenticationConfigFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> getHighSpeedVideoSizes;

    private ConfigModule_ProvideAuthenticationConfigFactory(dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig get() {
        return provideAuthenticationConfig(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.shared.di.ConfigModule_ProvideAuthenticationConfigFactory create(dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider) {
        return new com.paypal.oslo.feature.identity.shared.di.ConfigModule_ProvideAuthenticationConfigFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig provideAuthenticationConfig(com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.shared.di.ConfigModule.INSTANCE.provideAuthenticationConfig(authConfigProvider));
    }
}
