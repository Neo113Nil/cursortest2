package com.fyber.inneractive.sdk.measurement.tracker;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public com.iab.omid.library.fyber.adsession.AdSession f3791a;
    public com.iab.omid.library.fyber.adsession.AdEvents b;
    public boolean c = false;
    public final com.iab.omid.library.fyber.adsession.Partner d;
    public android.webkit.WebView e;

    public e(com.iab.omid.library.fyber.adsession.Partner partner, com.fyber.inneractive.sdk.web.m mVar) {
        this.d = partner;
        this.e = mVar;
    }

    public abstract void a();

    public void a(com.fyber.inneractive.sdk.web.m mVar) {
        com.iab.omid.library.fyber.adsession.AdSessionContext adSessionContext;
        try {
            com.iab.omid.library.fyber.adsession.AdSessionConfiguration b = b();
            try {
                adSessionContext = com.iab.omid.library.fyber.adsession.AdSessionContext.createHtmlAdSessionContext(this.d, mVar, "", "");
            } catch (java.lang.Throwable unused) {
                adSessionContext = null;
            }
            com.iab.omid.library.fyber.adsession.AdSession createAdSession = com.iab.omid.library.fyber.adsession.AdSession.createAdSession(b, adSessionContext);
            this.f3791a = createAdSession;
            createAdSession.registerAdView(mVar);
            this.f3791a.start();
        } catch (java.lang.Throwable unused2) {
        }
    }

    public abstract com.iab.omid.library.fyber.adsession.AdSessionConfiguration b();

    public abstract void c();
}
