package com.paypal.oslo.feature.taptopay.data.repository.payment;

/* loaded from: classes15.dex */
public final class TransactionRepositoryWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> getHighSpeedVideoFpsRanges;

    private TransactionRepositoryWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper get() {
        return newInstance(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper newInstance(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository> provider2, com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector implementationSelector) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payment.TransactionRepositoryWrapper(provider, provider2, implementationSelector);
    }
}
