package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class StartPaymentFromRequestUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> getHighSpeedVideoSizes;

    private StartPaymentFromRequestUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider2) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository paymentRequestRepository, com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase(paymentRequestRepository, transferFlowRepository);
    }
}
