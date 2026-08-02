package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallback;", "", "", "url", "", "onLoadingStarted", "(Ljava/lang/String;)V", "onLoadingFinished", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "error", "onLoadFailed", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;)V", "Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;", "actionBundle", "onActionsReady", "(Lcom/paypal/oslo/core/webview/ui/callback/WebViewActionBundle;)V", "userAgent", "contentDisposition", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "contentLength", "onDownloadRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SecureWebViewCallback {
    default void onActionsReady(com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle actionBundle) {
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onLoadingStarted(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback.super.onLoadingStarted(str);
        }

        @java.lang.Deprecated
        public static void onLoadingFinished(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback.super.onLoadingFinished(str);
        }

        @java.lang.Deprecated
        public static void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, com.paypal.oslo.core.webview.ui.callback.SecureWebViewError secureWebViewError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewError, "");
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback.super.onLoadFailed(secureWebViewError);
        }

        @java.lang.Deprecated
        public static void onActionsReady(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, com.paypal.oslo.core.webview.ui.callback.WebViewActionBundle webViewActionBundle) {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback.super.onActionsReady(webViewActionBundle);
        }

        @java.lang.Deprecated
        public static void onDownloadRequest(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback.super.onDownloadRequest(str, str2, str3, str4, j);
        }
    }

    default void onLoadingStarted(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
    }

    default void onLoadingFinished(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
    }

    default void onLoadFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
    }

    default void onDownloadRequest(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimeType, long contentLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
    }
}
