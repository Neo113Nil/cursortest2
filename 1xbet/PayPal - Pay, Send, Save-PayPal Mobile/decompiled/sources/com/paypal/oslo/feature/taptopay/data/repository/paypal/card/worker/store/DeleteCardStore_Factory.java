package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

/* loaded from: classes15.dex */
public final class DeleteCardStore_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private DeleteCardStore_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore(context);
    }
}
