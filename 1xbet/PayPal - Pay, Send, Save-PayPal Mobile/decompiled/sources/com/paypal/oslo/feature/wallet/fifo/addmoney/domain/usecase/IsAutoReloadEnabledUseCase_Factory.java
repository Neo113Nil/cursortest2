package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase;

/* loaded from: classes15.dex */
public final class IsAutoReloadEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> Camera2StreamConfigurationMap;

    private IsAutoReloadEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository addMoneyRepository) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase(addMoneyRepository);
    }
}
