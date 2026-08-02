package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class ResolvePaymentContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> getHighSpeedVideoFpsRangesFor;

    private ResolvePaymentContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase(transferFlowRepository);
    }
}
