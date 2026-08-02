package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class ProcessNotifySuspendCardResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> getHighSpeedVideoSizes;

    private ProcessNotifySuspendCardResultHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.SuspendCardStore suspendCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifySuspendCardResultHandler(context, suspendCardStore);
    }
}
