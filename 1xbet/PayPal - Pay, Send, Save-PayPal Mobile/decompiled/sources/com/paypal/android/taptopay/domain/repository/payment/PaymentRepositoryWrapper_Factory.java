package com.paypal.android.taptopay.domain.repository.payment;

/* loaded from: classes10.dex */
public final class PaymentRepositoryWrapper_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> getHighSpeedVideoSizes;

    public PaymentRepositoryWrapper_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        return new com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper newInstance(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository, com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        return new com.paypal.android.taptopay.domain.repository.payment.PaymentRepositoryWrapper(paymentRepository, paymentRepository2, implementationSelector);
    }
}
