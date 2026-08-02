package com.paypal.oslo.feature.pushnotification.delivery.data.worker;

@dagger.Module
/* loaded from: classes13.dex */
public interface ProcessNotificationActionWorker_HiltModule {
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker")
    androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker> bind(com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory processNotificationActionWorker_AssistedFactory);
}
