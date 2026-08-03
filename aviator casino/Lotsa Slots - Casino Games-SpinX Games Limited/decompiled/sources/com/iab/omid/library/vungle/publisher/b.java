package com.iab.omid.library.vungle.publisher;

/* loaded from: classes5.dex */
public class b extends com.iab.omid.library.vungle.publisher.AdSessionStatePublisher {
    private android.webkit.WebView g;
    private java.lang.Long h;
    private final java.util.Map<java.lang.String, com.iab.omid.library.vungle.adsession.VerificationScriptResource> i;
    private final java.lang.String j;

    class a extends android.webkit.WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            return com.iab.omid.library.vungle.publisher.b.this.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            return com.iab.omid.library.vungle.webviewclient.a.a(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            return com.iab.omid.library.vungle.webviewclient.a.a(str);
        }
    }

    /* renamed from: com.iab.omid.library.vungle.publisher.b$b, reason: collision with other inner class name */
    class C0113b extends android.webkit.WebViewClient {
        C0113b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            return com.iab.omid.library.vungle.publisher.b.this.a(webView, renderProcessGoneDetail);
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final android.webkit.WebView f4563a;

        c() {
            this.f4563a = com.iab.omid.library.vungle.publisher.b.this.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4563a.destroy();
        }
    }

    public b(java.lang.String str, java.util.Map<java.lang.String, com.iab.omid.library.vungle.adsession.VerificationScriptResource> map, java.lang.String str2) {
        super(str);
        this.h = null;
        this.i = map;
        this.j = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        android.util.Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + " for WebView: " + webView);
        if (getWebView() == webView) {
            android.util.Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            a((android.webkit.WebView) null);
        }
        if (webView == null) {
            return true;
        }
        webView.destroy();
        return true;
    }

    private boolean a(boolean z, android.content.Context context) {
        return !z && com.iab.omid.library.vungle.attestation.c.a(context).b();
    }

    private android.webkit.WebViewClient c(boolean z) {
        return z ? k() : j();
    }

    private android.webkit.WebViewClient j() {
        return new com.iab.omid.library.vungle.publisher.b.C0113b();
    }

    private android.webkit.WebViewClient k() {
        return new com.iab.omid.library.vungle.publisher.b.a();
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.vungle.adsession.a aVar, com.iab.omid.library.vungle.adsession.AdSessionContext adSessionContext) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, com.iab.omid.library.vungle.adsession.VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (java.lang.String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.vungle.utils.c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new android.os.Handler().postDelayed(new com.iab.omid.library.vungle.publisher.b.c(), java.lang.Math.max(4000 - (this.h == null ? 4000L : java.util.concurrent.TimeUnit.MILLISECONDS.convert(com.iab.omid.library.vungle.utils.f.b() - this.h.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS)), 2000L));
        this.g = null;
    }

    @Override // com.iab.omid.library.vungle.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        l();
    }

    void l() {
        android.content.Context a2 = com.iab.omid.library.vungle.internal.g.b().a();
        android.webkit.WebView webView = new android.webkit.WebView(a2);
        this.g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setAllowContentAccess(false);
        this.g.getSettings().setAllowFileAccess(false);
        this.g.setWebViewClient(c(a(com.iab.omid.library.vungle.attestation.g.a(this.g), a2)));
        a(this.g);
        com.iab.omid.library.vungle.internal.h.a().c(this.g, this.j);
        for (java.lang.String str : this.i.keySet()) {
            com.iab.omid.library.vungle.internal.h.a().d(this.g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.h = java.lang.Long.valueOf(com.iab.omid.library.vungle.utils.f.b());
    }
}
