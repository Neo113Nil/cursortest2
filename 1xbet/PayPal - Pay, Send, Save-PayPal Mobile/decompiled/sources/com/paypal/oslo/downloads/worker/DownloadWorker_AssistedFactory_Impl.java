package com.paypal.oslo.downloads.worker;

/* loaded from: classes10.dex */
public final class DownloadWorker_AssistedFactory_Impl implements com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory {
    private final com.paypal.oslo.downloads.worker.DownloadWorker_Factory getHighResolutionOutputSizeshNQ4ISI;

    private DownloadWorker_AssistedFactory_Impl(com.paypal.oslo.downloads.worker.DownloadWorker_Factory downloadWorker_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = downloadWorker_Factory;
    }

    @Override // androidx.hilt.work.WorkerAssistedFactory
    public final com.paypal.oslo.downloads.worker.DownloadWorker create(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(context, workerParameters);
    }

    public static javax.inject.Provider<com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory> create(com.paypal.oslo.downloads.worker.DownloadWorker_Factory downloadWorker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory_Impl(downloadWorker_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory> createFactoryProvider(com.paypal.oslo.downloads.worker.DownloadWorker_Factory downloadWorker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory_Impl(downloadWorker_Factory));
    }
}
