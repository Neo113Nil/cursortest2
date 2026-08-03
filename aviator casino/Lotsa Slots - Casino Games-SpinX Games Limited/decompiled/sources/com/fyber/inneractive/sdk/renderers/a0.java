package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class a0 implements com.fyber.inneractive.sdk.ui.controller.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.c0 f4232a;

    public a0(com.fyber.inneractive.sdk.renderers.c0 c0Var) {
        this.f4232a = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        com.fyber.inneractive.sdk.renderers.c0 c0Var = this.f4232a;
        boolean z = c0Var.m;
        if (z) {
            return;
        }
        if (c0Var.b != null && !z) {
            c0Var.m = true;
            com.fyber.inneractive.sdk.util.IAlog.a("%sTracking impression", com.fyber.inneractive.sdk.util.IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((com.fyber.inneractive.sdk.flow.w0) c0Var.b);
            c0Var.n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
