package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.z f4237a;
    public com.fyber.inneractive.sdk.player.ui.s b;
    public final com.fyber.inneractive.sdk.player.n c;

    public f0(com.fyber.inneractive.sdk.player.t tVar) {
        this.c = (com.fyber.inneractive.sdk.player.n) tVar.f;
    }

    public abstract com.fyber.inneractive.sdk.player.controller.b a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.flow.t0 t0Var);

    public abstract com.fyber.inneractive.sdk.player.ui.m a(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar);

    public java.lang.String a() {
        com.fyber.inneractive.sdk.flow.t0 t0Var;
        com.fyber.inneractive.sdk.player.n nVar = this.c;
        com.fyber.inneractive.sdk.response.e eVar = (nVar == null || (t0Var = nVar.b) == null) ? null : t0Var.b;
        if (eVar != null) {
            return eVar.C;
        }
        return null;
    }

    public abstract void a(com.fyber.inneractive.sdk.player.e eVar);

    public abstract void b();
}
