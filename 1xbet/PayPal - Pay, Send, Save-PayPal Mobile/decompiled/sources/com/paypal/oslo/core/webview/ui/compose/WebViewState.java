package com.paypal.oslo.core.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u001e\u001a\u00020\n8\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0011\u0010!\u001a\u00020\f8\u0007¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/core/webview/ui/compose/WebViewState;", "", "Landroid/webkit/WebView;", "p0", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridgeImpl;", "p1", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "", "p2", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActionsImpl;", "p3", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActionsImpl;", "p4", "<init>", "(Landroid/webkit/WebView;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridgeImpl;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActionsImpl;Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActionsImpl;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroid/webkit/WebView;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridgeImpl;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewActionsImpl;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActionsImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class WebViewState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl getHighSpeedVideoFpsRangesFor;
    final com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final android.webkit.WebView getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewState(android.webkit.WebView webView, com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1, com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl secureWebViewActionsImpl, com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl navigationWebViewActionsImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewActionsImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationWebViewActionsImpl, "");
        this.getHighSpeedVideoSizes = webView;
        this.getHighSpeedVideoFpsRangesFor = secureWebViewJavaScriptBridgeImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = secureWebViewActionsImpl;
        this.getHighSpeedVideoFpsRanges = navigationWebViewActionsImpl;
    }

    public final java.lang.String toString() {
        android.webkit.WebView webView = this.getHighSpeedVideoSizes;
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewActionsImpl secureWebViewActionsImpl = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActionsImpl navigationWebViewActionsImpl = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewState(getHighSpeedVideoSizes=");
        sb.append(webView);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(secureWebViewJavaScriptBridgeImpl);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(function1);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(secureWebViewActionsImpl);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(navigationWebViewActionsImpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridgeImpl secureWebViewJavaScriptBridgeImpl = this.getHighSpeedVideoFpsRangesFor;
        int hashCode2 = secureWebViewJavaScriptBridgeImpl == null ? 0 : secureWebViewJavaScriptBridgeImpl.hashCode();
        kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        return (((((((hashCode * 31) + hashCode2) * 31) + (function1 != null ? function1.hashCode() : 0)) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.core.webview.ui.compose.WebViewState)) {
            return false;
        }
        com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState = (com.paypal.oslo.core.webview.ui.compose.WebViewState) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, webViewState.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, webViewState.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, webViewState.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, webViewState.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, webViewState.getHighSpeedVideoFpsRanges);
    }
}
