package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class ExecuteRequestTransferUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> getHighSpeedVideoSizes;

    private ExecuteRequestTransferUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository paymentTransferRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase(paymentTransferRepository);
    }
}
