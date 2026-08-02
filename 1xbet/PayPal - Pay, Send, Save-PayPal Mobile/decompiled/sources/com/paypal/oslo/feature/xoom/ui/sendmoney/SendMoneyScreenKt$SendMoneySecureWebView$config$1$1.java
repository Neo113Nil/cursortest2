package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyScreenKt$SendMoneySecureWebView$config$1$1;", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebResourceRequest;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SendMoneyScreenKt$SendMoneySecureWebView$config$1$1 implements com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    SendMoneyScreenKt$SendMoneySecureWebView$config$1$1(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoSizes = appNavigator;
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ void onPageFinished(java.lang.String str) {
        super.onPageFinished(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ void onPageStarted(java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(str, bitmap);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ boolean onPdfDetected(java.lang.String str) {
        return super.onPdfDetected(str);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ void onReceivedError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webResourceRequest, webResourceError);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webResourceRequest, webResourceResponse);
    }

    @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
    public final boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest request) {
        android.net.Uri url;
        java.lang.String obj;
        if (request == null || (url = request.getUrl()) == null || (obj = url.toString()) == null) {
            return false;
        }
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneySecureWebView$config$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneySecureWebView$config$1$1.m21545$r8$lambda$XDRt00pnfVniMQxeOa_IwTKfVw(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        };
        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.shouldOverrideUrlLoadingForCompletion(obj, this.getHighSpeedVideoFpsRangesFor.getValue()) || com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt.shouldOverrideUrlLoadingForCancel(obj, function0) || com.paypal.oslo.feature.xoom.ui.shared.WebViewRedirectUtilsKt.shouldOverrideUrlLoadingForRedirect(obj, function0);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RbiHaHxS1NKK3XkzI9pmIgolkMM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XDRt00pnf-VniMQxeOa_IwTKfVw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21545$r8$lambda$XDRt00pnfVniMQxeOa_IwTKfVw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneySecureWebView$config$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneySecureWebView$config$1$1.$r8$lambda$RbiHaHxS1NKK3XkzI9pmIgolkMM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
