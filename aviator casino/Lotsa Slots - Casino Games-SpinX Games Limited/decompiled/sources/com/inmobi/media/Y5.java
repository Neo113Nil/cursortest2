package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y5 extends com.inmobi.media.A2 {
    public final java.lang.String f;
    public final kotlin.jvm.functions.Function0 g;
    public final kotlin.jvm.functions.Function1 h;
    public final kotlin.jvm.functions.Function2 i;
    public final com.inmobi.media.O8 j;
    public com.inmobi.media.C2431gb k;
    public com.inmobi.media.C2377eb l;
    public final com.inmobi.media.C2465hj m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(java.lang.String api, kotlin.jvm.functions.Function0 onUserLandingCompleted, kotlin.jvm.functions.Function1 onLpLifecycleEvent, kotlin.jvm.functions.Function2 fireLandingPageTracker, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, com.inmobi.media.O8 o8, long j) {
        super(interfaceC2772t9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onUserLandingCompleted, "onUserLandingCompleted");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fireLandingPageTracker, "fireLandingPageTracker");
        this.f = api;
        this.g = onUserLandingCompleted;
        this.h = onLpLifecycleEvent;
        this.i = fireLandingPageTracker;
        this.j = o8;
        this.m = new com.inmobi.media.C2465hj(j, interfaceC2772t9, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Y5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.Y5.a(com.inmobi.media.Y5.this, (java.lang.String) obj);
            }
        });
        toString();
    }

    public final boolean a(android.webkit.WebView webView, java.lang.String url) {
        java.lang.Integer num;
        int i;
        com.inmobi.media.X5 x5;
        com.inmobi.media.InterfaceC2729rl userLeftApplicationListener;
        if (this.e.get()) {
            return true;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + url);
        }
        com.inmobi.media.C2465hj c2465hj = this.m;
        if (!c2465hj.f) {
            c2465hj.g = com.inmobi.media.EnumC2412fj.c;
        }
        c2465hj.h = true;
        c2465hj.a();
        if (webView instanceof com.inmobi.media.AbstractC2920z2) {
            com.inmobi.media.C2298bb a2 = com.inmobi.media.C2325cb.a(((com.inmobi.media.AbstractC2920z2) webView).getLandingPageHandler(), this.f, (java.lang.String) null, url, this.k, 16);
            num = a2.b;
            i = a2.f5121a;
        } else {
            num = null;
            i = 0;
        }
        if (i == 0) {
            com.inmobi.media.C2465hj c2465hj2 = this.m;
            c2465hj2.getClass();
            c2465hj2.g = com.inmobi.media.EnumC2412fj.d;
            return false;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return false;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 10);
            com.inmobi.media.C2377eb c2377eb = this.l;
            if (c2377eb != null) {
                c2377eb.a(3, false, url, valueOf);
            }
            return true;
        }
        com.inmobi.media.C2465hj c2465hj3 = this.m;
        c2465hj3.getClass();
        c2465hj3.g = com.inmobi.media.EnumC2412fj.e;
        boolean z = webView instanceof com.inmobi.media.Z5;
        if (z) {
            android.view.ViewParent parent = ((com.inmobi.media.Z5) webView).getParent();
            if ((parent instanceof com.inmobi.media.U5) && (userLeftApplicationListener = ((com.inmobi.media.U5) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        kotlin.jvm.functions.Function1 function1 = this.h;
        com.inmobi.media.Vh vh = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1;
        java.lang.String str = this.f;
        vh.getClass();
        function1.invoke(com.inmobi.media.Vh.a(str, "onNavigatingAway"));
        a(webView);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        android.net.Uri parse = android.net.Uri.parse(url);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (!com.inmobi.media.B3.a(parse) || kotlin.jvm.internal.Intrinsics.areEqual("play.google.com", parse.getHost()) || kotlin.jvm.internal.Intrinsics.areEqual("market.android.com", parse.getHost()) || kotlin.jvm.internal.Intrinsics.areEqual("market", parse.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z) {
                android.view.ViewParent parent2 = ((com.inmobi.media.Z5) webView).getParent();
                if ((parent2 instanceof com.inmobi.media.U5) && (x5 = ((com.inmobi.media.U5) parent2).d) != null) {
                    com.inmobi.media.R8.a(((com.inmobi.media.Q8) x5).f4912a);
                }
            }
            com.inmobi.media.O8 o8 = this.j;
            if (o8 != null) {
                ((com.inmobi.media.C2359di) o8).f5162a.x();
            }
        }
        a(this, 2, false, url, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        kotlinx.coroutines.Job launch$default;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        com.inmobi.media.C2465hj c2465hj = this.m;
        if (!c2465hj.f && c2465hj.f5245a > 0) {
            long j = c2465hj.e;
            c2465hj.a();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2465hj.d, null, null, new com.inmobi.media.C2439gj(c2465hj, j, str, webView, null), 3, null);
            c2465hj.i = launch$default;
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.inmobi.media.C2465hj c2465hj = this.m;
        if (!c2465hj.f && c2465hj.f5245a > 0) {
            c2465hj.e++;
            c2465hj.f = false;
            c2465hj.g = com.inmobi.media.EnumC2412fj.b;
            c2465hj.h = false;
            c2465hj.a();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        kotlin.jvm.functions.Function1 function1 = this.h;
        com.inmobi.media.Vh vh = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1;
        java.lang.String str2 = this.f;
        vh.getClass();
        function1.invoke(com.inmobi.media.Vh.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, int i, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        com.inmobi.media.C2377eb c2377eb = this.l;
        if (c2377eb != null) {
            c2377eb.a(3, false, failingUrl, valueOf);
        }
        com.inmobi.media.C2465hj c2465hj = this.m;
        c2465hj.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
        c2465hj.a("RECEIVED_ERROR", failingUrl);
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onReceivedError: " + failingUrl);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        com.inmobi.media.C2465hj c2465hj = this.m;
        java.lang.String uri = webResourceRequest.getUrl().toString();
        c2465hj.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("RECEIVED_HTTP_ERROR", "reason");
        c2465hj.a("RECEIVED_HTTP_ERROR", uri);
    }

    @Override // com.inmobi.media.A2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        boolean onRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            com.inmobi.media.C2377eb c2377eb = this.l;
            if (c2377eb != null) {
                c2377eb.a(3, true, null, 8007);
            }
            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("source", "embedded_browser"), kotlin.TuplesKt.to("isCrashed", java.lang.Boolean.valueOf(detail.didCrash())));
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("WebViewRenderProcessGoneEvent", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.C2465hj c2465hj = this.m;
        java.lang.String url = view.getUrl();
        c2465hj.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("RENDER_PROCESS_GONE", "reason");
        c2465hj.a("RENDER_PROCESS_GONE", url);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String str;
        android.net.Uri url;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.x()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (str = url.toString()) == null) {
            str = "";
        }
        if (webView == null || str.length() <= 0) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        int i = android.os.Build.VERSION.SDK_INT;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            java.lang.Integer valueOf = i >= 23 ? java.lang.Integer.valueOf(error.getErrorCode()) : null;
            java.lang.String uri = request.getUrl().toString();
            com.inmobi.media.C2377eb c2377eb = this.l;
            if (c2377eb != null) {
                c2377eb.a(3, true, uri, valueOf);
            }
            com.inmobi.media.C2465hj c2465hj = this.m;
            java.lang.String uri2 = request.getUrl().toString();
            c2465hj.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
            c2465hj.a("RECEIVED_ERROR", uri2);
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Y5 y5, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        com.inmobi.media.O8 o8 = y5.j;
        if (o8 != null) {
            com.inmobi.media.C2359di c2359di = (com.inmobi.media.C2359di) o8;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            if (c2359di.f5162a.getFullScreenActivity() instanceof com.inmobi.ads.rendering.InMobiAdActivity) {
                android.app.Activity fullScreenActivity = c2359di.f5162a.getFullScreenActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(fullScreenActivity, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((com.inmobi.ads.rendering.InMobiAdActivity) fullScreenActivity).a(reason);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static void a(com.inmobi.media.Y5 y5, int i, boolean z, java.lang.String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        com.inmobi.media.C2377eb c2377eb = y5.l;
        if (c2377eb != null) {
            c2377eb.a(i, z, str, null);
        }
    }
}
