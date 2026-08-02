package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class ProcessNotifyAddCardResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ProcessNotifyAddCardResultHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.AddCardStore addCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyAddCardResultHandler(context, addCardStore);
    }
}
