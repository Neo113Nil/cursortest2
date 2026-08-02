package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase;

/* loaded from: classes15.dex */
public final class DepositFulfillmentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DepositFulfillmentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository> provider) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase newInstance(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.repository.AddMoneyRepository addMoneyRepository) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase(addMoneyRepository);
    }
}
