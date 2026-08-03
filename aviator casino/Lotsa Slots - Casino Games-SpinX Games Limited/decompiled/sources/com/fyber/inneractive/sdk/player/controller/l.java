package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3888a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q b;

    public l(com.fyber.inneractive.sdk.player.controller.q qVar, int i) {
        this.b = qVar;
        this.f3888a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.util.Iterator it = this.b.c.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.o) it.next()).a(this.f3888a);
            }
        } catch (java.lang.Exception e) {
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
                com.fyber.inneractive.sdk.player.controller.q qVar = this.b;
                qVar.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerProgress callback threw an exception!", e, com.fyber.inneractive.sdk.util.IAlog.a(qVar));
            }
        }
    }
}
