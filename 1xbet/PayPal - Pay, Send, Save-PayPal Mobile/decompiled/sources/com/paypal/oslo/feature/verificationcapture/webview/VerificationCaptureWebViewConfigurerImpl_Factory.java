package com.paypal.oslo.feature.verificationcapture.webview;

/* loaded from: classes15.dex */
public final class VerificationCaptureWebViewConfigurerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> getHighSpeedVideoFpsRangesFor;

    private VerificationCaptureWebViewConfigurerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider> provider3) {
        return new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl newInstance(com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource, com.paypal.oslo.feature.verificationcapture.webview.ActivityProvider activityProvider) {
        return new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewConfigurerImpl(verificationCaptureWebViewDelegateImpl, faceTecLivenessDataSource, activityProvider);
    }
}
