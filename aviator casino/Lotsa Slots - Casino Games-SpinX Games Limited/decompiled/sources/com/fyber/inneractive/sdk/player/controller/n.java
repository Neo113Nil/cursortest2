package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q f3890a;

    public n(com.fyber.inneractive.sdk.player.controller.q qVar) {
        this.f3890a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.util.Iterator it = this.f3890a.b.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.p) it.next()).d();
            }
        } catch (java.lang.Exception e) {
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                com.fyber.inneractive.sdk.player.controller.q qVar = this.f3890a;
                qVar.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sonDrawnToSurface callback threw an exception!", e, com.fyber.inneractive.sdk.util.IAlog.a(qVar));
            }
        }
    }
}
