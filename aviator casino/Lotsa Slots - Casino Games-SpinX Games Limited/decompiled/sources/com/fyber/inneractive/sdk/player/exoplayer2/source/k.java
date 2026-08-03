package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.n f4057a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.p b;

    public k(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar) {
        this.b = pVar;
        this.f4057a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar = this.f4057a;
        if (nVar.c != null) {
            nVar.c = null;
        }
        int size = this.b.o.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.b.o.valueAt(i)).b();
        }
    }
}
