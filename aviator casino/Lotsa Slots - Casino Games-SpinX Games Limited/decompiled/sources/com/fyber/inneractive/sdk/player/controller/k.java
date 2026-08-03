package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3887a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q b;

    public k(com.fyber.inneractive.sdk.player.controller.f fVar, boolean z) {
        this.b = fVar;
        this.f3887a = z;
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
                ((com.fyber.inneractive.sdk.player.controller.p) it.next()).c(this.f3887a);
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
