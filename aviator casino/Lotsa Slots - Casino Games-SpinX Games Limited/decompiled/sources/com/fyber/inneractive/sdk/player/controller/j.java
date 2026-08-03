package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f3886a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q b;

    public j(com.fyber.inneractive.sdk.player.controller.q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.b = qVar;
        this.f3886a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.q qVar = this.b;
        if (qVar.g) {
            return;
        }
        try {
            java.util.Iterator it = qVar.b.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f3886a);
            }
        } catch (java.lang.Exception e) {
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                com.fyber.inneractive.sdk.player.controller.q qVar2 = this.b;
                qVar2.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerError callback threw an exception!", e, com.fyber.inneractive.sdk.util.IAlog.a(qVar2));
            }
        }
    }
}
