package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class CheckoutGraphQlModule_ProvideDefaultHttpRequestComposerFactory implements dagger.internal.Factory<com.apollographql.apollo.api.http.DefaultHttpRequestComposer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> Camera2StreamConfigurationMap;

    private CheckoutGraphQlModule_ProvideDefaultHttpRequestComposerFactory(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.api.http.DefaultHttpRequestComposer get() {
        return provideDefaultHttpRequestComposer(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideDefaultHttpRequestComposerFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideDefaultHttpRequestComposerFactory(provider);
    }

    public static com.apollographql.apollo.api.http.DefaultHttpRequestComposer provideDefaultHttpRequestComposer(com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        return (com.apollographql.apollo.api.http.DefaultHttpRequestComposer) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule.INSTANCE.provideDefaultHttpRequestComposer(graphQlConfig));
    }
}
