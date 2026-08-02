package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPaymentRequestUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> getHighSpeedVideoFpsRangesFor;

    private GetPaymentRequestUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository paymentRequestRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentRequestUseCase(paymentRequestRepository);
    }
}
