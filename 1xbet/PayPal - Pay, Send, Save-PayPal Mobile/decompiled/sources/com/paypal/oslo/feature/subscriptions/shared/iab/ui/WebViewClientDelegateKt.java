package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "", "", "onUrlLoadFailed", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "webViewClientDelegate", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebViewClientDelegateKt {
    public static final com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate webViewClientDelegate(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.subscriptions.shared.iab.ui.WebViewClientDelegateKt$webViewClientDelegate$1
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
            public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webResourceRequest, webResourceResponse);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final /* bridge */ boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest webResourceRequest) {
                return super.shouldOverrideUrlLoading(webResourceRequest);
            }

            @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
            public final void onReceivedError(android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
                if (request == null || !request.isForMainFrame()) {
                    return;
                }
                android.net.Uri url = request.getUrl();
                java.lang.String obj = url != null ? url.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                function1.invoke(obj);
            }
        };
    }
}
