package com.paypal.oslo.core.network.rest.di;

/* loaded from: classes4.dex */
public final class RestModule_Companion_ProvideRetrofit$rest_releaseFactory implements dagger.internal.Factory<retrofit2.Retrofit> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighResolutionOutputSizeshNQ4ISI;

    private RestModule_Companion_ProvideRetrofit$rest_releaseFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final retrofit2.Retrofit get() {
        return provideRetrofit$rest_release(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.network.rest.di.RestModule_Companion_ProvideRetrofit$rest_releaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2) {
        return new com.paypal.oslo.core.network.rest.di.RestModule_Companion_ProvideRetrofit$rest_releaseFactory(provider, provider2);
    }

    public static retrofit2.Retrofit provideRetrofit$rest_release(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        return (retrofit2.Retrofit) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.rest.di.RestModule.INSTANCE.provideRetrofit$rest_release(dynamicOkHttpClientProvider, restConfig));
    }
}
