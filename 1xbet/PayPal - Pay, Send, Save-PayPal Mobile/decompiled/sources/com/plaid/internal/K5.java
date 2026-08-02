package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K5 extends com.plaid.internal.C0670w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(com.plaid.internal.C0505d4 c0505d4) {
        super(c0505d4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0505d4, "");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceError, "");
        int errorCode = webResourceError.getErrorCode();
        if (400 > errorCode || errorCode >= 500 || errorCode == 408 || errorCode == 404) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(com.plaid.internal.B7.a(webResourceError)), "onReceivedError");
        } else {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(com.plaid.internal.B7.a(webResourceError)), "onReceivedError");
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String path;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceRequest, "");
        if (!webResourceRequest.isForMainFrame() && (path = webResourceRequest.getUrl().getPath()) != null && kotlin.text.StringsKt.endsWith$default(path, "/favicon.ico", false, 2, (java.lang.Object) null)) {
            try {
                return new android.webkit.WebResourceResponse(androidx.media3.common.MimeTypes.IMAGE_PNG, null, null);
            } catch (java.lang.Exception e) {
                com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceRequest, "");
        try {
            com.plaid.internal.C0505d4 c0505d4 = this.f6603a;
            java.lang.String obj = webResourceRequest.getUrl().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return c0505d4.a(obj);
        } catch (java.lang.Exception e) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e);
            return true;
        }
    }
}
