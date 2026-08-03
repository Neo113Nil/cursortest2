package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class j implements com.fyber.inneractive.sdk.player.exoplayer2.source.u {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f3938a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k d;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.t e;

    public j(android.net.Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, android.os.Handler handler, com.fyber.inneractive.sdk.player.controller.b0 b0Var) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b(gVar);
        this.f3938a = uri;
        this.b = bVar;
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.t tVar) {
        if (this.d != null) {
            throw new java.lang.IllegalStateException();
        }
        android.net.Uri uri = this.f3938a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar = this.b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.c, this);
        this.d = kVar;
        this.e = tVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0(bVar.f3934a.a(), uri, kVar.b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = kVar.h;
        b0Var.getClass();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, myLooper, d0Var, kVar, 3, android.os.SystemClock.elapsedRealtime());
        if (b0Var.b != null) {
            throw new java.lang.IllegalStateException();
        }
        b0Var.b = yVar;
        yVar.e = null;
        b0Var.f4074a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.d;
        if (kVar != null) {
            kVar.h.a(null);
            java.util.Iterator it = kVar.d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).b.a(null);
            }
            kVar.e.removeCallbacksAndMessages(null);
            kVar.d.clear();
            this.d = null;
        }
        this.e = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.d;
        kVar.h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.d.get(aVar);
            hVar.b.b();
            java.io.IOException iOException = hVar.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s a(int i, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j) {
        if (i == 0) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i(this.d, this.b, this.c, bVar, j);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) sVar;
        iVar.f3937a.g.remove(iVar);
        iVar.h.removeCallbacksAndMessages(null);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] nVarArr = iVar.n;
        if (nVarArr != null) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar : nVarArr) {
                int size = nVar.j.size();
                for (int i = 0; i < size; i++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i)).b();
                }
                nVar.g.a(null);
                nVar.m.removeCallbacksAndMessages(null);
                nVar.s = true;
            }
        }
    }
}
