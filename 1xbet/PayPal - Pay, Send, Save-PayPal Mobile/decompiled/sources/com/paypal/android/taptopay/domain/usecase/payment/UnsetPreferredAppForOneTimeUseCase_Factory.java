package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class UnsetPreferredAppForOneTimeUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRanges;

    public UnsetPreferredAppForOneTimeUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase(paymentRepository);
    }
}
