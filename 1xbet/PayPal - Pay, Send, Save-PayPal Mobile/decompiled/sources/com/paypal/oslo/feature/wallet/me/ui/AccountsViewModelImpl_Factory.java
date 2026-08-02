package com.paypal.oslo.feature.wallet.me.ui;

/* loaded from: classes16.dex */
public final class AccountsViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private AccountsViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase> provider5) {
        return new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase defaultProductsUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase) {
        return new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl(appNavigator, walletFeatureManager, defaultProductsUseCase, formatCurrencyUseCase, walletComponentsUseCase);
    }
}
