package com.paypal.oslo.feature.taptopay.data.repository.payment;

/* loaded from: classes15.dex */
public final class PaymentRepositoryWrapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoSizes;

    private PaymentRepositoryWrapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper newInstance(javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider2, javax.inject.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider3, com.paypal.oslo.feature.taptopay.data.wallet.ImplementationSelector implementationSelector, com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager) {
        return new com.paypal.oslo.feature.taptopay.data.repository.payment.PaymentRepositoryWrapper(provider, provider2, provider3, implementationSelector, manager);
    }
}
