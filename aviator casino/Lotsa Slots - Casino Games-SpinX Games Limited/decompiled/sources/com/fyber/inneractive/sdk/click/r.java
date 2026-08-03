package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.z0 f3581a;
    public android.content.Context b;
    public java.lang.String c;
    public final boolean d;
    public com.fyber.inneractive.sdk.click.o e;
    public com.fyber.inneractive.sdk.network.h1 i;
    public com.fyber.inneractive.sdk.web.v0 k;
    public boolean l;
    public com.fyber.inneractive.sdk.ignite.m m;
    public volatile boolean f = false;
    public long h = 0;
    public final java.util.ArrayList j = new java.util.ArrayList();
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final boolean n = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a(false, "should_decode_url");

    public r(boolean z, com.fyber.inneractive.sdk.flow.x xVar) {
        this.d = true;
        this.d = z;
        this.f3581a = new com.fyber.inneractive.sdk.util.z0(xVar);
    }

    public final void a(android.content.Context context, java.lang.String str, com.fyber.inneractive.sdk.click.o oVar, com.fyber.inneractive.sdk.web.v0 v0Var, boolean z, com.fyber.inneractive.sdk.ignite.m mVar, java.lang.String str2) {
        android.net.Uri uri;
        this.b = context;
        this.c = str;
        this.e = oVar;
        this.l = z;
        this.h = java.lang.System.currentTimeMillis();
        this.k = v0Var;
        this.m = mVar;
        com.fyber.inneractive.sdk.click.b a2 = a(this.c);
        com.fyber.inneractive.sdk.util.IAlog.d("%s EVENT_CLICK %s %s", "VAST_EVENT", a2, str);
        if (a2 == null) {
            java.lang.String str3 = this.c;
            try {
                try {
                    uri = this.n ? !com.fyber.inneractive.sdk.util.h0.c(str3) ? android.net.Uri.parse(java.net.URLDecoder.decode(str3, com.ironsource.B5.O)) : android.net.Uri.parse(str3) : com.fyber.inneractive.sdk.util.h0.c(str3) ? android.net.Uri.parse(java.net.URLDecoder.decode(str3, com.ironsource.B5.O)) : android.net.Uri.parse(str3);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%sfollowRedirects: Fetching uri: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), uri.toString());
                    java.lang.String uri2 = uri.toString();
                    com.fyber.inneractive.sdk.network.h1 h1Var = new com.fyber.inneractive.sdk.network.h1(new com.fyber.inneractive.sdk.click.m(this, uri2, str2), uri2);
                    this.i = h1Var;
                    com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(h1Var);
                }
            } catch (java.lang.Exception e) {
                if (e instanceof java.lang.InterruptedException) {
                    return;
                }
                com.fyber.inneractive.sdk.util.IAlog.b("%sfailed followRedirects %s", com.fyber.inneractive.sdk.util.IAlog.a(this), e);
                this.g.add(new com.fyber.inneractive.sdk.click.j(str3, false, com.fyber.inneractive.sdk.click.q.INTERNAL_REDIRECT, null));
                a(new com.fyber.inneractive.sdk.click.b(str3, com.fyber.inneractive.sdk.click.q.FAILED, "followRedirects", e));
            }
        }
    }

    public final com.fyber.inneractive.sdk.click.b a(java.lang.String str) {
        android.net.Uri uri;
        com.fyber.inneractive.sdk.util.z0 z0Var;
        boolean z;
        try {
            uri = android.net.Uri.parse(str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.g.add(new com.fyber.inneractive.sdk.click.j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.j.isEmpty()) {
            this.g.add(new com.fyber.inneractive.sdk.click.j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.click.a aVar = (com.fyber.inneractive.sdk.click.a) it.next();
            if (aVar.a(uri, this)) {
                android.content.Context context = this.b;
                com.fyber.inneractive.sdk.click.b a2 = context != null ? aVar.a(context, uri, this.g) : null;
                if (a2 != null) {
                    if (a2.f3570a == com.fyber.inneractive.sdk.click.q.OPEN_GOOGLE_STORE && !(z = (z0Var = this.f3581a).c) && !z) {
                        z0Var.c = true;
                        z0Var.b = java.lang.System.currentTimeMillis();
                        com.fyber.inneractive.sdk.config.e eVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.b;
                        if (eVar != null) {
                            eVar.f3594a.add(z0Var);
                        }
                    }
                    return a(a2);
                }
            }
        }
        return null;
    }

    public final boolean a(android.net.Uri uri) {
        if (uri == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s followRedirects: Got a url which is not valid: null", com.fyber.inneractive.sdk.util.IAlog.a(this));
            this.g.add(new com.fyber.inneractive.sdk.click.j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(androidx.webkit.ProxyConfig.MATCH_HTTP) || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%scould not follow redirects for scheme: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), uri.getScheme());
        com.fyber.inneractive.sdk.util.IAlog.a("%sfull url: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), uri.toString());
        this.g.add(new com.fyber.inneractive.sdk.click.j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public static void a(com.fyber.inneractive.sdk.click.r rVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        if (rVar.d) {
            android.content.Intent intent = new android.content.Intent(rVar.b, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.class);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra(com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.URL_EXTRA, str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.b instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            try {
                android.content.Context context = rVar.b;
                if (context != null) {
                    context.startActivity(intent);
                }
                java.util.ArrayList arrayList = rVar.g;
                boolean z = exc == null;
                com.fyber.inneractive.sdk.click.q qVar = com.fyber.inneractive.sdk.click.q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new com.fyber.inneractive.sdk.click.j(str2, z, qVar, com.fyber.inneractive.sdk.util.v.a(exc)));
                rVar.a(new com.fyber.inneractive.sdk.click.b(str2, qVar, "followRedirects", null));
                return;
            } catch (android.content.ActivityNotFoundException unused) {
                rVar.g.add(new com.fyber.inneractive.sdk.click.j(str2, false, com.fyber.inneractive.sdk.click.q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.g.add(new com.fyber.inneractive.sdk.click.j(str2, false, com.fyber.inneractive.sdk.click.q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static com.fyber.inneractive.sdk.click.b a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.fyber.inneractive.sdk.click.b(str, com.fyber.inneractive.sdk.click.q.FAILED, str2, new com.fyber.inneractive.sdk.click.p(str3));
    }

    public final com.fyber.inneractive.sdk.click.b a(com.fyber.inneractive.sdk.click.b bVar) {
        java.util.ArrayList arrayList = this.g;
        bVar.f.clear();
        bVar.f.addAll(arrayList);
        bVar.e = java.lang.System.currentTimeMillis() - this.h;
        com.fyber.inneractive.sdk.util.IAlog.a("%s reporting result: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.click.n(this, bVar));
        return bVar;
    }
}
