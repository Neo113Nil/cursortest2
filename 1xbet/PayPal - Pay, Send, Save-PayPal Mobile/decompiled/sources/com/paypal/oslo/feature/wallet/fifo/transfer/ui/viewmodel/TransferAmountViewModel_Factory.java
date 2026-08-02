package com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel;

/* loaded from: classes16.dex */
public final class TransferAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase> getHighSpeedVideoFpsRangesFor;

    private TransferAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel newInstance(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase getEligibilityAndBalancesUseCase, com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetBalancesUseCase getBalancesUseCase) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel(getEligibilityAndBalancesUseCase, getBalancesUseCase);
    }
}
