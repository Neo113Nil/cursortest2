package com.plaid.internal;

/* renamed from: com.plaid.internal.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C0670w extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0505d4 f6603a;
    public java.lang.String b;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.core.webview.BasePlaidWebViewClient$onPageFinished$1", f = "WebViewClients.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.w$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        public a(kotlin.coroutines.Continuation<? super com.plaid.internal.C0670w.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.plaid.internal.C0670w.a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.plaid.internal.C0670w.a(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            kotlin.ResultKt.throwOnFailure(obj);
            android.webkit.CookieManager.getInstance().flush();
            return kotlin.Unit.INSTANCE;
        }
    }

    public C0670w(com.plaid.internal.C0505d4 c0505d4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0505d4, "");
        this.f6603a = c0505d4;
        this.b = "";
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        java.lang.String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cookie, this.b)) {
            return;
        }
        this.b = cookie;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getIO(), null, new com.plaid.internal.C0670w.a(null), 2, null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webResourceResponse, "");
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int statusCode = webResourceResponse.getStatusCode();
        if (400 > statusCode || statusCode >= 500 || statusCode == 408 || statusCode == 404) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(com.plaid.internal.C7.a(webResourceResponse)), "onReceivedHttpError");
        } else {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, new com.plaid.internal.C0605o5(com.plaid.internal.C7.a(webResourceResponse)), "onReceivedHttpError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslErrorHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslError, "");
        com.plaid.internal.C0452a6.a.e(com.plaid.internal.C0452a6.f5996a, "onReceivedSslError ".concat(java.lang.String.valueOf(sslError)));
    }
}
