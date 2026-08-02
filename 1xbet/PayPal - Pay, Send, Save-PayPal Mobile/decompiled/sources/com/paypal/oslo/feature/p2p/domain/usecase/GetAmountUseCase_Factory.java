package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class GetAmountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.AmountRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetAmountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.AmountRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.AmountRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.AmountRepository amountRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase(amountRepository);
    }
}
