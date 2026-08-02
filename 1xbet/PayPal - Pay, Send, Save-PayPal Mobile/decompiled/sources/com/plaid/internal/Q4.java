package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q4 extends com.plaid.internal.C0670w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(com.plaid.internal.C0505d4 c0505d4) {
        super(c0505d4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0505d4, "");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        super.onReceivedError(webView, i, str, str2);
        if (400 > i || i >= 500 || i == 408 || i == 404) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(str), "onReceivedError");
        } else {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(str), "onReceivedError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "/favicon.ico", false, 2, (java.lang.Object) null)) {
            try {
                return new android.webkit.WebResourceResponse(androidx.media3.common.MimeTypes.IMAGE_PNG, null, null);
            } catch (java.lang.Exception e) {
                com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        if (str == null) {
            return false;
        }
        try {
            return this.f6603a.a(str);
        } catch (java.lang.Exception e) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e);
            return true;
        }
    }
}
