package com.paypal.oslo.feature.shaketoreport.di;

/* loaded from: classes14.dex */
public final class JiraOkHttpClientProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private JiraOkHttpClientProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider newInstance(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.shaketoreport.di.JiraOkHttpClientProvider(dynamicOkHttpClientProvider, coroutineScope);
    }
}
