package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

/* loaded from: classes15.dex */
public final class ReviewScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.GetDepositOptionsUseCase> getHighSpeedVideoSizes;

    private ReviewScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.GetDepositOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.GetDepositOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> provider5) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel newInstance(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.IsAutoReloadEnabledUseCase isAutoReloadEnabledUseCase, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.DepositFulfillmentUseCase depositFulfillmentUseCase, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter amountFormatter) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel(getDepositOptionsUseCase, isAutoReloadEnabledUseCase, depositFulfillmentUseCase, walletFeatureManager, amountFormatter);
    }
}
