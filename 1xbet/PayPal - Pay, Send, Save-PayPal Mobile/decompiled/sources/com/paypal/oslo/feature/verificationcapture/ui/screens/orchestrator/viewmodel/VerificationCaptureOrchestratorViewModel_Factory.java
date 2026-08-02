package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel;

/* loaded from: classes15.dex */
public final class VerificationCaptureOrchestratorViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService> getHighSpeedVideoSizes;

    private VerificationCaptureOrchestratorViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel newInstance(com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService verificationCaptureService, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel(verificationCaptureService, verificationCaptureWebViewDelegateImpl);
    }
}
