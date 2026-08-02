package com.paypal.oslo.downloads.worker;

@dagger.Module
/* loaded from: classes10.dex */
public interface DownloadWorker_HiltModule {
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("com.paypal.oslo.downloads.worker.DownloadWorker")
    androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker> bind(com.paypal.oslo.downloads.worker.DownloadWorker_AssistedFactory downloadWorker_AssistedFactory);
}
