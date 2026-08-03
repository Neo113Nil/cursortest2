package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, com.google.common.base.Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f;
    public int l;
    public long m;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n o;
    public long p;
    public int q;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j y;
    public boolean z;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f4110a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);
    public final byte[] h = new byte[16];
    public final java.util.Stack i = new java.util.Stack();
    public final java.util.LinkedList j = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f3972a = new android.util.SparseArray();
    public long r = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public int k = 0;
    public int n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int size = this.f3972a.size();
        for (int i = 0; i < size; i++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) this.f3972a.valueAt(i)).a();
        }
        this.j.clear();
        this.q = 0;
        this.i.clear();
        this.k = 0;
        this.n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x007a, code lost:
    
        r2 = r27.t;
        r4 = r2.f3971a;
        r8 = r4.h;
        r9 = r2.e;
        r27.u = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0088, code lost:
    
        if (r4.l == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x008a, code lost:
    
        r8 = r4.p;
        r10 = r4.f3979a.f3969a;
        r11 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0092, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0095, code lost:
    
        r11 = r2.c.h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009b, code lost:
    
        r10 = r11.f3978a;
        r4 = r4.m[r9];
        r9 = r27.e;
        r11 = r9.f4112a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00a5, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00a7, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00ab, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.b;
        r2.a(1, r27.e);
        r2.a(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00bc, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00be, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00d3, code lost:
    
        r27.v = r10;
        r27.u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00e3, code lost:
    
        if (r27.t.c.g != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00e5, code lost:
    
        r27.u -= 8;
        r1.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00ed, code lost:
    
        r27.k = 4;
        r27.w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00f2, code lost:
    
        r2 = r27.t;
        r4 = r2.f3971a;
        r5 = r2.c;
        r8 = r2.b;
        r2 = r2.e;
        r9 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0100, code lost:
    
        if (r9 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0102, code lost:
    
        r12 = r27.c.f4112a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r3 = r9 + 1;
        r9 = 4 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0115, code lost:
    
        if (r27.v >= r27.u) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0117, code lost:
    
        r13 = r27.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0119, code lost:
    
        if (r13 != 0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x014c, code lost:
    
        if (r27.x == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x014e, code lost:
    
        r27.d.c(r13);
        r1.b(r27.d.f4112a, r7 ? 1 : 0, r27.w, r7);
        r8.a(r27.w, r27.d);
        r13 = r27.w;
        r14 = r27.d;
        r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r14.c, r14.f4112a);
        r27.d.e("video/hevc".equals(r5.f.f) ? 1 : 0);
        r27.d.d(r14);
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r4.j[r2] + r4.i[r2]) * 1000, r27.d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x019b, code lost:
    
        r27.v += r13;
        r27.w -= r13;
        r6 = 1;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0196, code lost:
    
        r13 = r8.a(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x011b, code lost:
    
        r1.b(r12, r9, r3, r7);
        r27.c.e(r7 ? 1 : 0);
        r27.w = r27.c.m() - r6;
        r27.b.e(r7 ? 1 : 0);
        r8.a(4, r27.b);
        r8.a(r6, r27.c);
        r27.x = r7;
        r27.v += 5;
        r27.u += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01bb, code lost:
    
        r6 = (r4.j[r2] + r4.i[r2]) * 1000;
        r1 = r4.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01c9, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01cb, code lost:
    
        r3 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01cf, code lost:
    
        r11 = r3 | (r4.k[r2] ? 1 : 0);
        r2 = r4.f3979a.f3969a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01d9, code lost:
    
        if (r1 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01db, code lost:
    
        r1 = r4.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01dd, code lost:
    
        if (r1 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01df, code lost:
    
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x01e8, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x01eb, code lost:
    
        r1 = r27.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01ed, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01ef, code lost:
    
        r9 = r1.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01f6, code lost:
    
        r8.a(r9, r11, r27.u, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0202, code lost:
    
        if (r27.j.isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0204, code lost:
    
        r1 = r27.t;
        r1.e++;
        r2 = r1.f + 1;
        r1.f = r2;
        r4 = r4.g;
        r5 = r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0217, code lost:
    
        if (r2 != r4[r5]) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0219, code lost:
    
        r1.g = r5 + 1;
        r2 = 0;
        r1.f = 0;
        r27.t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0224, code lost:
    
        r27.k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0227, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0223, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0228, code lost:
    
        r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.j.removeFirst();
        r27.q -= r1.b;
        r1 = r1.f3970a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x023a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01f5, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01e2, code lost:
    
        r1 = r5.h[r2].b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01ea, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01ce, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01a9, code lost:
    
        r3 = r27.v;
        r6 = r27.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01ad, code lost:
    
        if (r3 >= r6) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01af, code lost:
    
        r27.v += r8.a(r1, r6 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x00c0, code lost:
    
        r4 = r8.o();
        r8.e(r8.b - 2);
        r4 = (r4 * 6) + 2;
        r2.a(r4, r8);
        r10 = (r10 + 1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x00aa, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x00db, code lost:
    
        r27.v = 0;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        long n;
        long n2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = bVar;
        while (true) {
            int i = this.k;
            int i2 = 1;
            boolean z = false;
            if (i == 0) {
                if (this.n == 0) {
                    if (!bVar2.b(this.g.f4112a, 0, 8, true)) {
                        return -1;
                    }
                    this.n = 8;
                    this.g.e(0);
                    this.m = this.g.k();
                    this.l = this.g.b();
                }
                if (this.m == 1) {
                    bVar2.b(this.g.f4112a, 8, 8, false);
                    this.n += 8;
                    this.m = this.g.n();
                }
                long j = this.m;
                long j2 = this.n;
                if (j >= j2) {
                    long j3 = bVar2.c - j2;
                    if (this.l == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.L) {
                        int size = this.f3972a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) this.f3972a.valueAt(i3)).f3971a;
                            uVar.getClass();
                            uVar.c = j3;
                            uVar.b = j3;
                        }
                    }
                    int i4 = this.l;
                    if (i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.i) {
                        this.t = null;
                        this.p = j3 + this.m;
                        if (!this.z) {
                            this.y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(this.r));
                            this.z = true;
                        }
                        this.k = 2;
                    } else if (i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.E && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.F && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.H && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.L && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.M && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.N && i4 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.Q) {
                        if (i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.T || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.S || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.D || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.B || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.U || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.x || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.y || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.P || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.z || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.A || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.V || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.d0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.e0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.i0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.h0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.f0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.g0 || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.R || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.O || i4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G0) {
                            if (this.n == 8) {
                                long j4 = this.m;
                                if (j4 <= 2147483647L) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j4);
                                    this.o = nVar;
                                    java.lang.System.arraycopy(this.g.f4112a, 0, nVar.f4112a, 0, 8);
                                    this.k = 1;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.m <= 2147483647L) {
                            this.o = null;
                            this.k = 1;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long j5 = (bVar2.c + this.m) - 8;
                        this.i.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a(this.l, j5));
                        if (this.m == this.n) {
                            a(j5);
                        } else {
                            this.k = 0;
                            this.n = 0;
                        }
                    }
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j6 = Long.MAX_VALUE;
                if (i != 2) {
                    if (i != 3) {
                        break;
                    }
                    if (this.t != null) {
                        break;
                    }
                    android.util.SparseArray sparseArray = this.f3972a;
                    int size2 = sparseArray.size();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar = null;
                    for (int i5 = 0; i5 < size2; i5++) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) sparseArray.valueAt(i5);
                        int i6 = lVar2.g;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar2 = lVar2.f3971a;
                        if (i6 != uVar2.d) {
                            long j7 = uVar2.f[i6];
                            if (j7 < j6) {
                                lVar = lVar2;
                                j6 = j7;
                            }
                        }
                    }
                    if (lVar == null) {
                        int i7 = (int) (this.p - bVar2.c);
                        if (i7 >= 0) {
                            bVar2.a(i7);
                            this.k = 0;
                            this.n = 0;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to end of mdat was negative.");
                        }
                    } else {
                        int i8 = (int) (lVar.f3971a.f[lVar.g] - bVar2.c);
                        if (i8 < 0) {
                            android.util.Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i8 = 0;
                        }
                        bVar2.a(i8);
                        this.t = lVar;
                    }
                } else {
                    int size3 = this.f3972a.size();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar3 = null;
                    for (int i9 = 0; i9 < size3; i9++) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar3 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) this.f3972a.valueAt(i9)).f3971a;
                        if (uVar3.q) {
                            long j8 = uVar3.c;
                            if (j8 < j6) {
                                lVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) this.f3972a.valueAt(i9);
                                j6 = j8;
                            }
                        }
                    }
                    if (lVar3 == null) {
                        this.k = 3;
                    } else {
                        int i10 = (int) (j6 - bVar2.c);
                        if (i10 >= 0) {
                            bVar2.a(i10);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar4 = lVar3.f3971a;
                            bVar2.b(uVar4.p.f4112a, 0, uVar4.o, false);
                            uVar4.p.e(0);
                            uVar4.q = false;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i11 = ((int) this.m) - this.n;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.o;
                if (nVar2 != null) {
                    bVar2.b(nVar2.f4112a, 8, i11, false);
                    int i12 = this.l;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.o;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b(i12, nVar3);
                    long j9 = bVar2.c;
                    if (!this.i.isEmpty()) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) this.i.peek()).Q0.add(bVar3);
                    } else {
                        if (i12 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.B) {
                            nVar3.e(8);
                            int b = (nVar3.b() >> 24) & 255;
                            nVar3.e(nVar3.b + 4);
                            long k = nVar3.k();
                            if (b == 0) {
                                n = nVar3.k();
                                n2 = nVar3.k();
                            } else {
                                n = nVar3.n();
                                n2 = nVar3.n();
                            }
                            long j10 = n2 + j9;
                            long j11 = n;
                            long j12 = j10;
                            long a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j11, 1000000L, k);
                            nVar3.e(nVar3.b + 2);
                            int o = nVar3.o();
                            int[] iArr = new int[o];
                            long[] jArr = new long[o];
                            long[] jArr2 = new long[o];
                            long[] jArr3 = new long[o];
                            long j13 = j11;
                            long j14 = a2;
                            int i13 = 0;
                            while (i13 < o) {
                                int b2 = nVar3.b();
                                if ((Integer.MIN_VALUE & b2) == 0) {
                                    long k2 = nVar3.k();
                                    iArr[i13] = b2 & Integer.MAX_VALUE;
                                    jArr[i13] = j12;
                                    jArr3[i13] = j14;
                                    long j15 = j13 + k2;
                                    long[] jArr4 = jArr3;
                                    long[] jArr5 = jArr2;
                                    long a3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j15, 1000000L, k);
                                    jArr5[i13] = a3 - jArr4[i13];
                                    nVar3.e(nVar3.b + 4);
                                    j12 += iArr[i13];
                                    i13++;
                                    jArr2 = jArr5;
                                    jArr = jArr;
                                    jArr3 = jArr4;
                                    o = o;
                                    j13 = j15;
                                    j14 = a3;
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unhandled indirect reference");
                                }
                            }
                            android.util.Pair create = android.util.Pair.create(java.lang.Long.valueOf(a2), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr, jArr, jArr2, jArr3));
                            this.s = ((java.lang.Long) create.first).longValue();
                            this.y.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.q) create.second);
                            this.z = true;
                        } else {
                            int i14 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G0;
                        }
                        bVar2 = bVar;
                    }
                } else {
                    bVar2.a(i11);
                }
                a(bVar2.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x06cd, code lost:
    
        r2 = r0;
        r2.k = 0;
        r2.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06d3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s a2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m mVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar;
        android.util.SparseArray sparseArray;
        byte[] bArr;
        int i;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar;
        int size;
        int i3;
        byte[] bArr2;
        int i4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar2;
        int i5;
        byte[] bArr3;
        int i6;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar3;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar2;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        long j3;
        boolean z;
        int i11;
        boolean z2;
        int i12;
        boolean z3;
        int i13;
        boolean z4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j jVar;
        boolean z5;
        loop0: while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m mVar2 = this;
            while (!mVar2.i.isEmpty() && ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) mVar2.i.peek()).P0 == j) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) mVar2.i.pop();
                int i14 = aVar4.f3963a;
                int i15 = 12;
                int i16 = 8;
                int i17 = 1;
                if (i14 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C) {
                    com.fyber.inneractive.sdk.player.exoplayer2.drm.d a3 = a(aVar4.Q0);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b = aVar4.b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.N);
                    android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                    int size2 = b.Q0.size();
                    long j4 = -9223372036854775807L;
                    int i18 = 0;
                    while (i18 < size2) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) b.Q0.get(i18);
                        int i19 = bVar.f3963a;
                        if (i19 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.z) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
                            nVar.e(i15);
                            android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(nVar.b()), new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j(nVar.m() - 1, nVar.m(), nVar.m(), nVar.b()));
                            sparseArray2.put(((java.lang.Integer) create.first).intValue(), (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j) create.second);
                        } else if (i19 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.O) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVar.P0;
                            nVar2.e(8);
                            j4 = ((nVar2.b() >> 24) & 255) == 0 ? nVar2.k() : nVar2.n();
                        }
                        i18++;
                        i15 = 12;
                    }
                    android.util.SparseArray sparseArray3 = new android.util.SparseArray();
                    int size3 = aVar4.R0.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) aVar4.R0.get(i20);
                        if (aVar5.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.E && (a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(aVar5, aVar4.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.D), j4, a3, false)) != null) {
                            sparseArray3.put(a2.f3977a, a2);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (mVar2.f3972a.size() == 0) {
                        for (int i21 = 0; i21 < size4; i21++) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s) sparseArray3.valueAt(i21);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a4 = mVar2.y.a(i21, sVar.b);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l(a4);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j jVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j) sparseArray2.get(sVar.f3977a);
                            lVar2.c = sVar;
                            jVar2.getClass();
                            lVar2.d = jVar2;
                            a4.a(sVar.f);
                            lVar2.a();
                            mVar2.f3972a.put(sVar.f3977a, lVar2);
                            mVar2.r = java.lang.Math.max(mVar2.r, sVar.e);
                        }
                        mVar2.y.b();
                    } else {
                        if (mVar2.f3972a.size() != size4) {
                            throw new java.lang.IllegalStateException();
                        }
                        for (int i22 = 0; i22 < size4; i22++) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s) sparseArray3.valueAt(i22);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) mVar2.f3972a.get(sVar2.f3977a);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j jVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j) sparseArray2.get(sVar2.f3977a);
                            lVar3.getClass();
                            lVar3.c = sVar2;
                            jVar3.getClass();
                            lVar3.d = jVar3;
                            lVar3.b.a(sVar2.f);
                            lVar3.a();
                        }
                    }
                } else {
                    if (i14 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.L) {
                        android.util.SparseArray sparseArray4 = mVar2.f3972a;
                        byte[] bArr4 = mVar2.h;
                        int size5 = aVar4.R0.size();
                        int i23 = 0;
                        while (i23 < size5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) aVar4.R0.get(i23);
                            if (aVar6.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.M) {
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.y).P0;
                                nVar3.e(i16);
                                int b2 = nVar3.b();
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) sparseArray4.get(nVar3.b());
                                if (lVar4 == null) {
                                    lVar4 = null;
                                } else {
                                    if ((b2 & 1) != 0) {
                                        long n = nVar3.n();
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar3 = lVar4.f3971a;
                                        uVar3.b = n;
                                        uVar3.c = n;
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j jVar4 = lVar4.d;
                                    lVar4.f3971a.f3979a = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j((b2 & 2) != 0 ? nVar3.m() - i17 : jVar4.f3969a, (b2 & 8) != 0 ? nVar3.m() : jVar4.b, (b2 & 16) != 0 ? nVar3.m() : jVar4.c, (b2 & 32) != 0 ? nVar3.m() : jVar4.d);
                                }
                                if (lVar4 != null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar4 = lVar4.f3971a;
                                    long j5 = uVar4.r;
                                    lVar4.a();
                                    int i24 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.x;
                                    if (aVar6.c(i24) != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVar6.c(i24).P0;
                                        nVar4.e(i16);
                                        j5 = ((nVar4.b() >> 24) & 255) == i17 ? nVar4.n() : nVar4.k();
                                    }
                                    java.util.ArrayList arrayList2 = aVar6.Q0;
                                    int size6 = arrayList2.size();
                                    int i25 = 0;
                                    int i26 = 0;
                                    int i27 = 0;
                                    while (i27 < size6) {
                                        android.util.SparseArray sparseArray5 = sparseArray4;
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) arrayList2.get(i27);
                                        int i28 = size5;
                                        long j6 = j5;
                                        if (bVar2.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.A) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = bVar2.P0;
                                            nVar5.e(12);
                                            int m = nVar5.m();
                                            if (m > 0) {
                                                i25 += m;
                                                i26++;
                                            }
                                        }
                                        i27++;
                                        size5 = i28;
                                        sparseArray4 = sparseArray5;
                                        j5 = j6;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size5;
                                    long j7 = j5;
                                    lVar4.g = 0;
                                    lVar4.f = 0;
                                    lVar4.e = 0;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar5 = lVar4.f3971a;
                                    uVar5.d = i26;
                                    uVar5.e = i25;
                                    int[] iArr = uVar5.g;
                                    if (iArr == null || iArr.length < i26) {
                                        uVar5.f = new long[i26];
                                        uVar5.g = new int[i26];
                                    }
                                    int[] iArr2 = uVar5.h;
                                    if (iArr2 == null || iArr2.length < i25) {
                                        int i29 = (i25 * 125) / 100;
                                        uVar5.h = new int[i29];
                                        uVar5.i = new int[i29];
                                        uVar5.j = new long[i29];
                                        uVar5.k = new boolean[i29];
                                        uVar5.m = new boolean[i29];
                                    }
                                    int i30 = 0;
                                    int i31 = 0;
                                    int i32 = 0;
                                    while (i30 < size6) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) arrayList2.get(i30);
                                        if (bVar3.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.A) {
                                            int i33 = i31 + 1;
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVar3.P0;
                                            nVar6.e(8);
                                            int b3 = nVar6.b();
                                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar3 = lVar4.c;
                                            arrayList = arrayList2;
                                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar6 = lVar4.f3971a;
                                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j jVar5 = uVar6.f3979a;
                                            i7 = size6;
                                            uVar6.g[i31] = nVar6.m();
                                            long[] jArr = uVar6.f;
                                            aVar2 = aVar4;
                                            long j8 = uVar6.b;
                                            jArr[i31] = j8;
                                            if ((b3 & 1) != 0) {
                                                i6 = i23;
                                                aVar3 = aVar6;
                                                uVar2 = uVar4;
                                                jArr[i31] = j8 + nVar6.b();
                                            } else {
                                                i6 = i23;
                                                aVar3 = aVar6;
                                                uVar2 = uVar4;
                                            }
                                            boolean z6 = (b3 & 4) != 0;
                                            int i34 = jVar5.d;
                                            if (z6) {
                                                i34 = nVar6.m();
                                            }
                                            boolean z7 = (b3 & 256) != 0;
                                            boolean z8 = (b3 & 512) != 0;
                                            boolean z9 = (b3 & 1024) != 0;
                                            boolean z10 = (b3 & 2048) != 0;
                                            long[] jArr2 = sVar3.i;
                                            int i35 = i34;
                                            if (jArr2 != null) {
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i8 = i30;
                                                    j2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(sVar3.j[0], 1000L, sVar3.c);
                                                    int[] iArr3 = uVar6.h;
                                                    lVar = lVar4;
                                                    int[] iArr4 = uVar6.i;
                                                    i5 = i8;
                                                    long[] jArr3 = uVar6.j;
                                                    boolean[] zArr = uVar6.k;
                                                    i9 = uVar6.g[i31] + i32;
                                                    long j9 = j2;
                                                    long j10 = sVar3.c;
                                                    if (i31 <= 0) {
                                                        i10 = i32;
                                                        j3 = uVar6.r;
                                                    } else {
                                                        i10 = i32;
                                                        j3 = j7;
                                                    }
                                                    while (i10 < i9) {
                                                        if (z7) {
                                                            z = z7;
                                                            i11 = nVar6.m();
                                                        } else {
                                                            z = z7;
                                                            i11 = jVar5.b;
                                                        }
                                                        if (z8) {
                                                            z2 = z8;
                                                            i12 = nVar6.m();
                                                        } else {
                                                            z2 = z8;
                                                            i12 = jVar5.c;
                                                        }
                                                        if (i10 == 0 && z6) {
                                                            z3 = z6;
                                                            i13 = i35;
                                                        } else if (z9) {
                                                            z3 = z6;
                                                            i13 = nVar6.b();
                                                        } else {
                                                            z3 = z6;
                                                            i13 = jVar5.d;
                                                        }
                                                        if (z10) {
                                                            z4 = z9;
                                                            jVar = jVar5;
                                                            z5 = z10;
                                                            iArr4[i10] = (int) ((nVar6.b() * 1000) / j10);
                                                        } else {
                                                            z4 = z9;
                                                            jVar = jVar5;
                                                            z5 = z10;
                                                            iArr4[i10] = 0;
                                                        }
                                                        jArr3[i10] = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j3, 1000L, j10) - j9;
                                                        iArr3[i10] = i12;
                                                        zArr[i10] = ((i13 >> 16) & 1) == 0;
                                                        j3 += i11;
                                                        i10++;
                                                        z7 = z;
                                                        z8 = z2;
                                                        z6 = z3;
                                                        z9 = z4;
                                                        jVar5 = jVar;
                                                        z10 = z5;
                                                    }
                                                    uVar6.r = j3;
                                                    i32 = i9;
                                                    i31 = i33;
                                                }
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                            i8 = i30;
                                            j2 = 0;
                                            int[] iArr32 = uVar6.h;
                                            lVar = lVar4;
                                            int[] iArr42 = uVar6.i;
                                            i5 = i8;
                                            long[] jArr32 = uVar6.j;
                                            boolean[] zArr2 = uVar6.k;
                                            i9 = uVar6.g[i31] + i32;
                                            long j92 = j2;
                                            long j102 = sVar3.c;
                                            if (i31 <= 0) {
                                            }
                                            while (i10 < i9) {
                                            }
                                            uVar6.r = j3;
                                            i32 = i9;
                                            i31 = i33;
                                        } else {
                                            aVar2 = aVar4;
                                            i5 = i30;
                                            bArr3 = bArr4;
                                            i6 = i23;
                                            aVar3 = aVar6;
                                            uVar2 = uVar4;
                                            arrayList = arrayList2;
                                            lVar = lVar4;
                                            i7 = size6;
                                        }
                                        i30 = i5 + 1;
                                        arrayList2 = arrayList;
                                        size6 = i7;
                                        aVar4 = aVar2;
                                        i23 = i6;
                                        aVar6 = aVar3;
                                        uVar4 = uVar2;
                                        bArr4 = bArr3;
                                        lVar4 = lVar;
                                    }
                                    aVar = aVar4;
                                    byte[] bArr5 = bArr4;
                                    i2 = i23;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar7 = uVar4;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar5 = lVar4;
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.d0);
                                    if (c != null) {
                                        uVar = uVar7;
                                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.t tVar = lVar5.c.h[uVar.f3979a.f3969a];
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = c.P0;
                                        int i36 = tVar.f3978a;
                                        nVar7.e(8);
                                        if ((nVar7.b() & 1) == 1) {
                                            nVar7.e(nVar7.b + 8);
                                        }
                                        int j11 = nVar7.j();
                                        int m2 = nVar7.m();
                                        if (m2 == uVar.e) {
                                            if (j11 == 0) {
                                                boolean[] zArr3 = uVar.m;
                                                i4 = 0;
                                                for (int i37 = 0; i37 < m2; i37++) {
                                                    int j12 = nVar7.j();
                                                    i4 += j12;
                                                    zArr3[i37] = j12 > i36;
                                                }
                                            } else {
                                                i4 = j11 * m2;
                                                java.util.Arrays.fill(uVar.m, 0, m2, j11 > i36);
                                            }
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = uVar.p;
                                            if (nVar8 == null || nVar8.c < i4) {
                                                uVar.p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i4);
                                            }
                                            uVar.o = i4;
                                            uVar.l = true;
                                            uVar.q = true;
                                        } else {
                                            java.lang.StringBuilder a5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m2, ", ");
                                            a5.append(uVar.e);
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a5.toString());
                                        }
                                    } else {
                                        uVar = uVar7;
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c2 = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.e0);
                                    if (c2 != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar9 = c2.P0;
                                        nVar9.e(8);
                                        int b4 = nVar9.b();
                                        if ((b4 & 1) == 1) {
                                            nVar9.e(nVar9.b + 8);
                                        }
                                        int m3 = nVar9.m();
                                        if (m3 != 1) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected saio entry count: ", m3));
                                        }
                                        uVar.c += ((b4 >> 24) & 255) == 0 ? nVar9.k() : nVar9.n();
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c3 = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.i0);
                                    if (c3 != null) {
                                        a(c3.P0, 0, uVar);
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c4 = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.f0);
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c5 = aVar6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.g0);
                                    if (c4 != null && c5 != null) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar10 = c4.P0;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar11 = c5.P0;
                                        nVar10.e(8);
                                        int b5 = nVar10.b();
                                        int b6 = nVar10.b();
                                        int i38 = A;
                                        if (b6 == i38) {
                                            if (((b5 >> 24) & 255) == 1) {
                                                nVar10.e(nVar10.b + 4);
                                            }
                                            if (nVar10.b() == 1) {
                                                nVar11.e(8);
                                                int b7 = nVar11.b();
                                                if (nVar11.b() == i38) {
                                                    int i39 = (b7 >> 24) & 255;
                                                    if (i39 == 1) {
                                                        if (nVar11.k() == 0) {
                                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Variable length decription in sgpd found (unsupported)");
                                                        }
                                                    } else if (i39 >= 2) {
                                                        nVar11.e(nVar11.b + 4);
                                                    }
                                                    if (nVar11.k() == 1) {
                                                        nVar11.e(nVar11.b + 2);
                                                        if (nVar11.j() == 1) {
                                                            int j13 = nVar11.j();
                                                            byte[] bArr6 = new byte[16];
                                                            nVar11.a(bArr6, 0, 16);
                                                            uVar.l = true;
                                                            uVar.n = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.t(j13, bArr6);
                                                        }
                                                        size = aVar6.Q0.size();
                                                        i3 = 0;
                                                        while (i3 < size) {
                                                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) aVar6.Q0.get(i3);
                                                            if (bVar4.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.h0) {
                                                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar12 = bVar4.P0;
                                                                nVar12.e(8);
                                                                bArr2 = bArr5;
                                                                nVar12.a(bArr2, 0, 16);
                                                                if (java.util.Arrays.equals(bArr2, B)) {
                                                                    a(nVar12, 16, uVar);
                                                                }
                                                            } else {
                                                                bArr2 = bArr5;
                                                            }
                                                            i3++;
                                                            bArr5 = bArr2;
                                                        }
                                                        bArr = bArr5;
                                                        i23 = i2 + 1;
                                                        bArr4 = bArr;
                                                        size5 = i;
                                                        sparseArray4 = sparseArray;
                                                        aVar4 = aVar;
                                                        i16 = 8;
                                                        i17 = 1;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                }
                                            } else {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                    }
                                    size = aVar6.Q0.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    bArr = bArr5;
                                    i23 = i2 + 1;
                                    bArr4 = bArr;
                                    size5 = i;
                                    sparseArray4 = sparseArray;
                                    aVar4 = aVar;
                                    i16 = 8;
                                    i17 = 1;
                                }
                            }
                            aVar = aVar4;
                            sparseArray = sparseArray4;
                            bArr = bArr4;
                            i = size5;
                            i2 = i23;
                            i23 = i2 + 1;
                            bArr4 = bArr;
                            size5 = i;
                            sparseArray4 = sparseArray;
                            aVar4 = aVar;
                            i16 = 8;
                            i17 = 1;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.drm.d a6 = a(aVar4.Q0);
                        if (a6 != null) {
                            mVar = this;
                            int size7 = mVar.f3972a.size();
                            for (int i40 = 0; i40 < size7; i40++) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l lVar6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.l) mVar.f3972a.valueAt(i40);
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = lVar6.b;
                                com.fyber.inneractive.sdk.player.exoplayer2.o oVar = lVar6.c.f;
                                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f4044a, oVar.e, oVar.f, oVar.c, oVar.b, oVar.g, oVar.j, oVar.k, oVar.l, oVar.m, oVar.n, oVar.p, oVar.o, oVar.q, oVar.r, oVar.s, oVar.t, oVar.u, oVar.v, oVar.x, oVar.y, oVar.z, oVar.w, oVar.h, a6, oVar.d));
                            }
                        }
                    } else {
                        mVar = mVar2;
                        if (!mVar.i.isEmpty()) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) mVar.i.peek()).R0.add(aVar4);
                        }
                    }
                    mVar2 = mVar;
                }
            }
        }
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.u uVar) {
        nVar.e(i + 8);
        int b = nVar.b();
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b;
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int m = nVar.m();
            if (m == uVar.e) {
                java.util.Arrays.fill(uVar.m, 0, m, z);
                int i3 = nVar.c - nVar.b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.p;
                if (nVar2 == null || nVar2.c < i3) {
                    uVar.p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i3);
                }
                uVar.o = i3;
                uVar.l = true;
                uVar.q = true;
                nVar.a(uVar.p.f4112a, 0, i3);
                uVar.p.e(0);
                uVar.q = false;
                return;
            }
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", m, ", ");
            a2.append(uVar.e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(a2.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b) arrayList.get(i);
            if (bVar.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                byte[] bArr = bVar.P0.f4112a;
                java.util.UUID a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.q.a(bArr);
                if (a2 == null) {
                    android.util.Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(a2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
