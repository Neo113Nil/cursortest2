package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

/* loaded from: classes15.dex */
public final class GetEligibilityAndBalancesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> getHighSpeedVideoSizes;

    private GetEligibilityAndBalancesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository fIFORepository) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase(fIFORepository);
    }
}
