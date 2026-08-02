package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class ClaimMoneyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ClaimMoneyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.ClaimMoneyRepository claimMoneyRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.ClaimMoneyUseCase(claimMoneyRepository);
    }
}
