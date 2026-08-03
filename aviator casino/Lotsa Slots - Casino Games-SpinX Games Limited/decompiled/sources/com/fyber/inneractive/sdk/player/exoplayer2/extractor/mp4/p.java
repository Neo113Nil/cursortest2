package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public static final int p = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("qt  ");
    public int e;
    public int f;
    public long g;
    public int h;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n i;
    public int j;
    public int k;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j l;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o[] m;
    public long n;
    public boolean o;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);
    public final java.util.Stack d = new java.util.Stack();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f3975a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f4110a);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.r.a(bVar, false);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:43:0x00aa, B:45:0x00ae, B:47:0x00bd, B:49:0x00d0, B:51:0x00d5, B:53:0x00dd, B:60:0x00e4, B:62:0x00c8, B:63:0x00ec, B:65:0x00f0, B:67:0x00f7, B:69:0x00fb, B:70:0x0102, B:72:0x0106, B:73:0x0111, B:75:0x0115, B:76:0x011d, B:78:0x0121, B:79:0x0127, B:81:0x012b, B:82:0x0132, B:84:0x0136, B:85:0x013d, B:87:0x0141, B:88:0x0148, B:90:0x014c, B:91:0x0153, B:93:0x0157, B:94:0x015e, B:96:0x0162, B:97:0x0169, B:99:0x016d, B:100:0x0175, B:102:0x0179, B:103:0x0182, B:105:0x0186, B:106:0x018d, B:108:0x0191, B:109:0x0199, B:111:0x019d, B:112:0x0216, B:119:0x01a3, B:121:0x01ab, B:122:0x01b1, B:124:0x01b5, B:127:0x01bb, B:129:0x01bf, B:132:0x01c4, B:134:0x01c8, B:135:0x01d0, B:137:0x01d4, B:138:0x01dc, B:140:0x01e0, B:141:0x01e8, B:143:0x01ec, B:144:0x01f4, B:146:0x01f8, B:147:0x0200, B:149:0x0204, B:150:0x020a, B:152:0x020e, B:153:0x022e, B:154:0x0236), top: B:42:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4 A[Catch: all -> 0x024a, TryCatch #0 {all -> 0x024a, blocks: (B:43:0x00aa, B:45:0x00ae, B:47:0x00bd, B:49:0x00d0, B:51:0x00d5, B:53:0x00dd, B:60:0x00e4, B:62:0x00c8, B:63:0x00ec, B:65:0x00f0, B:67:0x00f7, B:69:0x00fb, B:70:0x0102, B:72:0x0106, B:73:0x0111, B:75:0x0115, B:76:0x011d, B:78:0x0121, B:79:0x0127, B:81:0x012b, B:82:0x0132, B:84:0x0136, B:85:0x013d, B:87:0x0141, B:88:0x0148, B:90:0x014c, B:91:0x0153, B:93:0x0157, B:94:0x015e, B:96:0x0162, B:97:0x0169, B:99:0x016d, B:100:0x0175, B:102:0x0179, B:103:0x0182, B:105:0x0186, B:106:0x018d, B:108:0x0191, B:109:0x0199, B:111:0x019d, B:112:0x0216, B:119:0x01a3, B:121:0x01ab, B:122:0x01b1, B:124:0x01b5, B:127:0x01bb, B:129:0x01bf, B:132:0x01c4, B:134:0x01c8, B:135:0x01d0, B:137:0x01d4, B:138:0x01dc, B:140:0x01e0, B:141:0x01e8, B:143:0x01ec, B:144:0x01f4, B:146:0x01f8, B:147:0x0200, B:149:0x0204, B:150:0x020a, B:152:0x020e, B:153:0x022e, B:154:0x0236), top: B:42:0x00aa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s a2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e hVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar;
        boolean z;
        long j2;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar;
        int i;
        int i2;
        int i3;
        long j3;
        boolean z2;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        int i4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar;
        int i5;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i6;
        long j4;
        long[] jArr3;
        long[] jArr4;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar;
        int[] iArr3;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2;
        long[] jArr5;
        int[] iArr4;
        int i7;
        int[] iArr5;
        long[] jArr6;
        boolean z3;
        int[] iArr6;
        int[] iArr7;
        long[] jArr7;
        int[] iArr8;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.s sVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3;
        java.util.ArrayList arrayList2;
        int i8;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o b;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar;
        int i9;
        java.lang.String str;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p pVar = this;
        while (!pVar.d.isEmpty() && ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) pVar.d.peek()).P0 == j) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) pVar.d.pop();
            if (aVar2.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c = aVar2.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.A0);
                int i10 = 12;
                if (c != null) {
                    boolean z4 = pVar.o;
                    int i11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.f3968a;
                    if (!z4) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = c.P0;
                        nVar2.e(8);
                        while (true) {
                            int i12 = nVar2.c;
                            int i13 = nVar2.b;
                            if (i12 - i13 < 8) {
                                break;
                            }
                            int b2 = nVar2.b();
                            if (nVar2.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.B0) {
                                nVar2.e(i13);
                                int i14 = i13 + b2;
                                nVar2.e(nVar2.b + i10);
                                while (true) {
                                    int i15 = nVar2.b;
                                    if (i15 >= i14) {
                                        break;
                                    }
                                    int b3 = nVar2.b();
                                    if (nVar2.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C0) {
                                        nVar2.e(i15);
                                        int i16 = i15 + b3;
                                        nVar2.e(nVar2.b + 8);
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        while (true) {
                                            int i17 = nVar2.b;
                                            if (i17 >= i16) {
                                                break;
                                            }
                                            int i18 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.f3973a;
                                            int b4 = nVar2.b() + i17;
                                            int b5 = nVar2.b();
                                            int i19 = (b5 >> 24) & 255;
                                            if (i19 == 169 || i19 == 65533) {
                                                int i20 = 16777215 & b5;
                                                if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.c) {
                                                    b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, nVar2);
                                                } else {
                                                    if (i20 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.f3973a && i20 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b) {
                                                        if (i20 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.h && i20 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.i) {
                                                            if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.d) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TDRC");
                                                            } else if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.e) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TPE1");
                                                            } else if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.f) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSSE");
                                                            } else if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.g) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TALB");
                                                            } else if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.j) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "USLT");
                                                            } else if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.k) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TCON");
                                                            } else {
                                                                if (i20 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.n) {
                                                                    b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TIT1");
                                                                }
                                                                android.util.Log.d("MetadataUtil", "Skipped unknown metadata entry: " + com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.a(b5));
                                                                nVar2.e(b4);
                                                                oVar = null;
                                                                if (oVar == null) {
                                                                    arrayList4.add(oVar);
                                                                }
                                                            }
                                                        }
                                                        b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TCOM");
                                                    }
                                                    b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TIT2");
                                                }
                                                oVar = b;
                                                nVar2.e(b4);
                                                if (oVar == null) {
                                                }
                                            } else {
                                                try {
                                                    if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.m) {
                                                        nVar2.e(nVar2.b + 4);
                                                        if (nVar2.b() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.F0) {
                                                            nVar2.e(nVar2.b + 8);
                                                            i9 = nVar2.j();
                                                        } else {
                                                            android.util.Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                            i9 = -1;
                                                        }
                                                        if (i9 > 0) {
                                                            java.lang.String[] strArr = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.D;
                                                            if (i9 <= strArr.length) {
                                                                str = strArr[i9 - 1];
                                                                if (str == null) {
                                                                    oVar = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s("TCON", null, str);
                                                                } else {
                                                                    android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                    oVar = null;
                                                                }
                                                            }
                                                        }
                                                        str = null;
                                                        if (str == null) {
                                                        }
                                                    } else {
                                                        if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.o) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, nVar2, "TPOS");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.p) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, nVar2, "TRCK");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.q) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, "TBPM", nVar2, true, false);
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.r) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, "TCMP", nVar2, true, true);
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.l) {
                                                            oVar = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(nVar2);
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.s) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TPE2");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.t) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSOT");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.u) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSO2");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.v) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSOA");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.w) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSOP");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.x) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TSOC");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.y) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, "ITUNESADVISORY", nVar2, false, false);
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.z) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.a(b5, "ITUNESGAPLESS", nVar2, false, true);
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.A) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TVSHOWSORT");
                                                        } else if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.B) {
                                                            b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b5, nVar2, "TVSHOW");
                                                        } else {
                                                            if (b5 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.C) {
                                                                b = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n.b(b4, nVar2);
                                                            }
                                                            android.util.Log.d("MetadataUtil", "Skipped unknown metadata entry: " + com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.a(b5));
                                                            nVar2.e(b4);
                                                            oVar = null;
                                                            if (oVar == null) {
                                                            }
                                                        }
                                                        oVar = b;
                                                    }
                                                    nVar2.e(b4);
                                                    if (oVar == null) {
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    nVar2.e(b4);
                                                    throw th;
                                                }
                                            }
                                        }
                                        if (!arrayList4.isEmpty()) {
                                            bVar = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList4);
                                        }
                                    } else {
                                        nVar2.e(nVar2.b + (b3 - 8));
                                    }
                                }
                            } else {
                                nVar2.e(nVar2.b + (b2 - 8));
                                i10 = 12;
                            }
                        }
                    }
                    bVar = null;
                    if (bVar != null) {
                        mVar4.a(bVar);
                    }
                } else {
                    bVar = null;
                }
                long j5 = -9223372036854775807L;
                long j6 = Long.MAX_VALUE;
                int i21 = 0;
                while (i21 < aVar2.R0.size()) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a aVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) aVar2.R0.get(i21);
                    if (aVar3.f3963a == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.E && (a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i.a(aVar3, aVar2.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.D), -9223372036854775807L, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar.o)) != null) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a b6 = aVar3.b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.F).b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G).b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.H);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c2 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.q0);
                        if (c2 != null) {
                            hVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g(c2);
                        } else {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c3 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.r0);
                            if (c3 == null) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Track has no sample table size information");
                            }
                            hVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h(c3);
                        }
                        int a3 = hVar.a();
                        if (a3 == 0) {
                            aVar = aVar2;
                            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(new long[0], new int[0], 0, new long[0], new int[0]);
                            bVar2 = bVar;
                            arrayList = arrayList3;
                            mVar = mVar4;
                            j3 = j5;
                            i4 = i21;
                            j2 = j6;
                            sVar = a2;
                        } else {
                            aVar = aVar2;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c4 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.s0);
                            if (c4 == null) {
                                c4 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.t0);
                                z = true;
                            } else {
                                z = false;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = c4.P0;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.p0).P0;
                            j2 = j6;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.m0).P0;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c5 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.n0);
                            if (c5 != null) {
                                nVar = c5.P0;
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList3;
                                nVar = null;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b c6 = b6.c(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.o0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = c6 != null ? c6.P0 : null;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d dVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d(nVar4, nVar3, z);
                            nVar5.e(12);
                            int m = nVar5.m() - 1;
                            int m2 = nVar5.m();
                            int m3 = nVar5.m();
                            if (nVar6 != null) {
                                nVar6.e(12);
                                i = nVar6.m();
                            } else {
                                i = 0;
                            }
                            if (nVar != null) {
                                nVar.e(12);
                                i2 = nVar.m();
                                if (i2 > 0) {
                                    i3 = nVar.m() - 1;
                                    if (hVar.c()) {
                                        j3 = j5;
                                    } else {
                                        j3 = j5;
                                        if ("audio/raw".equals(a2.f.f) && m == 0 && i == 0 && i2 == 0) {
                                            z2 = true;
                                            if (z2) {
                                                bVar2 = bVar;
                                                mVar = mVar4;
                                                i4 = i21;
                                                sVar = a2;
                                                i5 = a3;
                                                int i22 = dVar.f3964a;
                                                long[] jArr8 = new long[i22];
                                                int[] iArr9 = new int[i22];
                                                while (dVar.a()) {
                                                    int i23 = dVar.b;
                                                    jArr8[i23] = dVar.d;
                                                    iArr9[i23] = dVar.c;
                                                }
                                                int b7 = hVar.b();
                                                long j7 = m3;
                                                int i24 = 8192 / b7;
                                                int i25 = 0;
                                                for (int i26 = 0; i26 < i22; i26++) {
                                                    int i27 = iArr9[i26];
                                                    int i28 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
                                                    i25 += ((i27 + i24) - 1) / i24;
                                                }
                                                long[] jArr9 = new long[i25];
                                                int[] iArr10 = new int[i25];
                                                jArr = new long[i25];
                                                iArr = new int[i25];
                                                int i29 = 0;
                                                int i30 = 0;
                                                int i31 = 0;
                                                int i32 = 0;
                                                while (i29 < i22) {
                                                    int i33 = iArr9[i29];
                                                    long j8 = jArr8[i29];
                                                    long[] jArr10 = jArr8;
                                                    int i34 = i33;
                                                    int i35 = i22;
                                                    int i36 = i32;
                                                    while (i34 > 0) {
                                                        int min = java.lang.Math.min(i24, i34);
                                                        jArr9[i31] = j8;
                                                        int[] iArr11 = iArr9;
                                                        int i37 = b7 * min;
                                                        iArr10[i31] = i37;
                                                        i36 = java.lang.Math.max(i36, i37);
                                                        jArr[i31] = i30 * j7;
                                                        iArr[i31] = 1;
                                                        j8 += iArr10[i31];
                                                        i30 += min;
                                                        i34 -= min;
                                                        i31++;
                                                        iArr9 = iArr11;
                                                        b7 = b7;
                                                    }
                                                    i29++;
                                                    i32 = i36;
                                                    i22 = i35;
                                                    jArr8 = jArr10;
                                                }
                                                jArr2 = jArr9;
                                                iArr2 = iArr10;
                                                i6 = i32;
                                                j4 = 0;
                                            } else {
                                                jArr2 = new long[a3];
                                                iArr2 = new int[a3];
                                                long[] jArr11 = new long[a3];
                                                int[] iArr12 = new int[a3];
                                                mVar = mVar4;
                                                i4 = i21;
                                                int i38 = m3;
                                                int i39 = i2;
                                                int i40 = i3;
                                                int i41 = m;
                                                int i42 = 0;
                                                int i43 = 0;
                                                int i44 = 0;
                                                int i45 = 0;
                                                long j9 = 0;
                                                j4 = 0;
                                                int i46 = i;
                                                int i47 = 0;
                                                bVar2 = bVar;
                                                int i48 = m2;
                                                while (i42 < a3) {
                                                    while (i45 == 0) {
                                                        if (!dVar.a()) {
                                                            throw new java.lang.IllegalStateException();
                                                        }
                                                        j9 = dVar.d;
                                                        i45 = dVar.c;
                                                        i38 = i38;
                                                        i40 = i40;
                                                    }
                                                    int i49 = i38;
                                                    int i50 = i40;
                                                    if (nVar6 != null) {
                                                        while (i47 == 0 && i46 > 0) {
                                                            i47 = nVar6.m();
                                                            i44 = nVar6.b();
                                                            i46--;
                                                        }
                                                        i47--;
                                                    }
                                                    int i51 = i44;
                                                    jArr2[i42] = j9;
                                                    int b8 = hVar.b();
                                                    iArr2[i42] = b8;
                                                    int i52 = b8 > i43 ? b8 : i43;
                                                    int i53 = a3;
                                                    jArr11[i42] = j4 + i51;
                                                    iArr12[i42] = nVar == null ? 1 : 0;
                                                    int i54 = i50;
                                                    if (i42 == i54) {
                                                        iArr12[i42] = 1;
                                                        i39--;
                                                        if (i39 > 0) {
                                                            i54 = nVar.m() - 1;
                                                        }
                                                    }
                                                    int[] iArr13 = iArr12;
                                                    int i55 = i49;
                                                    long[] jArr12 = jArr11;
                                                    j4 += i55;
                                                    i48--;
                                                    if (i48 == 0 && i41 > 0) {
                                                        i48 = nVar5.m();
                                                        i41--;
                                                        i55 = nVar5.m();
                                                    }
                                                    j9 += iArr2[i42];
                                                    i45--;
                                                    i42++;
                                                    jArr11 = jArr12;
                                                    iArr12 = iArr13;
                                                    int i56 = i52;
                                                    i44 = i51;
                                                    i38 = i55;
                                                    a3 = i53;
                                                    i40 = i54;
                                                    i43 = i56;
                                                }
                                                long[] jArr13 = jArr11;
                                                int[] iArr14 = iArr12;
                                                i5 = a3;
                                                if (i47 != 0) {
                                                    throw new java.lang.IllegalArgumentException();
                                                }
                                                while (i46 > 0) {
                                                    if (nVar6.m() != 0) {
                                                        throw new java.lang.IllegalArgumentException();
                                                    }
                                                    nVar6.b();
                                                    i46--;
                                                }
                                                if (i39 == 0 && i48 == 0 && i45 == 0 && i41 == 0) {
                                                    sVar = a2;
                                                } else {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent stbl box for track ");
                                                    sVar = a2;
                                                    sb.append(sVar.f3977a);
                                                    sb.append(": remainingSynchronizationSamples ");
                                                    sb.append(i39);
                                                    sb.append(", remainingSamplesAtTimestampDelta ");
                                                    sb.append(i48);
                                                    sb.append(", remainingSamplesInChunk ");
                                                    sb.append(i45);
                                                    sb.append(", remainingTimestampDeltaChanges ");
                                                    sb.append(i41);
                                                    android.util.Log.w("AtomParsers", sb.toString());
                                                }
                                                iArr = iArr14;
                                                i6 = i43;
                                                jArr = jArr13;
                                            }
                                            jArr3 = sVar.i;
                                            if (jArr3 != null) {
                                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar5 = mVar;
                                                if (mVar5.f3951a == -1 || mVar5.b == -1) {
                                                    if (jArr3.length == 1 && sVar.b == 1 && jArr.length >= 2) {
                                                        long j10 = sVar.j[0];
                                                        iArr3 = iArr2;
                                                        long a4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr3[0], sVar.c, sVar.d) + j10;
                                                        long j11 = jArr[0];
                                                        if (j11 <= j10 && j10 < jArr[1] && jArr[jArr.length - 1] < a4 && a4 <= j4) {
                                                            long j12 = j4 - a4;
                                                            long a5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j10 - j11, sVar.f.s, sVar.c);
                                                            long a6 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j12, sVar.f.s, sVar.c);
                                                            if ((a5 != 0 || a6 != 0) && a5 <= 2147483647L && a6 <= 2147483647L) {
                                                                mVar5.f3951a = (int) a5;
                                                                mVar5.b = (int) a6;
                                                                com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, sVar.c);
                                                                vVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr2, iArr3, i6, jArr, iArr);
                                                                mVar = mVar5;
                                                                vVar = vVar2;
                                                            }
                                                        }
                                                    } else {
                                                        iArr3 = iArr2;
                                                    }
                                                    long[] jArr14 = sVar.i;
                                                    if (jArr14.length == 1) {
                                                        char c7 = 0;
                                                        if (jArr14[0] == 0) {
                                                            int i57 = 0;
                                                            while (i57 < jArr.length) {
                                                                jArr[i57] = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr[i57] - sVar.j[c7], 1000000L, sVar.c);
                                                                i57++;
                                                                c7 = 0;
                                                            }
                                                            vVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr2, iArr3, i6, jArr, iArr);
                                                            mVar = mVar5;
                                                            vVar = vVar2;
                                                        }
                                                    }
                                                    boolean z5 = sVar.b == 1;
                                                    int i58 = 0;
                                                    int i59 = 0;
                                                    int i60 = 0;
                                                    boolean z6 = false;
                                                    while (true) {
                                                        long[] jArr15 = sVar.i;
                                                        if (i58 >= jArr15.length) {
                                                            break;
                                                        }
                                                        long j13 = sVar.j[i58];
                                                        if (j13 != -1) {
                                                            jArr7 = jArr2;
                                                            iArr8 = iArr3;
                                                            long a7 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr15[i58], sVar.c, sVar.d);
                                                            int a8 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, j13, true, true);
                                                            int a9 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, j13 + a7, z5, false);
                                                            int i61 = (a9 - a8) + i59;
                                                            boolean z7 = i60 != a8;
                                                            i60 = a9;
                                                            z6 = z7 | z6;
                                                            i59 = i61;
                                                        } else {
                                                            jArr7 = jArr2;
                                                            iArr8 = iArr3;
                                                        }
                                                        i58++;
                                                        jArr2 = jArr7;
                                                        iArr3 = iArr8;
                                                    }
                                                    long[] jArr16 = jArr2;
                                                    int[] iArr15 = iArr3;
                                                    boolean z8 = (i59 != i5) | z6;
                                                    long[] jArr17 = z8 ? new long[i59] : jArr16;
                                                    int[] iArr16 = z8 ? new int[i59] : iArr15;
                                                    if (z8) {
                                                        i6 = 0;
                                                    }
                                                    int[] iArr17 = z8 ? new int[i59] : iArr;
                                                    long[] jArr18 = new long[i59];
                                                    int i62 = i6;
                                                    int i63 = 0;
                                                    int i64 = 0;
                                                    long j14 = 0;
                                                    while (true) {
                                                        long[] jArr19 = sVar.i;
                                                        if (i63 >= jArr19.length) {
                                                            break;
                                                        }
                                                        long j15 = sVar.j[i63];
                                                        long j16 = jArr19[i63];
                                                        if (j15 != -1) {
                                                            jArr5 = jArr18;
                                                            iArr4 = iArr17;
                                                            i7 = i63;
                                                            int[] iArr18 = iArr;
                                                            long a10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j16, sVar.c, sVar.d) + j15;
                                                            int a11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, j15, true, true);
                                                            int a12 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, a10, z5, false);
                                                            if (z8) {
                                                                int i65 = a12 - a11;
                                                                jArr6 = jArr16;
                                                                java.lang.System.arraycopy(jArr6, a11, jArr17, i64, i65);
                                                                z3 = z5;
                                                                iArr7 = iArr15;
                                                                java.lang.System.arraycopy(iArr7, a11, iArr16, i64, i65);
                                                                mVar2 = mVar5;
                                                                iArr6 = iArr18;
                                                                java.lang.System.arraycopy(iArr6, a11, iArr4, i64, i65);
                                                            } else {
                                                                mVar2 = mVar5;
                                                                jArr6 = jArr16;
                                                                iArr6 = iArr18;
                                                                z3 = z5;
                                                                iArr7 = iArr15;
                                                            }
                                                            int i66 = i62;
                                                            while (true) {
                                                                iArr5 = iArr6;
                                                                iArr15 = iArr7;
                                                                if (a11 >= a12) {
                                                                    break;
                                                                }
                                                                long j17 = j15;
                                                                jArr5[i64] = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j14, 1000000L, sVar.d) + com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr[a11] - j15, 1000000L, sVar.c);
                                                                if (z8 && iArr16[i64] > i66) {
                                                                    i66 = iArr15[a11];
                                                                }
                                                                i64++;
                                                                a11++;
                                                                j15 = j17;
                                                                iArr7 = iArr15;
                                                                iArr6 = iArr5;
                                                            }
                                                            i62 = i66;
                                                        } else {
                                                            mVar2 = mVar5;
                                                            jArr5 = jArr18;
                                                            iArr4 = iArr17;
                                                            i7 = i63;
                                                            iArr5 = iArr;
                                                            jArr6 = jArr16;
                                                            z3 = z5;
                                                        }
                                                        j14 += j16;
                                                        iArr17 = iArr4;
                                                        jArr18 = jArr5;
                                                        z5 = z3;
                                                        iArr = iArr5;
                                                        jArr16 = jArr6;
                                                        i63 = i7 + 1;
                                                        mVar5 = mVar2;
                                                    }
                                                    mVar = mVar5;
                                                    long[] jArr20 = jArr18;
                                                    int[] iArr19 = iArr17;
                                                    boolean z9 = false;
                                                    for (int i67 = 0; i67 < iArr19.length && !z9; i67++) {
                                                        z9 |= (iArr19[i67] & 1) != 0;
                                                    }
                                                    if (!z9) {
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                    vVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr17, iArr16, i62, jArr20, iArr19);
                                                } else {
                                                    jArr4 = jArr2;
                                                    mVar = mVar5;
                                                }
                                            } else {
                                                jArr4 = jArr2;
                                            }
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, sVar.c);
                                            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr4, iArr2, i6, jArr, iArr);
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                    }
                                    jArr3 = sVar.i;
                                    if (jArr3 != null) {
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, sVar.c);
                                    vVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr4, iArr2, i6, jArr, iArr);
                                } else {
                                    nVar = null;
                                }
                            } else {
                                i2 = 0;
                            }
                            i3 = -1;
                            if (hVar.c()) {
                            }
                            z2 = false;
                            if (z2) {
                            }
                            jArr3 = sVar.i;
                            if (jArr3 != null) {
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jArr, sVar.c);
                            vVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v(jArr4, iArr2, i6, jArr, iArr);
                        }
                        if (vVar.f3980a != 0) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a13 = this.l.a(i4, sVar.b);
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o(sVar, vVar, a13);
                            int i68 = vVar.d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = sVar.f;
                            java.lang.String str2 = oVar3.f4044a;
                            java.lang.String str3 = oVar3.e;
                            java.lang.String str4 = oVar3.f;
                            java.lang.String str5 = oVar3.c;
                            int i69 = oVar3.b;
                            int i70 = oVar3.j;
                            int i71 = oVar3.k;
                            float f = oVar3.l;
                            int i72 = oVar3.m;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar3 = vVar;
                            float f2 = oVar3.n;
                            byte[] bArr = oVar3.p;
                            int i73 = oVar3.o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar3.q;
                            int i74 = oVar3.r;
                            int i75 = oVar3.s;
                            int i76 = oVar3.t;
                            int i77 = oVar3.u;
                            int i78 = oVar3.v;
                            int i79 = oVar3.x;
                            java.lang.String str6 = oVar3.y;
                            int i80 = oVar3.z;
                            long j18 = oVar3.w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i69, i68, i70, i71, f, i72, f2, bArr, i73, cVar, i74, i75, i76, i77, i78, i79, str6, i80, j18, oVar3.h, oVar3.i, oVar3.d);
                            if (sVar.b == 1) {
                                mVar3 = mVar;
                                int i81 = mVar3.f3951a;
                                sVar2 = sVar;
                                if (i81 != -1 && (i8 = mVar3.b) != -1) {
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i69, i68, i70, i71, f, i72, f2, bArr, i73, cVar, i74, i75, i76, i81, i8, i79, str6, i80, j18, oVar4.h, oVar4.i, oVar4.d);
                                }
                                if (bVar2 != null) {
                                    oVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar4.f4044a, oVar4.e, oVar4.f, oVar4.c, oVar4.b, oVar4.g, oVar4.j, oVar4.k, oVar4.l, oVar4.m, oVar4.n, oVar4.p, oVar4.o, oVar4.q, oVar4.r, oVar4.s, oVar4.t, oVar4.u, oVar4.v, oVar4.x, oVar4.y, oVar4.z, oVar4.w, oVar4.h, oVar4.i, bVar2);
                                }
                            } else {
                                sVar2 = sVar;
                                mVar3 = mVar;
                            }
                            a13.a(oVar4);
                            long max = java.lang.Math.max(j3, sVar2.e);
                            arrayList2 = arrayList;
                            arrayList2.add(oVar2);
                            long j19 = vVar3.b[0];
                            if (j19 < j2) {
                                j6 = j19;
                                j5 = max;
                            } else {
                                j5 = max;
                                j6 = j2;
                            }
                            i21 = i4 + 1;
                            pVar = this;
                            mVar4 = mVar3;
                            arrayList3 = arrayList2;
                            bVar = bVar2;
                            aVar2 = aVar;
                        }
                    } else {
                        aVar = aVar2;
                        bVar2 = bVar;
                        arrayList = arrayList3;
                        mVar = mVar4;
                        j3 = j5;
                        i4 = i21;
                        j2 = j6;
                    }
                    j6 = j2;
                    arrayList2 = arrayList;
                    j5 = j3;
                    mVar3 = mVar;
                    i21 = i4 + 1;
                    pVar = this;
                    mVar4 = mVar3;
                    arrayList3 = arrayList2;
                    bVar = bVar2;
                    aVar2 = aVar;
                }
                java.util.ArrayList arrayList5 = arrayList3;
                pVar.n = j5;
                pVar.m = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o[]) arrayList5.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o[arrayList5.size()]);
                pVar.l.b();
                pVar.l.a(pVar);
                pVar.d.clear();
                pVar.e = 2;
            } else if (!pVar.d.isEmpty()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) pVar.d.peek()).R0.add(aVar2);
            }
        }
        if (pVar.e != 2) {
            pVar.e = 0;
            pVar.h = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        int i;
        this.d.clear();
        this.h = 0;
        this.j = 0;
        this.k = 0;
        if (j == 0) {
            this.e = 0;
            this.h = 0;
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o[] oVarArr = this.m;
        if (oVarArr != null) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o oVar : oVarArr) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar = oVar.b;
                int a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(vVar.e, j2, false);
                while (true) {
                    i = -1;
                    if (a2 < 0) {
                        a2 = -1;
                        break;
                    } else if ((vVar.f[a2] & 1) != 0) {
                        break;
                    } else {
                        a2--;
                    }
                }
                if (a2 == -1) {
                    a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(vVar.e, j2, true, false);
                    while (a2 < vVar.e.length) {
                        if ((vVar.f[a2] & 1) == 0) {
                            a2++;
                        }
                    }
                    oVar.d = i;
                }
                i = a2;
                oVar.d = i;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o[] oVarArr;
        int i;
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this.e;
            if (i2 == 0) {
                if (this.h == 0) {
                    if (!bVar.b(this.c.f4112a, 0, 8, true)) {
                        return -1;
                    }
                    this.h = 8;
                    this.c.e(0);
                    this.g = this.c.k();
                    this.f = this.c.b();
                }
                if (this.g == 1) {
                    bVar.b(this.c.f4112a, 8, 8, false);
                    this.h += 8;
                    this.g = this.c.n();
                }
                int i3 = this.f;
                if (i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.C && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.E && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.F && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.G && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.H && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.Q) {
                    if (i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.S && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.D && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.T && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.U && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.m0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.n0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.o0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.R && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.p0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.q0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.r0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.s0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.t0 && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.P && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b && i3 != com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.A0) {
                        this.i = null;
                        this.e = 1;
                    } else if (this.h == 8) {
                        long j = this.g;
                        if (j <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j);
                            this.i = nVar;
                            java.lang.System.arraycopy(this.c.f4112a, 0, nVar.f4112a, 0, 8);
                            this.e = 1;
                        } else {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                } else {
                    long j2 = (bVar.c + this.g) - this.h;
                    this.d.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a(this.f, j2));
                    if (this.g == this.h) {
                        c(j2);
                    } else {
                        this.e = 0;
                        this.h = 0;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException();
                    }
                    long j3 = Long.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        oVarArr = this.m;
                        if (i4 >= oVarArr.length) {
                            break;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o oVar2 = oVarArr[i4];
                        int i6 = oVar2.d;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar = oVar2.b;
                        if (i6 != vVar.f3980a) {
                            long j4 = vVar.b[i6];
                            if (j4 < j3) {
                                i5 = i4;
                                j3 = j4;
                            }
                        }
                        i4++;
                    }
                    if (i5 == -1) {
                        return -1;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o oVar3 = oVarArr[i5];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.c;
                    int i7 = oVar3.d;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar2 = oVar3.b;
                    long j5 = vVar2.b[i7];
                    int i8 = vVar2.c[i7];
                    if (oVar3.f3974a.g == 1) {
                        j5 += 8;
                        i8 -= 8;
                    }
                    int i9 = i8;
                    long j6 = (j5 - bVar.c) + this.j;
                    if (j6 >= 0 && j6 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        bVar.a((int) j6);
                        int i10 = oVar3.f3974a.k;
                        if (i10 == 0) {
                            while (true) {
                                int i11 = this.j;
                                i = i9;
                                if (i11 >= i) {
                                    break;
                                }
                                int a2 = rVar.a(bVar, i - i11, false);
                                this.j += a2;
                                this.k -= a2;
                                i9 = i;
                            }
                        } else {
                            byte[] bArr = this.b.f4112a;
                            boolean z3 = false;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i12 = 4 - i10;
                            i = i9;
                            while (this.j < i) {
                                int i13 = this.k;
                                if (i13 == 0) {
                                    bVar.b(this.b.f4112a, i12, i10, z3);
                                    this.b.e(z3 ? 1 : 0);
                                    this.k = this.b.m();
                                    this.f3975a.e(z3 ? 1 : 0);
                                    rVar.a(4, this.f3975a);
                                    this.j += 4;
                                    i += i12;
                                } else {
                                    int a3 = rVar.a(bVar, i13, z3);
                                    this.j += a3;
                                    this.k -= a3;
                                    z3 = false;
                                }
                            }
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar3 = oVar3.b;
                        rVar.a(vVar3.e[i7], vVar3.f[i7], i, 0, null);
                        oVar3.d++;
                        this.j = 0;
                        this.k = 0;
                        return 0;
                    }
                    oVar.f3982a = j5;
                    return 1;
                }
                long j7 = this.g;
                int i14 = this.h;
                long j8 = j7 - i14;
                long j9 = bVar.c + j8;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f4112a, i14, (int) j8, false);
                    if (this.f == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.i;
                        nVar3.e(8);
                        if (nVar3.b() != p) {
                            nVar3.e(nVar3.b + 4);
                            while (nVar3.c - nVar3.b > 0) {
                                if (nVar3.b() == p) {
                                }
                            }
                            z2 = false;
                            this.o = z2;
                        }
                        z2 = true;
                        this.o = z2;
                    } else if (!this.d.isEmpty()) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a) this.d.peek()).Q0.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b(this.f, this.i));
                    }
                } else if (j8 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    bVar.a((int) j8);
                } else {
                    oVar.f3982a = j9;
                    z = true;
                    c(j9);
                    if (z && this.e != 2) {
                        return 1;
                    }
                }
                z = false;
                c(j9);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j) {
        int i;
        long j2;
        long j3 = Long.MAX_VALUE;
        for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.o oVar : this.m) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.v vVar = oVar.b;
            int a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(vVar.e, j, false);
            while (true) {
                i = -1;
                if (a2 < 0) {
                    a2 = -1;
                    break;
                }
                if ((vVar.f[a2] & 1) != 0) {
                    break;
                }
                a2--;
            }
            if (a2 == -1) {
                a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(vVar.e, j, true, false);
                while (a2 < vVar.e.length) {
                    if ((vVar.f[a2] & 1) == 0) {
                        a2++;
                    }
                }
                j2 = vVar.b[i];
                if (j2 >= j3) {
                    j3 = j2;
                }
            }
            i = a2;
            j2 = vVar.b[i];
            if (j2 >= j3) {
            }
        }
        return j3;
    }
}
