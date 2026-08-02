package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

/* loaded from: classes15.dex */
public final class UpdateCardStore_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private UpdateCardStore_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore(context);
    }
}
