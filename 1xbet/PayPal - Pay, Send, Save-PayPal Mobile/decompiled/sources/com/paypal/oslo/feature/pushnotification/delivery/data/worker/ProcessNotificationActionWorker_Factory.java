package com.paypal.oslo.feature.pushnotification.delivery.data.worker;

/* loaded from: classes13.dex */
public final class ProcessNotificationActionWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private ProcessNotificationActionWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    public final com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase> provider) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessNotificationActionUseCase processNotificationActionUseCase) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker(context, workerParameters, processNotificationActionUseCase);
    }
}
