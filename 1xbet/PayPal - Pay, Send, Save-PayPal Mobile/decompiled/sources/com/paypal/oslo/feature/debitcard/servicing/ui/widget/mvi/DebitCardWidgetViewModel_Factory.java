package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

/* loaded from: classes12.dex */
public final class DebitCardWidgetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputMinFrameDuration;

    private DebitCardWidgetViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider8, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider10) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getOutputFormats = provider5;
        this.getInputFormats = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getHighSpeedVideoSizes = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getHighSpeedVideoFpsRanges = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider> provider8, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider10) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel newInstance(android.content.Context context, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitCardWidgetUseCase getDebitCardWidgetUseCase, com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider debitInstrumentProductDefinitionProvider, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetReducer debitCardWidgetReducer, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.dynamicconfig.DynamicConfigManager dynamicConfigManager, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityProvider bankingBundleEligibilityProvider, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.IsInContextTapToPayEligibleUseCase isInContextTapToPayEligibleUseCase, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel(context, userStore, getDebitCardWidgetUseCase, debitInstrumentProductDefinitionProvider, debitCardWidgetReducer, featureGateManager, dynamicConfigManager, bankingBundleEligibilityProvider, isInContextTapToPayEligibleUseCase, debitCardWebViewUrlBuilder);
    }
}
