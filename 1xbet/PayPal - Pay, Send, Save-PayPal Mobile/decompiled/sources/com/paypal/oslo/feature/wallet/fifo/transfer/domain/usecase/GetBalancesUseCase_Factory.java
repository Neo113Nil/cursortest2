package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

/* loaded from: classes15.dex */
public final class GetBalancesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> getHighSpeedVideoFpsRanges;

    private GetBalancesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository fIFORepository) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase(fIFORepository);
    }
}
