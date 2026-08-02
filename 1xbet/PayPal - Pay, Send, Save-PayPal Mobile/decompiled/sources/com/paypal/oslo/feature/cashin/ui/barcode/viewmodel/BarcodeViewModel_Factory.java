package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

/* loaded from: classes11.dex */
public final class BarcodeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getOutputMinFrameDuration;

    private BarcodeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> provider8, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider9) {
        this.getOutputFormats = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
        this.getHighSpeedVideoFpsRangesFor = provider9;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel get() {
        return newInstance(this.getOutputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> provider8, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider9) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel newInstance(com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase getCashInActivationDetailsUseCase, com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase getDebitCardEligibilityUseCase, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration cashInDynamicConfiguration, com.paypal.oslo.feature.cashin.manager.CashInFeatureManager cashInFeatureManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel(getCashInActivationDetailsUseCase, getDebitCardEligibilityUseCase, debitInstrumentProductDefinitionProvider, dateTimeFormatUseCase, formatCurrencyUseCase, localeInformation, cashInDynamicConfiguration, cashInFeatureManager, coroutineDispatcher);
    }
}
