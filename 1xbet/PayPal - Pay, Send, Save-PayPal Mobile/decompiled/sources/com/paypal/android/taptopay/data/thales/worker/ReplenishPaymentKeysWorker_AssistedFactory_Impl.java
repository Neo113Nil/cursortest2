package com.paypal.android.taptopay.data.thales.worker;

/* loaded from: classes10.dex */
public final class ReplenishPaymentKeysWorker_AssistedFactory_Impl implements com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_AssistedFactory {
    private final com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_Factory getHighSpeedVideoFpsRangesFor;

    private ReplenishPaymentKeysWorker_AssistedFactory_Impl(com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_Factory replenishPaymentKeysWorker_Factory) {
        this.getHighSpeedVideoFpsRangesFor = replenishPaymentKeysWorker_Factory;
    }

    @Override // androidx.hilt.work.WorkerAssistedFactory
    public final com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker create(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return this.getHighSpeedVideoFpsRangesFor.get(context, workerParameters);
    }

    public static javax.inject.Provider<com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_AssistedFactory> create(com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_Factory replenishPaymentKeysWorker_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_AssistedFactory_Impl(replenishPaymentKeysWorker_Factory));
    }
}
