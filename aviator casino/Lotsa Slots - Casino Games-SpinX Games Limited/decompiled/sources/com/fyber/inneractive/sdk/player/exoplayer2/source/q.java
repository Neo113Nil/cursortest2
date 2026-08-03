package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class q implements com.fyber.inneractive.sdk.player.exoplayer2.source.u, com.fyber.inneractive.sdk.player.exoplayer2.source.t {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f4063a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k c;
    public final int d;
    public final android.os.Handler e;
    public final com.fyber.inneractive.sdk.player.controller.b0 f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.v g = new com.fyber.inneractive.sdk.player.exoplayer2.v();
    public com.fyber.inneractive.sdk.player.exoplayer2.source.t h;
    public boolean i;

    public q(android.net.Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i, android.os.Handler handler, com.fyber.inneractive.sdk.player.controller.b0 b0Var) {
        this.f4063a = uri;
        this.b = gVar;
        this.c = cVar;
        this.d = i;
        this.e = handler;
        this.f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.h = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.t tVar) {
        this.h = tVar;
        tVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.source.x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s a(int i, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j) {
        if (i == 0) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.source.p(this.f4063a, this.b.a(), this.c.a(), this.d, this.e, this.f, this, bVar);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.p) sVar;
        pVar.i.a(new com.fyber.inneractive.sdk.player.exoplayer2.source.k(pVar, pVar.j));
        pVar.n.removeCallbacksAndMessages(null);
        pVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z = xVar.a(0, this.g, false).d != -9223372036854775807L;
        if (!this.i || z) {
            this.i = z;
            this.h.a(xVar, null);
        }
    }
}
