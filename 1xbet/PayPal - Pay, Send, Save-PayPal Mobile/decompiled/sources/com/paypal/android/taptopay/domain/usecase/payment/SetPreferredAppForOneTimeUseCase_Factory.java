package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class SetPreferredAppForOneTimeUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoSizes;

    public SetPreferredAppForOneTimeUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase(paymentRepository);
    }
}
