package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class LinkDirectDepositAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> getHighSpeedVideoSizes;

    private LinkDirectDepositAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase newInstance(com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository depositSwitchDDRepository) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.LinkDirectDepositAccountUseCase(depositSwitchDDRepository);
    }
}
