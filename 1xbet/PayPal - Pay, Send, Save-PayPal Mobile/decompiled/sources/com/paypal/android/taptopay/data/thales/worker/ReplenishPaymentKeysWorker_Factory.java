package com.paypal.android.taptopay.data.thales.worker;

/* loaded from: classes10.dex */
public final class ReplenishPaymentKeysWorker_Factory {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase> Camera2StreamConfigurationMap;

    public ReplenishPaymentKeysWorker_Factory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_Factory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase> provider) {
        return new com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_Factory(provider);
    }

    public static com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase replenishPaymentKeysUseCase) {
        return new com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker(context, workerParameters, replenishPaymentKeysUseCase);
    }
}
