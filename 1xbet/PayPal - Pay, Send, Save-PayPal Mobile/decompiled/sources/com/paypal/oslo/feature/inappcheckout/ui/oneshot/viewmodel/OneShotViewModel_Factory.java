package com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel;

/* loaded from: classes13.dex */
public final class OneShotViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer> getOutputMinFrameDuration;

    private OneShotViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider6) {
        this.getOutputMinFrameDuration = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel newInstance(com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer oneShotReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase getAuthDataUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase initializeNativeRypCheckoutUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel(oneShotReducer, getAuthDataUseCase, initializeNativeRypCheckoutUseCase, appSwitchSession, mockFileNameProvider, analyticsTracer);
    }
}
