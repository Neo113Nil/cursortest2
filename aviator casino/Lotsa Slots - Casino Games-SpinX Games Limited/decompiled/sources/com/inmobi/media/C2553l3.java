package com.inmobi.media;

/* renamed from: com.inmobi.media.l3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2553l3 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5307a;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef b;
    public final /* synthetic */ com.inmobi.media.C2579m3 c;
    public final /* synthetic */ com.inmobi.media.V2 d;

    public C2553l3(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlin.jvm.internal.Ref.ObjectRef objectRef, com.inmobi.media.C2579m3 c2579m3, com.inmobi.media.V2 v2) {
        this.f5307a = atomicBoolean;
        this.b = objectRef;
        this.c = c2579m3;
        this.d = v2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        com.inmobi.media.C2579m3.a(this.f5307a, this.b, this.c, this.d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, int i, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        com.inmobi.media.C2579m3.a(this.f5307a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceResponse errorResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        com.inmobi.media.C2579m3.a(this.f5307a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        com.inmobi.media.C2579m3.a(this.f5307a, this.b, this.c, this.d, false);
        return com.inmobi.media.Fo.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.inmobi.media.C2579m3.a(this.f5307a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        return (this.d.d || kotlin.jvm.internal.Intrinsics.areEqual(request.getUrl().toString(), this.d.b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.V2 v2 = this.d;
        return (v2.d || kotlin.jvm.internal.Intrinsics.areEqual(url, v2.b)) ? false : true;
    }
}
