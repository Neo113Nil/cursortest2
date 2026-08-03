package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3862a;
    public final java.util.HashMap b;
    public java.lang.String c;

    public y(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        java.lang.String a2;
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
        if (android.text.TextUtils.isEmpty(property)) {
            a2 = "https://" + com.fyber.inneractive.sdk.config.IAConfigManager.N.i.f;
        } else {
            a2 = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.c = null;
        if (android.text.TextUtils.isEmpty(a2)) {
            throw new java.security.InvalidParameterException();
        }
        this.b = new java.util.HashMap();
        this.f3862a = a2;
        a(str7 == null ? "8.4.4" : str7, com.ironsource.M6.V);
        a(com.fyber.inneractive.sdk.util.o.f4302a.getPackageName(), "pkgn");
        if (com.fyber.inneractive.sdk.config.IAConfigManager.c()) {
            return;
        }
        a(com.ironsource.X3.d, "osn");
        a(android.os.Build.VERSION.RELEASE, "osv");
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        a(str2, "session");
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN_ID);
    }

    public final void a(java.lang.Object obj, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
