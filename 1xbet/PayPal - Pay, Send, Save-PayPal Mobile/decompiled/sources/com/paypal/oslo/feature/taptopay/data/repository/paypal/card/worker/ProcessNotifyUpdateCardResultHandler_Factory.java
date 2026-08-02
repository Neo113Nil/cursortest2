package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class ProcessNotifyUpdateCardResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private ProcessNotifyUpdateCardResultHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.UpdateCardStore updateCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyUpdateCardResultHandler(context, updateCardStore);
    }
}
