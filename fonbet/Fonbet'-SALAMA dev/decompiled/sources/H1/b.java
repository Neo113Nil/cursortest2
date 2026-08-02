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
import java.util.ArrayList;
import java.util.Arrays;
import v2.i;
import v2.t;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: c, reason: collision with root package name */
    public int f3199c;

    /* renamed from: e, reason: collision with root package name */
    public c f3201e;

    /* renamed from: h, reason: collision with root package name */
    public long f3204h;

    /* renamed from: i, reason: collision with root package name */
    public e f3205i;

    /* renamed from: m, reason: collision with root package name */
    public int f3208m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3209n;

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f3197a = new C0095a(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0091j f3198b = new C0091j();

    /* renamed from: d, reason: collision with root package name */
    public m f3200d = new V(4);

    /* renamed from: g, reason: collision with root package name */
    public e[] f3203g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f3206k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f3207l = -1;
    public int j = -1;

    /* renamed from: f, reason: collision with root package name */
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        boolean z4;
        e eVar;
        long j;
        int i7;
        e eVar2;
        int i8;
        long j3 = this.f3204h;
        if (j3 != -1) {
            long j7 = ((F1.h) lVar).f2534d;
            if (j3 < j7 || j3 > 262144 + j7) {
                yVar.f2247a = j3;
                z4 = true;
                this.f3204h = -1L;
                if (!z4) {
                    return 1;
                }
                int i9 = this.f3199c;
                C0091j c0091j = this.f3198b;
                C0095a c0095a = this.f3197a;
                e eVar3 = null;
                switch (i9) {
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
                        int i10 = c0095a.i();
                        c0091j.f1291c = i10;
                        if (i10 == 1819436136) {
                            this.j = c0091j.f1290b;
                            this.f3199c = 2;
                            return 0;
                        }
                        throw C0045t0.a(null, "hdrl expected, found: " + c0091j.f1291c);
                    case 2:
                        int i11 = this.j - 4;
                        C0095a c0095a2 = new C0095a(i11);
                        ((F1.h) lVar).a((byte[]) c0095a2.f1465c, 0, i11, false);
                        f b7 = f.b(1819436136, c0095a2);
                        int i12 = b7.f3230b;
                        if (i12 != 1819436136) {
                            throw C0045t0.a(null, "Unexpected header list type " + i12);
                        }
                        c cVar = (c) b7.a(c.class);
                        if (cVar == null) {
                            throw C0045t0.a(null, "AviHeader not found");
                        }
                        this.f3201e = cVar;
                        this.f3202f = cVar.f3212c * cVar.f3210a;
                        ArrayList arrayList = new ArrayList();
                        C0165x listIterator = b7.f3229a.listIterator(0);
                        int i13 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i14 = i13 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    Log.w("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    Log.w("AviExtractor", "Missing Stream Format");
                                } else {
                                    long K7 = t.K(dVar.f3216d, dVar.f3214b * 1000000, dVar.f3215c);
                                    X x4 = gVar.f3231a;
                                    Format$Builder a2 = x4.a();
                                    a2.f10528a = Integer.toString(i13);
                                    int i15 = dVar.f3217e;
                                    if (i15 != 0) {
                                        a2.f10538l = i15;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.f10529b = hVar.f3232a;
                                    }
                                    int g3 = i.g(x4.f283C);
                                    if (g3 == 1 || g3 == 2) {
                                        v r7 = this.f3200d.r(i13, g3);
                                        r7.a(new X(a2));
                                        eVar = new e(i13, g3, K7, dVar.f3216d, r7);
                                        this.f3202f = K7;
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i13 = i14;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i13 = i14;
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
                        int i16 = c0095a.i();
                        int i17 = c0091j.f1289a;
                        if (i17 == 1179011410) {
                            hVar2.q(12);
                            return 0;
                        }
                        if (i17 != 1414744396 || i16 != 1769369453) {
                            this.f3204h = hVar2.f2534d + c0091j.f1290b + 8;
                            return 0;
                        }
                        long j9 = hVar2.f2534d;
                        this.f3206k = j9;
                        this.f3207l = j9 + c0091j.f1290b + 8;
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
                        int i18 = c0095a.i();
                        int i19 = c0095a.i();
                        if (i18 != 829973609) {
                            this.f3204h = ((F1.h) lVar).f2534d + i19;
                            return 0;
                        }
                        this.f3199c = 5;
                        this.f3208m = i19;
                        return 0;
                    case 5:
                        C0095a c0095a3 = new C0095a(this.f3208m);
                        ((F1.h) lVar).a((byte[]) c0095a3.f1465c, 0, this.f3208m, false);
                        if (c0095a3.d() < 16) {
                            j = 0;
                        } else {
                            int i20 = c0095a3.f1463a;
                            c0095a3.E(8);
                            long i21 = c0095a3.i();
                            long j10 = this.f3206k;
                            j = i21 > j10 ? 0L : j10 + 8;
                            c0095a3.D(i20);
                        }
                        while (c0095a3.d() >= 16) {
                            int i22 = c0095a3.i();
                            int i23 = c0095a3.i();
                            long i24 = c0095a3.i() + j;
                            c0095a3.i();
                            e[] eVarArr = this.f3203g;
                            int length = eVarArr.length;
                            while (true) {
                                if (i7 < length) {
                                    eVar2 = eVarArr[i7];
                                    i7 = (eVar2.f3219b == i22 || eVar2.f3220c == i22) ? 0 : i7 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                if ((i23 & 16) == 16) {
                                    if (eVar2.j == eVar2.f3228l.length) {
                                        long[] jArr = eVar2.f3227k;
                                        eVar2.f3227k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.f3228l;
                                        eVar2.f3228l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.f3227k;
                                    int i25 = eVar2.j;
                                    jArr2[i25] = i24;
                                    eVar2.f3228l[i25] = eVar2.f3226i;
                                    i8 = 1;
                                    eVar2.j = i25 + 1;
                                } else {
                                    i8 = 1;
                                }
                                eVar2.f3226i += i8;
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
                            int i26 = eVar5.f3224g;
                            int d7 = i26 - eVar5.f3218a.d(lVar, i26, false);
                            eVar5.f3224g = d7;
                            boolean z7 = d7 == 0;
                            if (z7) {
                                if (eVar5.f3223f > 0) {
                                    int i27 = eVar5.f3225h;
                                    eVar5.f3218a.e((eVar5.f3221d * i27) / eVar5.f3222e, Arrays.binarySearch(eVar5.f3228l, i27) >= 0 ? 1 : 0, eVar5.f3223f, 0, null);
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
                        int i28 = c0095a.i();
                        if (i28 == 1414744396) {
                            c0095a.D(8);
                            hVar3.q(c0095a.i() == 1769369453 ? 12 : 8);
                            hVar3.f2536f = 0;
                            return 0;
                        }
                        int i29 = c0095a.i();
                        if (i28 == 1263424842) {
                            this.f3204h = hVar3.f2534d + i29 + 8;
                            return 0;
                        }
                        hVar3.q(8);
                        hVar3.f2536f = 0;
                        for (e eVar6 : this.f3203g) {
                            if (eVar6.f3219b == i28 || eVar6.f3220c == i28) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.f3204h = hVar3.f2534d + i29;
                                    return 0;
                                }
                                eVar3.f3223f = i29;
                                eVar3.f3224g = i29;
                                this.f3205i = eVar3;
                                return 0;
                            }
                        }
                        if (eVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                ((F1.h) lVar).q((int) (j3 - j7));
            }
        }
        z4 = false;
        this.f3204h = -1L;
        if (!z4) {
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
