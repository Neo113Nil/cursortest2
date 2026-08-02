package com.paypal.android.taptopay.data.thales.worker;

@dagger.Module
/* loaded from: classes10.dex */
public interface ReplenishPaymentKeysWorker_HiltModule {
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker")
    androidx.hilt.work.WorkerAssistedFactory<? extends androidx.work.ListenableWorker> bind(com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker_AssistedFactory replenishPaymentKeysWorker_AssistedFactory);
}
