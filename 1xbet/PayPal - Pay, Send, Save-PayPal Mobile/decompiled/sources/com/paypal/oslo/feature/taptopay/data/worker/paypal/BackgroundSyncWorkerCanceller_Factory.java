package com.paypal.oslo.feature.taptopay.data.worker.paypal;

/* loaded from: classes15.dex */
public final class BackgroundSyncWorkerCanceller_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller> {
    private final dagger.internal.Provider<androidx.work.WorkManager> Camera2StreamConfigurationMap;

    private BackgroundSyncWorkerCanceller_Factory(dagger.internal.Provider<androidx.work.WorkManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller_Factory create(dagger.internal.Provider<androidx.work.WorkManager> provider) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller newInstance(androidx.work.WorkManager workManager) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller(workManager);
    }
}
