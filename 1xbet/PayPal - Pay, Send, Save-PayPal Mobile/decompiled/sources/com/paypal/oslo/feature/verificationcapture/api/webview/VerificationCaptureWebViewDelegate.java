package com.paypal.oslo.feature.verificationcapture.api.webview;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0018\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH'¢\u0006\u0004\b\n\u0010\u0019J-\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\n\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;", "", "context", "", "setWorkflowContext", "(Ljava/lang/Object;)V", "getWorkflowContext", "()Ljava/lang/Object;", "", "resultJson", "onCaptureResult", "(Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Landroid/webkit/WebView;", "webView", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "webViewId", "registerWebView", "(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/Integer;)V", "fragment", "registerWebViewFromFragment", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;I)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface VerificationCaptureWebViewDelegate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate.Companion INSTANCE = com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate.Companion.getHighSpeedVideoSizes;

    java.lang.Object getWorkflowContext();

    void onCaptureResult(java.lang.String resultJson);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use onCaptureResult(String) instead - bridge manages WebView reference")
    void onCaptureResult(java.lang.String resultJson, java.lang.ref.WeakReference<android.webkit.WebView> webView);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use onCaptureResult(String) instead - bridge manages WebView reference")
    void onCaptureResult(java.lang.String resultJson, java.lang.ref.WeakReference<android.app.Activity> activity, int webViewId);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use SecureWebView with VerificationCaptureWebViewConfigProvider instead")
    void registerWebView(java.lang.ref.WeakReference<android.app.Activity> activity, java.lang.ref.WeakReference<android.webkit.WebView> webView, com.paypal.oslo.core.navigation.AppNavigator navigator, java.lang.Integer webViewId);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use SecureWebView with VerificationCaptureWebViewConfigProvider instead")
    void registerWebViewFromFragment(java.lang.ref.WeakReference<?> fragment, java.lang.ref.WeakReference<android.webkit.WebView> webView, com.paypal.oslo.core.navigation.AppNavigator navigator, java.lang.Integer webViewId);

    void setWorkflowContext(java.lang.Object context);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void registerWebView$default(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerWebView");
        }
        if ((i & 8) != 0) {
            num = null;
        }
        verificationCaptureWebViewDelegate.registerWebView(weakReference, weakReference2, appNavigator, num);
    }

    static /* synthetic */ void registerWebViewFromFragment$default(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerWebViewFromFragment");
        }
        if ((i & 8) != 0) {
            num = null;
        }
        verificationCaptureWebViewDelegate.registerWebViewFromFragment(weakReference, weakReference2, appNavigator, num);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;", "getInstance", "()Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;", "delegate", "", "setInstance", "(Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private static volatile com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate Camera2StreamConfigurationMap;
        static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate.Companion();

        private Companion() {
        }

        public final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate getInstance() {
            com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate = Camera2StreamConfigurationMap;
            if (verificationCaptureWebViewDelegate != null) {
                return verificationCaptureWebViewDelegate;
            }
            throw new java.lang.IllegalStateException("VerificationCaptureWebViewDelegate is not initialized. Make sure the verification-capture module is included in your build.".toString());
        }

        @kotlin.jvm.JvmStatic
        public final void setInstance(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            Camera2StreamConfigurationMap = delegate;
        }
    }

    @kotlin.jvm.JvmStatic
    static void setInstance(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate) {
        INSTANCE.setInstance(verificationCaptureWebViewDelegate);
    }
}
