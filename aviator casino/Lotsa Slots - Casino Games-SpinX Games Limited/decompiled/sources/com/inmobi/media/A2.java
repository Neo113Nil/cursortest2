package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class A2 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.InterfaceC2772t9 f4592a;
    public boolean c;
    public boolean d;
    public int b = -1;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);

    public A2(com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this.f4592a = interfaceC2772t9;
    }

    public final void a(android.webkit.WebView view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        this.e.set(true);
        view.postDelayed(new java.lang.Runnable() { // from class: com.inmobi.media.A2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.A2.a(com.inmobi.media.A2.this);
            }
        }, 1000L);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        if (this.d) {
            this.d = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return false;
        }
        com.inmobi.media.Sb.a((byte) 1, "BaseWebViewClient", "WebView crash detected, destroying ad");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("BaseWebViewClient", "onRenderProcessGone - WebView crash detected, destroying ad ");
        }
        view.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, java.lang.String url) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.x() && -1 != (i = this.b)) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.inmobi.media.Oe(view));
                this.c = true;
                if (view instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                    ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) view).G();
                }
            }
        }
        android.webkit.WebResourceResponse a2 = com.inmobi.media.AbstractC2840vo.a(url, this.f4592a);
        return a2 == null ? super.shouldInterceptRequest(view, url) : a2;
    }

    public static final void a(com.inmobi.media.A2 a2) {
        a2.e.set(false);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f4592a;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("BaseWebViewClient", "shouldInterceptRequest - url - " + request.getUrl() + ", method - " + request.getMethod() + ", isMainFrame - " + request.isForMainFrame());
        }
        int i = this.b;
        if (-1 != i) {
            if (i > 0) {
                this.b = i - 1;
            } else if (!this.c) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.inmobi.media.Oe(view));
                this.c = true;
                if (view instanceof com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) {
                    ((com.inmobi.media.GestureDetectorOnGestureListenerC2675pi) view).G();
                }
            }
        }
        android.webkit.WebResourceResponse a2 = com.inmobi.media.AbstractC2840vo.a(request, this.f4592a);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }
}
