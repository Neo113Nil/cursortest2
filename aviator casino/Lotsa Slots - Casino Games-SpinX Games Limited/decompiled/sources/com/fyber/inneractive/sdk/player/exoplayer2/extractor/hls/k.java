package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class k implements com.fyber.inneractive.sdk.player.exoplayer2.source.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f3939a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n b;

    public k(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar, int i) {
        this.b = nVar;
        this.f3939a = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar = this.b;
        nVar.g.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.e.d.get(aVar);
            hVar.b.b();
            java.io.IOException iOException = hVar.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar = this.b;
        int i = this.f3939a;
        if (nVar.y) {
            return true;
        }
        if (nVar.x == -9223372036854775807L) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i)).c;
            synchronized (eVar) {
                z = eVar.i == 0;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar = this.b;
        int i = this.f3939a;
        if (nVar.x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (nVar.k.size() > 1) {
            int i2 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) nVar.k.getFirst()).j;
            for (int i3 = 0; i3 < nVar.j.size(); i3++) {
                if (nVar.v[i3]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i3)).c;
                    if ((eVar.i == 0 ? eVar.r : eVar.b[eVar.k]) == i2) {
                        break loop0;
                    }
                }
            }
            nVar.k.removeFirst();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) nVar.k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.c;
        if (!oVar.equals(nVar.q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.h;
            int i4 = nVar.f3941a;
            int i5 = hVar.d;
            java.lang.Object obj = hVar.e;
            long j = hVar.f;
            if (fVar.b != null) {
                fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i4, oVar, i5, obj, j));
            }
        }
        nVar.q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(i)).a(pVar, cVar, z, nVar.y, nVar.w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar = this.b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.j.valueAt(this.f3939a);
        if (nVar.y && j > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j);
        }
    }
}
