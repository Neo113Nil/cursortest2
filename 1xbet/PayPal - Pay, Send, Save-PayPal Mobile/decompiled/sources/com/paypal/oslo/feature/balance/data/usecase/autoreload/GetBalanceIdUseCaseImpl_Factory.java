package com.paypal.oslo.feature.balance.data.usecase.autoreload;

/* loaded from: classes11.dex */
public final class GetBalanceIdUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> Camera2StreamConfigurationMap;

    private GetBalanceIdUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl(balanceRepository);
    }
}
