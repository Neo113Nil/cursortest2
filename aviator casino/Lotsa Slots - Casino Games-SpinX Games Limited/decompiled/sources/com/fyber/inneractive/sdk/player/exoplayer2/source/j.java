package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.p f4056a;

    public j(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar) {
        this.f4056a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar = this.f4056a;
        if (pVar.G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.p;
        lVar.getClass();
        lVar.f.obtainMessage(9, pVar).sendToTarget();
    }
}
