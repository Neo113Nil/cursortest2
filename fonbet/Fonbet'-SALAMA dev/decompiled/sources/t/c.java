package t;

import d6.C0977k;
import java.util.ArrayList;
import java.util.Arrays;
import v.C1652c;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f16228p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f16229q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final d f16232c;

    /* renamed from: f, reason: collision with root package name */
    public b[] f16235f;

    /* renamed from: l, reason: collision with root package name */
    public final C1726n0 f16240l;

    /* renamed from: o, reason: collision with root package name */
    public b f16243o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16230a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f16231b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16233d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f16234e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16236g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f16237h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f16238i = 1;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f16239k = 32;

    /* renamed from: m, reason: collision with root package name */
    public f[] f16241m = new f[f16229q];

    /* renamed from: n, reason: collision with root package name */
    public int f16242n = 0;

    public c() {
        this.f16235f = null;
        this.f16235f = new b[32];
        s();
        C1726n0 c1726n0 = new C1726n0(23);
        c1726n0.f17805b = new O.c();
        c1726n0.f17806c = new O.c();
        c1726n0.f17807d = new f[32];
        this.f16240l = c1726n0;
        d dVar = new d(c1726n0);
        dVar.f16244f = new f[128];
        dVar.f16245g = new f[128];
        dVar.f16246h = 0;
        dVar.f16247i = new C0977k(dVar);
        this.f16232c = dVar;
        this.f16243o = new b(c1726n0);
    }

    public static int n(Object obj) {
        f fVar = ((C1652c) obj).f16911i;
        if (fVar != null) {
            return (int) (fVar.f16256e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i7) {
        O.c cVar = (O.c) this.f16240l.f17806c;
        int i8 = cVar.f4827b;
        f fVar = null;
        if (i8 > 0) {
            int i9 = i8 - 1;
            ?? r32 = cVar.f4826a;
            ?? r42 = r32[i9];
            r32[i9] = 0;
            cVar.f4827b = i9;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i7);
            fVar2.f16251C = i7;
        } else {
            fVar2.c();
            fVar2.f16251C = i7;
        }
        int i10 = this.f16242n;
        int i11 = f16229q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f16229q = i12;
            this.f16241m = (f[]) Arrays.copyOf(this.f16241m, i12);
        }
        f[] fVarArr = this.f16241m;
        int i13 = this.f16242n;
        this.f16242n = i13 + 1;
        fVarArr[i13] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i7, float f7, f fVar3, f fVar4, int i8, int i9) {
        b l7 = l();
        if (fVar2 == fVar3) {
            l7.f16226d.g(fVar, 1.0f);
            l7.f16226d.g(fVar4, 1.0f);
            l7.f16226d.g(fVar2, -2.0f);
        } else if (f7 == 0.5f) {
            l7.f16226d.g(fVar, 1.0f);
            l7.f16226d.g(fVar2, -1.0f);
            l7.f16226d.g(fVar3, -1.0f);
            l7.f16226d.g(fVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                l7.f16224b = (-i7) + i8;
            }
        } else if (f7 <= 0.0f) {
            l7.f16226d.g(fVar, -1.0f);
            l7.f16226d.g(fVar2, 1.0f);
            l7.f16224b = i7;
        } else if (f7 >= 1.0f) {
            l7.f16226d.g(fVar4, -1.0f);
            l7.f16226d.g(fVar3, 1.0f);
            l7.f16224b = -i8;
        } else {
            float f8 = 1.0f - f7;
            l7.f16226d.g(fVar, f8 * 1.0f);
            l7.f16226d.g(fVar2, f8 * (-1.0f));
            l7.f16226d.g(fVar3, (-1.0f) * f7);
            l7.f16226d.g(fVar4, 1.0f * f7);
            if (i7 > 0 || i8 > 0) {
                l7.f16224b = (i8 * f7) + ((-i7) * f8);
            }
        }
        if (i9 != 8) {
            l7.a(this, i9);
        }
        c(l7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d0, code lost:
    
        if (r4.f16250B <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r4.f16250B <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        if (r4.f16250B <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ff, code lost:
    
        if (r4.f16250B <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b bVar) {
        boolean z4;
        boolean z7;
        f fVar;
        f f7;
        ArrayList arrayList;
        if (this.j + 1 >= this.f16239k || this.f16238i + 1 >= this.f16234e) {
            o();
        }
        if (bVar.f16227e) {
            z4 = false;
        } else {
            if (this.f16235f.length != 0) {
                boolean z8 = false;
                while (!z8) {
                    int d7 = bVar.f16226d.d();
                    int i7 = 0;
                    while (true) {
                        arrayList = bVar.f16225c;
                        if (i7 >= d7) {
                            break;
                        }
                        f e7 = bVar.f16226d.e(i7);
                        if (e7.f16254c != -1 || e7.f16257f) {
                            arrayList.add(e7);
                        }
                        i7++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i8 = 0; i8 < size; i8++) {
                            f fVar2 = (f) arrayList.get(i8);
                            if (fVar2.f16257f) {
                                bVar.h(this, fVar2, true);
                            } else {
                                bVar.i(this, this.f16235f[fVar2.f16254c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z8 = true;
                    }
                }
                if (bVar.f16223a != null && bVar.f16226d.d() == 0) {
                    bVar.f16227e = true;
                    this.f16230a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f8 = bVar.f16224b;
            if (f8 < 0.0f) {
                bVar.f16224b = f8 * (-1.0f);
                C1602a c1602a = bVar.f16226d;
                int i9 = c1602a.f16221h;
                for (int i10 = 0; i9 != -1 && i10 < c1602a.f16214a; i10++) {
                    float[] fArr = c1602a.f16220g;
                    fArr[i9] = fArr[i9] * (-1.0f);
                    i9 = c1602a.f16219f[i9];
                }
            }
            int d8 = bVar.f16226d.d();
            float f9 = 0.0f;
            float f10 = 0.0f;
            f fVar3 = null;
            f fVar4 = null;
            boolean z9 = false;
            boolean z10 = false;
            for (int i11 = 0; i11 < d8; i11++) {
                float f11 = bVar.f16226d.f(i11);
                f e8 = bVar.f16226d.e(i11);
                if (e8.f16251C == 1) {
                    if (fVar3 != null) {
                        if (f9 <= f11) {
                            if (!z9) {
                                if (e8.f16250B > 1) {
                                }
                            }
                        }
                        z9 = true;
                    }
                    fVar3 = e8;
                    f9 = f11;
                } else if (fVar3 == null && f11 < 0.0f) {
                    if (fVar4 != null) {
                        if (f10 <= f11) {
                            if (!z10) {
                                if (e8.f16250B > 1) {
                                }
                            }
                        }
                        z10 = true;
                    }
                    fVar4 = e8;
                    f10 = f11;
                }
            }
            if (fVar3 == null) {
                fVar3 = fVar4;
            }
            if (fVar3 == null) {
                z7 = true;
            } else {
                bVar.g(fVar3);
                z7 = false;
            }
            if (bVar.f16226d.d() == 0) {
                bVar.f16227e = true;
            }
            if (z7) {
                if (this.f16238i + 1 >= this.f16234e) {
                    o();
                }
                f a2 = a(3);
                int i12 = this.f16231b + 1;
                this.f16231b = i12;
                this.f16238i++;
                a2.f16253b = i12;
                C1726n0 c1726n0 = this.f16240l;
                ((f[]) c1726n0.f17807d)[i12] = a2;
                bVar.f16223a = a2;
                int i13 = this.j;
                h(bVar);
                if (this.j == i13 + 1) {
                    b bVar2 = this.f16243o;
                    bVar2.f16223a = null;
                    bVar2.f16226d.b();
                    for (int i14 = 0; i14 < bVar.f16226d.d(); i14++) {
                        bVar2.f16226d.a(bVar.f16226d.e(i14), bVar.f16226d.f(i14), true);
                    }
                    r(this.f16243o);
                    if (a2.f16254c == -1) {
                        if (bVar.f16223a == a2 && (f7 = bVar.f(null, a2)) != null) {
                            bVar.g(f7);
                        }
                        if (!bVar.f16227e) {
                            bVar.f16223a.f(this, bVar);
                        }
                        ((O.c) c1726n0.f17805b).b(bVar);
                        this.j--;
                    }
                    z4 = true;
                    fVar = bVar.f16223a;
                    if (fVar != null) {
                        return;
                    }
                    if (fVar.f16251C != 1 && bVar.f16224b < 0.0f) {
                        return;
                    }
                }
            }
            z4 = false;
            fVar = bVar.f16223a;
            if (fVar != null) {
            }
        }
        if (z4) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i7) {
        int i8 = fVar.f16254c;
        if (i8 == -1) {
            fVar.d(this, i7);
            for (int i9 = 0; i9 < this.f16231b + 1; i9++) {
                f fVar2 = ((f[]) this.f16240l.f17807d)[i9];
            }
            return;
        }
        if (i8 == -1) {
            b l7 = l();
            l7.f16223a = fVar;
            float f7 = i7;
            fVar.f16256e = f7;
            l7.f16224b = f7;
            l7.f16227e = true;
            c(l7);
            return;
        }
        b bVar = this.f16235f[i8];
        if (bVar.f16227e) {
            bVar.f16224b = i7;
            return;
        }
        if (bVar.f16226d.d() == 0) {
            bVar.f16227e = true;
            bVar.f16224b = i7;
            return;
        }
        b l8 = l();
        if (i7 < 0) {
            l8.f16224b = i7 * (-1);
            l8.f16226d.g(fVar, 1.0f);
        } else {
            l8.f16224b = i7;
            l8.f16226d.g(fVar, -1.0f);
        }
        c(l8);
    }

    public final void e(f fVar, f fVar2, int i7, int i8) {
        if (i8 == 8 && fVar2.f16257f && fVar.f16254c == -1) {
            fVar.d(this, fVar2.f16256e + i7);
            return;
        }
        b l7 = l();
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            l7.f16224b = i7;
        }
        if (z4) {
            l7.f16226d.g(fVar, 1.0f);
            l7.f16226d.g(fVar2, -1.0f);
        } else {
            l7.f16226d.g(fVar, -1.0f);
            l7.f16226d.g(fVar2, 1.0f);
        }
        if (i8 != 8) {
            l7.a(this, i8);
        }
        c(l7);
    }

    public final void f(f fVar, f fVar2, int i7, int i8) {
        b l7 = l();
        f m7 = m();
        m7.f16255d = 0;
        l7.b(fVar, fVar2, m7, i7);
        if (i8 != 8) {
            l7.f16226d.g(j(i8), (int) (l7.f16226d.c(m7) * (-1.0f)));
        }
        c(l7);
    }

    public final void g(f fVar, f fVar2, int i7, int i8) {
        b l7 = l();
        f m7 = m();
        m7.f16255d = 0;
        l7.c(fVar, fVar2, m7, i7);
        if (i8 != 8) {
            l7.f16226d.g(j(i8), (int) (l7.f16226d.c(m7) * (-1.0f)));
        }
        c(l7);
    }

    public final void h(b bVar) {
        int i7;
        if (bVar.f16227e) {
            bVar.f16223a.d(this, bVar.f16224b);
        } else {
            b[] bVarArr = this.f16235f;
            int i8 = this.j;
            bVarArr[i8] = bVar;
            f fVar = bVar.f16223a;
            fVar.f16254c = i8;
            this.j = i8 + 1;
            fVar.f(this, bVar);
        }
        if (this.f16230a) {
            int i9 = 0;
            while (i9 < this.j) {
                if (this.f16235f[i9] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f16235f[i9];
                if (bVar2 != null && bVar2.f16227e) {
                    bVar2.f16223a.d(this, bVar2.f16224b);
                    ((O.c) this.f16240l.f17805b).b(bVar2);
                    this.f16235f[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.j;
                        if (i10 >= i7) {
                            break;
                        }
                        b[] bVarArr2 = this.f16235f;
                        int i12 = i10 - 1;
                        b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        f fVar2 = bVar3.f16223a;
                        if (fVar2.f16254c == i10) {
                            fVar2.f16254c = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f16235f[i11] = null;
                    }
                    this.j = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f16230a = false;
        }
    }

    public final void i() {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f16235f[i7];
            bVar.f16223a.f16256e = bVar.f16224b;
        }
    }

    public final f j(int i7) {
        if (this.f16238i + 1 >= this.f16234e) {
            o();
        }
        f a2 = a(4);
        int i8 = this.f16231b + 1;
        this.f16231b = i8;
        this.f16238i++;
        a2.f16253b = i8;
        a2.f16255d = i7;
        ((f[]) this.f16240l.f17807d)[i8] = a2;
        d dVar = this.f16232c;
        dVar.f16247i.f12441b = a2;
        float[] fArr = a2.f16259y;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f16255d] = 1.0f;
        dVar.j(a2);
        return a2;
    }

    public final f k(Object obj) {
        f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f16238i + 1 >= this.f16234e) {
            o();
        }
        if (obj instanceof C1652c) {
            C1652c c1652c = (C1652c) obj;
            fVar = c1652c.f16911i;
            if (fVar == null) {
                c1652c.k();
                fVar = c1652c.f16911i;
            }
            int i7 = fVar.f16253b;
            C1726n0 c1726n0 = this.f16240l;
            if (i7 == -1 || i7 > this.f16231b || ((f[]) c1726n0.f17807d)[i7] == null) {
                if (i7 != -1) {
                    fVar.c();
                }
                int i8 = this.f16231b + 1;
                this.f16231b = i8;
                this.f16238i++;
                fVar.f16253b = i8;
                fVar.f16251C = 1;
                ((f[]) c1726n0.f17807d)[i8] = fVar;
            }
        }
        return fVar;
    }

    public final b l() {
        Object obj;
        C1726n0 c1726n0 = this.f16240l;
        O.c cVar = (O.c) c1726n0.f17805b;
        int i7 = cVar.f4827b;
        if (i7 > 0) {
            int i8 = i7 - 1;
            Object[] objArr = cVar.f4826a;
            obj = objArr[i8];
            objArr[i8] = null;
            cVar.f4827b = i8;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(c1726n0);
        }
        bVar.f16223a = null;
        bVar.f16226d.b();
        bVar.f16224b = 0.0f;
        bVar.f16227e = false;
        return bVar;
    }

    public final f m() {
        if (this.f16238i + 1 >= this.f16234e) {
            o();
        }
        f a2 = a(3);
        int i7 = this.f16231b + 1;
        this.f16231b = i7;
        this.f16238i++;
        a2.f16253b = i7;
        ((f[]) this.f16240l.f17807d)[i7] = a2;
        return a2;
    }

    public final void o() {
        int i7 = this.f16233d * 2;
        this.f16233d = i7;
        this.f16235f = (b[]) Arrays.copyOf(this.f16235f, i7);
        C1726n0 c1726n0 = this.f16240l;
        c1726n0.f17807d = (f[]) Arrays.copyOf((f[]) c1726n0.f17807d, this.f16233d);
        int i8 = this.f16233d;
        this.f16237h = new boolean[i8];
        this.f16234e = i8;
        this.f16239k = i8;
    }

    public final void p() {
        d dVar = this.f16232c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f16236g) {
            q(dVar);
            return;
        }
        for (int i7 = 0; i7 < this.j; i7++) {
            if (!this.f16235f[i7].f16227e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        int i7 = 0;
        while (true) {
            if (i7 >= this.j) {
                break;
            }
            b bVar = this.f16235f[i7];
            int i8 = 1;
            if (bVar.f16223a.f16251C != 1) {
                float f7 = 0.0f;
                if (bVar.f16224b < 0.0f) {
                    boolean z4 = false;
                    int i9 = 0;
                    while (!z4) {
                        i9 += i8;
                        float f8 = Float.MAX_VALUE;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < this.j) {
                            b bVar2 = this.f16235f[i12];
                            if (bVar2.f16223a.f16251C != i8 && !bVar2.f16227e && bVar2.f16224b < f7) {
                                int d7 = bVar2.f16226d.d();
                                int i14 = 0;
                                while (i14 < d7) {
                                    f e7 = bVar2.f16226d.e(i14);
                                    float c3 = bVar2.f16226d.c(e7);
                                    if (c3 > f7) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f9 = e7.f16258x[i15] / c3;
                                            if ((f9 < f8 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i11 = e7.f16253b;
                                                i10 = i12;
                                                f8 = f9;
                                            }
                                        }
                                    }
                                    i14++;
                                    f7 = 0.0f;
                                }
                            }
                            i12++;
                            f7 = 0.0f;
                            i8 = 1;
                        }
                        if (i10 != -1) {
                            b bVar3 = this.f16235f[i10];
                            bVar3.f16223a.f16254c = -1;
                            bVar3.g(((f[]) this.f16240l.f17807d)[i11]);
                            f fVar = bVar3.f16223a;
                            fVar.f16254c = i10;
                            fVar.f(this, bVar3);
                        } else {
                            z4 = true;
                        }
                        if (i9 > this.f16238i / 2) {
                            z4 = true;
                        }
                        f7 = 0.0f;
                        i8 = 1;
                    }
                }
            }
            i7++;
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z4;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f16238i; i8++) {
            this.f16237h[i8] = false;
        }
        boolean z7 = false;
        int i9 = 0;
        while (!z7) {
            int i10 = 1;
            i9++;
            if (i9 >= this.f16238i * 2) {
                return;
            }
            f fVar = bVar.f16223a;
            if (fVar != null) {
                this.f16237h[fVar.f16253b] = true;
            }
            f d7 = bVar.d(this.f16237h);
            if (d7 != null) {
                boolean[] zArr = this.f16237h;
                int i11 = d7.f16253b;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (d7 != null) {
                float f7 = Float.MAX_VALUE;
                int i12 = i7;
                int i13 = -1;
                while (i12 < this.j) {
                    b bVar2 = this.f16235f[i12];
                    if (bVar2.f16223a.f16251C != i10 && !bVar2.f16227e) {
                        C1602a c1602a = bVar2.f16226d;
                        int i14 = c1602a.f16221h;
                        if (i14 != -1) {
                            for (int i15 = 0; i14 != -1 && i15 < c1602a.f16214a; i15++) {
                                if (c1602a.f16218e[i14] == d7.f16253b) {
                                    z4 = true;
                                    break;
                                }
                                i14 = c1602a.f16219f[i14];
                            }
                        }
                        z4 = false;
                        if (z4) {
                            float c3 = bVar2.f16226d.c(d7);
                            if (c3 < 0.0f) {
                                float f8 = (-bVar2.f16224b) / c3;
                                if (f8 < f7) {
                                    f7 = f8;
                                    i13 = i12;
                                }
                            }
                        }
                    }
                    i12++;
                    i10 = 1;
                }
                if (i13 > -1) {
                    b bVar3 = this.f16235f[i13];
                    bVar3.f16223a.f16254c = -1;
                    bVar3.g(d7);
                    f fVar2 = bVar3.f16223a;
                    fVar2.f16254c = i13;
                    fVar2.f(this, bVar3);
                }
            } else {
                z7 = true;
            }
            i7 = 0;
        }
    }

    public final void s() {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f16235f[i7];
            if (bVar != null) {
                ((O.c) this.f16240l.f17805b).b(bVar);
            }
            this.f16235f[i7] = null;
        }
    }

    public final void t() {
        C1726n0 c1726n0;
        int i7 = 0;
        while (true) {
            c1726n0 = this.f16240l;
            f[] fVarArr = (f[]) c1726n0.f17807d;
            if (i7 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i7];
            if (fVar != null) {
                fVar.c();
            }
            i7++;
        }
        O.c cVar = (O.c) c1726n0.f17806c;
        f[] fVarArr2 = this.f16241m;
        int i8 = this.f16242n;
        cVar.getClass();
        if (i8 > fVarArr2.length) {
            i8 = fVarArr2.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            f fVar2 = fVarArr2[i9];
            int i10 = cVar.f4827b;
            Object[] objArr = cVar.f4826a;
            if (i10 < objArr.length) {
                objArr[i10] = fVar2;
                cVar.f4827b = i10 + 1;
            }
        }
        this.f16242n = 0;
        Arrays.fill((f[]) c1726n0.f17807d, (Object) null);
        this.f16231b = 0;
        d dVar = this.f16232c;
        dVar.f16246h = 0;
        dVar.f16224b = 0.0f;
        this.f16238i = 1;
        for (int i11 = 0; i11 < this.j; i11++) {
            b bVar = this.f16235f[i11];
        }
        s();
        this.j = 0;
        this.f16243o = new b(c1726n0);
    }
}
