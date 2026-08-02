package com.paypal.oslo.feature.inappcheckout.features.switchback;

/* loaded from: classes13.dex */
public final class ReturnToMerchantHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getInputFormats;

    private ReturnToMerchantHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getInputFormats = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider6, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider7) {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCancelActionFromSwitchBackUseCase getCancelActionFromSwitchBackUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.SaveCheckoutExperienceUseCase saveCheckoutExperienceUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase handleUniversalLinkUseCase, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler(getCancelActionFromSwitchBackUseCase, saveCheckoutExperienceUseCase, appSwitchSession, checkoutUrlHandler, handleUniversalLinkUseCase, checkoutLogger, analyticsTracer);
    }
}
