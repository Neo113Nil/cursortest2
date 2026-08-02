package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class ProcessNotifyDeleteCardResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ProcessNotifyDeleteCardResultHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DeleteCardStore deleteCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyDeleteCardResultHandler(context, deleteCardStore);
    }
}
