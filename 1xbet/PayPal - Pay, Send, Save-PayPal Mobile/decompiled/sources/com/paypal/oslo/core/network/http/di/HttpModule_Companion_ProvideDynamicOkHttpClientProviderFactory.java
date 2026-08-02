package com.paypal.oslo.core.network.http.di;

/* loaded from: classes4.dex */
public final class HttpModule_Companion_ProvideDynamicOkHttpClientProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> getOutputMinFrameDuration;

    private HttpModule_Companion_ProvideDynamicOkHttpClientProviderFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> provider4, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider7) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getOutputFormats = provider6;
        this.getOutputMinFrameDuration = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider get() {
        return provideDynamicOkHttpClientProvider(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideDynamicOkHttpClientProviderFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> provider4, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider7) {
        return new com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideDynamicOkHttpClientProviderFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider provideDynamicOkHttpClientProvider(android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig httpConfig, java.util.Set<okhttp3.Interceptor> set, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker) {
        return (com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.http.di.HttpModule.INSTANCE.provideDynamicOkHttpClientProvider(context, httpConfig, set, cronetEngineFactory, cronetInterceptorFactory, coroutineScope, networkConnectivityChecker));
    }
}
