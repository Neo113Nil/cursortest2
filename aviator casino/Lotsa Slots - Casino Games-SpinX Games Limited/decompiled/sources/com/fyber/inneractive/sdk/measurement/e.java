package com.fyber.inneractive.sdk.measurement;

/* loaded from: classes3.dex */
public final class e {
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public com.iab.omid.library.fyber.adsession.Partner e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3786a = false;
    public final com.fyber.inneractive.sdk.measurement.tracker.f f = new com.fyber.inneractive.sdk.measurement.tracker.f();
    public final com.fyber.inneractive.sdk.measurement.a g = new com.fyber.inneractive.sdk.measurement.a(this);
    public final com.fyber.inneractive.sdk.measurement.b h = new com.fyber.inneractive.sdk.measurement.b(this);
    public final com.fyber.inneractive.sdk.measurement.c i = new com.fyber.inneractive.sdk.measurement.c(this);

    public static void a(com.fyber.inneractive.sdk.measurement.e eVar, android.content.Context context) {
        eVar.getClass();
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/" + com.iab.omid.library.fyber.Omid.getVersion() + ".js", "omid-latest.js", eVar.g);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-" + com.iab.omid.library.fyber.Omid.getVersion() + ".js", "omid-session-client-latest.js", eVar.h);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", eVar.i);
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.network.f0 f0Var) {
        com.fyber.inneractive.sdk.util.IAlog.d("%s- Loading URL: %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.measurement.e.class), str);
        com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.v0(f0Var, context, new com.fyber.inneractive.sdk.cache.f(str, str2)));
    }
}
