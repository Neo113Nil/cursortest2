package com.paypal.oslo.feature.taptopay.data.worker.paypal;

/* loaded from: classes15.dex */
public final class BackgroundSyncWorkerScheduler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> {
    private final dagger.internal.Provider<androidx.work.WorkManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.work.Constraints> getHighResolutionOutputSizeshNQ4ISI;

    private BackgroundSyncWorkerScheduler_Factory(dagger.internal.Provider<androidx.work.WorkManager> provider, dagger.internal.Provider<androidx.work.Constraints> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler_Factory create(dagger.internal.Provider<androidx.work.WorkManager> provider, dagger.internal.Provider<androidx.work.Constraints> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler newInstance(androidx.work.WorkManager workManager, androidx.work.Constraints constraints) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler(workManager, constraints);
    }
}
