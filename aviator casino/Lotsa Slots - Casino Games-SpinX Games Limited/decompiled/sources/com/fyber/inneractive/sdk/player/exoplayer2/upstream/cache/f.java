package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l f4078a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d d;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.o oVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.t tVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.t();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d(lVar);
        this.f4078a = lVar;
        this.b = oVar;
        this.c = tVar;
        this.d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar = this.f4078a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a2 = this.b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a3 = this.c.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d dVar = this.d;
        return new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e(lVar, a2, a3, dVar != null ? new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c(dVar.f4076a) : null);
    }
}
