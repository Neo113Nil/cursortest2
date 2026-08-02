package com.paypal.oslo.feature.taptopay.data.payair.worker;

/* loaded from: classes15.dex */
public final class PayairWorkManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private PayairWorkManager_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.payair.worker.PayairWorkManager(context);
    }
}
