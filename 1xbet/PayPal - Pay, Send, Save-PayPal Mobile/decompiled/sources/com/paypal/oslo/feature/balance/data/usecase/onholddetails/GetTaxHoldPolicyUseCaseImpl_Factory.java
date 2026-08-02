package com.paypal.oslo.feature.balance.data.usecase.onholddetails;

/* loaded from: classes11.dex */
public final class GetTaxHoldPolicyUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> getHighSpeedVideoSizes;

    private GetTaxHoldPolicyUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.onholddetails.GetTaxHoldPolicyUseCaseImpl(balanceRepository);
    }
}
