package com.paypal.oslo.downloads.impl.data;

/* loaded from: classes10.dex */
public final class DownloadHttpClientImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider> getHighSpeedVideoSizes;

    private DownloadHttpClientImpl_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider2) {
        return new com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl newInstance(com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider downloadOkHttpClientProvider, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        return new com.paypal.oslo.downloads.impl.data.DownloadHttpClientImpl(downloadOkHttpClientProvider, downloadDispatchers);
    }
}
