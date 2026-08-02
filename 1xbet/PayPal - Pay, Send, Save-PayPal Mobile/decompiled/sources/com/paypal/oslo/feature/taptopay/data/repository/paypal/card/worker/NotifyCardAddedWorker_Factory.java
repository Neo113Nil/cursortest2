package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class NotifyCardAddedWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler> getHighSpeedVideoSizes;

    private NotifyCardAddedWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier cardAddedNotifier, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler processNotifyAddCardResultHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker(context, workerParameters, cardAddedNotifier, processNotifyAddCardResultHandler, coroutineDispatcher);
    }
}
