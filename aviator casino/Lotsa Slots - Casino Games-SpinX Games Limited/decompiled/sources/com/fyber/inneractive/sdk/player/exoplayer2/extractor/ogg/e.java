package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l f3986a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g();
            if (gVar.a(bVar, true) && (gVar.f3988a & 2) == 2) {
                int min = java.lang.Math.min(gVar.e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(min);
                bVar.a(nVar.f4112a, 0, min, false);
                nVar.e(0);
                if (nVar.c - nVar.b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f3986a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d();
                } else {
                    nVar.e(0);
                    try {
                        if (com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.s.a(1, nVar, true)) {
                            this.f3986a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.o();
                        }
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                    }
                    nVar.e(0);
                    int i = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i.o;
                    int i2 = nVar.c - nVar.b;
                    byte[] bArr = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i.p;
                    if (i2 >= bArr.length) {
                        byte[] bArr2 = new byte[bArr.length];
                        nVar.a(bArr2, 0, bArr.length);
                        if (java.util.Arrays.equals(bArr2, bArr)) {
                            this.f3986a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(0, 1);
        jVar.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l lVar = this.f3986a;
        lVar.c = jVar;
        lVar.b = a2;
        lVar.f3990a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l lVar = this.f3986a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f fVar = lVar.f3990a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar = fVar.f3987a;
        gVar.f3988a = 0;
        gVar.b = 0L;
        gVar.c = 0;
        gVar.d = 0;
        gVar.e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.b;
        nVar.b = 0;
        nVar.c = 0;
        fVar.c = -1;
        fVar.e = false;
        if (j == 0) {
            lVar.a(!lVar.l);
        } else if (lVar.h != 0) {
            lVar.e = lVar.d.c(j2);
            lVar.h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l lVar = this.f3986a;
        int i = lVar.h;
        if (i == 0) {
            while (lVar.f3990a.a(bVar)) {
                long j = bVar.c;
                long j2 = lVar.f;
                lVar.k = j - j2;
                boolean a2 = lVar.a(lVar.f3990a.b, j2, lVar.j);
                if (a2) {
                    lVar.f = bVar.c;
                }
                if (!a2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.j.f3989a;
                    lVar.i = oVar2.s;
                    if (!lVar.m) {
                        lVar.b.a(oVar2);
                        lVar.m = true;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c cVar = lVar.j.b;
                    if (cVar != null) {
                        lVar.d = cVar;
                    } else {
                        long j3 = bVar.b;
                        if (j3 == -1) {
                            lVar.d = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k();
                        } else {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g gVar = lVar.f3990a.f3987a;
                            lVar.d = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b(lVar.f, j3, lVar, gVar.d + gVar.e, gVar.b);
                        }
                    }
                    lVar.j = null;
                    lVar.h = 2;
                    lVar.f3990a.a();
                }
            }
            lVar.h = 3;
            return -1;
        }
        if (i == 1) {
            bVar.a((int) lVar.f);
            lVar.h = 2;
        } else if (i == 2) {
            long a3 = lVar.d.a(bVar);
            if (a3 >= 0) {
                oVar.f3982a = a3;
                return 1;
            }
            if (a3 < -1) {
                lVar.a(-(a3 + 2));
            }
            if (!lVar.l) {
                lVar.c.a(lVar.d.b());
                lVar.l = true;
            }
            if (lVar.k <= 0 && !lVar.f3990a.a(bVar)) {
                lVar.h = 3;
                return -1;
            }
            lVar.k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f3990a.b;
            long a4 = lVar.a(nVar);
            if (a4 >= 0) {
                long j4 = lVar.g;
                if (j4 + a4 >= lVar.e) {
                    lVar.b.a(nVar.c, nVar);
                    lVar.b.a((j4 * 1000000) / lVar.i, 1, nVar.c, 0, null);
                    lVar.e = -1L;
                }
            }
            lVar.g += a4;
        } else {
            throw new java.lang.IllegalStateException();
        }
        return 0;
    }
}
