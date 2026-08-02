package com.paypal.oslo.feature.taptopay.data.repository.thales;

/* loaded from: classes15.dex */
public final class ThalesPaymentRepositoryAdapter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository> getHighSpeedVideoFpsRangesFor;

    private ThalesPaymentRepositoryAdapter_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter newInstance(android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository thalesPaymentRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesPaymentRepositoryAdapter(context, thalesPaymentRepository);
    }
}
