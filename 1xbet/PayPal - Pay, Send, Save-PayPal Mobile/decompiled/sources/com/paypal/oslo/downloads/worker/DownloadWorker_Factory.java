package com.paypal.oslo.downloads.worker;

/* loaded from: classes10.dex */
public final class DownloadWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadEngine> getHighSpeedVideoSizes;

    private DownloadWorker_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadEngine> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    public final com.paypal.oslo.downloads.worker.DownloadWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.downloads.worker.DownloadWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadEngine> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager> provider3) {
        return new com.paypal.oslo.downloads.worker.DownloadWorker_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.downloads.worker.DownloadWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao, com.paypal.oslo.downloads.impl.engine.DownloadEngine downloadEngine, com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager) {
        return new com.paypal.oslo.downloads.worker.DownloadWorker(context, workerParameters, downloadDao, downloadEngine, workerNotificationManager);
    }
}
