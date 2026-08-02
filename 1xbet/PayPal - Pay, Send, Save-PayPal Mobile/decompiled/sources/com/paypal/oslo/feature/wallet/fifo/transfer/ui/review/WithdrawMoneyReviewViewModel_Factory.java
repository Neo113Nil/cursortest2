package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

/* loaded from: classes15.dex */
public final class WithdrawMoneyReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private WithdrawMoneyReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel newInstance(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetWithdrawalOptionsUseCase getWithdrawalOptionsUseCase, com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.WithdrawFundsUseCase withdrawFundsUseCase) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel(getWithdrawalOptionsUseCase, withdrawFundsUseCase);
    }
}
