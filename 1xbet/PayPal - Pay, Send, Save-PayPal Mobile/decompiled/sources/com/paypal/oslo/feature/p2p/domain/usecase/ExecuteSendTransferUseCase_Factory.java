package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class ExecuteSendTransferUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> Camera2StreamConfigurationMap;

    private ExecuteSendTransferUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository paymentTransferRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase(paymentTransferRepository);
    }
}
