package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f3949a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("HlsPlaylistTracker:MediaPlaylist");
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public java.io.IOException j;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k k;

    public h(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, long j) {
        this.k = kVar;
        this.f3949a = aVar;
        this.g = j;
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0(kVar.f3950a.f3934a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.j.f3946a, aVar.f3944a), kVar.b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.k.i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
        long j3 = d0Var.f;
        if (fVar.b != null) {
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
        }
    }

    public final void b() {
        this.h = 0L;
        if (this.i || this.b.a()) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.b;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = this.c;
        int i = this.k.c;
        b0Var.getClass();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, myLooper, d0Var, this, i, android.os.SystemClock.elapsedRealtime());
        if (b0Var.b != null) {
            throw new java.lang.IllegalStateException();
        }
        b0Var.b = yVar;
        yVar.e = null;
        b0Var.f4074a.execute(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i = false;
        b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar = d0Var.d;
        if (eVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d) {
            a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d) eVar);
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.k.i;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
            long j3 = d0Var.f;
            if (fVar.b != null) {
                fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3));
                return;
            }
            return;
        }
        this.j = new com.fyber.inneractive.sdk.player.exoplayer2.r("Loaded playlist has unexpected type.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, java.io.IOException iOException) {
        boolean z;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0 d0Var = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0) zVar;
        boolean z2 = iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.k.i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f4086a;
        long j3 = d0Var.f;
        if (fVar.b != null) {
            z = z2;
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z));
        } else {
            z = z2;
        }
        if (z) {
            return 3;
        }
        if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) && ((i = ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) iOException).f4099a) == 404 || i == 410)) {
            a();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar2 = this.k;
            if (kVar2.k == this.f3949a) {
                java.util.List list = kVar2.j.b;
                int size = list.size();
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                for (int i2 = 0; i2 < size; i2++) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar2.d.get(list.get(i2));
                    if (elapsedRealtime > hVar.h) {
                        kVar2.k = hVar.f3949a;
                        hVar.b();
                    }
                }
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar) {
        long j;
        long j2;
        long j3;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2;
        long j4;
        com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar;
        long j5;
        int size;
        int size2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar3 = this.d;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.e = elapsedRealtime;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.k;
        kVar.getClass();
        if (dVar3 != null) {
            int i2 = dVar.g;
            int i3 = dVar3.g;
            if (i2 <= i3 && (i2 < i3 || ((size = dVar.m.size()) <= (size2 = dVar3.m.size()) && (size != size2 || !dVar.j || dVar3.j)))) {
                dVar2 = (!dVar.j || dVar3.j) ? dVar3 : new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d(dVar3.b, dVar3.f3946a, dVar3.c, dVar3.d, dVar3.e, dVar3.f, dVar3.g, dVar3.h, dVar3.i, true, dVar3.k, dVar3.l, dVar3.m, dVar3.n);
                this.d = dVar2;
                if (dVar2 == dVar3) {
                    this.j = null;
                    this.f = elapsedRealtime;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar2 = this.k;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = this.f3949a;
                    if (aVar == kVar2.k) {
                        if (kVar2.l == null) {
                            kVar2.m = !dVar2.j;
                        }
                        kVar2.l = dVar2;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar = kVar2.f;
                        jVar.getClass();
                        long j6 = dVar2.c;
                        if (jVar.d.m) {
                            long j7 = dVar2.j ? dVar2.d + dVar2.o : -9223372036854775807L;
                            java.util.List list = dVar2.m;
                            if (j6 == -9223372036854775807L) {
                                if (!list.isEmpty()) {
                                    j6 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) list.get(java.lang.Math.max(0, list.size() - 3))).d;
                                } else {
                                    j5 = 0;
                                    xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j7, dVar2.o, dVar2.d, j5, true, !dVar2.j);
                                }
                            }
                            j5 = j6;
                            xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j7, dVar2.o, dVar2.d, j5, true, !dVar2.j);
                        } else {
                            long j8 = j6 == -9223372036854775807L ? 0L : j6;
                            long j9 = dVar2.d;
                            long j10 = dVar2.o;
                            xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j9 + j10, j10, j9, j8, true, false);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.source.t tVar = jVar.e;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = jVar.d.j;
                        tVar.a(xVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g());
                    }
                    int size3 = kVar2.g.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar2.g.get(i4);
                        if (iVar.m != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
                            lVar.getClass();
                            lVar.f.obtainMessage(9, iVar).sendToTarget();
                        } else {
                            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar : iVar.n) {
                                if (!nVar.o) {
                                    nVar.b(nVar.w);
                                }
                            }
                        }
                    }
                    if (aVar == kVar2.k && !dVar2.j) {
                        j4 = this.d.i;
                    }
                    j4 = -9223372036854775807L;
                } else {
                    if (!dVar2.j) {
                        if (elapsedRealtime - this.f > com.fyber.inneractive.sdk.player.exoplayer2.b.a(dVar2.i) * 3.5d) {
                            java.lang.String str = this.f3949a.f3944a;
                            this.j = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.j();
                            a();
                        } else if (dVar.m.size() + dVar.g < this.d.g) {
                            java.lang.String str2 = this.f3949a.f3944a;
                            this.j = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.i();
                        }
                        j4 = this.d.i / 2;
                    }
                    j4 = -9223372036854775807L;
                }
                if (j4 == -9223372036854775807L) {
                    this.i = this.k.e.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.a(j4));
                    return;
                }
                return;
            }
        } else {
            dVar.getClass();
        }
        if (dVar.k) {
            j = dVar.d;
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar4 = kVar.l;
            j = dVar4 != null ? dVar4.d : 0L;
            if (dVar3 != null) {
                int size4 = dVar3.m.size();
                int i5 = dVar.g - dVar3.g;
                java.util.List list2 = dVar3.m;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = i5 < list2.size() ? (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) list2.get(i5) : null;
                if (cVar != null) {
                    j2 = dVar3.d;
                    j3 = cVar.d;
                } else if (size4 == dVar.g - dVar3.g) {
                    j2 = dVar3.d;
                    j3 = dVar3.o;
                }
                j = j2 + j3;
            }
        }
        long j11 = j;
        if (dVar.e) {
            i = dVar.f;
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar5 = kVar.l;
            i = dVar5 != null ? dVar5.f : 0;
            if (dVar3 != null) {
                int i6 = dVar.g - dVar3.g;
                java.util.List list3 = dVar3.m;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = i6 < list3.size() ? (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) list3.get(i6) : null;
                if (cVar2 != null) {
                    i = (dVar3.f + cVar2.c) - ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) dVar.m.get(0)).c;
                }
            }
        }
        dVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d(dVar.b, dVar.f3946a, dVar.c, j11, true, i, dVar.g, dVar.h, dVar.i, dVar.j, dVar.k, dVar.l, dVar.m, dVar.n);
        this.d = dVar2;
        if (dVar2 == dVar3) {
        }
        if (j4 == -9223372036854775807L) {
        }
    }

    public final void a() {
        this.h = android.os.SystemClock.elapsedRealtime() + 60000;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.k;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = this.f3949a;
        int size = kVar.g.size();
        for (int i = 0; i < size; i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.g.get(i);
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar : iVar.n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.c;
                int a2 = fVar.f.a(aVar.b);
                if (a2 != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.p;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= bVar.b) {
                            i2 = -1;
                            break;
                        } else if (bVar.c[i2] == a2) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        fVar.p.a(i2);
                    }
                }
            }
            if (iVar.m != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
                lVar.getClass();
                lVar.f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar2 : iVar.n) {
                    if (!nVar2.o) {
                        nVar2.b(nVar2.w);
                    }
                }
            }
        }
    }
}
