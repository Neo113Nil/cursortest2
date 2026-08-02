package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

/* loaded from: classes13.dex */
public final class AppSwitchEntryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> getOutputStallDurationlomOqCM;

    private AppSwitchEntryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor> provider7, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider8, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler> provider9, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider10, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> provider11) {
        this.getHighSpeedVideoSizesFor = provider;
        this.getInputFormats = provider2;
        this.getInputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getOutputStallDurationlomOqCM = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
        this.getHighSpeedVideoFpsRangesFor = provider10;
        this.getOutputFormats = provider11;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel get() {
        return newInstance(this.getHighSpeedVideoSizesFor.get(), this.getInputFormats.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor> provider7, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider8, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler> provider9, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider10, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver> provider11) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.entry.reducer.AppSwitchEntryReducer appSwitchEntryReducer, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase handleUniversalLinkUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.domain.usecase.TrackMonitoringEventUseCase trackMonitoringEventUseCase, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler oneShotAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.ui.entry.handler.CheckoutFlowHandler checkoutFlowHandler, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver.CheckoutAppLifecycleObserver checkoutAppLifecycleObserver) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel(appSwitchEntryReducer, handleUniversalLinkUseCase, checkoutLogger, analyticsTracer, trackMonitoringEventUseCase, oneShotAuthenticationHandler, authenticationResultProcessor, featureGateManager, checkoutFlowHandler, appSwitchSession, checkoutAppLifecycleObserver);
    }
}
