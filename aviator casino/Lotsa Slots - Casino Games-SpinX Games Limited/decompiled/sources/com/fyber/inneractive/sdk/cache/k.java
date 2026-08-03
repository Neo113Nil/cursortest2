package com.fyber.inneractive.sdk.cache;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public long f3557a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;

    public final void a() {
        if (java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(java.lang.System.currentTimeMillis() - this.f3557a) >= 60) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            if (iAConfigManager.t.b.a(false, "use_js_inline")) {
                android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
                if (application == null) {
                    com.fyber.inneractive.sdk.util.IAlog.f("fetchJS() failed context null", new java.lang.Object[0]);
                    return;
                }
                this.f3557a = java.lang.System.currentTimeMillis();
                com.fyber.inneractive.sdk.network.v0 v0Var = new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.cache.g(this), application, new com.fyber.inneractive.sdk.cache.f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                com.fyber.inneractive.sdk.util.IAlog.d("%s- Loading URL: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.r.a(v0Var);
                iAConfigManager.r.a(new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.cache.h(this), application, new com.fyber.inneractive.sdk.cache.f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.r.a(new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.cache.i(this), application, new com.fyber.inneractive.sdk.cache.f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.t;
                if (sVar == null || !sVar.b.a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.r.a(new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.cache.j(this), application, new com.fyber.inneractive.sdk.cache.f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
