package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class w extends androidx.webkit.WebViewClientCompat {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.a g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.a(null);
    public static final int h = 8;
    public static final java.lang.String i = "MraidWebViewClient";
    public static final java.lang.String j = "com.moloco.sdk.xenoss.sdkdevkit.mraid.js";
    public static final java.lang.String k = "mraid.js";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o f7530a;
    public final androidx.webkit.WebViewAssetLoader b;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> c;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> d;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> e;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final android.net.Uri a(android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.String str;
            android.net.Uri url = webResourceRequest.getUrl();
            if (url == null || (str = url.toString()) == null) {
                str = "";
            }
            android.net.Uri parse = android.net.Uri.parse(kotlin.text.StringsKt.replace(str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.j, true));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }
    }

    public w(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o mraidJsCommandsSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidJsCommandsSource, "mraidJsCommandsSource");
        this.f7530a = mraidJsCommandsSource;
        androidx.webkit.WebViewAssetLoader build = new androidx.webkit.WebViewAssetLoader.Builder().addPathHandler(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, new androidx.webkit.WebViewAssetLoader.AssetsPathHandler(context.getApplicationContext())).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.b = build;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.c = MutableStateFlow;
        this.d = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.e = MutableStateFlow2;
        this.f = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> a() {
        return this.f;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> b() {
        return this.d;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        this.c.setValue(java.lang.Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.c.setValue(java.lang.Boolean.FALSE);
    }

    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Android API 23")
    public void onReceivedError(android.webkit.WebView webView, int i2, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i2, str, str2);
        this.e.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f7443a);
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "onReceivedError " + str, null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        this.e.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.b);
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return this.b.shouldInterceptRequest(g.a(request));
    }

    @Override // android.webkit.WebViewClient
    @kotlin.Deprecated(message = "Deprecated in Android API 24")
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str == null) {
            return false;
        }
        return this.f7530a.a(str);
    }
}
