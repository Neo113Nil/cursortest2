package com.paypal.oslo.core.webview.ui.client;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebResourceRequest;)Z", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "onPdfDetected", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface SecureWebViewClientDelegate {
    default void onPageFinished(java.lang.String url) {
    }

    default void onPageStarted(java.lang.String url, android.graphics.Bitmap favicon) {
    }

    default void onReceivedError(android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
    }

    default void onReceivedHttpError(android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
    }

    default boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest request) {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean shouldOverrideUrlLoading(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, android.webkit.WebResourceRequest webResourceRequest) {
            return com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.shouldOverrideUrlLoading(webResourceRequest);
        }

        @java.lang.Deprecated
        public static void onPageStarted(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, java.lang.String str, android.graphics.Bitmap bitmap) {
            com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.onPageStarted(str, bitmap);
        }

        @java.lang.Deprecated
        public static void onPageFinished(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, java.lang.String str) {
            com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.onPageFinished(str);
        }

        @java.lang.Deprecated
        public static void onReceivedError(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.onReceivedError(webResourceRequest, webResourceError);
        }

        @java.lang.Deprecated
        public static void onReceivedHttpError(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.onReceivedHttpError(webResourceRequest, webResourceResponse);
        }

        @java.lang.Deprecated
        public static boolean onPdfDetected(com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate.super.onPdfDetected(str);
        }
    }

    default boolean onPdfDetected(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return false;
    }
}
