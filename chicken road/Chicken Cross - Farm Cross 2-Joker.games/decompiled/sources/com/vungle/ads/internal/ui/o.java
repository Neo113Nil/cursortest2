package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public com.vungle.ads.internal.ui.view.o f12156a;

    public o(com.vungle.ads.internal.ui.view.o oVar) {
        this.f12156a = oVar;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new n(webView, webViewRenderProcess));
        com.vungle.ads.internal.ui.view.o oVar = this.f12156a;
        if (oVar != null) {
            ((com.vungle.ads.internal.presenter.r) oVar).f();
        }
    }
}
