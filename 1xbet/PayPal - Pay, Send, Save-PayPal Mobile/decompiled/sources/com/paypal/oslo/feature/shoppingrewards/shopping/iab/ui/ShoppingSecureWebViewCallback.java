package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/ShoppingSecureWebViewCallback;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "", "onNavigationActionsReady", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;", "actionBundle", "onActionsReady", "(Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingSecureWebViewCallback implements com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingSecureWebViewCallback(kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.webview.ui.callback.NavigationWebViewActions, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = function1;
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onDownloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        super.onDownloadRequest(str, str2, str3, str4, j);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
        super.onLoadFailed(secureWebViewError);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onLoadingFinished(java.lang.String str) {
        super.onLoadingFinished(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final /* bridge */ void onLoadingStarted(java.lang.String str) {
        super.onLoadingStarted(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback
    public final void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle actionBundle) {
        com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "SecureWebView actions ready", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasActions", java.lang.Boolean.valueOf(actionBundle != null))), null, 4, null);
        this.Camera2StreamConfigurationMap.invoke(actionBundle != null ? actionBundle.getNavigationActions() : null);
    }
}
