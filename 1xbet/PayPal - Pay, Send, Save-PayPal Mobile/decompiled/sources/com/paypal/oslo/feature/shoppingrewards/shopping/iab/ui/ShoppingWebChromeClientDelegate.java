package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/ShoppingWebChromeClientDelegate;", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebChromeClientDelegate;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/ShoppingWebViewState;", "", "onStateChange", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "newProgress", "onProgressChanged", "(I)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingWebChromeClientDelegate implements com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingWebChromeClientDelegate(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ boolean onJsAlert(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return super.onJsAlert(str, str2, jsResult);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ boolean onJsConfirm(java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        return super.onJsConfirm(str, str2, jsResult);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ boolean onJsPrompt(java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        return super.onJsPrompt(str, str2, str3, jsPromptResult);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ void onReceivedIcon(android.graphics.Bitmap bitmap) {
        super.onReceivedIcon(bitmap);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ void onReceivedTitle(java.lang.String str) {
        super.onReceivedTitle(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final /* bridge */ boolean onShowFileChooser(android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(valueCallback, fileChooserParams);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebChromeClientDelegate
    public final void onProgressChanged(int newProgress) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "WebView loading progress", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("progress", java.lang.Integer.valueOf(newProgress))), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingWebViewState(newProgress < 100, newProgress / 100.0f, null, false, false, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
    }
}
