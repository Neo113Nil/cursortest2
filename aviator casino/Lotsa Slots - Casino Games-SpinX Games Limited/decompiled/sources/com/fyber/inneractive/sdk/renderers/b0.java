package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.c0 f4234a;

    public b0(com.fyber.inneractive.sdk.renderers.c0 c0Var) {
        this.f4234a = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.renderers.c0 c0Var = this.f4234a;
        if (c0Var.b != null && !c0Var.m) {
            c0Var.m = true;
            com.fyber.inneractive.sdk.util.IAlog.a("%sTracking impression", com.fyber.inneractive.sdk.util.IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((com.fyber.inneractive.sdk.flow.w0) c0Var.b);
            c0Var.n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
