package com.paypal.android.taptopay.data.thales.payment;

/* loaded from: classes10.dex */
public final class ThalesPaymentRepository_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository> {
    private final javax.inject.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> getHighSpeedVideoSizes;

    public ThalesPaymentRepository_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider2) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository_Factory(provider, provider2);
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository newInstance(android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentRepository(context, thalesPaymentDataSource);
    }
}
