package com.paypal.oslo.feature.taptopay.data.payair.worker;

/* loaded from: classes15.dex */
public final class PayairReplenishPaymentKeysWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase> Camera2StreamConfigurationMap;

    private PayairReplenishPaymentKeysWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.domain.usecase.replenishment.payair.PayairReplenishPaymentKeysUseCase payairReplenishPaymentKeysUseCase) {
        return new com.paypal.oslo.feature.taptopay.data.payair.worker.PayairReplenishPaymentKeysWorker(context, workerParameters, payairReplenishPaymentKeysUseCase);
    }
}
