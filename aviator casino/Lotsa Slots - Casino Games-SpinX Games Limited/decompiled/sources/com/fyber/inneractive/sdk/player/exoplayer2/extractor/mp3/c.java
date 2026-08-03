package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

/* loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("Xing");
    public static final int n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("Info");
    public static final int o = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("VBRI");

    /* renamed from: a, reason: collision with root package name */
    public final long f3960a;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j e;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f;
    public int g;
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b h;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b i;
    public long k;
    public int l;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.m d = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
    public long j = -9223372036854775807L;

    public c(long j) {
        this.f3960a = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.b.f4112a, 0, 4, false);
        this.b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.b.b(), this.c);
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a(this.c.f, bVar.c, bVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
    
        if (r20 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
    
        r19.a(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ea, code lost:
    
        r18.g = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r19.e = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z) {
        int i;
        int a2;
        int i2 = z ? 16384 : 131072;
        bVar.e = 0;
        int i3 = 0;
        if (bVar.c == 0) {
            while (true) {
                bVar.a(this.b.f4112a, 0, 10, false);
                this.b.e(0);
                if (this.b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.b) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.b;
                nVar.e(nVar.b + 3);
                int i4 = this.b.i();
                int i5 = i4 + 10;
                if (this.h == null) {
                    byte[] bArr = new byte[i5];
                    java.lang.System.arraycopy(this.b.f4112a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i4, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a3 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i5, bArr);
                    this.h = a3;
                    if (a3 != null) {
                        this.d.a(a3);
                    }
                } else {
                    bVar.a(i4, false);
                }
                i3 += i5;
            }
            bVar.e = 0;
            bVar.a(i3, false);
            i = (int) (bVar.c + bVar.e);
            if (!z) {
                bVar.a(i);
            }
            i3 = 0;
        } else {
            i = 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (!bVar.a(this.b.f4112a, 0, 4, i3 > 0)) {
                break;
            }
            this.b.e(0);
            int b = this.b.b();
            if ((i6 == 0 || ((-128000) & b) == (i6 & (-128000))) && (a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b, this.c);
                    i6 = b;
                }
                bVar.a(a2 - 4, false);
            } else {
                int i8 = i7 + 1;
                if (i7 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z) {
                    bVar.e = 0;
                    bVar.a(i + i8, false);
                } else {
                    bVar.a(1);
                }
                i7 = i8;
                i3 = 0;
                i6 = 0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.e = jVar;
        this.f = jVar.a(0, 1);
        this.e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.g = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r12 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c.n) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005e  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        int i;
        int i2;
        int b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b bVar2;
        int m2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d dVar;
        int j;
        long j2;
        long min;
        if (this.g == 0) {
            try {
                a(bVar, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.i == null) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.c.c);
            bVar.a(nVar.f4112a, 0, this.c.c, false);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.c;
            if ((nVar2.f3981a & 1) != 0) {
                if (nVar2.e != 1) {
                    i = 36;
                    if (nVar.c >= i + 4) {
                        nVar.e(i);
                        i2 = nVar.b();
                        if (i2 != m) {
                        }
                        if (i2 == m && i2 != n) {
                            if (i2 == o) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar3 = this.c;
                                long j3 = bVar.c;
                                long j4 = bVar.b;
                                nVar.e(nVar.b + 10);
                                int b2 = nVar.b();
                                if (b2 > 0) {
                                    int i3 = nVar3.d;
                                    long a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(b2, (i3 >= 32000 ? 1152 : 576) * 1000000, i3);
                                    int o2 = nVar.o();
                                    int o3 = nVar.o();
                                    int o4 = nVar.o();
                                    int i4 = 2;
                                    nVar.e(nVar.b + 2);
                                    long j5 = j3 + nVar3.c;
                                    int i5 = o2 + 1;
                                    long[] jArr = new long[i5];
                                    long[] jArr2 = new long[i5];
                                    jArr[0] = 0;
                                    jArr2[0] = j5;
                                    long j6 = j5;
                                    int i6 = 1;
                                    while (i6 < i5) {
                                        if (o4 == 1) {
                                            j = nVar.j();
                                        } else if (o4 == i4) {
                                            j = nVar.o();
                                        } else if (o4 == 3) {
                                            j = nVar.l();
                                        } else if (o4 == 4) {
                                            j = nVar.m();
                                        }
                                        long j7 = j4;
                                        long j8 = j6 + (j * o3);
                                        int i7 = i5;
                                        int i8 = o3;
                                        int i9 = o4;
                                        jArr[i6] = (i6 * a2) / o2;
                                        if (j7 == -1) {
                                            min = j8;
                                            j2 = j7;
                                        } else {
                                            j2 = j7;
                                            min = java.lang.Math.min(j2, j8);
                                        }
                                        jArr2[i6] = min;
                                        i6++;
                                        o3 = i8;
                                        o4 = i9;
                                        long j9 = j2;
                                        i5 = i7;
                                        j6 = j8;
                                        i4 = 2;
                                        j4 = j9;
                                    }
                                    dVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d(jArr, jArr2, a2);
                                    bVar.a(this.c.c);
                                    bVar2 = dVar;
                                }
                                dVar = null;
                                bVar.a(this.c.c);
                                bVar2 = dVar;
                            } else {
                                bVar.e = 0;
                                bVar2 = null;
                            }
                        } else {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar4 = this.c;
                            long j10 = bVar.c;
                            long j11 = bVar.b;
                            int i10 = nVar4.g;
                            int i11 = nVar4.d;
                            long j12 = j10 + nVar4.c;
                            b = nVar.b();
                            if ((b & 1) == 1 || (m2 = nVar.m()) == 0) {
                                bVar2 = null;
                            } else {
                                long a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(m2, i10 * 1000000, i11);
                                if ((b & 6) != 6) {
                                    bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.e(j12, a3, j11, null, 0L, 0);
                                } else {
                                    long m3 = nVar.m();
                                    nVar.e(nVar.b + 1);
                                    long[] jArr3 = new long[99];
                                    for (int i12 = 0; i12 < 99; i12++) {
                                        jArr3[i12] = nVar.j();
                                    }
                                    bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.e(j12, a3, j11, jArr3, m3, nVar4.c);
                                }
                            }
                            if (bVar2 != null) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar = this.d;
                                if (mVar.f3951a == -1 || mVar.b == -1) {
                                    bVar.e = 0;
                                    bVar.a(i + 141, false);
                                    bVar.a(this.b.f4112a, 0, 3, false);
                                    this.b.e(0);
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2 = this.d;
                                    int l = this.b.l();
                                    mVar2.getClass();
                                    int i13 = l >> 12;
                                    int i14 = l & 4095;
                                    if (i13 > 0 || i14 > 0) {
                                        mVar2.f3951a = i13;
                                        mVar2.b = i14;
                                    }
                                }
                            }
                            bVar.a(this.c.c);
                            if (bVar2 != null && !bVar2.a() && i2 == n) {
                                bVar2 = b(bVar);
                            }
                        }
                        this.i = bVar2;
                        if (bVar2 == null) {
                            this.i = b(bVar);
                        }
                        this.e.a(this.i);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5 = this.c;
                        java.lang.String str = nVar5.b;
                        int i15 = nVar5.e;
                        int i16 = nVar5.d;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3 = this.d;
                        rVar.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, -1, 4096, i15, i16, -1, mVar3.f3951a, mVar3.b, null, null, 0, null, this.h));
                    }
                    if (nVar.c >= 40) {
                        nVar.e(36);
                        int b3 = nVar.b();
                        int i17 = o;
                        if (b3 == i17) {
                            i2 = i17;
                            if (i2 == m) {
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar42 = this.c;
                            long j102 = bVar.c;
                            long j112 = bVar.b;
                            int i102 = nVar42.g;
                            int i112 = nVar42.d;
                            long j122 = j102 + nVar42.c;
                            b = nVar.b();
                            if ((b & 1) == 1) {
                            }
                            bVar2 = null;
                            if (bVar2 != null) {
                            }
                            bVar.a(this.c.c);
                            if (bVar2 != null) {
                                bVar2 = b(bVar);
                            }
                            this.i = bVar2;
                            if (bVar2 == null) {
                            }
                            this.e.a(this.i);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar52 = this.c;
                            java.lang.String str2 = nVar52.b;
                            int i152 = nVar52.e;
                            int i162 = nVar52.d;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar32 = this.d;
                            rVar2.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str2, -1, 4096, i152, i162, -1, mVar32.f3951a, mVar32.b, null, null, 0, null, this.h));
                        }
                    }
                    i2 = 0;
                    if (i2 == m) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar422 = this.c;
                    long j1022 = bVar.c;
                    long j1122 = bVar.b;
                    int i1022 = nVar422.g;
                    int i1122 = nVar422.d;
                    long j1222 = j1022 + nVar422.c;
                    b = nVar.b();
                    if ((b & 1) == 1) {
                    }
                    bVar2 = null;
                    if (bVar2 != null) {
                    }
                    bVar.a(this.c.c);
                    if (bVar2 != null) {
                    }
                    this.i = bVar2;
                    if (bVar2 == null) {
                    }
                    this.e.a(this.i);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar22 = this.f;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar522 = this.c;
                    java.lang.String str22 = nVar522.b;
                    int i1522 = nVar522.e;
                    int i1622 = nVar522.d;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar322 = this.d;
                    rVar22.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str22, -1, 4096, i1522, i1622, -1, mVar322.f3951a, mVar322.b, null, null, 0, null, this.h));
                }
                i = 21;
                if (nVar.c >= i + 4) {
                }
                if (nVar.c >= 40) {
                }
                i2 = 0;
                if (i2 == m) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar4222 = this.c;
                long j10222 = bVar.c;
                long j11222 = bVar.b;
                int i10222 = nVar4222.g;
                int i11222 = nVar4222.d;
                long j12222 = j10222 + nVar4222.c;
                b = nVar.b();
                if ((b & 1) == 1) {
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                bVar.a(this.c.c);
                if (bVar2 != null) {
                }
                this.i = bVar2;
                if (bVar2 == null) {
                }
                this.e.a(this.i);
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar222 = this.f;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5222 = this.c;
                java.lang.String str222 = nVar5222.b;
                int i15222 = nVar5222.e;
                int i16222 = nVar5222.d;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3222 = this.d;
                rVar222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str222, -1, 4096, i15222, i16222, -1, mVar3222.f3951a, mVar3222.b, null, null, 0, null, this.h));
            } else {
                if (nVar2.e == 1) {
                    i = 13;
                    if (nVar.c >= i + 4) {
                    }
                    if (nVar.c >= 40) {
                    }
                    i2 = 0;
                    if (i2 == m) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar42222 = this.c;
                    long j102222 = bVar.c;
                    long j112222 = bVar.b;
                    int i102222 = nVar42222.g;
                    int i112222 = nVar42222.d;
                    long j122222 = j102222 + nVar42222.c;
                    b = nVar.b();
                    if ((b & 1) == 1) {
                    }
                    bVar2 = null;
                    if (bVar2 != null) {
                    }
                    bVar.a(this.c.c);
                    if (bVar2 != null) {
                    }
                    this.i = bVar2;
                    if (bVar2 == null) {
                    }
                    this.e.a(this.i);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2222 = this.f;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar52222 = this.c;
                    java.lang.String str2222 = nVar52222.b;
                    int i152222 = nVar52222.e;
                    int i162222 = nVar52222.d;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar32222 = this.d;
                    rVar2222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str2222, -1, 4096, i152222, i162222, -1, mVar32222.f3951a, mVar32222.b, null, null, 0, null, this.h));
                }
                i = 21;
                if (nVar.c >= i + 4) {
                }
                if (nVar.c >= 40) {
                }
                i2 = 0;
                if (i2 == m) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar422222 = this.c;
                long j1022222 = bVar.c;
                long j1122222 = bVar.b;
                int i1022222 = nVar422222.g;
                int i1122222 = nVar422222.d;
                long j1222222 = j1022222 + nVar422222.c;
                b = nVar.b();
                if ((b & 1) == 1) {
                }
                bVar2 = null;
                if (bVar2 != null) {
                }
                bVar.a(this.c.c);
                if (bVar2 != null) {
                }
                this.i = bVar2;
                if (bVar2 == null) {
                }
                this.e.a(this.i);
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar22222 = this.f;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar522222 = this.c;
                java.lang.String str22222 = nVar522222.b;
                int i1522222 = nVar522222.e;
                int i1622222 = nVar522222.d;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar322222 = this.d;
                rVar22222.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str22222, -1, 4096, i1522222, i1622222, -1, mVar322222.f3951a, mVar322222.b, null, null, 0, null, this.h));
            }
        }
        if (this.l == 0) {
            bVar.e = 0;
            if (!bVar.a(this.b.f4112a, 0, 4, true)) {
                return -1;
            }
            this.b.e(0);
            int b4 = this.b.b();
            if (((-128000) & b4) == (this.g & (-128000)) && com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b4) != -1) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(b4, this.c);
                if (this.j == -9223372036854775807L) {
                    this.j = this.i.b(bVar.c);
                    if (this.f3960a != -9223372036854775807L) {
                        this.j = (this.f3960a - this.i.b(0L)) + this.j;
                    }
                }
                this.l = this.c.c;
            } else {
                bVar.a(1);
                this.g = 0;
                return 0;
            }
        }
        int a4 = this.f.a(bVar, this.l, true);
        if (a4 != -1) {
            int i18 = this.l - a4;
            this.l = i18;
            if (i18 <= 0) {
                this.f.a(((this.k * 1000000) / r5.d) + this.j, 1, this.c.c, 0, null);
                this.k += this.c.g;
                this.l = 0;
            }
            return 0;
        }
        return -1;
    }
}
