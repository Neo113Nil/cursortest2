package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

/* loaded from: classes15.dex */
public final class AmountSelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoFpsRanges;

    private AmountSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel newInstance(com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase, com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel(getEligibilityUseCase, amountFormatter, walletFeatureManager);
    }
}
