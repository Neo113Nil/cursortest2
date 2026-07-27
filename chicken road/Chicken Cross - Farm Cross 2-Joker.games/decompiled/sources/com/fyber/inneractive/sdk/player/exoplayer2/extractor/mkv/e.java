package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.FirebaseError;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID b0 = new UUID(72057594037932032L, -9223371306706625679L);
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
    public j Y;

    /* renamed from: a, reason: collision with root package name */
    public final b f5610a;
    public final g b;
    public final SparseArray c;
    public final boolean d;
    public final n e;
    public final n f;
    public final n g;
    public final n h;
    public final n i;
    public final n j;
    public final n k;
    public final n l;
    public final n m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public d t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    public e() {
        b bVar = new b();
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.f5610a = bVar;
        bVar.d = new c(this);
        this.d = true;
        this.b = new g();
        this.c = new SparseArray();
        this.g = new n(4);
        this.h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new n(4);
        this.e = new n(l.f5764a);
        this.f = new n(4);
        this.j = new n();
        this.k = new n();
        this.l = new n(8);
        this.m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        f fVar = new f();
        long j = bVar.b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        bVar.a(fVar.f5611a.f5766a, 0, 4, false);
        fVar.b = 4;
        for (long k = fVar.f5611a.k(); k != 440786851; k = ((k << 8) & (-256)) | (fVar.f5611a.f5766a[0] & 255)) {
            int i2 = fVar.b + 1;
            fVar.b = i2;
            if (i2 == i) {
                return false;
            }
            bVar.a(fVar.f5611a.f5766a, 0, 1, false);
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
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        b bVar = this.f5610a;
        bVar.e = 0;
        bVar.b.clear();
        g gVar = bVar.c;
        gVar.b = 0;
        gVar.c = 0;
        g gVar2 = this.b;
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
        n nVar = this.j;
        nVar.b = 0;
        nVar.c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02e7, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x080b, code lost:
    
        if (r9 != 7) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0587  */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.b] */
    /* JADX WARN: Type inference failed for: r3v135, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.g] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v133 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v89, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v93 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) {
        ?? r4;
        ?? r42;
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        long j;
        int i6;
        int i7;
        double longBitsToDouble;
        long j2;
        int i8;
        int a2;
        q pVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar;
        int i9;
        com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar2;
        int i10 = 0;
        this.W = false;
        boolean z3 = true;
        while (z3 && !this.W) {
            b bVar2 = this.f5610a;
            if (bVar2.d == null) {
                throw new IllegalStateException();
            }
            while (true) {
                if (bVar2.b.isEmpty()) {
                    r4 = i10;
                } else if (bVar.c >= ((a) bVar2.b.peek()).b) {
                    c cVar = bVar2.d;
                    int i11 = ((a) bVar2.b.pop()).f5606a;
                    e eVar = cVar.f5608a;
                    if (i11 != 160) {
                        if (i11 == 174) {
                            String str2 = eVar.t.f5609a;
                            if ("V_VP8".equals(str2) || "V_VP9".equals(str2) || "V_MPEG2".equals(str2) || "V_MPEG4/ISO/SP".equals(str2) || "V_MPEG4/ISO/ASP".equals(str2) || "V_MPEG4/ISO/AP".equals(str2) || "V_MPEG4/ISO/AVC".equals(str2) || "V_MPEGH/ISO/HEVC".equals(str2) || "V_MS/VFW/FOURCC".equals(str2) || "V_THEORA".equals(str2) || "A_OPUS".equals(str2) || "A_VORBIS".equals(str2) || "A_AAC".equals(str2) || "A_MPEG/L2".equals(str2) || "A_MPEG/L3".equals(str2) || "A_AC3".equals(str2) || "A_EAC3".equals(str2) || "A_TRUEHD".equals(str2) || "A_DTS".equals(str2) || "A_DTS/EXPRESS".equals(str2) || "A_DTS/LOSSLESS".equals(str2) || "A_FLAC".equals(str2) || "A_MS/ACM".equals(str2) || "A_PCM/INT/LIT".equals(str2) || "S_TEXT/UTF8".equals(str2) || "S_VOBSUB".equals(str2) || "S_HDMV/PGS".equals(str2) || "S_DVBSUB".equals(str2)) {
                                d dVar = eVar.t;
                                dVar.a(eVar.Y, dVar.b);
                                SparseArray sparseArray = eVar.c;
                                d dVar2 = eVar.t;
                                sparseArray.put(dVar2.b, dVar2);
                            }
                            eVar.t = null;
                        } else {
                            if (i11 == 19899) {
                                int i12 = eVar.v;
                                if (i12 != -1) {
                                    long j3 = eVar.w;
                                    if (j3 != -1) {
                                        if (i12 == 475249515) {
                                            eVar.y = j3;
                                        }
                                    }
                                }
                                throw new r("Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i11 == 25152) {
                                d dVar3 = eVar.t;
                                if (dVar3.e) {
                                    byte[] bArr = dVar3.g;
                                    if (bArr != null) {
                                        dVar3.i = new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(true, new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(com.fyber.inneractive.sdk.player.exoplayer2.b.b, "video/webm", bArr));
                                    } else {
                                        throw new r("Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                }
                            } else if (i11 == 28032) {
                                d dVar4 = eVar.t;
                                if (dVar4.e && dVar4.f != null) {
                                    throw new r("Combining encryption and compression is not supported");
                                }
                            } else if (i11 == 357149030) {
                                if (eVar.q == -9223372036854775807L) {
                                    eVar.q = 1000000L;
                                }
                                long j4 = eVar.r;
                                if (j4 != -9223372036854775807L) {
                                    eVar.s = eVar.a(j4);
                                }
                            } else if (i11 != 374648427) {
                                if (i11 != 475249515) {
                                    eVar.getClass();
                                } else if (!eVar.u) {
                                    j jVar = eVar.Y;
                                    if (eVar.p != -1 && eVar.s != -9223372036854775807L && (gVar = eVar.B) != null && (i9 = gVar.f5761a) != 0 && (gVar2 = eVar.C) != null && gVar2.f5761a == i9) {
                                        int[] iArr2 = new int[i9];
                                        long[] jArr = new long[i9];
                                        long[] jArr2 = new long[i9];
                                        long[] jArr3 = new long[i9];
                                        for (int i13 = 0; i13 < i9; i13++) {
                                            com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar3 = eVar.B;
                                            if (i13 >= 0) {
                                                if (i13 < gVar3.f5761a) {
                                                    jArr3[i13] = gVar3.b[i13];
                                                    long j5 = eVar.p;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.util.g gVar4 = eVar.C;
                                                    if (i13 < 0) {
                                                        gVar4.getClass();
                                                    } else if (i13 < gVar4.f5761a) {
                                                        jArr[i13] = gVar4.b[i13] + j5;
                                                    }
                                                    throw new IndexOutOfBoundsException(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i13, ", size is ").append(gVar4.f5761a).toString());
                                                }
                                            } else {
                                                gVar3.getClass();
                                            }
                                            throw new IndexOutOfBoundsException(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Invalid index ", i13, ", size is ").append(gVar3.f5761a).toString());
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            int i15 = i9 - 1;
                                            if (i14 < i15) {
                                                int i16 = i14 + 1;
                                                iArr2[i14] = (int) (jArr[i16] - jArr[i14]);
                                                jArr2[i14] = jArr3[i16] - jArr3[i14];
                                                i14 = i16;
                                            } else {
                                                iArr2[i15] = (int) ((eVar.p + eVar.o) - jArr[i15]);
                                                jArr2[i15] = eVar.s - jArr3[i15];
                                                eVar.B = null;
                                                eVar.C = null;
                                                pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a(iArr2, jArr, jArr2, jArr3);
                                            }
                                        }
                                    } else {
                                        eVar.B = null;
                                        eVar.C = null;
                                        pVar = new p(eVar.s);
                                    }
                                    jVar.a(pVar);
                                    eVar.u = true;
                                }
                            } else if (eVar.c.size() != 0) {
                                eVar.Y.b();
                            } else {
                                throw new r("No valid tracks were found");
                            }
                        }
                    } else if (eVar.E == 2) {
                        if (!eVar.X) {
                            eVar.M |= 1;
                        }
                        eVar.a((d) eVar.c.get(eVar.K), eVar.F);
                        r42 = 0;
                        eVar.E = 0;
                    }
                    r42 = 0;
                } else {
                    r4 = 0;
                }
                int i17 = 8;
                if (bVar2.e == 0) {
                    long a3 = bVar2.c.a(bVar, true, r4, 4);
                    if (a3 == -2) {
                        bVar.e = r4 == true ? 1 : 0;
                        ?? r43 = r4;
                        while (true) {
                            bVar.a(bVar2.f5607a, r43, 4, r43);
                            byte b = bVar2.f5607a[r43];
                            int i18 = 0;
                            while (true) {
                                long[] jArr4 = g.d;
                                if (i18 >= 8) {
                                    i8 = -1;
                                } else if ((jArr4[i18] & b) != 0) {
                                    i8 = i18 + 1;
                                } else {
                                    i18++;
                                }
                            }
                            if (i8 != -1 && i8 <= 4) {
                                a2 = (int) g.a(bVar2.f5607a, i8, false);
                                bVar2.d.f5608a.getClass();
                                if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                }
                            }
                            bVar.a(1);
                            r43 = 0;
                        }
                        bVar.a(i8);
                        j2 = a2;
                        z2 = true;
                    } else {
                        z2 = true;
                        j2 = a3;
                    }
                    if (j2 == -1) {
                        z = false;
                        z3 = false;
                    } else {
                        bVar2.f = (int) j2;
                        bVar2.e = z2 ? 1 : 0;
                    }
                } else {
                    z2 = true;
                }
                if (bVar2.e == z2) {
                    bVar2.g = bVar2.c.a(bVar, false, z2, 8);
                    bVar2.e = 2;
                }
                c cVar2 = bVar2.d;
                int i19 = bVar2.f;
                cVar2.f5608a.getClass();
                switch (i19) {
                    case MRAID_JS_WRITE_FAILED_VALUE:
                    case 136:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
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
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
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
                    i10 = 0;
                } else if (i == 1) {
                    long j6 = bVar.c;
                    bVar2.b.add(new a(bVar2.f, bVar2.g + j6));
                    c cVar3 = bVar2.d;
                    int i20 = bVar2.f;
                    long j7 = bVar2.g;
                    e eVar2 = cVar3.f5608a;
                    eVar2.getClass();
                    if (i20 == 160) {
                        z = false;
                        eVar2.X = false;
                    } else if (i20 == 174) {
                        z = false;
                        eVar2.t = new d();
                    } else if (i20 != 187) {
                        if (i20 == 19899) {
                            eVar2.v = -1;
                            eVar2.w = -1L;
                        } else if (i20 == 20533) {
                            eVar2.t.e = true;
                        } else if (i20 == 21968) {
                            eVar2.t.q = true;
                        } else if (i20 == 408125543) {
                            long j8 = eVar2.p;
                            if (j8 != -1 && j8 != j6) {
                                throw new r("Multiple Segment elements not supported");
                            }
                            eVar2.p = j6;
                            eVar2.o = j7;
                        } else if (i20 != 475249515) {
                            if (i20 == 524531317 && !eVar2.u) {
                                if (eVar2.d && eVar2.y != -1) {
                                    eVar2.x = true;
                                } else {
                                    eVar2.Y.a(new p(eVar2.s));
                                    eVar2.u = true;
                                }
                            }
                        } else {
                            eVar2.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                            eVar2.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.g();
                        }
                        z = false;
                    } else {
                        z = false;
                        eVar2.D = false;
                    }
                    bVar2.e = z ? 1 : 0;
                } else if (i == 2) {
                    long j9 = bVar2.g;
                    if (j9 <= 8) {
                        c cVar4 = bVar2.d;
                        int i21 = bVar2.f;
                        int i22 = (int) j9;
                        bVar.b(bVar2.f5607a, 0, i22, false);
                        long j10 = 0;
                        for (int i23 = 0; i23 < i22; i23++) {
                            j10 = (j10 << 8) | (bVar2.f5607a[i23] & 255);
                        }
                        e eVar3 = cVar4.f5608a;
                        eVar3.getClass();
                        if (i21 != 20529) {
                            if (i21 != 20530) {
                                switch (i21) {
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                        eVar3.t.c = (int) j10;
                                        break;
                                    case 136:
                                        eVar3.t.L = j10 == 1;
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
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
                                            throw new r("ContentCompAlgo " + j10 + " not supported");
                                        }
                                        break;
                                    case 17029:
                                        if (j10 < 1 || j10 > 2) {
                                            throw new r("DocTypeReadVersion " + j10 + " not supported");
                                        }
                                        break;
                                    case 17143:
                                        if (j10 != 1) {
                                            throw new r("EBMLReadVersion " + j10 + " not supported");
                                        }
                                        break;
                                    case 18401:
                                        if (j10 != 5) {
                                            throw new r("ContentEncAlgo " + j10 + " not supported");
                                        }
                                        break;
                                    case 18408:
                                        if (j10 != 1) {
                                            throw new r("AESSettingsCipherMode " + j10 + " not supported");
                                        }
                                        break;
                                    case 21420:
                                        eVar3.w = j10 + eVar3.p;
                                        break;
                                    case 21432:
                                        int i24 = (int) j10;
                                        if (i24 != 0) {
                                            if (i24 != 1) {
                                                if (i24 != 3) {
                                                    if (i24 == 15) {
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
                                            z = false;
                                            bVar2.e = z ? 1 : 0;
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
                                        switch (i21) {
                                            case 21945:
                                                int i25 = (int) j10;
                                                if (i25 != 1) {
                                                    if (i25 == 2) {
                                                        eVar3.t.t = 1;
                                                        break;
                                                    }
                                                } else {
                                                    eVar3.t.t = 2;
                                                    break;
                                                }
                                                break;
                                            case 21946:
                                                int i26 = (int) j10;
                                                if (i26 != 1) {
                                                    if (i26 == 16) {
                                                        eVar3.t.s = 6;
                                                        break;
                                                    } else if (i26 == 18) {
                                                        eVar3.t.s = 7;
                                                        break;
                                                    } else if (i26 != 6) {
                                                    }
                                                }
                                                eVar3.t.s = 3;
                                                break;
                                            case 21947:
                                                d dVar5 = eVar3.t;
                                                dVar5.q = true;
                                                int i27 = (int) j10;
                                                if (i27 != 1) {
                                                    if (i27 != 9) {
                                                        if (i27 == 4 || i27 == 5 || i27 == 6 || i27 == 7) {
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
                                throw new r("ContentEncodingScope " + j10 + " not supported");
                            }
                        } else if (j10 != 0) {
                            throw new r("ContentEncodingOrder " + j10 + " not supported");
                        }
                        z = false;
                        bVar2.e = z ? 1 : 0;
                    } else {
                        throw new r("Invalid integer size: " + bVar2.g);
                    }
                } else if (i == 3) {
                    long j11 = bVar2.g;
                    if (j11 <= 2147483647L) {
                        c cVar5 = bVar2.d;
                        int i28 = bVar2.f;
                        int i29 = (int) j11;
                        if (i29 == 0) {
                            str = "";
                        } else {
                            byte[] bArr2 = new byte[i29];
                            bVar.b(bArr2, 0, i29, false);
                            str = new String(bArr2);
                        }
                        e eVar4 = cVar5.f5608a;
                        eVar4.getClass();
                        if (i28 == 134) {
                            eVar4.t.f5609a = str;
                        } else if (i28 != 17026) {
                            if (i28 == 2274716) {
                                eVar4.t.N = str;
                            }
                        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                            throw new r("DocType " + str + " not supported");
                        }
                        z = false;
                        bVar2.e = 0;
                    } else {
                        throw new r("String element size: " + bVar2.g);
                    }
                } else if (i != 4) {
                    if (i != 5) {
                        throw new r(m.a("Invalid element type ", i));
                    }
                    long j12 = bVar2.g;
                    if (j12 != 4 && j12 != 8) {
                        throw new r("Invalid float size: " + bVar2.g);
                    }
                    c cVar6 = bVar2.d;
                    int i30 = bVar2.f;
                    int i31 = (int) j12;
                    bVar.b(bVar2.f5607a, 0, i31, false);
                    long j13 = 0;
                    for (int i32 = 0; i32 < i31; i32++) {
                        j13 = (j13 << 8) | (bVar2.f5607a[i32] & 255);
                    }
                    if (i31 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) j13);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(j13);
                    }
                    e eVar5 = cVar6.f5608a;
                    if (i30 == 181) {
                        eVar5.t.I = (int) longBitsToDouble;
                    } else if (i30 != 17545) {
                        switch (i30) {
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
                    z = false;
                    bVar2.e = 0;
                } else {
                    c cVar7 = bVar2.d;
                    int i33 = bVar2.f;
                    int i34 = (int) bVar2.g;
                    e eVar6 = cVar7.f5608a;
                    if (i33 == 161 || i33 == 163) {
                        i2 = 0;
                        if (eVar6.E == 0) {
                            eVar6.K = (int) eVar6.b.a(bVar, false, true, 8);
                            eVar6.L = eVar6.b.c;
                            eVar6.G = -9223372036854775807L;
                            eVar6.E = 1;
                            n nVar = eVar6.g;
                            nVar.b = 0;
                            nVar.c = 0;
                        }
                        d dVar6 = (d) eVar6.c.get(eVar6.K);
                        if (dVar6 == null) {
                            bVar.a(i34 - eVar6.L);
                            eVar6.E = 0;
                        } else {
                            if (eVar6.E == 1) {
                                eVar6.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, 3);
                                int i35 = (eVar6.g.f5766a[2] & 6) >> 1;
                                if (i35 == 0) {
                                    eVar6.I = 1;
                                    int[] iArr3 = eVar6.J;
                                    if (iArr3 == null) {
                                        iArr3 = new int[1];
                                    } else if (iArr3.length < 1) {
                                        iArr3 = new int[Math.max(iArr3.length * 2, 1)];
                                    }
                                    eVar6.J = iArr3;
                                    iArr3[0] = (i34 - eVar6.L) - 3;
                                } else if (i33 == 163) {
                                    eVar6.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, 4);
                                    int i36 = (eVar6.g.f5766a[3] & 255) + 1;
                                    eVar6.I = i36;
                                    int[] iArr4 = eVar6.J;
                                    if (iArr4 == null) {
                                        iArr4 = new int[i36];
                                    } else if (iArr4.length < i36) {
                                        int length = iArr4.length;
                                        i5 = 2;
                                        iArr = new int[Math.max(length * 2, i36)];
                                        eVar6.J = iArr;
                                        if (i35 != i5) {
                                            int i37 = (i34 - eVar6.L) - 4;
                                            int i38 = eVar6.I;
                                            Arrays.fill(iArr, 0, i38, i37 / i38);
                                        } else {
                                            int i39 = 1;
                                            int i40 = 0;
                                            if (i35 != 1) {
                                                if (i35 == 3) {
                                                    int i41 = 0;
                                                    int i42 = 0;
                                                    int i43 = 4;
                                                    while (true) {
                                                        int i44 = eVar6.I - 1;
                                                        if (i41 < i44) {
                                                            eVar6.J[i41] = 0;
                                                            int i45 = i43 + 1;
                                                            eVar6.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i45);
                                                            if (eVar6.g.f5766a[i43] == 0) {
                                                                throw new r("No valid varint length mask found");
                                                            }
                                                            int i46 = 0;
                                                            while (true) {
                                                                if (i46 < i17) {
                                                                    int i47 = 1 << (7 - i46);
                                                                    if ((eVar6.g.f5766a[i43] & i47) != 0) {
                                                                        int i48 = i45 + i46;
                                                                        eVar6.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i48);
                                                                        int i49 = eVar6.g.f5766a[i43] & 255 & (~i47);
                                                                        int i50 = i45;
                                                                        long j14 = i49;
                                                                        while (true) {
                                                                            int i51 = i50;
                                                                            if (i51 < i48) {
                                                                                i50 = i51 + 1;
                                                                                j14 = (j14 << 8) | (eVar6.g.f5766a[i51] & 255);
                                                                            } else {
                                                                                if (i41 > 0) {
                                                                                    j14 -= (1 << ((i46 * 7) + 6)) - 1;
                                                                                }
                                                                                long j15 = j14;
                                                                                i43 = i48;
                                                                                j = j15;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i46++;
                                                                        i17 = 8;
                                                                    }
                                                                } else {
                                                                    i43 = i45;
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j >= -2147483648L && j <= 2147483647L) {
                                                                int i52 = (int) j;
                                                                int[] iArr5 = eVar6.J;
                                                                if (i41 != 0) {
                                                                    i52 += iArr5[i41 - 1];
                                                                }
                                                                iArr5[i41] = i52;
                                                                i42 += i52;
                                                                i41++;
                                                                i17 = 8;
                                                            }
                                                        } else {
                                                            eVar6.J[i44] = ((i34 - eVar6.L) - i43) - i42;
                                                        }
                                                    }
                                                    throw new r("EBML lacing sample size out of range.");
                                                }
                                                throw new r(m.a("Unexpected lacing value: ", i35));
                                            }
                                            int i53 = 0;
                                            int i54 = 0;
                                            int i55 = 4;
                                            while (true) {
                                                int i56 = eVar6.I - i39;
                                                if (i53 < i56) {
                                                    eVar6.J[i53] = i40;
                                                    while (true) {
                                                        i6 = i55 + 1;
                                                        eVar6.a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) bVar, i6);
                                                        int i57 = eVar6.g.f5766a[i55] & 255;
                                                        int[] iArr6 = eVar6.J;
                                                        i7 = iArr6[i53] + i57;
                                                        iArr6[i53] = i7;
                                                        if (i57 != 255) {
                                                            break;
                                                        }
                                                        i55 = i6;
                                                    }
                                                    i54 += i7;
                                                    i53++;
                                                    i55 = i6;
                                                    i39 = 1;
                                                    i40 = 0;
                                                } else {
                                                    eVar6.J[i56] = ((i34 - eVar6.L) - i55) - i54;
                                                }
                                            }
                                        }
                                    }
                                    iArr = iArr4;
                                    i5 = 2;
                                    eVar6.J = iArr;
                                    if (i35 != i5) {
                                    }
                                } else {
                                    throw new r("Lacing only supported in SimpleBlocks.");
                                }
                                byte[] bArr3 = eVar6.g.f5766a;
                                eVar6.F = eVar6.a((bArr3[1] & 255) | (bArr3[0] << 8)) + eVar6.A;
                                byte b2 = eVar6.g.f5766a[2];
                                eVar6.M = ((dVar6.c == 2 || (i33 == 163 && (b2 & 128) == 128)) ? 1 : 0) | ((b2 & 8) == 8 ? Integer.MIN_VALUE : 0);
                                eVar6.E = 2;
                                eVar6.H = 0;
                                i3 = 163;
                            } else {
                                i3 = 163;
                            }
                            if (i33 == i3) {
                                while (true) {
                                    int i58 = eVar6.H;
                                    if (i58 < eVar6.I) {
                                        eVar6.a(bVar, dVar6, eVar6.J[i58]);
                                        eVar6.a(dVar6, eVar6.F + ((eVar6.H * dVar6.d) / 1000));
                                        eVar6.H++;
                                    } else {
                                        i4 = 0;
                                        eVar6.E = 0;
                                    }
                                }
                            } else {
                                i4 = 0;
                                eVar6.a(bVar, dVar6, eVar6.J[0]);
                            }
                            bVar2.e = i4;
                            r42 = i4;
                        }
                    } else if (i33 == 16981) {
                        i2 = 0;
                        byte[] bArr4 = new byte[i34];
                        eVar6.t.f = bArr4;
                        bVar.b(bArr4, 0, i34, false);
                    } else if (i33 == 18402) {
                        i2 = 0;
                        byte[] bArr5 = new byte[i34];
                        eVar6.t.g = bArr5;
                        bVar.b(bArr5, 0, i34, false);
                    } else if (i33 == 21419) {
                        i2 = 0;
                        Arrays.fill(eVar6.i.f5766a, (byte) 0);
                        bVar.b(eVar6.i.f5766a, 4 - i34, i34, false);
                        eVar6.i.e(0);
                        eVar6.v = (int) eVar6.i.k();
                    } else if (i33 != 25506) {
                        if (i33 != 30322) {
                            eVar6.getClass();
                            throw new r(m.a("Unexpected id: ", i33));
                        }
                        byte[] bArr6 = new byte[i34];
                        eVar6.t.o = bArr6;
                        i2 = 0;
                        bVar.b(bArr6, 0, i34, false);
                    } else {
                        i2 = 0;
                        byte[] bArr7 = new byte[i34];
                        eVar6.t.h = bArr7;
                        bVar.b(bArr7, 0, i34, false);
                    }
                    i4 = i2;
                    bVar2.e = i4;
                    r42 = i4;
                }
            }
            if (z3) {
                long j16 = bVar.c;
                if (this.x) {
                    this.z = j16;
                    oVar.f5636a = this.y;
                    this.x = z;
                    return 1;
                }
                if (this.u) {
                    long j17 = this.z;
                    if (j17 != -1) {
                        oVar.f5636a = j17;
                        this.z = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
            i10 = 0;
        }
        int i59 = i10;
        if (z3) {
            return i59;
        }
        return -1;
    }

    public final void a(d dVar, long j) {
        byte[] b;
        if ("S_TEXT/UTF8".equals(dVar.f5609a)) {
            byte[] bArr = this.k.f5766a;
            long j2 = this.G;
            if (j2 == -9223372036854775807L) {
                b = a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                b = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r5)) / 1000))));
            }
            System.arraycopy(b, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            n nVar = this.k;
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
        n nVar2 = this.j;
        nVar2.b = 0;
        nVar2.c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i) {
        n nVar = this.g;
        if (nVar.c >= i) {
            return;
        }
        if (nVar.a() < i) {
            n nVar2 = this.g;
            byte[] bArr = nVar2.f5766a;
            byte[] copyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i));
            int i2 = this.g.c;
            nVar2.f5766a = copyOf;
            nVar2.c = i2;
            nVar2.b = 0;
        }
        n nVar3 = this.g;
        byte[] bArr2 = nVar3.f5766a;
        int i3 = nVar3.c;
        bVar.b(bArr2, i3, i - i3, false);
        this.g.d(i);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i) {
        int a2;
        int a3;
        int i2;
        if ("S_TEXT/UTF8".equals(dVar.f5609a)) {
            byte[] bArr = Z;
            int i3 = i + 32;
            if (this.k.a() < i3) {
                this.k.f5766a = Arrays.copyOf(bArr, i3 + i);
            }
            bVar.b(this.k.f5766a, 32, i, false);
            this.k.e(0);
            this.k.d(i3);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.g.f5766a, 0, 1, false);
                    this.N++;
                    byte b = this.g.f5766a[0];
                    if ((b & 128) != 128) {
                        this.S = b;
                        this.P = true;
                    } else {
                        throw new r("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.l.f5766a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.g;
                        nVar.f5766a[0] = (byte) ((z ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.g);
                        this.V++;
                        this.l.e(0);
                        rVar.a(8, this.l);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            bVar.b(this.g.f5766a, 0, 1, false);
                            this.N++;
                            this.g.e(0);
                            this.T = this.g.j();
                            this.R = true;
                        }
                        int i4 = this.T * 4;
                        this.g.c(i4);
                        bVar.b(this.g.f5766a, 0, i4, false);
                        this.N += i4;
                        short s = (short) ((this.T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.n = ByteBuffer.allocate(i5);
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
                        n nVar2 = this.m;
                        nVar2.f5766a = this.n.array();
                        nVar2.c = i5;
                        nVar2.b = 0;
                        rVar.a(i5, this.m);
                        this.V += i5;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f;
                if (bArr2 != null) {
                    n nVar3 = this.j;
                    int length = bArr2.length;
                    nVar3.f5766a = bArr2;
                    nVar3.c = length;
                    nVar3.b = 0;
                }
            }
            this.O = true;
        }
        int i9 = i + this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f5609a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f5609a)) {
            while (true) {
                int i10 = this.N;
                if (i10 >= i9) {
                    break;
                }
                int i11 = i9 - i10;
                n nVar4 = this.j;
                int i12 = nVar4.c - nVar4.b;
                if (i12 > 0) {
                    a3 = Math.min(i11, i12);
                    rVar.a(a3, this.j);
                } else {
                    a3 = rVar.a(bVar, i11, false);
                }
                this.N += a3;
                this.V += a3;
            }
        } else {
            byte[] bArr3 = this.f.f5766a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = dVar.P;
            int i14 = 4 - i13;
            while (this.N < i9) {
                int i15 = this.U;
                if (i15 == 0) {
                    n nVar5 = this.j;
                    int min = Math.min(i13, nVar5.c - nVar5.b);
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
                    n nVar6 = this.j;
                    int i16 = nVar6.c - nVar6.b;
                    if (i16 > 0) {
                        a2 = Math.min(i15, i16);
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
        if ("A_VORBIS".equals(dVar.f5609a)) {
            this.h.e(0);
            rVar.a(4, this.h);
            this.V += 4;
        }
    }

    public final long a(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return z.a(j, j2, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }
}
