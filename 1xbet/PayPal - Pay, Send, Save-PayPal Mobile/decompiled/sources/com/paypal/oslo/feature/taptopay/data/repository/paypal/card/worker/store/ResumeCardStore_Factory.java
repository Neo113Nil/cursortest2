package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

/* loaded from: classes15.dex */
public final class ResumeCardStore_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ResumeCardStore_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore(context);
    }
}
