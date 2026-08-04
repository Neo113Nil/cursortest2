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
import java.io.InterruptedIOException;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final H5.k f4546u = new H5.k(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f4549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f4550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f4551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p145u1.c f4552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f4553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f4554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f4555i;
    public v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Metadata f4557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f4562q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4563r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
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
        int iG = c0095a.g();
        I i7 = this.f4550d;
        i7.a(iG);
        return new a(hVar.f2533c, hVar.f2534d, i7.f1408e, i7.f1405b, z4);
    }

    public final boolean d(F1.h hVar) {
        f fVar = this.f4562q;
        if (fVar != null) {
            long jC = fVar.c();
            if (jC != -1 && hVar.d() > jC - 4) {
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
        v vVarR = mVar.r(0, 1);
        this.f4555i = vVarR;
        this.j = vVarR;
        this.f4554h.n();
    }

    /* JADX WARN: Code duplicated, block: B:159:0x039d  */
    /* JADX WARN: Code duplicated, block: B:187:0x044b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0453  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    @Override // F1.k
    public final int f(l lVar, y yVar) throws C0045t0, EOFException, InterruptedIOException {
        d dVar;
        int i7;
        int i8;
        l lVar2;
        C0095a c0095a;
        int iD;
        int i9;
        int i10;
        int iG;
        h hVar;
        C0095a c0095a2;
        p pVar;
        f fVarB;
        int iW;
        p pVar2;
        c cVar;
        long jC;
        long j;
        C0095a c0095a3;
        p pVar3;
        F1.h hVar2;
        int iT;
        p151v2.a.i(this.f4555i);
        int i11 = t.f17159a;
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
        f fVar = this.f4562q;
        C0095a c0095a4 = this.f4549c;
        if (fVar == null) {
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
                iG = c0095a5.g();
                if (iG != 1483304551 && iG != 1231971951) {
                    if (c0095a5.f1464b >= 40) {
                        c0095a5.D(36);
                        if (c0095a5.g() == 1447187017) {
                            iG = 1447187017;
                        } else {
                            iG = 0;
                        }
                    } else {
                        iG = 0;
                    }
                }
            } else if (c0095a5.f1464b >= 40) {
                c0095a5.D(36);
                if (c0095a5.g() == 1447187017) {
                    iG = 1447187017;
                } else {
                    iG = 0;
                }
            } else {
                iG = 0;
            }
            p pVar4 = this.f4551e;
            long jC2 = -1;
            if (iG == 1483304551 || iG == 1231971951) {
                lVar2 = lVar;
                F1.h hVar3 = (F1.h) lVar2;
                long j3 = hVar3.f2534d;
                int i15 = i13.f1409f;
                int i16 = i13.f1406c;
                int iG2 = c0095a5.g();
                if ((iG2 & 1) != 1 || (iW = c0095a5.w()) == 0) {
                    hVar = null;
                } else {
                    long jK = t.K(iW, ((long) i15) * 1000000, i16);
                    if ((iG2 & 6) != 6) {
                        hVar = new h(j3, i13.f1405b, jK, -1L, null);
                    } else {
                        long jU = c0095a5.u();
                        long[] jArr = new long[100];
                        for (int i17 = 0; i17 < 100; i17++) {
                            jArr[i17] = c0095a5.t();
                        }
                        long j7 = hVar3.f2533c;
                        if (j7 != -1) {
                            long j8 = j3 + jU;
                            if (j7 != j8) {
                                StringBuilder sbJ = p031e1.k.j("XING data size mismatch: ", ", ", j7);
                                sbJ.append(j8);
                                Log.w("XingSeeker", sbJ.toString());
                            }
                        }
                        hVar = new h(j3, i13.f1405b, jK, jU, jArr);
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
                        int iV = c0095a2.v();
                        int i18 = iV >> 12;
                        int i19 = iV & 4095;
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
                if (hVar == null || hVar.d() || iG != 1231971951) {
                    dVar = this;
                    fVarB = hVar;
                } else {
                    dVar = this;
                    fVarB = dVar.b(hVar3, false);
                }
            } else if (iG == 1447187017) {
                F1.h hVar4 = (F1.h) lVar;
                long j9 = hVar4.f2534d;
                c0095a5.E(10);
                int iG3 = c0095a5.g();
                if (iG3 <= 0) {
                    hVar2 = hVar4;
                    c0095a3 = c0095a4;
                    pVar3 = pVar4;
                } else {
                    int i20 = i13.f1406c;
                    long jK2 = t.K(iG3, ((long) (i20 >= 32000 ? 1152 : 576)) * 1000000, i20);
                    int iY = c0095a5.y();
                    int iY2 = c0095a5.y();
                    int iY3 = c0095a5.y();
                    c0095a5.E(2);
                    long j10 = ((long) i13.f1405b) + j9;
                    long[] jArr2 = new long[iY];
                    long[] jArr3 = new long[iY];
                    c0095a3 = c0095a4;
                    pVar3 = pVar4;
                    long j11 = j9;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= iY) {
                            hVar2 = hVar4;
                            long j12 = hVar2.f2533c;
                            if (j12 != -1 && j12 != j11) {
                                StringBuilder sbJ2 = p031e1.k.j("VBRI data size mismatch: ", ", ", j12);
                                sbJ2.append(j11);
                                Log.w("VbriSeeker", sbJ2.toString());
                            }
                            fVarB = new g(jArr2, jArr3, jK2, j11);
                            break;
                        }
                        int i22 = iY2;
                        int i23 = iY3;
                        jArr2[i21] = (((long) i21) * jK2) / ((long) iY);
                        jArr3[i21] = Math.max(j11, j10);
                        if (i23 == 1) {
                            iT = c0095a5.t();
                        } else if (i23 == 2) {
                            iT = c0095a5.y();
                        } else if (i23 == 3) {
                            iT = c0095a5.v();
                        } else if (i23 != 4) {
                            hVar2 = hVar4;
                        } else {
                            iT = c0095a5.w();
                        }
                        j11 += ((long) iT) * ((long) i22);
                        i21++;
                        iY2 = i22;
                        iY3 = i23;
                    }
                    hVar2.q(i13.f1405b);
                    dVar = this;
                    lVar2 = lVar;
                    c0095a2 = c0095a3;
                    pVar = pVar3;
                }
                fVarB = null;
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
                fVarB = null;
            }
            Metadata metadata = dVar.f4557l;
            F1.h hVar5 = (F1.h) lVar2;
            long j13 = hVar5.f2534d;
            if (metadata == null) {
                pVar2 = pVar;
                c0095a = c0095a2;
                cVar = null;
                break;
            }
            Metadata.Entry[] entryArr = metadata.f10562a;
            int length = entryArr.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length) {
                    pVar2 = pVar;
                    c0095a = c0095a2;
                    cVar = null;
                    break;
                }
                Metadata.Entry entry = entryArr[i24];
                if (entry instanceof MlltFrame) {
                    MlltFrame mlltFrame = (MlltFrame) entry;
                    long jC3 = c(metadata);
                    int length2 = mlltFrame.f10632e.length;
                    boolean z4 = true;
                    int i25 = length2 + 1;
                    long[] jArr4 = new long[i25];
                    long[] jArr5 = new long[i25];
                    jArr4[0] = j13;
                    jArr5[0] = 0;
                    int i26 = 1;
                    long j14 = 0;
                    while (i26 <= length2) {
                        int i27 = i26 - 1;
                        j13 += (long) (mlltFrame.f10630c + mlltFrame.f10632e[i27]);
                        j14 += (long) (mlltFrame.f10631d + mlltFrame.f10633f[i27]);
                        jArr4[i26] = j13;
                        jArr5[i26] = j14;
                        i26++;
                        z4 = true;
                        length2 = length2;
                        c0095a2 = c0095a2;
                        pVar = pVar;
                    }
                    pVar2 = pVar;
                    c0095a = c0095a2;
                    cVar = new c(jArr4, jArr5, jC3);
                    break;
                }
                i24++;
                pVar = pVar;
            }
            boolean z7 = dVar.f4563r;
            int i28 = dVar.f4547a;
            if (z7) {
                fVarB = new e(-9223372036854775807L);
            } else {
                if ((4 & i28) != 0) {
                    if (cVar != null) {
                        jC = cVar.f4545c;
                    } else {
                        if (fVarB != null) {
                            long jI = fVarB.i();
                            jC2 = fVarB.c();
                            j = jI;
                        } else {
                            jC = c(dVar.f4557l);
                        }
                        fVarB = new b(j, hVar5.f2534d, jC2);
                    }
                    j = jC;
                    fVarB = new b(j, hVar5.f2534d, jC2);
                } else if (cVar != null) {
                    fVarB = cVar;
                } else if (fVarB == null) {
                    fVarB = null;
                }
                if (fVarB == null || (!fVarB.d() && (i28 & 1) != 0)) {
                    fVarB = dVar.b(hVar5, (2 & i28) != 0);
                }
            }
            dVar.f4562q = fVarB;
            dVar.f4554h.m(fVarB);
            v vVar = dVar.j;
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = (String) i13.f1410g;
            format$Builder.f10538l = 4096;
            format$Builder.f10550x = i13.f1407d;
            format$Builder.f10551y = i13.f1406c;
            p pVar5 = pVar2;
            format$Builder.f10524A = pVar5.f2561a;
            format$Builder.f10525B = pVar5.f2562b;
            format$Builder.f10536i = (i28 & 8) != 0 ? null : dVar.f4557l;
            vVar.a(new X(format$Builder));
            dVar.f4560o = hVar5.f2534d;
        } else {
            dVar = this;
            lVar2 = lVar;
            c0095a = c0095a4;
            long j15 = dVar.f4560o;
            if (j15 != 0) {
                long j16 = ((F1.h) lVar2).f2534d;
                if (j16 < j15) {
                    ((F1.h) lVar2).q((int) (j15 - j16));
                }
            }
        }
        if (dVar.f4561p == 0) {
            ((F1.h) lVar2).f2536f = 0;
            F1.h hVar6 = (F1.h) lVar2;
            if (dVar.d(hVar6)) {
                i10 = -1;
            } else {
                C0095a c0095a6 = c0095a;
                c0095a6.D(0);
                int iG4 = c0095a6.g();
                if (((-128000) & iG4) != (((long) dVar.f4556k) & (-128000)) || AbstractC0096b.d(iG4) == -1) {
                    hVar6.q(1);
                    dVar.f4556k = 0;
                } else {
                    i13.a(iG4);
                    if (dVar.f4558m == -9223372036854775807L) {
                        dVar.f4558m = dVar.f4562q.b(hVar6.f2534d);
                        long j17 = dVar.f4548b;
                        if (j17 != -9223372036854775807L) {
                            dVar.f4558m = (j17 - dVar.f4562q.b(0L)) + dVar.f4558m;
                        }
                    }
                    int i29 = i13.f1405b;
                    dVar.f4561p = i29;
                    f fVar2 = dVar.f4562q;
                    if (fVar2 instanceof b) {
                        b bVar = (b) fVar2;
                        long j18 = (((dVar.f4559n + ((long) i13.f1409f)) * 1000000) / ((long) i13.f1406c)) + dVar.f4558m;
                        long j19 = hVar6.f2534d + ((long) i29);
                        if (!bVar.a(j18)) {
                            bVar.f4540b.d(j18);
                            bVar.f4541c.d(j19);
                        }
                        if (dVar.f4564s && bVar.a(dVar.f4565t)) {
                            dVar.f4564s = false;
                            dVar.j = dVar.f4555i;
                        }
                    }
                    iD = dVar.j.d(lVar2, dVar.f4561p, true);
                    if (iD == -1) {
                        i10 = -1;
                    } else {
                        i9 = dVar.f4561p - iD;
                        dVar.f4561p = i9;
                        if (i9 <= 0) {
                            dVar.j.e(((dVar.f4559n * 1000000) / ((long) i13.f1406c)) + dVar.f4558m, 1, i13.f1405b, 0, null);
                            dVar.f4559n += (long) i13.f1409f;
                            dVar.f4561p = 0;
                            i10 = 0;
                        }
                    }
                }
                i10 = 0;
            }
        } else {
            iD = dVar.j.d(lVar2, dVar.f4561p, true);
            if (iD == -1) {
                i10 = -1;
            } else {
                i9 = dVar.f4561p - iD;
                dVar.f4561p = i9;
                if (i9 <= 0) {
                    i10 = 0;
                } else {
                    dVar.j.e(((dVar.f4559n * 1000000) / ((long) i13.f1406c)) + dVar.f4558m, 1, i13.f1405b, 0, null);
                    dVar.f4559n += (long) i13.f1409f;
                    dVar.f4561p = 0;
                    i10 = 0;
                }
            }
        }
        i8 = i10;
        i7 = -1;
        if (i8 == i7) {
            f fVar3 = dVar.f4562q;
            if (fVar3 instanceof b) {
                long j20 = ((dVar.f4559n * 1000000) / ((long) i13.f1406c)) + dVar.f4558m;
                if (fVar3.i() != j20) {
                    f fVar4 = dVar.f4562q;
                    ((b) fVar4).f4542d = j20;
                    dVar.f4554h.m(fVar4);
                }
            }
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

    public final boolean h(F1.h hVar, boolean z4) throws C0045t0, EOFException, InterruptedIOException {
        int iD;
        int i7;
        int iD2;
        int i8 = z4 ? 32768 : 131072;
        hVar.f2536f = 0;
        if (hVar.f2534d == 0) {
            Metadata metadataQ = this.f4552f.q(hVar, (this.f4547a & 8) == 0 ? null : f4546u);
            this.f4557l = metadataQ;
            if (metadataQ != null) {
                this.f4551e.b(metadataQ);
            }
            iD = (int) hVar.d();
            if (!z4) {
                hVar.q(iD);
            }
            i7 = 0;
        } else {
            iD = 0;
            i7 = 0;
        }
        int i9 = i7;
        int i10 = i9;
        while (true) {
            if (d(hVar)) {
                if (i9 > 0) {
                    break;
                }
                throw new EOFException();
            }
            C0095a c0095a = this.f4549c;
            c0095a.D(0);
            int iG = c0095a.g();
            if ((i7 == 0 || ((-128000) & iG) == (((long) i7) & (-128000))) && (iD2 = AbstractC0096b.d(iG)) != -1) {
                i9++;
                if (i9 != 1) {
                    if (i9 == 4) {
                        break;
                    }
                } else {
                    this.f4550d.a(iG);
                    i7 = iG;
                }
                hVar.b(iD2 - 4, false);
            } else {
                int i11 = i10 + 1;
                if (i10 == i8) {
                    if (z4) {
                        return false;
                    }
                    throw C0045t0.a(null, "Searched too many bytes.");
                }
                if (z4) {
                    hVar.f2536f = 0;
                    hVar.b(iD + i11, false);
                } else {
                    hVar.q(1);
                }
                i9 = 0;
                i10 = i11;
                i7 = 0;
            }
        }
        if (z4) {
            hVar.q(iD + i10);
        } else {
            hVar.f2536f = 0;
        }
        this.f4556k = i7;
        return true;
    }

    public d(int i7, long j) {
        this.f4547a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f4548b = j;
        this.f4549c = new C0095a(10);
        this.f4550d = new I();
        this.f4551e = new p();
        this.f4558m = -9223372036854775807L;
        this.f4552f = new p145u1.c(4);
        j jVar = new j();
        this.f4553g = jVar;
        this.j = jVar;
    }

    @Override // F1.k
    public final void release() {
    }
}
