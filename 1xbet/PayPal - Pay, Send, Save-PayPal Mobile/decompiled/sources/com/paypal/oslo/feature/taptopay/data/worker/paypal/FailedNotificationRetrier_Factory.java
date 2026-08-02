package com.paypal.oslo.feature.taptopay.data.worker.paypal;

/* loaded from: classes15.dex */
public final class FailedNotificationRetrier_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> getOutputMinFrameDuration;

    private FailedNotificationRetrier_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> provider7) {
        this.getInputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getOutputMinFrameDuration = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> provider7) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier newInstance(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore addCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore deleteCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore resumeCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore suspendCardStore, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore updateCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier(backgroundSyncWorkerScheduler, coroutineDispatcher, addCardStore, deleteCardStore, resumeCardStore, suspendCardStore, updateCardStore);
    }
}
