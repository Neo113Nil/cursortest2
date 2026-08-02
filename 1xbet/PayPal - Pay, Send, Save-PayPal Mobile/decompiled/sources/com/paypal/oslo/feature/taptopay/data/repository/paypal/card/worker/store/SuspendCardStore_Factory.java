package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

/* loaded from: classes15.dex */
public final class SuspendCardStore_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private SuspendCardStore_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore(context);
    }
}
