package com.paypal.oslo.downloads.worker;

/* loaded from: classes10.dex */
public final class DownloadWorkScheduler_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.worker.DownloadWorkScheduler> {
    private final dagger.internal.Provider<androidx.work.WorkManager> getHighSpeedVideoFpsRangesFor;

    private DownloadWorkScheduler_Factory(dagger.internal.Provider<androidx.work.WorkManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.worker.DownloadWorkScheduler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.downloads.worker.DownloadWorkScheduler_Factory create(dagger.internal.Provider<androidx.work.WorkManager> provider) {
        return new com.paypal.oslo.downloads.worker.DownloadWorkScheduler_Factory(provider);
    }

    public static com.paypal.oslo.downloads.worker.DownloadWorkScheduler newInstance(androidx.work.WorkManager workManager) {
        return new com.paypal.oslo.downloads.worker.DownloadWorkScheduler(workManager);
    }
}
