package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockPaymentRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private MockPaymentRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository newInstance(android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository mockTransactionRepository) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockPaymentRepository(context, mockTransactionRepository);
    }
}
