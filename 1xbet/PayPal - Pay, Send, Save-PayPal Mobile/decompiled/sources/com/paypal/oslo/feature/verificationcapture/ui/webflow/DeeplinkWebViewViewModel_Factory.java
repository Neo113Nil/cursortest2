package com.paypal.oslo.feature.verificationcapture.ui.webflow;

/* loaded from: classes15.dex */
public final class DeeplinkWebViewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> getHighSpeedVideoSizes;

    private DeeplinkWebViewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider3, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider3, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider4) {
        return new com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel newInstance(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl verificationCaptureWebViewConfigurerImpl, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewViewModel(verificationCaptureWebViewDelegateImpl, verificationCaptureWebViewConfigurerImpl, restConfig, tokenProvider);
    }
}
