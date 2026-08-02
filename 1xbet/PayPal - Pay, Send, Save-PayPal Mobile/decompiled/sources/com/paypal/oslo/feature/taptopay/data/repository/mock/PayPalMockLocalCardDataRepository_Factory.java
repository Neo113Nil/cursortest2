package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class PayPalMockLocalCardDataRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private PayPalMockLocalCardDataRepository_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository(context);
    }
}
