package com.paypal.oslo.downloads.impl.engine;

/* loaded from: classes10.dex */
public final class DownloadFileExecutor_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> getHighSpeedVideoSizes;

    private DownloadFileExecutor_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider3) {
        return new com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor newInstance(com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient, com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator, com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter) {
        return new com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor(downloadHttpClient, contentValidator, fileDeleter);
    }
}
