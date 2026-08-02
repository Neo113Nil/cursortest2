package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideGetTaxHoldPolicyUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> Camera2StreamConfigurationMap;

    private UseCaseModule_ProvideGetTaxHoldPolicyUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase get() {
        return provideGetTaxHoldPolicyUseCase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetTaxHoldPolicyUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetTaxHoldPolicyUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase provideGetTaxHoldPolicyUseCase(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideGetTaxHoldPolicyUseCase(balanceRepository));
    }
}
