package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class NotifyCardSuspendedWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private NotifyCardSuspendedWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardSuspendedNotifier cardSuspendedNotifier, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler processNotifySuspendCardResultHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardSuspendedWorker(context, workerParameters, cardSuspendedNotifier, processNotifySuspendCardResultHandler, coroutineDispatcher);
    }
}
