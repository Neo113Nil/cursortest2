package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class PayPalMockCardRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private PayPalMockCardRepository_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository(context);
    }
}
