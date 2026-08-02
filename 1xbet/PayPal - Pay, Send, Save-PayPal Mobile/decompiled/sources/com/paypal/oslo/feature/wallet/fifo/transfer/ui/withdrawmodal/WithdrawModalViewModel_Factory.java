package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

/* loaded from: classes16.dex */
public final class WithdrawModalViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoSizes;

    private WithdrawModalViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel newInstance(com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel(getEligibilityUseCase, walletFeatureManager);
    }
}
