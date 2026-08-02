package com.paypal.oslo.downloads.impl;

/* loaded from: classes10.dex */
public final class DownloadManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.DownloadManagerImpl> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadStorageProvider> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.worker.DownloadWorkScheduler> getOutputMinFrameDuration;

    private DownloadManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> provider, dagger.internal.Provider<com.paypal.oslo.downloads.worker.DownloadWorkScheduler> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadStorageProvider> provider3, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider4, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider5, dagger.internal.Provider<kotlinx.serialization.json.Json> provider6, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider7) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getOutputFormats = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.DownloadManagerImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.downloads.impl.DownloadManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> provider, dagger.internal.Provider<com.paypal.oslo.downloads.worker.DownloadWorkScheduler> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadStorageProvider> provider3, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider4, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider5, dagger.internal.Provider<kotlinx.serialization.json.Json> provider6, dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker> provider7) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.downloads.impl.DownloadManagerImpl newInstance(com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler, com.paypal.oslo.downloads.api.DownloadStorageProvider downloadStorageProvider, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers, com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter, kotlinx.serialization.json.Json json, com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl(downloadDao, downloadWorkScheduler, downloadStorageProvider, downloadDispatchers, fileDeleter, json, networkConnectivityChecker);
    }
}
