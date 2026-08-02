package M1;

import A1.C0045t0;
import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import C1.I;
import E4.y;
import F1.j;
import F1.k;
import F1.l;
import F1.m;
import F1.p;
import F1.v;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: u, reason: collision with root package name */
    public static final H5.k f4546u = new H5.k(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f4547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4548b;

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f4549c;

    /* renamed from: d, reason: collision with root package name */
    public final I f4550d;

    /* renamed from: e, reason: collision with root package name */
    public final p f4551e;

    /* renamed from: f, reason: collision with root package name */
    public final u1.c f4552f;

    /* renamed from: g, reason: collision with root package name */
    public final j f4553g;

    /* renamed from: h, reason: collision with root package name */
    public m f4554h;

    /* renamed from: i, reason: collision with root package name */
    public v f4555i;
    public v j;

    /* renamed from: k, reason: collision with root package name */
    public int f4556k;

    /* renamed from: l, reason: collision with root package name */
    public Metadata f4557l;

    /* renamed from: m, reason: collision with root package name */
    public long f4558m;

    /* renamed from: n, reason: collision with root package name */
    public long f4559n;

    /* renamed from: o, reason: collision with root package name */
    public long f4560o;

    /* renamed from: p, reason: collision with root package name */
    public int f4561p;

    /* renamed from: q, reason: collision with root package name */
    public f f4562q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4563r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4564s;

    /* renamed from: t, reason: collision with root package name */
    public long f4565t;

    public d(int i7) {
        this(i7, -9223372036854775807L);
    }

    public static long c(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        for (Metadata.Entry entry : metadata.f10562a) {
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f10625a.equals("TLEN")) {
                    return t.E(Long.parseLong(textInformationFrame.f10637c));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // F1.k
    public final boolean a(l lVar) {
        return h((F1.h) lVar, true);
    }

    public final a b(F1.h hVar, boolean z4) {
        C0095a c0095a = this.f4549c;
        hVar.c((byte[]) c0095a.f1465c, 0, 4, false);
        c0095a.D(0);
        int g3 = c0095a.g();
        I i7 = this.f4550d;
        i7.a(g3);
        return new a(hVar.f2533c, hVar.f2534d, i7.f1408e, i7.f1405b, z4);
    }

    public final boolean d(F1.h hVar) {
        f fVar = this.f4562q;
        if (fVar != null) {
            long c3 = fVar.c();
            if (c3 != -1 && hVar.d() > c3 - 4) {
                return true;
            }
        }
        try {
            return !hVar.c((byte[]) this.f4549c.f1465c, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f4554h = mVar;
        v r7 = mVar.r(0, 1);
        this.f4555i = r7;
        this.j = r7;
        this.f4554h.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r11 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02df  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        d dVar;
        int i7;
        int i8;
        l lVar2;
        C0095a c0095a;
        int i9;
        int i10;
        int g3;
        h hVar;
        C0095a c0095a2;
        p pVar;
        f fVar;
        int w7;
        Metadata metadata;
        p pVar2;
        c cVar;
        boolean z4;
        long c3;
        long j;
        C0095a c0095a3;
        p pVar3;
        F1.h hVar2;
        int t7;
        AbstractC1664a.i(this.f4555i);
        int i11 = t.f17153a;
        int i12 = this.f4556k;
        I i13 = this.f4550d;
        if (i12 == 0) {
            try {
                h((F1.h) lVar, false);
            } catch (EOFException unused) {
                dVar = this;
                i7 = -1;
                i8 = -1;
            }
        }
        f fVar2 = this.f4562q;
        C0095a c0095a4 = this.f4549c;
        if (fVar2 == null) {
            C0095a c0095a5 = new C0095a(i13.f1405b);
            ((F1.h) lVar).c((byte[]) c0095a5.f1465c, 0, i13.f1405b, false);
            int i14 = 21;
            if ((i13.f1404a & 1) != 0) {
                if (i13.f1407d != 1) {
                    i14 = 36;
                }
            } else if (i13.f1407d == 1) {
                i14 = 13;
            }
            if (c0095a5.f1464b >= i14 + 4) {
                c0095a5.D(i14);
                i10 = c0095a5.g();
                if (i10 != 1483304551) {
                }
                p pVar4 = this.f4551e;
                long j3 = -1;
                if (i10 != 1483304551 || i10 == 1231971951) {
                    lVar2 = lVar;
                    F1.h hVar3 = (F1.h) lVar2;
                    long j7 = hVar3.f2534d;
                    int i15 = i13.f1409f;
                    int i16 = i13.f1406c;
                    g3 = c0095a5.g();
                    if ((g3 & 1) == 1 || (w7 = c0095a5.w()) == 0) {
                        hVar = null;
                    } else {
                        long K7 = t.K(w7, i15 * 1000000, i16);
                        if ((g3 & 6) != 6) {
                            hVar = new h(j7, i13.f1405b, K7, -1L, null);
                        } else {
                            long u4 = c0095a5.u();
                            long[] jArr = new long[100];
                            for (int i17 = 0; i17 < 100; i17++) {
                                jArr[i17] = c0095a5.t();
                            }
                            long j8 = hVar3.f2533c;
                            if (j8 != -1) {
                                long j9 = j7 + u4;
                                if (j8 != j9) {
                                    StringBuilder j10 = e1.k.j("XING data size mismatch: ", ", ", j8);
                                    j10.append(j9);
                                    Log.w("XingSeeker", j10.toString());
                                }
                            }
                            hVar = new h(j7, i13.f1405b, K7, u4, jArr);
                        }
                    }
                    if (hVar != null) {
                        pVar = pVar4;
                        if (pVar.f2561a == -1 || pVar.f2562b == -1) {
                            hVar3.f2536f = 0;
                            hVar3.b(i14 + 141, false);
                            c0095a2 = c0095a4;
                            hVar3.c((byte[]) c0095a2.f1465c, 0, 3, false);
                            c0095a2.D(0);
                            int v6 = c0095a2.v();
                            int i18 = v6 >> 12;
                            int i19 = v6 & 4095;
                            if (i18 > 0 || i19 > 0) {
                                pVar.f2561a = i18;
                                pVar.f2562b = i19;
                            }
                        } else {
                            c0095a2 = c0095a4;
                        }
                    } else {
                        c0095a2 = c0095a4;
                        pVar = pVar4;
                    }
                    hVar3.q(i13.f1405b);
                    if (hVar == null && !hVar.d() && i10 == 1231971951) {
                        dVar = this;
                        fVar = dVar.b(hVar3, false);
                    } else {
                        dVar = this;
                        fVar = hVar;
                    }
                } else if (i10 == 1447187017) {
                    F1.h hVar4 = (F1.h) lVar;
                    long j11 = hVar4.f2534d;
                    c0095a5.E(10);
                    int g7 = c0095a5.g();
                    if (g7 <= 0) {
                        hVar2 = hVar4;
                        c0095a3 = c0095a4;
                        pVar3 = pVar4;
                    } else {
                        int i20 = i13.f1406c;
                        long K8 = t.K(g7, (i20 >= 32000 ? 1152 : 576) * 1000000, i20);
                        int y4 = c0095a5.y();
                        int y5 = c0095a5.y();
                        int y7 = c0095a5.y();
                        c0095a5.E(2);
                        long j12 = i13.f1405b + j11;
                        long[] jArr2 = new long[y4];
                        long[] jArr3 = new long[y4];
                        c0095a3 = c0095a4;
                        pVar3 = pVar4;
                        long j13 = j11;
                        int i21 = 0;
                        while (i21 < y4) {
                            int i22 = y5;
                            int i23 = y7;
                            jArr2[i21] = (i21 * K8) / y4;
                            jArr3[i21] = Math.max(j13, j12);
                            if (i23 == 1) {
                                t7 = c0095a5.t();
                            } else if (i23 == 2) {
                                t7 = c0095a5.y();
                            } else if (i23 == 3) {
                                t7 = c0095a5.v();
                            } else if (i23 != 4) {
                                hVar2 = hVar4;
                            } else {
                                t7 = c0095a5.w();
                            }
                            j13 += t7 * i22;
                            i21++;
                            y5 = i22;
                            y7 = i23;
                        }
                        hVar2 = hVar4;
                        long j14 = hVar2.f2533c;
                        if (j14 != -1 && j14 != j13) {
                            StringBuilder j15 = e1.k.j("VBRI data size mismatch: ", ", ", j14);
                            j15.append(j13);
                            Log.w("VbriSeeker", j15.toString());
                        }
                        fVar = new g(jArr2, jArr3, K8, j13);
                        hVar2.q(i13.f1405b);
                        dVar = this;
                        lVar2 = lVar;
                        c0095a2 = c0095a3;
                        pVar = pVar3;
                    }
                    fVar = null;
                    hVar2.q(i13.f1405b);
                    dVar = this;
                    lVar2 = lVar;
                    c0095a2 = c0095a3;
                    pVar = pVar3;
                } else {
                    lVar2 = lVar;
                    ((F1.h) lVar2).f2536f = 0;
                    dVar = this;
                    c0095a2 = c0095a4;
                    pVar = pVar4;
                    fVar = null;
                }
                metadata = dVar.f4557l;
                F1.h hVar5 = (F1.h) lVar2;
                long j16 = hVar5.f2534d;
                if (metadata != null) {
                    Metadata.Entry[] entryArr = metadata.f10562a;
                    int length = entryArr.length;
                    int i24 = 0;
                    while (i24 < length) {
                        Metadata.Entry entry = entryArr[i24];
                        if (entry instanceof MlltFrame) {
                            long c4 = c(metadata);
                            int length2 = ((MlltFrame) entry).f10632e.length;
                            boolean z7 = true;
                            int i25 = length2 + 1;
                            long[] jArr4 = new long[i25];
                            long[] jArr5 = new long[i25];
                            jArr4[0] = j16;
                            jArr5[0] = 0;
                            int i26 = 1;
                            long j17 = 0;
                            while (i26 <= length2) {
                                int i27 = i26 - 1;
                                j16 += r13.f10630c + r13.f10632e[i27];
                                j17 += r13.f10631d + r13.f10633f[i27];
                                jArr4[i26] = j16;
                                jArr5[i26] = j17;
                                i26++;
                                z7 = true;
                                length2 = length2;
                                c0095a2 = c0095a2;
                                pVar = pVar;
                            }
                            pVar2 = pVar;
                            c0095a = c0095a2;
                            cVar = new c(jArr4, jArr5, c4);
                            z4 = dVar.f4563r;
                            int i28 = dVar.f4547a;
                            if (z4) {
                                if ((4 & i28) != 0) {
                                    if (cVar != null) {
                                        c3 = cVar.f4545c;
                                    } else if (fVar != null) {
                                        long i29 = fVar.i();
                                        j3 = fVar.c();
                                        j = i29;
                                        fVar = new b(j, hVar5.f2534d, j3);
                                    } else {
                                        c3 = c(dVar.f4557l);
                                    }
                                    j = c3;
                                    fVar = new b(j, hVar5.f2534d, j3);
                                } else if (cVar != null) {
                                    fVar = cVar;
                                } else if (fVar == null) {
                                    fVar = null;
                                }
                                if (fVar == null || (!fVar.d() && (i28 & 1) != 0)) {
                                    fVar = dVar.b(hVar5, (2 & i28) != 0);
                                }
                            } else {
                                fVar = new e(-9223372036854775807L);
                            }
                            dVar.f4562q = fVar;
                            dVar.f4554h.m(fVar);
                            v vVar = dVar.j;
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10537k = (String) i13.f1410g;
                            format$Builder.f10538l = 4096;
                            format$Builder.f10550x = i13.f1407d;
                            format$Builder.f10551y = i13.f1406c;
                            p pVar5 = pVar2;
                            format$Builder.f10524A = pVar5.f2561a;
                            format$Builder.f10525B = pVar5.f2562b;
                            format$Builder.f10536i = (i28 & 8) == 0 ? null : dVar.f4557l;
                            vVar.a(new X(format$Builder));
                            dVar.f4560o = hVar5.f2534d;
                        } else {
                            i24++;
                            pVar = pVar;
                        }
                    }
                }
                pVar2 = pVar;
                c0095a = c0095a2;
                cVar = null;
                z4 = dVar.f4563r;
                int i282 = dVar.f4547a;
                if (z4) {
                }
                dVar.f4562q = fVar;
                dVar.f4554h.m(fVar);
                v vVar2 = dVar.j;
                Format$Builder format$Builder2 = new Format$Builder();
                format$Builder2.f10537k = (String) i13.f1410g;
                format$Builder2.f10538l = 4096;
                format$Builder2.f10550x = i13.f1407d;
                format$Builder2.f10551y = i13.f1406c;
                p pVar52 = pVar2;
                format$Builder2.f10524A = pVar52.f2561a;
                format$Builder2.f10525B = pVar52.f2562b;
                format$Builder2.f10536i = (i282 & 8) == 0 ? null : dVar.f4557l;
                vVar2.a(new X(format$Builder2));
                dVar.f4560o = hVar5.f2534d;
            }
            if (c0095a5.f1464b >= 40) {
                c0095a5.D(36);
                if (c0095a5.g() == 1447187017) {
                    i10 = 1447187017;
                    p pVar42 = this.f4551e;
                    long j32 = -1;
                    if (i10 != 1483304551) {
                    }
                    lVar2 = lVar;
                    F1.h hVar32 = (F1.h) lVar2;
                    long j72 = hVar32.f2534d;
                    int i152 = i13.f1409f;
                    int i162 = i13.f1406c;
                    g3 = c0095a5.g();
                    if ((g3 & 1) == 1) {
                    }
                    hVar = null;
                    if (hVar != null) {
                    }
                    hVar32.q(i13.f1405b);
                    if (hVar == null) {
                    }
                    dVar = this;
                    fVar = hVar;
                    metadata = dVar.f4557l;
                    F1.h hVar52 = (F1.h) lVar2;
                    long j162 = hVar52.f2534d;
                    if (metadata != null) {
                    }
                    pVar2 = pVar;
                    c0095a = c0095a2;
                    cVar = null;
                    z4 = dVar.f4563r;
                    int i2822 = dVar.f4547a;
                    if (z4) {
                    }
                    dVar.f4562q = fVar;
                    dVar.f4554h.m(fVar);
                    v vVar22 = dVar.j;
                    Format$Builder format$Builder22 = new Format$Builder();
                    format$Builder22.f10537k = (String) i13.f1410g;
                    format$Builder22.f10538l = 4096;
                    format$Builder22.f10550x = i13.f1407d;
                    format$Builder22.f10551y = i13.f1406c;
                    p pVar522 = pVar2;
                    format$Builder22.f10524A = pVar522.f2561a;
                    format$Builder22.f10525B = pVar522.f2562b;
                    format$Builder22.f10536i = (i2822 & 8) == 0 ? null : dVar.f4557l;
                    vVar22.a(new X(format$Builder22));
                    dVar.f4560o = hVar52.f2534d;
                }
            }
            i10 = 0;
            p pVar422 = this.f4551e;
            long j322 = -1;
            if (i10 != 1483304551) {
            }
            lVar2 = lVar;
            F1.h hVar322 = (F1.h) lVar2;
            long j722 = hVar322.f2534d;
            int i1522 = i13.f1409f;
            int i1622 = i13.f1406c;
            g3 = c0095a5.g();
            if ((g3 & 1) == 1) {
            }
            hVar = null;
            if (hVar != null) {
            }
            hVar322.q(i13.f1405b);
            if (hVar == null) {
            }
            dVar = this;
            fVar = hVar;
            metadata = dVar.f4557l;
            F1.h hVar522 = (F1.h) lVar2;
            long j1622 = hVar522.f2534d;
            if (metadata != null) {
            }
            pVar2 = pVar;
            c0095a = c0095a2;
            cVar = null;
            z4 = dVar.f4563r;
            int i28222 = dVar.f4547a;
            if (z4) {
            }
            dVar.f4562q = fVar;
            dVar.f4554h.m(fVar);
            v vVar222 = dVar.j;
            Format$Builder format$Builder222 = new Format$Builder();
            format$Builder222.f10537k = (String) i13.f1410g;
            format$Builder222.f10538l = 4096;
            format$Builder222.f10550x = i13.f1407d;
            format$Builder222.f10551y = i13.f1406c;
            p pVar5222 = pVar2;
            format$Builder222.f10524A = pVar5222.f2561a;
            format$Builder222.f10525B = pVar5222.f2562b;
            format$Builder222.f10536i = (i28222 & 8) == 0 ? null : dVar.f4557l;
            vVar222.a(new X(format$Builder222));
            dVar.f4560o = hVar522.f2534d;
        } else {
            dVar = this;
            lVar2 = lVar;
            c0095a = c0095a4;
            long j18 = dVar.f4560o;
            if (j18 != 0) {
                long j19 = ((F1.h) lVar2).f2534d;
                if (j19 < j18) {
                    ((F1.h) lVar2).q((int) (j18 - j19));
                }
            }
        }
        if (dVar.f4561p == 0) {
            ((F1.h) lVar2).f2536f = 0;
            F1.h hVar6 = (F1.h) lVar2;
            if (!dVar.d(hVar6)) {
                C0095a c0095a6 = c0095a;
                c0095a6.D(0);
                int g8 = c0095a6.g();
                if (((-128000) & g8) != (dVar.f4556k & (-128000)) || AbstractC0096b.d(g8) == -1) {
                    hVar6.q(1);
                    dVar.f4556k = 0;
                    i9 = 0;
                    i8 = i9;
                    i7 = -1;
                    if (i8 == i7) {
                        f fVar3 = dVar.f4562q;
                        if (fVar3 instanceof b) {
                            long j20 = ((dVar.f4559n * 1000000) / i13.f1406c) + dVar.f4558m;
                            if (fVar3.i() != j20) {
                                f fVar4 = dVar.f4562q;
                                ((b) fVar4).f4542d = j20;
                                dVar.f4554h.m(fVar4);
                            }
                        }
                    }
                    return i8;
                }
                i13.a(g8);
                if (dVar.f4558m == -9223372036854775807L) {
                    dVar.f4558m = dVar.f4562q.b(hVar6.f2534d);
                    long j21 = dVar.f4548b;
                    if (j21 != -9223372036854775807L) {
                        dVar.f4558m = (j21 - dVar.f4562q.b(0L)) + dVar.f4558m;
                    }
                }
                int i30 = i13.f1405b;
                dVar.f4561p = i30;
                f fVar5 = dVar.f4562q;
                if (fVar5 instanceof b) {
                    b bVar = (b) fVar5;
                    long j22 = (((dVar.f4559n + i13.f1409f) * 1000000) / i13.f1406c) + dVar.f4558m;
                    long j23 = hVar6.f2534d + i30;
                    if (!bVar.a(j22)) {
                        bVar.f4540b.d(j22);
                        bVar.f4541c.d(j23);
                    }
                    if (dVar.f4564s && bVar.a(dVar.f4565t)) {
                        dVar.f4564s = false;
                        dVar.j = dVar.f4555i;
                    }
                }
            }
            i9 = -1;
            i8 = i9;
            i7 = -1;
            if (i8 == i7) {
            }
            return i8;
        }
        int d7 = dVar.j.d(lVar2, dVar.f4561p, true);
        if (d7 != -1) {
            int i31 = dVar.f4561p - d7;
            dVar.f4561p = i31;
            if (i31 <= 0) {
                dVar.j.e(((dVar.f4559n * 1000000) / i13.f1406c) + dVar.f4558m, 1, i13.f1405b, 0, null);
                dVar.f4559n += i13.f1409f;
                dVar.f4561p = 0;
                i9 = 0;
                i8 = i9;
                i7 = -1;
                if (i8 == i7) {
                }
                return i8;
            }
            i9 = 0;
            i8 = i9;
            i7 = -1;
            if (i8 == i7) {
            }
            return i8;
        }
        i9 = -1;
        i8 = i9;
        i7 = -1;
        if (i8 == i7) {
        }
        return i8;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f4556k = 0;
        this.f4558m = -9223372036854775807L;
        this.f4559n = 0L;
        this.f4561p = 0;
        this.f4565t = j3;
        f fVar = this.f4562q;
        if (!(fVar instanceof b) || ((b) fVar).a(j3)) {
            return;
        }
        this.f4564s = true;
        this.j = this.f4553g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r19 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r18.q(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        r17.f4556k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r18.f2536f = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(F1.h hVar, boolean z4) {
        int i7;
        int i8;
        int d7;
        int i9 = z4 ? 32768 : 131072;
        hVar.f2536f = 0;
        if (hVar.f2534d == 0) {
            Metadata q7 = this.f4552f.q(hVar, (this.f4547a & 8) == 0 ? null : f4546u);
            this.f4557l = q7;
            if (q7 != null) {
                this.f4551e.b(q7);
            }
            i7 = (int) hVar.d();
            if (!z4) {
                hVar.q(i7);
            }
            i8 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i10 = i8;
        int i11 = i10;
        while (true) {
            if (!d(hVar)) {
                C0095a c0095a = this.f4549c;
                c0095a.D(0);
                int g3 = c0095a.g();
                if ((i8 == 0 || ((-128000) & g3) == (i8 & (-128000))) && (d7 = AbstractC0096b.d(g3)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f4550d.a(g3);
                        i8 = g3;
                    }
                    hVar.b(d7 - 4, false);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i9) {
                        if (z4) {
                            return false;
                        }
                        throw C0045t0.a(null, "Searched too many bytes.");
                    }
                    if (z4) {
                        hVar.f2536f = 0;
                        hVar.b(i7 + i12, false);
                    } else {
                        hVar.q(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i8 = 0;
                }
            } else if (i10 <= 0) {
                throw new EOFException();
            }
        }
    }

    public d(int i7, long j) {
        this.f4547a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f4548b = j;
        this.f4549c = new C0095a(10);
        this.f4550d = new I();
        this.f4551e = new p();
        this.f4558m = -9223372036854775807L;
        this.f4552f = new u1.c(4);
        j jVar = new j();
        this.f4553g = jVar;
        this.j = jVar;
    }

    @Override // F1.k
    public final void release() {
    }
}
