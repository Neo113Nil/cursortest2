package H1;

import A1.C0045t0;
import A1.X;
import B4.V;
import C0.C0091j;
import C1.C0095a;
import E3.C0165x;
import E4.y;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.v;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import p151v2.i;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3199c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3201e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f3205i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3209n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0095a f3197a = new C0095a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0091j f3198b = new C0091j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f3200d = new V(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e[] f3203g = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3206k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f3207l = -1;
    public int j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3202f = -9223372036854775807L;

    @Override // F1.k
    public final boolean a(l lVar) {
        C0095a c0095a = this.f3197a;
        ((F1.h) lVar).c((byte[]) c0095a.f1465c, 0, 12, false);
        c0095a.D(0);
        if (c0095a.i() != 1179011410) {
            return false;
        }
        c0095a.E(4);
        return c0095a.i() == 541677121;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f3199c = 0;
        this.f3200d = mVar;
        this.f3204h = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0389  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    @Override // F1.k
    public final int f(l lVar, y yVar) throws C0045t0, EOFException, InterruptedIOException {
        boolean z4;
        e eVar;
        long j;
        e eVar2;
        int i7;
        long j3 = this.f3204h;
        if (j3 != -1) {
            long j7 = ((F1.h) lVar).f2534d;
            if (j3 < j7 || j3 > 262144 + j7) {
                yVar.f2247a = j3;
                z4 = true;
            } else {
                ((F1.h) lVar).q((int) (j3 - j7));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f3204h = -1L;
        if (z4) {
            return 1;
        }
        int i8 = this.f3199c;
        C0091j c0091j = this.f3198b;
        C0095a c0095a = this.f3197a;
        e eVar3 = null;
        switch (i8) {
            case 0:
                if (!a(lVar)) {
                    throw C0045t0.a(null, "AVI Header List not found");
                }
                ((F1.h) lVar).q(12);
                this.f3199c = 1;
                return 0;
            case 1:
                ((F1.h) lVar).a((byte[]) c0095a.f1465c, 0, 12, false);
                c0095a.D(0);
                c0091j.f1289a = c0095a.i();
                c0091j.f1290b = c0095a.i();
                c0091j.f1291c = 0;
                if (c0091j.f1289a != 1414744396) {
                    throw C0045t0.a(null, "LIST expected, found: " + c0091j.f1289a);
                }
                int i9 = c0095a.i();
                c0091j.f1291c = i9;
                if (i9 == 1819436136) {
                    this.j = c0091j.f1290b;
                    this.f3199c = 2;
                    return 0;
                }
                throw C0045t0.a(null, "hdrl expected, found: " + c0091j.f1291c);
            case 2:
                int i10 = this.j - 4;
                C0095a c0095a2 = new C0095a(i10);
                ((F1.h) lVar).a((byte[]) c0095a2.f1465c, 0, i10, false);
                f fVarB = f.b(1819436136, c0095a2);
                int i11 = fVarB.f3230b;
                if (i11 != 1819436136) {
                    throw C0045t0.a(null, "Unexpected header list type " + i11);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw C0045t0.a(null, "AviHeader not found");
                }
                this.f3201e = cVar;
                this.f3202f = ((long) cVar.f3212c) * ((long) cVar.f3210a);
                ArrayList arrayList = new ArrayList();
                C0165x c0165xListIterator = fVarB.f3229a.listIterator(0);
                int i12 = 0;
                while (c0165xListIterator.hasNext()) {
                    a aVar = (a) c0165xListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i13 = i12 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            Log.w("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            Log.w("AviExtractor", "Missing Stream Format");
                        } else {
                            long jK = t.K(dVar.f3216d, ((long) dVar.f3214b) * 1000000, dVar.f3215c);
                            X x4 = gVar.f3231a;
                            Format$Builder format$BuilderA = x4.a();
                            format$BuilderA.f10528a = Integer.toString(i12);
                            int i14 = dVar.f3217e;
                            if (i14 != 0) {
                                format$BuilderA.f10538l = i14;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                format$BuilderA.f10529b = hVar.f3232a;
                            }
                            int iG = i.g(x4.f283C);
                            if (iG == 1 || iG == 2) {
                                v vVarR = this.f3200d.r(i12, iG);
                                vVarR.a(new X(format$BuilderA));
                                eVar = new e(i12, iG, jK, dVar.f3216d, vVarR);
                                this.f3202f = jK;
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i12 = i13;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i12 = i13;
                    }
                }
                this.f3203g = (e[]) arrayList.toArray(new e[0]);
                this.f3200d.n();
                this.f3199c = 3;
                return 0;
            case 3:
                long j8 = this.f3206k;
                if (j8 != -1 && ((F1.h) lVar).f2534d != j8) {
                    this.f3204h = j8;
                    return 0;
                }
                ((F1.h) lVar).c((byte[]) c0095a.f1465c, 0, 12, false);
                F1.h hVar2 = (F1.h) lVar;
                hVar2.f2536f = 0;
                c0095a.D(0);
                c0091j.f1289a = c0095a.i();
                c0091j.f1290b = c0095a.i();
                c0091j.f1291c = 0;
                int i15 = c0095a.i();
                int i16 = c0091j.f1289a;
                if (i16 == 1179011410) {
                    hVar2.q(12);
                    return 0;
                }
                if (i16 != 1414744396 || i15 != 1769369453) {
                    this.f3204h = hVar2.f2534d + ((long) c0091j.f1290b) + 8;
                    return 0;
                }
                long j9 = hVar2.f2534d;
                this.f3206k = j9;
                this.f3207l = j9 + ((long) c0091j.f1290b) + 8;
                if (!this.f3209n) {
                    c cVar2 = this.f3201e;
                    cVar2.getClass();
                    if ((cVar2.f3211b & 16) == 16) {
                        this.f3199c = 4;
                        this.f3204h = this.f3207l;
                        return 0;
                    }
                    this.f3200d.m(new n(this.f3202f));
                    this.f3209n = true;
                }
                this.f3204h = hVar2.f2534d + 12;
                this.f3199c = 6;
                return 0;
            case 4:
                ((F1.h) lVar).a((byte[]) c0095a.f1465c, 0, 8, false);
                c0095a.D(0);
                int i17 = c0095a.i();
                int i18 = c0095a.i();
                if (i17 != 829973609) {
                    this.f3204h = ((F1.h) lVar).f2534d + ((long) i18);
                    return 0;
                }
                this.f3199c = 5;
                this.f3208m = i18;
                return 0;
            case 5:
                C0095a c0095a3 = new C0095a(this.f3208m);
                ((F1.h) lVar).a((byte[]) c0095a3.f1465c, 0, this.f3208m, false);
                if (c0095a3.d() < 16) {
                    j = 0;
                } else {
                    int i19 = c0095a3.f1463a;
                    c0095a3.E(8);
                    long jI = c0095a3.i();
                    long j10 = this.f3206k;
                    j = jI > j10 ? 0L : j10 + 8;
                    c0095a3.D(i19);
                }
                while (c0095a3.d() >= 16) {
                    int i20 = c0095a3.i();
                    int i21 = c0095a3.i();
                    long jI2 = ((long) c0095a3.i()) + j;
                    c0095a3.i();
                    e[] eVarArr = this.f3203g;
                    int length = eVarArr.length;
                    int i22 = 0;
                    while (true) {
                        if (i22 < length) {
                            eVar2 = eVarArr[i22];
                            if (eVar2.f3219b != i20 && eVar2.f3220c != i20) {
                                i22++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        if ((i21 & 16) == 16) {
                            if (eVar2.j == eVar2.f3228l.length) {
                                long[] jArr = eVar2.f3227k;
                                eVar2.f3227k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f3228l;
                                eVar2.f3228l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.f3227k;
                            int i23 = eVar2.j;
                            jArr2[i23] = jI2;
                            eVar2.f3228l[i23] = eVar2.f3226i;
                            i7 = 1;
                            eVar2.j = i23 + 1;
                        } else {
                            i7 = 1;
                        }
                        eVar2.f3226i += i7;
                    }
                }
                for (e eVar4 : this.f3203g) {
                    eVar4.f3227k = Arrays.copyOf(eVar4.f3227k, eVar4.j);
                    eVar4.f3228l = Arrays.copyOf(eVar4.f3228l, eVar4.j);
                }
                this.f3209n = true;
                this.f3200d.m(new n(this, this.f3202f, 2));
                this.f3199c = 6;
                this.f3204h = this.f3206k;
                return 0;
            case 6:
                if (((F1.h) lVar).f2534d >= this.f3207l) {
                    return -1;
                }
                e eVar5 = this.f3205i;
                if (eVar5 != null) {
                    int i24 = eVar5.f3224g;
                    int iD = i24 - eVar5.f3218a.d(lVar, i24, false);
                    eVar5.f3224g = iD;
                    boolean z7 = iD == 0;
                    if (z7) {
                        if (eVar5.f3223f > 0) {
                            int i25 = eVar5.f3225h;
                            eVar5.f3218a.e((eVar5.f3221d * ((long) i25)) / ((long) eVar5.f3222e), Arrays.binarySearch(eVar5.f3228l, i25) >= 0 ? 1 : 0, eVar5.f3223f, 0, null);
                        }
                        eVar5.f3225h++;
                    }
                    if (!z7) {
                        return 0;
                    }
                    this.f3205i = null;
                    return 0;
                }
                F1.h hVar3 = (F1.h) lVar;
                if ((hVar3.f2534d & 1) == 1) {
                    hVar3.q(1);
                }
                hVar3.c((byte[]) c0095a.f1465c, 0, 12, false);
                c0095a.D(0);
                int i26 = c0095a.i();
                if (i26 == 1414744396) {
                    c0095a.D(8);
                    hVar3.q(c0095a.i() == 1769369453 ? 12 : 8);
                    hVar3.f2536f = 0;
                    return 0;
                }
                int i27 = c0095a.i();
                if (i26 == 1263424842) {
                    this.f3204h = hVar3.f2534d + ((long) i27) + 8;
                    return 0;
                }
                hVar3.q(8);
                hVar3.f2536f = 0;
                for (e eVar6 : this.f3203g) {
                    if (eVar6.f3219b == i26 || eVar6.f3220c == i26) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f3204h = hVar3.f2534d + ((long) i27);
                            return 0;
                        }
                        eVar3.f3223f = i27;
                        eVar3.f3224g = i27;
                        this.f3205i = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f3204h = hVar3.f2534d + ((long) i27);
                    return 0;
                }
                eVar3.f3223f = i27;
                eVar3.f3224g = i27;
                this.f3205i = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f3204h = -1L;
        this.f3205i = null;
        for (e eVar : this.f3203g) {
            if (eVar.j == 0) {
                eVar.f3225h = 0;
            } else {
                eVar.f3225h = eVar.f3228l[t.f(eVar.f3227k, j, true)];
            }
        }
        if (j != 0) {
            this.f3199c = 6;
        } else if (this.f3203g.length == 0) {
            this.f3199c = 0;
        } else {
            this.f3199c = 3;
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
