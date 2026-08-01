package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f5418a;
    public com.fyber.inneractive.sdk.response.e b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.config.x0 d;
    public boolean e = false;
    public boolean f = false;

    public x(com.fyber.inneractive.sdk.config.x0 x0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.d = x0Var;
        this.c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public void a(String str) {
    }

    public boolean a(boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public boolean b() {
        com.fyber.inneractive.sdk.config.x0 x0Var = this.d;
        if (x0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        com.fyber.inneractive.sdk.config.u0 u0Var = ((com.fyber.inneractive.sdk.config.w0) x0Var).e;
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
