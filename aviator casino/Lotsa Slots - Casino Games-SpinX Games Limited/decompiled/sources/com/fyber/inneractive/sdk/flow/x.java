package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest f3765a;
    public com.fyber.inneractive.sdk.response.e b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.config.s0 d;
    public boolean e = false;
    public boolean f = false;

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.d = s0Var;
        this.c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public void a(java.lang.String str) {
    }

    public boolean a(boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public boolean b() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.d;
        if (s0Var == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s : isFullscreenAd() called with unit config null", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return false;
        }
        com.fyber.inneractive.sdk.config.p0 p0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).e;
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    public abstract void destroy();

    public void e() {
    }

    public abstract boolean isVideoAd();
}
