package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class NotifyCardDeletedWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private NotifyCardDeletedWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardDeletedNotifier cardDeletedNotifier, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler processNotifyDeleteCardResultHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker(context, workerParameters, cardDeletedNotifier, processNotifyDeleteCardResultHandler, coroutineDispatcher);
    }
}
