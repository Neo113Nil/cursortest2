package com.paypal.android.taptopay.data.thales.replenishment;

/* loaded from: classes10.dex */
public final class CardPaymentKeysReplenisher_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;

    public CardPaymentKeysReplenisher_Factory(javax.inject.Provider<com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase> provider, javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher_Factory create(javax.inject.Provider<com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase> provider, javax.inject.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher_Factory(provider, provider2);
    }

    public static com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher newInstance(com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase backgroundSyncWorkerUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher(backgroundSyncWorkerUseCase, coroutineDispatcher);
    }
}
