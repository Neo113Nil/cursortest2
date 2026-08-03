package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.r f4245a;

    public p(com.fyber.inneractive.sdk.renderers.r rVar) {
        this.f4245a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.renderers.r rVar = this.f4245a;
        if (rVar.t != null) {
            rVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sIdle state reached!", com.fyber.inneractive.sdk.util.IAlog.a(rVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f4245a.k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f4245a.t = null;
        }
    }
}
