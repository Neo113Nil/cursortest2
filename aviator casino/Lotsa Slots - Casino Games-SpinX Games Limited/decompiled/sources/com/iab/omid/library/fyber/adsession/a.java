package com.iab.omid.library.fyber.adsession;

/* loaded from: classes5.dex */
public class a extends com.iab.omid.library.fyber.adsession.AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.adsession.AdSessionContext f4381a;
    private final com.iab.omid.library.fyber.adsession.AdSessionConfiguration b;
    private final com.iab.omid.library.fyber.internal.f c;
    private com.iab.omid.library.fyber.weakreference.a d;
    private com.iab.omid.library.fyber.publisher.AdSessionStatePublisher e;
    private boolean f;
    private boolean g;
    private final java.lang.String h;
    private boolean i;
    private boolean j;
    private com.iab.omid.library.fyber.adsession.PossibleObstructionListener k;

    a(com.iab.omid.library.fyber.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.fyber.adsession.AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, java.util.UUID.randomUUID().toString());
    }

    a(com.iab.omid.library.fyber.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.fyber.adsession.AdSessionContext adSessionContext, java.lang.String str) {
        this.c = new com.iab.omid.library.fyber.internal.f();
        this.f = false;
        this.g = false;
        this.b = adSessionConfiguration;
        this.f4381a = adSessionContext;
        this.h = str;
        b(null);
        this.e = (adSessionContext.getAdSessionContextType() == com.iab.omid.library.fyber.adsession.AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == com.iab.omid.library.fyber.adsession.AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(str, adSessionContext.getWebView()) : new com.iab.omid.library.fyber.publisher.b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.e.i();
        com.iab.omid.library.fyber.internal.c.c().a(this);
        this.e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.i) {
            throw new java.lang.IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(android.view.View view) {
        java.util.Collection<com.iab.omid.library.fyber.adsession.a> b = com.iab.omid.library.fyber.internal.c.c().b();
        if (b == null || b.isEmpty()) {
            return;
        }
        for (com.iab.omid.library.fyber.adsession.a aVar : b) {
            if (aVar != this && aVar.e() == view) {
                aVar.d.clear();
            }
        }
    }

    private void b() {
        if (this.j) {
            throw new java.lang.IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(android.view.View view) {
        this.d = new com.iab.omid.library.fyber.weakreference.a(view);
    }

    public void a(java.util.List<com.iab.omid.library.fyber.weakreference.a> list) {
        if (g()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<com.iab.omid.library.fyber.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                android.view.View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.k.onPossibleObstructionsDetected(this.h, arrayList);
        }
    }

    void a(org.json.JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(android.view.View view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str) {
        if (this.g) {
            return;
        }
        this.c.a(view, friendlyObstructionPurpose, str);
    }

    public java.lang.String c() {
        return this.h;
    }

    public com.iab.omid.library.fyber.publisher.AdSessionStatePublisher d() {
        return this.e;
    }

    public android.view.View e() {
        return this.d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(com.iab.omid.library.fyber.adsession.ErrorType errorType, java.lang.String str) {
        if (this.g) {
            throw new java.lang.IllegalStateException("AdSession is finished");
        }
        com.iab.omid.library.fyber.utils.g.a(errorType, "Error type is null");
        com.iab.omid.library.fyber.utils.g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public java.util.List<com.iab.omid.library.fyber.internal.e> f() {
        return this.c.a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.g) {
            return;
        }
        this.d.clear();
        removeAllFriendlyObstructions();
        this.g = true;
        d().f();
        com.iab.omid.library.fyber.internal.c.c().b(this);
        d().b();
        this.e = null;
        this.k = null;
    }

    public boolean g() {
        return this.k != null;
    }

    public boolean h() {
        return this.f && !this.g;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f;
    }

    void m() {
        a();
        d().g();
        this.i = true;
    }

    void n() {
        b();
        d().h();
        this.j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(android.view.View view) {
        if (this.g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.g) {
            return;
        }
        this.c.b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(android.view.View view) {
        if (this.g) {
            return;
        }
        this.c.c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(com.iab.omid.library.fyber.adsession.PossibleObstructionListener possibleObstructionListener) {
        this.k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        com.iab.omid.library.fyber.internal.c.c().c(this);
        this.e.a(com.iab.omid.library.fyber.internal.i.c().b());
        this.e.a(com.iab.omid.library.fyber.internal.a.a().b());
        this.e.a(this, this.f4381a);
    }
}
