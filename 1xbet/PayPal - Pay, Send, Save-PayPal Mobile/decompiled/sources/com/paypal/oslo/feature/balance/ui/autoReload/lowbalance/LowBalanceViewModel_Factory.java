package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

/* loaded from: classes11.dex */
public final class LowBalanceViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase> getOutputMinFrameDuration;

    private LowBalanceViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider6) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel newInstance(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceReducer lowBalanceReducer, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase turnOffLowBalanceAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel(lowBalanceReducer, formatCurrencyUseCase, getAutoReloadInitialConfigUseCase, turnOffLowBalanceAutoReloadUseCase, getAccountTypeUseCase, balanceFeatureManager);
    }
}
