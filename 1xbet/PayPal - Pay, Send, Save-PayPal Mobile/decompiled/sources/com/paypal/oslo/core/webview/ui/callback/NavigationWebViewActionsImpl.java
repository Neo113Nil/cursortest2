package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActionsImpl;", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "Landroid/webkit/WebView;", "webView", "", "source", "<init>", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "canGoForward", "()Z", "goForward", "canGoBack", "goBack", "", "reload", "()V", "dispose$webview_release", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/WeakReference;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavigationWebViewActionsImpl implements com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<android.webkit.WebView> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public NavigationWebViewActionsImpl(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = new java.lang.ref.WeakReference<>(webView);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions
    public final boolean canGoForward() {
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges.get();
        if (webView != null) {
            return webView.canGoForward();
        }
        return false;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions
    public final boolean goForward() {
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges.get();
        if (webView == null || !webView.canGoForward()) {
            webView = null;
        }
        boolean z = webView != null;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] navigation goForward", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("success", java.lang.String.valueOf(z))), null, 4, null);
        if (webView != null) {
            webView.goForward();
        }
        return z;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions
    public final boolean canGoBack() {
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges.get();
        if (webView != null) {
            return webView.canGoBack();
        }
        return false;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions
    public final boolean goBack() {
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges.get();
        if (webView == null || !webView.canGoBack()) {
            webView = null;
        }
        boolean z = webView != null;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] navigation goBack", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("success", java.lang.String.valueOf(z))), null, 4, null);
        if (webView != null) {
            webView.goBack();
        }
        return z;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions
    public final void reload() {
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges.get();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap);
        pairArr[1] = kotlin.TuplesKt.to("webview_available", java.lang.String.valueOf(webView != null));
        com.paypal.android.logger.Logger.d$default(logger, "[Webview] navigation reload", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (webView != null) {
            webView.reload();
        }
    }

    public final void dispose$webview_release() {
        this.getHighSpeedVideoFpsRanges.clear();
    }
}
