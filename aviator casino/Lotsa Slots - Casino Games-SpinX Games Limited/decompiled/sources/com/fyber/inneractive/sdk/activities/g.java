package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class g extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity f3524a;

    public g(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f3524a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        this.f3524a.f.setImageDrawable(webView.canGoBack() ? com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_left_arrow) : com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_unleft_arrow));
        this.f3524a.g.setImageDrawable(webView.canGoForward() ? com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_right_arrow) : com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f3524a.g.setImageDrawable(com.fyber.inneractive.sdk.util.o.d(com.fyber.inneractive.sdk.R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.util.IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", java.lang.Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.fyber.inneractive.sdk.network.z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f3524a;
        if (inneractiveInternalBrowserActivity.e == webView) {
            inneractiveInternalBrowserActivity.e = null;
        }
        if (webView != null) {
            com.fyber.inneractive.sdk.util.v.a(webView);
            webView.destroy();
        }
        this.f3524a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            android.webkit.WebView webView2 = this.f3524a.e;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f3524a;
        java.lang.String str2 = com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.URL_EXTRA;
        inneractiveInternalBrowserActivity.getClass();
        com.fyber.inneractive.sdk.click.g gVar = new com.fyber.inneractive.sdk.click.g(new com.fyber.inneractive.sdk.activities.h(inneractiveInternalBrowserActivity), null, com.fyber.inneractive.sdk.util.g.VIDEO_CTA);
        com.fyber.inneractive.sdk.click.r rVar = new com.fyber.inneractive.sdk.click.r(false, inneractiveInternalBrowserActivity.b);
        rVar.j.addAll(java.util.Arrays.asList(gVar, new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l(), new com.fyber.inneractive.sdk.click.i(false, android.text.TextUtils.isEmpty(str) ? null : android.net.Uri.parse(str).getScheme())));
        rVar.a(inneractiveInternalBrowserActivity.getApplicationContext(), str, new com.fyber.inneractive.sdk.activities.i(inneractiveInternalBrowserActivity), null, false, com.fyber.inneractive.sdk.ignite.m.NONE, "");
        return !str.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP);
    }
}
