package com.paypal.oslo.feature.pushnotification.delivery.data.worker;

/* loaded from: classes13.dex */
public final class ProcessNotificationActionWorker_AssistedFactory_Impl implements com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory {
    private final com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory Camera2StreamConfigurationMap;

    private ProcessNotificationActionWorker_AssistedFactory_Impl(com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory processNotificationActionWorker_Factory) {
        this.Camera2StreamConfigurationMap = processNotificationActionWorker_Factory;
    }

    @Override // androidx.hilt.work.WorkerAssistedFactory
    public final com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker create(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return this.Camera2StreamConfigurationMap.get(context, workerParameters);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory> create(com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory processNotificationActionWorker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory_Impl(processNotificationActionWorker_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory> createFactoryProvider(com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory processNotificationActionWorker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_AssistedFactory_Impl(processNotificationActionWorker_Factory));
    }
}
