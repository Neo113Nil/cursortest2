package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final java.util.UUID b0 = new java.util.UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j Y;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b f3956a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g b;
    public final android.util.SparseArray c;
    public final boolean d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n g;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n h;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n i;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n j;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n k;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n l;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n m;
    public java.nio.ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    public e() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b();
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.f3956a = bVar;
        bVar.d = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c(this);
        this.d = true;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g();
        this.c = new android.util.SparseArray();
        this.g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.h = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f4110a);
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.j = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
        this.k = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
        this.l = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(8);
        this.m = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f();
        long j = bVar.b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        bVar.a(fVar.f3957a.f4112a, 0, 4, false);
        fVar.b = 4;
        for (long k = fVar.f3957a.k(); k != 440786851; k = ((k << 8) & (-256)) | (fVar.f3957a.f4112a[0] & 255)) {
            int i2 = fVar.b + 1;
            fVar.b = i2;
            if (i2 == i) {
                return false;
            }
            bVar.a(fVar.f3957a.f4112a, 0, 1, false);
        }
        long a2 = fVar.a(bVar);
        long j3 = fVar.b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + a2 >= j) {
            return false;
        }
        while (true) {
            long j4 = fVar.b;
            long j5 = j3 + a2;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (fVar.a(bVar) == Long.MIN_VALUE) {
                return false;
            }
            long a3 = fVar.a(bVar);
            if (a3 < 0 || a3 > 2147483647L) {
                return false;
            }
            if (a3 != 0) {
                bVar.a((int) a3, false);
                fVar.b = (int) (fVar.b + a3);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b bVar = this.f3956a;
        bVar.e = 0;
        bVar.b.clear();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g gVar2 = this.b;
        gVar2.b = 0;
        gVar2.c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.j;
        nVar.b = 0;
        nVar.c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x02e5, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02e6, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0806, code lost:
    
        if (r9 != 7) goto L517;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0584  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v80, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v84 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        boolean z;
        int i;
        boolean z2;
        java.lang.String str;
        int i2;
        int i3;
        int[] iArr;
        long j;
        int i4;
        int i5;
        double longBitsToDouble;
        long j2;
        int i6;
        int a2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i7;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        this.W = false;
        boolean z3 = true;
        while (z3 && !this.W) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b bVar2 = this.f3956a;
            if (bVar2.d == null) {
                throw new java.lang.IllegalStateException();
            }
            while (true) {
                if (!bVar2.b.isEmpty() && bVar.c >= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a) bVar2.b.peek()).b) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar = bVar2.d;
                    int i8 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a) bVar2.b.pop()).f3952a;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar = cVar.f3954a;
                    if (i8 != 160) {
                        if (i8 == 174) {
                            java.lang.String str2 = eVar.t.f3955a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar = eVar.t;
                                dVar.a(eVar.Y, dVar.b);
                                android.util.SparseArray sparseArray = eVar.c;
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar2 = eVar.t;
                                sparseArray.put(dVar2.b, dVar2);
                            }
                            eVar.t = null;
                        } else {
                            if (i8 == 19899) {
                                int i9 = eVar.v;
                                if (i9 != -1) {
                                    long j3 = eVar.w;
                                    if (j3 != -1) {
                                        if (i9 == 475249515) {
                                            eVar.y = j3;
                                        }
                                    }
                                }
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i8 == 25152) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar3 = eVar.t;
                                if (dVar3.e) {
                                    byte[] bArr = dVar3.g;
                                    if (bArr != null) {
                                        dVar3.i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.b, "video/webm", bArr));
                                    } else {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                }
                            } else if (i8 == 28032) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar4 = eVar.t;
                                if (dVar4.e && dVar4.f != null) {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Combining encryption and compression is not supported");
                                }
                            } else if (i8 == 357149030) {
                                if (eVar.q == -9223372036854775807L) {
                                    eVar.q = 1000000L;
                                }
                                long j4 = eVar.r;
                                if (j4 != -9223372036854775807L) {
                                    eVar.s = eVar.a(j4);
                                }
                            } else if (i8 != 374648427) {
                                if (i8 != 475249515) {
                                    eVar.getClass();
                                } else if (!eVar.u) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar = eVar.Y;
                                    if (eVar.p != -1 && eVar.s != -9223372036854775807L && (gVar = eVar.B) != null && (i7 = gVar.f4107a) != 0 && (gVar2 = eVar.C) != null && gVar2.f4107a == i7) {
                                        int[] iArr2 = new int[i7];
                                        long[] jArr = new long[i7];
                                        long[] jArr2 = new long[i7];
                                        long[] jArr3 = new long[i7];
                                        for (int i10 = 0; i10 < i7; i10++) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.B;
                                            if (i10 >= 0) {
                                                if (i10 < gVar3.f4107a) {
                                                    jArr3[i10] = gVar3.b[i10];
                                                    long j5 = eVar.p;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.C;
                                                    if (i10 < 0) {
                                                        gVar4.getClass();
                                                    } else if (i10 < gVar4.f4107a) {
                                                        jArr[i10] = gVar4.b[i10] + j5;
                                                    }
                                                    java.lang.StringBuilder a3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i10, ", size is ");
                                                    a3.append(gVar4.f4107a);
                                                    throw new java.lang.IndexOutOfBoundsException(a3.toString());
                                                }
                                            } else {
                                                gVar3.getClass();
                                            }
                                            java.lang.StringBuilder a4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i10, ", size is ");
                                            a4.append(gVar3.f4107a);
                                            throw new java.lang.IndexOutOfBoundsException(a4.toString());
                                        }
                                        int i11 = 0;
                                        while (true) {
                                            int i12 = i7 - 1;
                                            if (i11 < i12) {
                                                int i13 = i11 + 1;
                                                iArr2[i11] = (int) (jArr[i13] - jArr[i11]);
                                                jArr2[i11] = jArr3[i13] - jArr3[i11];
                                                i11 = i13;
                                            } else {
                                                iArr2[i12] = (int) ((eVar.p + eVar.o) - jArr[i12]);
                                                jArr2[i12] = eVar.s - jArr3[i12];
                                                eVar.B = null;
                                                eVar.C = null;
                                                pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr2, jArr, jArr2, jArr3);
                                            }
                                        }
                                    } else {
                                        eVar.B = null;
                                        eVar.C = null;
                                        pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(eVar.s);
                                    }
                                    jVar.a(pVar);
                                    eVar.u = true;
                                }
                            } else if (eVar.c.size() != 0) {
                                eVar.Y.b();
                            } else {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("No valid tracks were found");
                            }
                        }
                    } else if (eVar.E == 2) {
                        if (!eVar.X) {
                            eVar.M |= 1;
                        }
                        eVar.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d) eVar.c.get(eVar.K), eVar.F);
                        eVar.E = 0;
                    }
                } else {
                    ?? r4 = 0;
                    int i14 = 8;
                    if (bVar2.e == 0) {
                        long a5 = bVar2.c.a(bVar, true, false, 4);
                        if (a5 == -2) {
                            bVar.e = 0;
                            while (true) {
                                bVar.a(bVar2.f3953a, r4, 4, r4);
                                byte b = bVar2.f3953a[r4];
                                int i15 = 0;
                                while (true) {
                                    long[] jArr4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g.d;
                                    if (i15 >= 8) {
                                        i6 = -1;
                                    } else if ((jArr4[i15] & b) != 0) {
                                        i6 = i15 + 1;
                                    } else {
                                        i15++;
                                    }
                                }
                                if (i6 != -1 && i6 <= 4) {
                                    a2 = (int) com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g.a(bVar2.f3953a, i6, false);
                                    bVar2.d.f3954a.getClass();
                                    if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    }
                                }
                                bVar.a(1);
                                r4 = 0;
                            }
                            bVar.a(i6);
                            j2 = a2;
                            z = true;
                        } else {
                            z = true;
                            j2 = a5;
                        }
                        if (j2 == -1) {
                            z2 = false;
                            z3 = false;
                        } else {
                            bVar2.f = (int) j2;
                            bVar2.e = z ? 1 : 0;
                        }
                    } else {
                        z = true;
                    }
                    if (bVar2.e == z) {
                        bVar2.g = bVar2.c.a(bVar, false, z, 8);
                        bVar2.e = 2;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar2 = bVar2.d;
                    int i16 = bVar2.f;
                    cVar2.f3954a.getClass();
                    switch (i16) {
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case AD_RESPONSE_EMPTY_VALUE:
                        case 231:
                        case 241:
                        case 251:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case com.google.firebase.FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        bVar.a((int) bVar2.g);
                        bVar2.e = 0;
                    } else if (i == 1) {
                        long j6 = bVar.c;
                        bVar2.b.add(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a(bVar2.f, bVar2.g + j6));
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar3 = bVar2.d;
                        int i17 = bVar2.f;
                        long j7 = bVar2.g;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar2 = cVar3.f3954a;
                        eVar2.getClass();
                        if (i17 == 160) {
                            z2 = false;
                            eVar2.X = false;
                        } else if (i17 == 174) {
                            z2 = false;
                            eVar2.t = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d();
                        } else if (i17 != 187) {
                            if (i17 == 19899) {
                                eVar2.v = -1;
                                eVar2.w = -1L;
                            } else if (i17 == 20533) {
                                eVar2.t.e = true;
                            } else if (i17 == 21968) {
                                eVar2.t.q = true;
                            } else if (i17 == 408125543) {
                                long j8 = eVar2.p;
                                if (j8 != -1 && j8 != j6) {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Multiple Segment elements not supported");
                                }
                                eVar2.p = j6;
                                eVar2.o = j7;
                            } else if (i17 != 475249515) {
                                if (i17 == 524531317 && !eVar2.u) {
                                    if (eVar2.d && eVar2.y != -1) {
                                        eVar2.x = true;
                                    } else {
                                        eVar2.Y.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(eVar2.s));
                                        eVar2.u = true;
                                    }
                                }
                            } else {
                                eVar2.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                                eVar2.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            }
                            z2 = false;
                        } else {
                            z2 = false;
                            eVar2.D = false;
                        }
                        bVar2.e = z2 ? 1 : 0;
                    } else if (i == 2) {
                        long j9 = bVar2.g;
                        if (j9 <= 8) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar4 = bVar2.d;
                            int i18 = bVar2.f;
                            int i19 = (int) j9;
                            bVar.b(bVar2.f3953a, 0, i19, false);
                            long j10 = 0;
                            for (int i20 = 0; i20 < i19; i20++) {
                                j10 = (j10 << 8) | (bVar2.f3953a[i20] & 255);
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar3 = cVar4.f3954a;
                            eVar3.getClass();
                            if (i18 != 20529) {
                                if (i18 != 20530) {
                                    switch (i18) {
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                            eVar3.t.c = (int) j10;
                                            break;
                                        case 136:
                                            eVar3.t.L = j10 == 1;
                                            break;
                                        case 155:
                                            eVar3.G = eVar3.a(j10);
                                            break;
                                        case 159:
                                            eVar3.t.G = (int) j10;
                                            break;
                                        case 176:
                                            eVar3.t.j = (int) j10;
                                            break;
                                        case 179:
                                            eVar3.B.a(eVar3.a(j10));
                                            break;
                                        case 186:
                                            eVar3.t.k = (int) j10;
                                            break;
                                        case AD_RESPONSE_EMPTY_VALUE:
                                            eVar3.t.b = (int) j10;
                                            break;
                                        case 231:
                                            eVar3.A = eVar3.a(j10);
                                            break;
                                        case 241:
                                            if (!eVar3.D) {
                                                eVar3.C.a(j10);
                                                eVar3.D = true;
                                                break;
                                            }
                                            break;
                                        case 251:
                                            eVar3.X = true;
                                            break;
                                        case 16980:
                                            if (j10 != 3) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("ContentCompAlgo " + j10 + " not supported");
                                            }
                                            break;
                                        case 17029:
                                            if (j10 < 1 || j10 > 2) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("DocTypeReadVersion " + j10 + " not supported");
                                            }
                                            break;
                                        case 17143:
                                            if (j10 != 1) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("EBMLReadVersion " + j10 + " not supported");
                                            }
                                            break;
                                        case 18401:
                                            if (j10 != 5) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("ContentEncAlgo " + j10 + " not supported");
                                            }
                                            break;
                                        case 18408:
                                            if (j10 != 1) {
                                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("AESSettingsCipherMode " + j10 + " not supported");
                                            }
                                            break;
                                        case 21420:
                                            eVar3.w = j10 + eVar3.p;
                                            break;
                                        case 21432:
                                            int i21 = (int) j10;
                                            if (i21 != 0) {
                                                if (i21 != 1) {
                                                    if (i21 != 3) {
                                                        if (i21 == 15) {
                                                            eVar3.t.p = 3;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar3.t.p = 1;
                                                        break;
                                                    }
                                                } else {
                                                    eVar3.t.p = 2;
                                                    break;
                                                }
                                            } else {
                                                eVar3.t.p = 0;
                                                break;
                                            }
                                            break;
                                        case 21680:
                                            eVar3.t.l = (int) j10;
                                            break;
                                        case 21682:
                                            eVar3.t.n = (int) j10;
                                            break;
                                        case 21690:
                                            eVar3.t.m = (int) j10;
                                            break;
                                        case 21930:
                                            eVar3.t.M = j10 == 1;
                                            break;
                                        case 22186:
                                            eVar3.t.J = j10;
                                            break;
                                        case 22203:
                                            eVar3.t.K = j10;
                                            break;
                                        case 25188:
                                            eVar3.t.H = (int) j10;
                                            break;
                                        case 2352003:
                                            eVar3.t.d = (int) j10;
                                            break;
                                        case 2807729:
                                            eVar3.q = j10;
                                            break;
                                        default:
                                            switch (i18) {
                                                case 21945:
                                                    int i22 = (int) j10;
                                                    if (i22 != 1) {
                                                        if (i22 == 2) {
                                                            eVar3.t.t = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        eVar3.t.t = 2;
                                                        break;
                                                    }
                                                    break;
                                                case 21946:
                                                    int i23 = (int) j10;
                                                    if (i23 != 1) {
                                                        if (i23 == 16) {
                                                            eVar3.t.s = 6;
                                                            break;
                                                        } else if (i23 == 18) {
                                                            eVar3.t.s = 7;
                                                            break;
                                                        } else if (i23 != 6) {
                                                        }
                                                    }
                                                    eVar3.t.s = 3;
                                                    break;
                                                case 21947:
                                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar5 = eVar3.t;
                                                    dVar5.q = true;
                                                    int i24 = (int) j10;
                                                    if (i24 != 1) {
                                                        if (i24 != 9) {
                                                            if (i24 == 4 || i24 == 5 || i24 == 6 || i24 == 7) {
                                                                dVar5.r = 2;
                                                                break;
                                                            }
                                                        } else {
                                                            dVar5.r = 6;
                                                            break;
                                                        }
                                                    } else {
                                                        dVar5.r = 1;
                                                        break;
                                                    }
                                                case 21948:
                                                    eVar3.t.u = (int) j10;
                                                    break;
                                                case 21949:
                                                    eVar3.t.v = (int) j10;
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (j10 != 1) {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("ContentEncodingScope " + j10 + " not supported");
                                }
                            } else if (j10 != 0) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("ContentEncodingOrder " + j10 + " not supported");
                            }
                            z2 = false;
                            bVar2.e = 0;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Invalid integer size: " + bVar2.g);
                        }
                    } else if (i == 3) {
                        long j11 = bVar2.g;
                        if (j11 <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar5 = bVar2.d;
                            int i25 = bVar2.f;
                            int i26 = (int) j11;
                            if (i26 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i26];
                                bVar.b(bArr2, 0, i26, false);
                                str = new java.lang.String(bArr2);
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar4 = cVar5.f3954a;
                            eVar4.getClass();
                            if (i25 == 134) {
                                eVar4.t.f3955a = str;
                            } else if (i25 != 17026) {
                                if (i25 == 2274716) {
                                    eVar4.t.N = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("DocType " + str + " not supported");
                            }
                            z2 = false;
                            bVar2.e = 0;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("String element size: " + bVar2.g);
                        }
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Invalid element type ", i));
                        }
                        long j12 = bVar2.g;
                        if (j12 != 4 && j12 != 8) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Invalid float size: " + bVar2.g);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar6 = bVar2.d;
                        int i27 = bVar2.f;
                        int i28 = (int) j12;
                        bVar.b(bVar2.f3953a, 0, i28, false);
                        long j13 = 0;
                        for (int i29 = 0; i29 < i28; i29++) {
                            j13 = (j13 << 8) | (bVar2.f3953a[i29] & 255);
                        }
                        if (i28 == 4) {
                            longBitsToDouble = java.lang.Float.intBitsToFloat((int) j13);
                        } else {
                            longBitsToDouble = java.lang.Double.longBitsToDouble(j13);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar5 = cVar6.f3954a;
                        if (i27 == 181) {
                            eVar5.t.I = (int) longBitsToDouble;
                        } else if (i27 != 17545) {
                            switch (i27) {
                                case 21969:
                                    eVar5.t.w = (float) longBitsToDouble;
                                    break;
                                case 21970:
                                    eVar5.t.x = (float) longBitsToDouble;
                                    break;
                                case 21971:
                                    eVar5.t.y = (float) longBitsToDouble;
                                    break;
                                case 21972:
                                    eVar5.t.z = (float) longBitsToDouble;
                                    break;
                                case 21973:
                                    eVar5.t.A = (float) longBitsToDouble;
                                    break;
                                case 21974:
                                    eVar5.t.B = (float) longBitsToDouble;
                                    break;
                                case 21975:
                                    eVar5.t.C = (float) longBitsToDouble;
                                    break;
                                case 21976:
                                    eVar5.t.D = (float) longBitsToDouble;
                                    break;
                                case 21977:
                                    eVar5.t.E = (float) longBitsToDouble;
                                    break;
                                case 21978:
                                    eVar5.t.F = (float) longBitsToDouble;
                                    break;
                                default:
                                    eVar5.getClass();
                                    break;
                            }
                        } else {
                            eVar5.r = (long) longBitsToDouble;
                        }
                        z2 = false;
                        bVar2.e = 0;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c cVar7 = bVar2.d;
                        int i30 = bVar2.f;
                        int i31 = (int) bVar2.g;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e eVar6 = cVar7.f3954a;
                        if (i30 == 161 || i30 == 163) {
                            if (eVar6.E == 0) {
                                eVar6.K = (int) eVar6.b.a(bVar, false, true, 8);
                                eVar6.L = eVar6.b.c;
                                eVar6.G = -9223372036854775807L;
                                eVar6.E = 1;
                                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = eVar6.g;
                                nVar.b = 0;
                                nVar.c = 0;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d) eVar6.c.get(eVar6.K);
                            if (dVar6 == null) {
                                bVar.a(i31 - eVar6.L);
                                eVar6.E = 0;
                            } else {
                                if (eVar6.E == 1) {
                                    eVar6.a(bVar, 3);
                                    int i32 = (eVar6.g.f4112a[2] & 6) >> 1;
                                    if (i32 == 0) {
                                        eVar6.I = 1;
                                        int[] iArr3 = eVar6.J;
                                        if (iArr3 == null) {
                                            iArr3 = new int[1];
                                        } else if (iArr3.length < 1) {
                                            iArr3 = new int[java.lang.Math.max(iArr3.length * 2, 1)];
                                        }
                                        eVar6.J = iArr3;
                                        iArr3[0] = (i31 - eVar6.L) - 3;
                                    } else if (i30 == 163) {
                                        eVar6.a(bVar, 4);
                                        int i33 = (eVar6.g.f4112a[3] & 255) + 1;
                                        eVar6.I = i33;
                                        int[] iArr4 = eVar6.J;
                                        if (iArr4 == null) {
                                            iArr4 = new int[i33];
                                        } else if (iArr4.length < i33) {
                                            int length = iArr4.length;
                                            i3 = 2;
                                            iArr = new int[java.lang.Math.max(length * 2, i33)];
                                            eVar6.J = iArr;
                                            if (i32 != i3) {
                                                int i34 = (i31 - eVar6.L) - 4;
                                                int i35 = eVar6.I;
                                                java.util.Arrays.fill(iArr, 0, i35, i34 / i35);
                                            } else {
                                                int i36 = 1;
                                                int i37 = 0;
                                                if (i32 != 1) {
                                                    if (i32 == 3) {
                                                        int i38 = 0;
                                                        int i39 = 0;
                                                        int i40 = 4;
                                                        while (true) {
                                                            int i41 = eVar6.I - 1;
                                                            if (i38 < i41) {
                                                                eVar6.J[i38] = 0;
                                                                int i42 = i40 + 1;
                                                                eVar6.a(bVar, i42);
                                                                if (eVar6.g.f4112a[i40] == 0) {
                                                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("No valid varint length mask found");
                                                                }
                                                                int i43 = 0;
                                                                while (true) {
                                                                    if (i43 < i14) {
                                                                        int i44 = 1 << (7 - i43);
                                                                        if ((eVar6.g.f4112a[i40] & i44) != 0) {
                                                                            int i45 = i42 + i43;
                                                                            eVar6.a(bVar, i45);
                                                                            int i46 = eVar6.g.f4112a[i40] & 255 & (~i44);
                                                                            int i47 = i42;
                                                                            long j14 = i46;
                                                                            while (true) {
                                                                                int i48 = i47;
                                                                                if (i48 < i45) {
                                                                                    i47 = i48 + 1;
                                                                                    j14 = (j14 << 8) | (eVar6.g.f4112a[i48] & 255);
                                                                                } else {
                                                                                    if (i38 > 0) {
                                                                                        j14 -= (1 << ((i43 * 7) + 6)) - 1;
                                                                                    }
                                                                                    long j15 = j14;
                                                                                    i40 = i45;
                                                                                    j = j15;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i43++;
                                                                            i14 = 8;
                                                                        }
                                                                    } else {
                                                                        i40 = i42;
                                                                        j = 0;
                                                                    }
                                                                }
                                                                if (j >= -2147483648L && j <= 2147483647L) {
                                                                    int i49 = (int) j;
                                                                    int[] iArr5 = eVar6.J;
                                                                    if (i38 != 0) {
                                                                        i49 += iArr5[i38 - 1];
                                                                    }
                                                                    iArr5[i38] = i49;
                                                                    i39 += i49;
                                                                    i38++;
                                                                    i14 = 8;
                                                                }
                                                            } else {
                                                                eVar6.J[i41] = ((i31 - eVar6.L) - i40) - i39;
                                                            }
                                                        }
                                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("EBML lacing sample size out of range.");
                                                    }
                                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected lacing value: ", i32));
                                                }
                                                int i50 = 0;
                                                int i51 = 0;
                                                int i52 = 4;
                                                while (true) {
                                                    int i53 = eVar6.I - i36;
                                                    if (i50 < i53) {
                                                        eVar6.J[i50] = i37;
                                                        while (true) {
                                                            i4 = i52 + 1;
                                                            eVar6.a(bVar, i4);
                                                            int i54 = eVar6.g.f4112a[i52] & 255;
                                                            int[] iArr6 = eVar6.J;
                                                            i5 = iArr6[i50] + i54;
                                                            iArr6[i50] = i5;
                                                            if (i54 != 255) {
                                                                break;
                                                            }
                                                            i52 = i4;
                                                        }
                                                        i51 += i5;
                                                        i50++;
                                                        i52 = i4;
                                                        i36 = 1;
                                                        i37 = 0;
                                                    } else {
                                                        eVar6.J[i53] = ((i31 - eVar6.L) - i52) - i51;
                                                    }
                                                }
                                            }
                                        }
                                        iArr = iArr4;
                                        i3 = 2;
                                        eVar6.J = iArr;
                                        if (i32 != i3) {
                                        }
                                    } else {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Lacing only supported in SimpleBlocks.");
                                    }
                                    byte[] bArr3 = eVar6.g.f4112a;
                                    eVar6.F = eVar6.a((bArr3[1] & 255) | (bArr3[0] << 8)) + eVar6.A;
                                    byte b2 = eVar6.g.f4112a[2];
                                    eVar6.M = ((dVar6.c == 2 || (i30 == 163 && (b2 & 128) == 128)) ? 1 : 0) | ((b2 & 8) == 8 ? Integer.MIN_VALUE : 0);
                                    eVar6.E = 2;
                                    eVar6.H = 0;
                                }
                                if (i30 == 163) {
                                    while (true) {
                                        int i55 = eVar6.H;
                                        if (i55 < eVar6.I) {
                                            eVar6.a(bVar, dVar6, eVar6.J[i55]);
                                            eVar6.a(dVar6, eVar6.F + ((eVar6.H * dVar6.d) / 1000));
                                            eVar6.H++;
                                        } else {
                                            i2 = 0;
                                            eVar6.E = 0;
                                        }
                                    }
                                } else {
                                    i2 = 0;
                                    eVar6.a(bVar, dVar6, eVar6.J[0]);
                                }
                                bVar2.e = i2;
                            }
                        } else if (i30 == 16981) {
                            byte[] bArr4 = new byte[i31];
                            eVar6.t.f = bArr4;
                            bVar.b(bArr4, 0, i31, false);
                        } else if (i30 == 18402) {
                            byte[] bArr5 = new byte[i31];
                            eVar6.t.g = bArr5;
                            bVar.b(bArr5, 0, i31, false);
                        } else if (i30 == 21419) {
                            java.util.Arrays.fill(eVar6.i.f4112a, (byte) 0);
                            bVar.b(eVar6.i.f4112a, 4 - i31, i31, false);
                            eVar6.i.e(0);
                            eVar6.v = (int) eVar6.i.k();
                        } else if (i30 != 25506) {
                            if (i30 != 30322) {
                                eVar6.getClass();
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected id: ", i30));
                            }
                            byte[] bArr6 = new byte[i31];
                            eVar6.t.o = bArr6;
                            bVar.b(bArr6, 0, i31, false);
                        } else {
                            byte[] bArr7 = new byte[i31];
                            eVar6.t.h = bArr7;
                            bVar.b(bArr7, 0, i31, false);
                        }
                        i2 = 0;
                        bVar2.e = i2;
                    }
                }
            }
            if (z3) {
                long j16 = bVar.c;
                if (this.x) {
                    this.z = j16;
                    oVar.f3982a = this.y;
                    this.x = z2;
                    return 1;
                }
                if (this.u) {
                    long j17 = this.z;
                    if (j17 != -1) {
                        oVar.f3982a = j17;
                        this.z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        return z3 ? 0 : -1;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar, long j) {
        byte[] b;
        if ("S_TEXT/UTF8".equals(dVar.f3955a)) {
            byte[] bArr = this.k.f4112a;
            long j2 = this.G;
            if (j2 == -9223372036854775807L) {
                b = a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                b = com.fyber.inneractive.sdk.player.exoplayer2.util.z.b(java.lang.String.format(java.util.Locale.US, "%02d:%02d:%02d,%03d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf((int) (j4 / 1000000)), java.lang.Integer.valueOf((int) ((j4 - (1000000 * r5)) / 1000))));
            }
            java.lang.System.arraycopy(b, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.k;
            rVar.a(nVar.c, nVar);
            this.V += this.k.c;
        }
        dVar.O.a(j, this.M, this.V, 0, dVar.g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.j;
        nVar2.b = 0;
        nVar2.c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.g;
        if (nVar.c >= i) {
            return;
        }
        if (nVar.a() < i) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.g;
            byte[] bArr = nVar2.f4112a;
            byte[] copyOf = java.util.Arrays.copyOf(bArr, java.lang.Math.max(bArr.length * 2, i));
            int i2 = this.g.c;
            nVar2.f4112a = copyOf;
            nVar2.c = i2;
            nVar2.b = 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.g;
        byte[] bArr2 = nVar3.f4112a;
        int i3 = nVar3.c;
        bVar.b(bArr2, i3, i - i3, false);
        this.g.d(i);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d dVar, int i) {
        int a2;
        int a3;
        int i2;
        if ("S_TEXT/UTF8".equals(dVar.f3955a)) {
            byte[] bArr = Z;
            int i3 = i + 32;
            if (this.k.a() < i3) {
                this.k.f4112a = java.util.Arrays.copyOf(bArr, i3 + i);
            }
            bVar.b(this.k.f4112a, 32, i, false);
            this.k.e(0);
            this.k.d(i3);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.g.f4112a, 0, 1, false);
                    this.N++;
                    byte b = this.g.f4112a[0];
                    if ((b & 128) != 128) {
                        this.S = b;
                        this.P = true;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.l.f4112a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.g;
                        nVar.f4112a[0] = (byte) ((z ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.g);
                        this.V++;
                        this.l.e(0);
                        rVar.a(8, this.l);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            bVar.b(this.g.f4112a, 0, 1, false);
                            this.N++;
                            this.g.e(0);
                            this.T = this.g.j();
                            this.R = true;
                        }
                        int i4 = this.T * 4;
                        this.g.c(i4);
                        bVar.b(this.g.f4112a, 0, i4, false);
                        this.N += i4;
                        short s = (short) ((this.T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.n = java.nio.ByteBuffer.allocate(i5);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.T;
                            if (i6 >= i2) {
                                break;
                            }
                            int m = this.g.m();
                            if (i6 % 2 == 0) {
                                this.n.putShort((short) (m - i7));
                            } else {
                                this.n.putInt(m - i7);
                            }
                            i6++;
                            i7 = m;
                        }
                        int i8 = (i - this.N) - i7;
                        if (i2 % 2 == 1) {
                            this.n.putInt(i8);
                        } else {
                            this.n.putShort((short) i8);
                            this.n.putInt(0);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.m;
                        nVar2.f4112a = this.n.array();
                        nVar2.c = i5;
                        nVar2.b = 0;
                        rVar.a(i5, this.m);
                        this.V += i5;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f;
                if (bArr2 != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.j;
                    int length = bArr2.length;
                    nVar3.f4112a = bArr2;
                    nVar3.c = length;
                    nVar3.b = 0;
                }
            }
            this.O = true;
        }
        int i9 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f3955a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f3955a)) {
            while (true) {
                int i10 = this.N;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i9 - i10;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.j;
                int i12 = nVar4.c - nVar4.b;
                if (i12 > 0) {
                    a3 = java.lang.Math.min(i11, i12);
                    rVar.a(a3, this.j);
                } else {
                    a3 = rVar.a(bVar, i11, false);
                }
                this.N += a3;
                this.V += a3;
            }
        } else {
            byte[] bArr3 = this.f.f4112a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = dVar.P;
            int i14 = 4 - i13;
            while (this.N < i9) {
                int i15 = this.U;
                if (i15 == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = this.j;
                    int min = java.lang.Math.min(i13, nVar5.c - nVar5.b);
                    bVar.b(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.j.a(bArr3, i14, min);
                    }
                    this.N += i13;
                    this.f.e(0);
                    this.U = this.f.m();
                    this.e.e(0);
                    rVar.a(4, this.e);
                    this.V += 4;
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = this.j;
                    int i16 = nVar6.c - nVar6.b;
                    if (i16 > 0) {
                        a2 = java.lang.Math.min(i15, i16);
                        rVar.a(a2, this.j);
                    } else {
                        a2 = rVar.a(bVar, i15, false);
                    }
                    this.N += a2;
                    this.V += a2;
                    this.U = i15 - a2;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f3955a)) {
            this.h.e(0);
            rVar.a(4, this.h);
            this.V += 4;
        }
    }

    public final long a(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j, j2, 1000L);
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Can't scale timecode prior to timecodeScale being set.");
    }
}
