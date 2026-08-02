package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes10.dex */
public final class DownloadOkHttpClientProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private DownloadOkHttpClientProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider newInstance(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider(dynamicOkHttpClientProvider, coroutineScope);
    }
}
