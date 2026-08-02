package com.paypal.oslo.feature.wallet.fifo.common.domain.usecase;

/* loaded from: classes15.dex */
public final class GetEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> getHighSpeedVideoFpsRangesFor;

    private GetEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.common.domain.repository.FIFORepository fIFORepository) {
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase(fIFORepository);
    }
}
