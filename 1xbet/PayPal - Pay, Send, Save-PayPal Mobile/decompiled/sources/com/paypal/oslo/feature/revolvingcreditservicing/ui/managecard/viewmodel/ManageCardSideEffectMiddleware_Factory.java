package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* loaded from: classes14.dex */
public final class ManageCardSideEffectMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase> getOutputFormats;

    private ManageCardSideEffectMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider7) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProductConfigurationsUseCase getProductConfigurationsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase updateCreditInstrumentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase updateStatementDeliveryPreferenceUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardSideEffectMiddleware(manageCardDetailsUiModelMapper, getProductConfigurationsUseCase, currencyFormatterFacade, updateCreditInstrumentUseCase, updateStatementDeliveryPreferenceUseCase, getAccountSummaryUseCase, featureGateManager);
    }
}
