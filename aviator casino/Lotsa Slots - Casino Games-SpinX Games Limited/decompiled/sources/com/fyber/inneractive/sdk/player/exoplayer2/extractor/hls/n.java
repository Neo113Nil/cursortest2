package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class n implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.source.w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3941a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o e;
    public final int f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f h;
    public boolean n;
    public boolean o;
    public int p;
    public com.fyber.inneractive.sdk.player.exoplayer2.o q;
    public int r;
    public boolean s;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.z t;
    public int u;
    public boolean[] v;
    public long w;
    public long x;
    public boolean y;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 g = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:HlsSampleStreamWrapper");
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d i = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d();
    public final android.util.SparseArray j = new android.util.SparseArray();
    public final java.util.LinkedList k = new java.util.LinkedList();
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.m l = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.m(this);
    public final android.os.Handler m = new android.os.Handler();

    public n(int i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f3941a = i;
        this.b = iVar;
        this.c = fVar;
        this.d = bVar;
        this.e = oVar;
        this.f = i2;
        this.h = fVar2;
        this.w = j;
        this.x = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j) {
        boolean z;
        boolean z2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar;
        int i;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar;
        int i3;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i4;
        if (this.y || this.g.a()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = this.c;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar2 = this.k.isEmpty() ? null : (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) this.k.getLast();
        long j2 = this.x;
        if (j2 == -9223372036854775807L) {
            j2 = j;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar = this.i;
        int a2 = hVar2 == null ? -1 : fVar.f.a(hVar2.c);
        fVar.k = null;
        if (hVar2 != null) {
            java.lang.Math.max(0L, hVar2.f - j2);
        }
        fVar.p.d();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.p;
        int i5 = bVar.c[bVar.a()];
        boolean z3 = a2 != i5;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = fVar.d[i5];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.e.d.get(aVar2);
        if (hVar3.d != null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar4 = hVar2;
            long j3 = j2;
            long max = java.lang.Math.max(30000L, com.fyber.inneractive.sdk.player.exoplayer2.b.a(hVar3.d.o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2 = hVar3.d;
            if (dVar2.j || (i4 = dVar2.b) == 2 || i4 == 1 || hVar3.e + max > elapsedRealtime) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d a3 = fVar.e.a(aVar2);
                if (hVar4 == null || z3) {
                    hVar = hVar4;
                    long j4 = hVar == null ? j3 : hVar.f;
                    if (a3.j || j4 <= a3.d + a3.o) {
                        java.util.List list = a3.m;
                        java.lang.Long valueOf = java.lang.Long.valueOf(j4 - a3.d);
                        boolean z4 = !fVar.e.m || hVar == null;
                        int i6 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                        int binarySearch = java.util.Collections.binarySearch(list, valueOf);
                        if (binarySearch < 0) {
                            i = -(binarySearch + 2);
                        } else {
                            while (true) {
                                int i7 = binarySearch - 1;
                                if (i7 < 0 || ((java.lang.Comparable) list.get(i7)).compareTo(valueOf) != 0) {
                                    break;
                                }
                                binarySearch = i7;
                            }
                            i = binarySearch;
                        }
                        if (z4) {
                            i = java.lang.Math.max(0, i);
                        }
                        int i8 = a3.g;
                        i2 = i + i8;
                        if (i2 < i8 && hVar != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar3 = fVar.d[a2];
                            aVar = aVar3;
                            a3 = fVar.e.a(aVar3);
                            i2 = hVar.i + 1;
                            i3 = a3.g;
                            if (i2 >= i3) {
                                fVar.j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                            } else {
                                int i9 = i2 - i3;
                                if (i9 < a3.m.size()) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) a3.m.get(i9);
                                    if (cVar.e) {
                                        android.net.Uri a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a3.f3946a, cVar.f);
                                        if (!a4.equals(fVar.l)) {
                                            dVar.f3935a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c(fVar.b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a4, 0L, 0L, -1L, null, 1), fVar.d[a2].b, fVar.p.c(), fVar.p.b(), fVar.i, cVar.g);
                                        } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(cVar.g, fVar.n)) {
                                            fVar.a(a4, cVar.g, fVar.m);
                                        }
                                    } else {
                                        fVar.l = null;
                                        fVar.m = null;
                                        fVar.n = null;
                                        fVar.o = null;
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = a3.l;
                                    if (cVar2 != null) {
                                        android.net.Uri a5 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a3.f3946a, cVar2.f3945a);
                                        long j5 = cVar2.h;
                                        kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a5, j5, j5, cVar2.i, null, 0);
                                    } else {
                                        kVar = null;
                                    }
                                    long j6 = a3.d + cVar.d;
                                    int i10 = a3.f + cVar.c;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.o oVar = fVar.c;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = (com.fyber.inneractive.sdk.player.exoplayer2.util.v) oVar.f3942a.get(i10);
                                    if (vVar == null) {
                                        vVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(Long.MAX_VALUE);
                                        oVar.f3942a.put(i10, vVar);
                                    }
                                    android.net.Uri a6 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(a3.f3946a, cVar.f3945a);
                                    long j7 = cVar.h;
                                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(a6, j7, j7, cVar.i, null, 0);
                                    z = true;
                                    dVar.f3935a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h(fVar.f3936a, kVar2, kVar, aVar, fVar.g, fVar.p.c(), fVar.p.b(), j6, j6 + cVar.b, i2, i10, fVar.h, vVar, hVar, fVar.m, fVar.o);
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar3 = this.i;
                                    z2 = dVar3.b;
                                    com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar4 = dVar3.f3935a;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar5 = dVar3.c;
                                    dVar3.f3935a = null;
                                    dVar3.b = false;
                                    dVar3.c = null;
                                    if (!z2) {
                                        this.y = z;
                                        return z;
                                    }
                                    if (aVar4 == null) {
                                        if (aVar5 == null) {
                                            return false;
                                        }
                                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.b.f3937a.d.get(aVar5)).b();
                                        return false;
                                    }
                                    if (aVar4 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) {
                                        this.x = -9223372036854775807L;
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) aVar4;
                                        hVar5.D = this;
                                        int i11 = hVar5.j;
                                        boolean z5 = hVar5.t;
                                        this.r = i11;
                                        for (int i12 = 0; i12 < this.j.size(); i12++) {
                                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i12)).c.r = i11;
                                        }
                                        if (z5) {
                                            for (int i13 = 0; i13 < this.j.size(); i13++) {
                                                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i13)).m = z;
                                            }
                                        }
                                        this.k.add(hVar5);
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.g;
                                    int i14 = this.f;
                                    b0Var.getClass();
                                    android.os.Looper myLooper = android.os.Looper.myLooper();
                                    if (myLooper == null) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, myLooper, aVar4, this, i14, elapsedRealtime2);
                                    if (b0Var.b != null) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    b0Var.b = yVar;
                                    yVar.e = null;
                                    b0Var.f4074a.execute(yVar);
                                    com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
                                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar3 = aVar4.f4050a;
                                    int i15 = aVar4.b;
                                    int i16 = this.f3941a;
                                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar4.c;
                                    int i17 = aVar4.d;
                                    java.lang.Object obj = aVar4.e;
                                    long j8 = aVar4.f;
                                    long j9 = aVar4.g;
                                    if (fVar2.b != null) {
                                        fVar2.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.a(fVar2, kVar3, i15, i16, oVar2, i17, obj, j8, j9, elapsedRealtime2));
                                    }
                                    return z;
                                }
                                if (a3.j) {
                                    dVar.b = true;
                                } else {
                                    dVar.c = aVar;
                                    fVar.k = aVar;
                                }
                            }
                            z = true;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar32 = this.i;
                            z2 = dVar32.b;
                            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar42 = dVar32.f3935a;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar52 = dVar32.c;
                            dVar32.f3935a = null;
                            dVar32.b = false;
                            dVar32.c = null;
                            if (!z2) {
                            }
                        }
                    } else {
                        i2 = a3.m.size() + a3.g;
                    }
                } else {
                    hVar = hVar4;
                    i2 = hVar.i + 1;
                }
                a2 = i5;
                aVar = aVar2;
                i3 = a3.g;
                if (i2 >= i3) {
                }
                z = true;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar322 = this.i;
                z2 = dVar322.b;
                com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar422 = dVar322.f3935a;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar522 = dVar322.c;
                dVar322.f3935a = null;
                dVar322.b = false;
                dVar322.c = null;
                if (!z2) {
                }
            }
        }
        dVar.c = aVar2;
        fVar.k = aVar2;
        z = true;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.d dVar3222 = this.i;
        z2 = dVar3222.b;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar4222 = dVar3222.f3935a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar5222 = dVar3222.c;
        dVar3222.f3935a = null;
        dVar3222.b = false;
        dVar3222.c = null;
        if (!z2) {
        }
    }

    public final void c(long j) {
        this.w = j;
        this.x = j;
        this.y = false;
        this.k.clear();
        if (this.g.a()) {
            this.g.b.a(false);
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i)).a(this.v[i]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.m.post(this.l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j = this.x;
        if (j != -9223372036854775807L) {
            return j;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) this.k.getLast()).g;
    }

    public final void h() {
        if (this.s || this.o || !this.n) {
            return;
        }
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i)).e() == null) {
                return;
            }
        }
        int size2 = this.j.size();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            java.lang.String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i2)).e().f;
            char c2 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c2 > c) {
                i3 = i2;
                c = c2;
            } else if (c2 == c && i3 != -1) {
                i3 = -1;
            }
            i2++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = this.c.f;
        int i4 = yVar.f4064a;
        this.u = -1;
        this.v = new boolean[size2];
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o e = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i5)).e();
            if (i5 == i3) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    oVarArr[i6] = a(yVar.b[i6], e);
                }
                yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
                this.u = i5;
            } else {
                yVarArr[i5] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(a((c == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(e.f))) ? this.e : null, e));
            }
        }
        this.t = new com.fyber.inneractive.sdk.player.exoplayer2.source.z(yVarArr);
        this.o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = this.b;
        int i7 = iVar.k - 1;
        iVar.k = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar : iVar.n) {
            i8 += nVar.t.f4065a;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i8];
        int i9 = 0;
        for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n nVar2 : iVar.n) {
            int i10 = nVar2.t.f4065a;
            int i11 = 0;
            while (i11 < i10) {
                yVarArr2[i9] = nVar2.t.b[i11];
                i11++;
                i9++;
            }
        }
        iVar.m = new com.fyber.inneractive.sdk.player.exoplayer2.source.z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j).f.obtainMessage(8, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f4050a;
        int i = aVar.b;
        int i2 = this.f3941a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        java.lang.Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar.b != null) {
            fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (z) {
            return;
        }
        int size = this.j.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.valueAt(i4)).a(this.v[i4]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = this.c;
        fVar.getClass();
        if (aVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c) aVar;
            fVar.i = cVar.i;
            fVar.a(cVar.f4050a.f4091a, cVar.l, cVar.m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f4050a;
        int i = aVar.b;
        int i2 = this.f3941a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
        int i3 = aVar.d;
        java.lang.Object obj = aVar.e;
        long j3 = aVar.f;
        long j4 = aVar.g;
        long c = aVar.c();
        if (fVar2.b != null) {
            fVar2.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i, i2, oVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.o) {
            b(this.w);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = this.b;
        iVar.getClass();
        if (iVar.m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
        lVar.getClass();
        lVar.f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j, long j2, java.io.IOException iOException) {
        boolean z;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.v vVar;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        boolean z2 = aVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h;
        boolean z3 = !z2 || aVar.c() == 0;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar2 = this.c;
        if (z3) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar2.p;
            int a2 = fVar2.f.a(aVar.c);
            int i2 = 0;
            while (true) {
                if (i2 >= bVar.b) {
                    i2 = -1;
                    break;
                }
                if (bVar.c[i2] == a2) {
                    break;
                }
                i2++;
            }
            if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) && ((i = (vVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) iOException).f4099a) == 404 || i == 410)) {
                boolean a3 = bVar.a(i2);
                int i3 = vVar.f4099a;
                if (a3) {
                    java.lang.StringBuilder a4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Blacklisted: duration=60000, responseCode=", i3, ", format=");
                    a4.append(bVar.d[i2]);
                    android.util.Log.w("ChunkedTrackBlacklist", a4.toString());
                } else {
                    java.lang.StringBuilder a5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i3, ", format=");
                    a5.append(bVar.d[i2]);
                    android.util.Log.w("ChunkedTrackBlacklist", a5.toString());
                }
                if (a3) {
                    if (z2) {
                        if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) this.k.removeLast()) == aVar) {
                            if (this.k.isEmpty()) {
                                this.x = this.w;
                            }
                        } else {
                            throw new java.lang.IllegalStateException();
                        }
                    }
                    z = true;
                    fVar = this.h;
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f4050a;
                    int i4 = aVar.b;
                    int i5 = this.f3941a;
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.c;
                    int i6 = aVar.d;
                    java.lang.Object obj = aVar.e;
                    long j3 = aVar.f;
                    long j4 = aVar.g;
                    long c = aVar.c();
                    if (fVar.b != null) {
                        fVar.f4053a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i4, i5, oVar, i6, obj, j3, j4, j, j2, c, iOException, z));
                    }
                    if (z) {
                        return 0;
                    }
                    if (!this.o) {
                        b(this.w);
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = this.b;
                        iVar.getClass();
                        if (iVar.m != null) {
                            com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.j;
                            lVar.getClass();
                            lVar.f.obtainMessage(9, iVar).sendToTarget();
                        }
                    }
                    return 2;
                }
            }
        } else {
            fVar2.getClass();
        }
        z = false;
        fVar = this.h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar.f4050a;
        int i42 = aVar.b;
        int i52 = this.f3941a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar.c;
        int i62 = aVar.d;
        java.lang.Object obj2 = aVar.e;
        long j32 = aVar.f;
        long j42 = aVar.g;
        long c2 = aVar.c();
        if (fVar.b != null) {
        }
        if (z) {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i, int i2) {
        if (this.j.indexOfKey(i) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.j.get(i);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.d);
        gVar.n = this;
        gVar.c.r = this.r;
        this.j.put(i, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        java.lang.String a2;
        if (oVar == null) {
            return oVar2;
        }
        int c = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f);
        if (c == 1) {
            a2 = a(oVar.c, 1);
        } else {
            a2 = c == 2 ? a(oVar.c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f4044a, oVar2.e, oVar2.f, a2, oVar.b, oVar2.g, oVar.j, oVar.k, oVar2.l, oVar2.m, oVar2.n, oVar2.p, oVar2.o, oVar2.q, oVar2.r, oVar2.s, oVar2.t, oVar2.u, oVar2.v, oVar.x, oVar.y, oVar2.z, oVar2.w, oVar2.h, oVar2.i, oVar2.d);
    }

    public static java.lang.String a(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str2 : split) {
            if (i == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.n = true;
        this.m.post(this.l);
    }
}
