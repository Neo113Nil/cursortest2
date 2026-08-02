package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAtomicPublicTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> getHighSpeedVideoFpsRangesFor;

    private GetAtomicPublicTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase newInstance(com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository depositSwitchDDRepository) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetAtomicPublicTokenUseCase(depositSwitchDDRepository);
    }
}
