package com.paypal.oslo.core.network.graphql;

/* loaded from: classes10.dex */
public final class DynamicApolloClientProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getOutputMinFrameDuration;

    private DynamicApolloClientProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3, dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> provider4, dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getOutputMinFrameDuration = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.apollographql.apollo.cache.normalized.ApolloStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3, dagger.internal.Provider<com.apollographql.apollo.api.http.HttpRequestComposer> provider4, dagger.internal.Provider<java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor>> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6) {
        return new com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider newInstance(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> set, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider(dynamicOkHttpClientProvider, apolloStore, graphQlConfig, httpRequestComposer, set, coroutineScope);
    }
}
