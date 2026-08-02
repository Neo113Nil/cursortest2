package com.paypal.oslo.feature.balance.ui.autoReload;

/* loaded from: classes11.dex */
public final class AutoReloadViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getOutputMinFrameDuration;

    private AutoReloadViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider8) {
        this.getInputFormats = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
        this.getHighSpeedVideoSizes = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel get() {
        return newInstance(this.getInputFormats.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> provider8) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel newInstance(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadReducer autoReloadReducer, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase turnOffAutoTransferUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase checkAutoTransferEnabledUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel(autoReloadReducer, localeInformation, formatCurrencyUseCase, getAutoReloadInitialConfigUseCase, getAccountTypeUseCase, turnOffAutoTransferUseCase, checkAutoTransferEnabledUseCase, formatOrdinalUseCase);
    }
}
