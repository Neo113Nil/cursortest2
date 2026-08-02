package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

/* loaded from: classes13.dex */
public final class HandleUniversalLinkUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> getHighSpeedVideoFpsRangesFor;

    private HandleUniversalLinkUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase newInstance(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase(appSwitchSession, analyticsTracer);
    }
}
