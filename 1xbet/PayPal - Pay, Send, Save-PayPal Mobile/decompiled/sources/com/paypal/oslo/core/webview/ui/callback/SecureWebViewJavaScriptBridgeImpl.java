package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridgeImpl;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "Landroid/webkit/WebView;", "webView", "", "source", "<init>", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "script", "Lkotlin/Function1;", "", "resultCallback", "evaluateJavaScript", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "dispose$webview_release", "()V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "", "isAvailable", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewJavaScriptBridgeImpl implements com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<android.webkit.WebView> getHighSpeedVideoFpsRangesFor;

    public SecureWebViewJavaScriptBridgeImpl(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(webView);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge
    public final void evaluateJavaScript(java.lang.String script, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> resultCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "");
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRangesFor.get();
        if (webView == null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS evaluation failed - WebView unavailable", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap)), null, null, 12, null);
            if (resultCallback != null) {
                resultCallback.invoke(null);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("evaluateJavaScript must be called from the main (UI) thread".toString());
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap);
        pairArr[1] = kotlin.TuplesKt.to("script_length", java.lang.String.valueOf(script.length()));
        pairArr[2] = kotlin.TuplesKt.to("has_callback", java.lang.String.valueOf(resultCallback != null));
        com.paypal.android.logger.Logger.d$default(logger, "[Webview] JS evaluation requested", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        webView.evaluateJavascript(script, new android.webkit.ValueCallback() { // from class: com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl.m11697$r8$lambda$rgCfY3jt_LwflfkftZB8k4V9Dc(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
            }
        });
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge
    public final boolean isAvailable() {
        return this.getHighSpeedVideoFpsRangesFor.get() != null;
    }

    public final void dispose$webview_release() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS bridge disposed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.Camera2StreamConfigurationMap)), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    /* renamed from: $r8$lambda$rgC-fY3jt_LwflfkftZB8k4V9Dc, reason: not valid java name */
    public static /* synthetic */ void m11697$r8$lambda$rgCfY3jt_LwflfkftZB8k4V9Dc(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        if (function1 != null) {
            function1.invoke(str);
        }
    }
}
