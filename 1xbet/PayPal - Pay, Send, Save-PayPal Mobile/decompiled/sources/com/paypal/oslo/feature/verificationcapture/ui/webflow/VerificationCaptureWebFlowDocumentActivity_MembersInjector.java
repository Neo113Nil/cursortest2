package com.paypal.oslo.feature.verificationcapture.ui.webflow;

/* loaded from: classes15.dex */
public final class VerificationCaptureWebFlowDocumentActivity_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> getHighSpeedVideoSizes;

    private VerificationCaptureWebFlowDocumentActivity_MembersInjector(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity) {
        injectDelegate(verificationCaptureWebFlowDocumentActivity, this.getHighSpeedVideoSizes.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity> create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> provider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity_MembersInjector(provider);
    }

    public static void injectDelegate(com.paypal.oslo.feature.verificationcapture.ui.webflow.VerificationCaptureWebFlowDocumentActivity verificationCaptureWebFlowDocumentActivity, com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl verificationCaptureWebViewDelegateImpl) {
        verificationCaptureWebFlowDocumentActivity.delegate = verificationCaptureWebViewDelegateImpl;
    }
}
