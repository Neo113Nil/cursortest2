package com.paypal.oslo.downloads.impl.notification;

/* loaded from: classes10.dex */
public final class DownloadActionHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.notification.DownloadActionHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> getHighSpeedVideoSizes;

    private DownloadActionHandler_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.notification.DownloadActionHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.downloads.impl.notification.DownloadActionHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider3) {
        return new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.downloads.impl.notification.DownloadActionHandler newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        return new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler(downloadManager, workerNotificationManager, downloadDispatchers);
    }
}
