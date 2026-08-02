package com.paypal.oslo.feature.verificationcapture.webview;

/* loaded from: classes15.dex */
public final class VerificationCaptureWebViewDelegateImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.webview.VerificationCaptureWebViewDelegateImpl_Factory();

        private InstanceHolder() {
        }
    }
}
