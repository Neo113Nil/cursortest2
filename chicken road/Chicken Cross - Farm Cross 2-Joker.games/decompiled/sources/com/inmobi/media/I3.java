package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class I3 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6616a;
    public final /* synthetic */ Ref.ObjectRef b;
    public final /* synthetic */ J3 c;
    public final /* synthetic */ C4066s3 d;

    public I3(AtomicBoolean atomicBoolean, Ref.ObjectRef objectRef, J3 j3, C4066s3 c4066s3) {
        this.f6616a = atomicBoolean;
        this.b = objectRef;
        this.c = j3;
        this.d = c4066s3;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        J3.a(this.f6616a, this.b, this.c, this.d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        J3.a(this.f6616a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        J3.a(this.f6616a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        J3.a(this.f6616a, this.b, this.c, this.d, false);
        return Cq.a(view, detail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        J3.a(this.f6616a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        return (this.d.d || Intrinsics.areEqual(request.getUrl().toString(), this.d.b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        C4066s3 c4066s3 = this.d;
        return (c4066s3.d || Intrinsics.areEqual(url, c4066s3.b)) ? false : true;
    }
}
