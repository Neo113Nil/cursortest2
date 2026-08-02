package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes5.dex */
public final class CheckoutGraphQlModule_ProvideApolloClientFactory implements dagger.internal.Factory<com.apollographql.apollo.ApolloClient> {
    private final dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> getInputFormats;

    private CheckoutGraphQlModule_ProvideApolloClientFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3, dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> provider4, dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> provider5, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getInputFormats = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.apollographql.apollo.ApolloClient get() {
        return provideApolloClient(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideApolloClientFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3, dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> provider4, dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> provider5, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.ApolloStoreFactory> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule_ProvideApolloClientFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.apollographql.apollo.ApolloClient provideApolloClient(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, android.content.Context context, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> set, com.paypal.oslo.core.network.graphql.ApolloStoreFactory apolloStoreFactory) {
        return (com.apollographql.apollo.ApolloClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.CheckoutGraphQlModule.INSTANCE.provideApolloClient(dynamicOkHttpClientProvider, context, graphQlConfig, httpRequestComposer, set, apolloStoreFactory));
    }
}
