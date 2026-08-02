package com.paypal.oslo.core.network.http;

/* loaded from: classes10.dex */
public final class DynamicOkHttpClientProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<kotlin.jvm.functions.Function0<java.lang.Boolean>> getOutputMinFrameDuration;

    private DynamicOkHttpClientProvider_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> provider4, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6, dagger.internal.Provider<kotlin.jvm.functions.Function0<java.lang.Boolean>> provider7) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getOutputMinFrameDuration = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.network.http.config.HttpConfig> provider2, dagger.internal.Provider<java.util.Set<okhttp3.Interceptor>> provider3, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetEngineFactory> provider4, dagger.internal.Provider<com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider6, dagger.internal.Provider<kotlin.jvm.functions.Function0<java.lang.Boolean>> provider7) {
        return new com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider newInstance(android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig httpConfig, java.util.Set<okhttp3.Interceptor> set, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        return new com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider(context, httpConfig, set, cronetEngineFactory, cronetInterceptorFactory, coroutineScope, function0);
    }
}
