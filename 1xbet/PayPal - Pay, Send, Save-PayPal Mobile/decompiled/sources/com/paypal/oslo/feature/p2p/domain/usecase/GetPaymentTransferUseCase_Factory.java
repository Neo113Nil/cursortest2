package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPaymentTransferUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> getHighSpeedVideoSizes;

    private GetPaymentTransferUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository claimMoneyRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferUseCase(claimMoneyRepository);
    }
}
