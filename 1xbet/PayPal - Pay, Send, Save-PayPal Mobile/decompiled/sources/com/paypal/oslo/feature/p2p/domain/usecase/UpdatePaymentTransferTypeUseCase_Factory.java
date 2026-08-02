package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class UpdatePaymentTransferTypeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> getHighSpeedVideoSizes;

    private UpdatePaymentTransferTypeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.UpdatePaymentTransferTypeUseCase(transferFlowRepository);
    }
}
