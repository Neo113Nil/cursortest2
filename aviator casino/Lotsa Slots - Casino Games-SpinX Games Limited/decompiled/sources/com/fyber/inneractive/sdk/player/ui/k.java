package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.l f4166a;

    public k(com.fyber.inneractive.sdk.player.ui.l lVar) {
        this.f4166a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.ui.l lVar = this.f4166a;
        int i = lVar.k;
        if (i != 0) {
            int i2 = (lVar.j / i) + lVar.F;
            lVar.F = i2;
            lVar.a(i2);
        }
        com.fyber.inneractive.sdk.player.ui.l lVar2 = this.f4166a;
        if (lVar2.F < lVar2.G) {
            lVar2.postDelayed(lVar2.E, lVar2.l);
            return;
        }
        lVar2.E = null;
        lVar2.F = 0;
        lVar2.G = 0;
    }
}
