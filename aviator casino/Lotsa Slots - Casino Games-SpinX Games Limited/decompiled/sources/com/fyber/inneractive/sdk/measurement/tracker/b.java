package com.fyber.inneractive.sdk.measurement.tracker;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.measurement.tracker.e {
    public b(com.iab.omid.library.fyber.adsession.Partner partner, com.fyber.inneractive.sdk.web.m mVar) {
        super(partner, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(com.fyber.inneractive.sdk.web.m mVar) {
        super.a(mVar);
        mVar.loadUrl("javascript:FyberMraidVideoTracker.initOmid(\"" + this.d.getName() + "\",\"" + this.d.getVersion() + "\");");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final com.iab.omid.library.fyber.adsession.AdSessionConfiguration b() {
        try {
            com.iab.omid.library.fyber.adsession.CreativeType creativeType = com.iab.omid.library.fyber.adsession.CreativeType.DEFINED_BY_JAVASCRIPT;
            com.iab.omid.library.fyber.adsession.ImpressionType impressionType = com.iab.omid.library.fyber.adsession.ImpressionType.DEFINED_BY_JAVASCRIPT;
            com.iab.omid.library.fyber.adsession.Owner owner = com.iab.omid.library.fyber.adsession.Owner.JAVASCRIPT;
            return com.iab.omid.library.fyber.adsession.AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        android.webkit.WebView webView;
        if (this.c || this.f3791a == null || (webView = this.e) == null) {
            return;
        }
        this.c = true;
        com.fyber.inneractive.sdk.util.q0.a(webView, "FyberMraidVideoTracker.impression();");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        android.webkit.WebView webView = this.e;
        if (webView != null) {
            com.fyber.inneractive.sdk.util.q0.a(webView, "FyberMraidVideoTracker.adUserInteraction();");
        }
    }
}
