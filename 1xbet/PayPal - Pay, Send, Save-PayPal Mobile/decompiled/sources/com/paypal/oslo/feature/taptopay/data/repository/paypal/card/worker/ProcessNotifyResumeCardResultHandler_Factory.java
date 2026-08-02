package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class ProcessNotifyResumeCardResultHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> getHighSpeedVideoSizes;

    private ProcessNotifyResumeCardResultHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore resumeCardStore) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessNotifyResumeCardResultHandler(context, resumeCardStore);
    }
}
