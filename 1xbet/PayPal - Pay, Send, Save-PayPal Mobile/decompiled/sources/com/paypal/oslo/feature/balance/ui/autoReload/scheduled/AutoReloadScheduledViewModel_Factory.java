package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

/* loaded from: classes11.dex */
public final class AutoReloadScheduledViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledReducer> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getOutputFormats;

    private AutoReloadScheduledViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider8) {
        this.getHighSpeedVideoSizesFor = provider;
        this.getOutputFormats = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getInputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.Camera2StreamConfigurationMap = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel get() {
        return newInstance(this.getHighSpeedVideoSizesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider8) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel newInstance(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledReducer autoReloadScheduledReducer, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase turnOffScheduledAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel(autoReloadScheduledReducer, localeInformation, formatCurrencyUseCase, getAutoReloadInitialConfigUseCase, turnOffScheduledAutoReloadUseCase, getAccountTypeUseCase, balanceFeatureManager, formatOrdinalUseCase);
    }
}
