package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.f f3881a;

    public e(com.fyber.inneractive.sdk.player.controller.f fVar) {
        this.f3881a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f3881a.s;
        if (gVar != null) {
            gVar.a(gVar.a(), -9223372036854775807L);
            this.f3881a.s.d.f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f3881a.s;
            gVar2.d.d();
            gVar2.c.removeCallbacksAndMessages(null);
            this.f3881a.s = null;
        }
    }
}
