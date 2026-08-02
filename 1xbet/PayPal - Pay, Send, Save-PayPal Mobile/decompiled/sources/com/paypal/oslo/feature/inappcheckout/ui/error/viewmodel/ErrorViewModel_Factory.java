package com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel;

/* loaded from: classes13.dex */
public final class ErrorViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private ErrorViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel newInstance(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel(savedStateHandle, checkoutLogger, analyticsTracer, handleInAppLinkUseCase);
    }
}
