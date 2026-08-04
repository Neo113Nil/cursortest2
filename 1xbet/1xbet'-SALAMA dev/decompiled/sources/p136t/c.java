package p136t;

import java.util.ArrayList;
import java.util.Arrays;
import p028d6.k;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f16234p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f16235q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f16238c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f16241f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1017n0 f16246l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f16249o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16236a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16237b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16239d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16240e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16242g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f16243h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16244i = 1;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16245k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f[] f16247m = new f[f16235q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16248n = 0;

    public c() {
        this.f16241f = null;
        this.f16241f = new b[32];
        s();
        C1017n0 c1017n0 = new C1017n0(23);
        c1017n0.f17811b = new O.c();
        c1017n0.f17812c = new O.c();
        c1017n0.f17813d = new f[32];
        this.f16246l = c1017n0;
        d dVar = new d(c1017n0);
        dVar.f16250f = new f[128];
        dVar.f16251g = new f[128];
        dVar.f16252h = 0;
        dVar.f16253i = new k(dVar);
        this.f16238c = dVar;
        this.f16249o = new b(c1017n0);
    }

    public static int n(Object obj) {
        f fVar = ((p149v.c) obj).f16917i;
        if (fVar != null) {
            return (int) (fVar.f16262e + 0.5f);
        }
        return 0;
    }

    public final f a(int i7) {
        O.c cVar = (O.c) this.f16246l.f17812c;
        int i8 = cVar.f4827b;
        Object obj = null;
        if (i8 > 0) {
            int i9 = i8 - 1;
            Object[] objArr = cVar.f4826a;
            Object obj2 = objArr[i9];
            objArr[i9] = null;
            cVar.f4827b = i9;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i7);
            fVar.f16257C = i7;
        } else {
            fVar.c();
            fVar.f16257C = i7;
        }
        int i10 = this.f16248n;
        int i11 = f16235q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f16235q = i12;
            this.f16247m = (f[]) Arrays.copyOf(this.f16247m, i12);
        }
        f[] fVarArr = this.f16247m;
        int i13 = this.f16248n;
        this.f16248n = i13 + 1;
        fVarArr[i13] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i7, float f7, f fVar3, f fVar4, int i8, int i9) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f16232d.g(fVar, 1.0f);
            bVarL.f16232d.g(fVar4, 1.0f);
            bVarL.f16232d.g(fVar2, -2.0f);
        } else if (f7 == 0.5f) {
            bVarL.f16232d.g(fVar, 1.0f);
            bVarL.f16232d.g(fVar2, -1.0f);
            bVarL.f16232d.g(fVar3, -1.0f);
            bVarL.f16232d.g(fVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                bVarL.f16230b = (-i7) + i8;
            }
        } else if (f7 <= 0.0f) {
            bVarL.f16232d.g(fVar, -1.0f);
            bVarL.f16232d.g(fVar2, 1.0f);
            bVarL.f16230b = i7;
        } else if (f7 >= 1.0f) {
            bVarL.f16232d.g(fVar4, -1.0f);
            bVarL.f16232d.g(fVar3, 1.0f);
            bVarL.f16230b = -i8;
        } else {
            float f8 = 1.0f - f7;
            bVarL.f16232d.g(fVar, f8 * 1.0f);
            bVarL.f16232d.g(fVar2, f8 * (-1.0f));
            bVarL.f16232d.g(fVar3, (-1.0f) * f7);
            bVarL.f16232d.g(fVar4, 1.0f * f7);
            if (i7 > 0 || i8 > 0) {
                bVarL.f16230b = (i8 * f7) + ((-i7) * f8);
            }
        }
        if (i9 != 8) {
            bVarL.a(this, i9);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    public final void c(b bVar) {
        boolean z4;
        boolean z7;
        f fVarF;
        ArrayList arrayList;
        if (this.j + 1 >= this.f16245k || this.f16244i + 1 >= this.f16240e) {
            o();
        }
        if (bVar.f16233e) {
            z4 = false;
        } else {
            if (this.f16241f.length != 0) {
                boolean z8 = false;
                while (!z8) {
                    int iD = bVar.f16232d.d();
                    int i7 = 0;
                    while (true) {
                        arrayList = bVar.f16231c;
                        if (i7 >= iD) {
                            break;
                        }
                        f fVarE = bVar.f16232d.e(i7);
                        if (fVarE.f16260c != -1 || fVarE.f16263f) {
                            arrayList.add(fVarE);
                        }
                        i7++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i8 = 0; i8 < size; i8++) {
                            f fVar = (f) arrayList.get(i8);
                            if (fVar.f16263f) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f16241f[fVar.f16260c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z8 = true;
                    }
                }
                if (bVar.f16229a != null && bVar.f16232d.d() == 0) {
                    bVar.f16233e = true;
                    this.f16236a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f7 = bVar.f16230b;
            if (f7 < 0.0f) {
                bVar.f16230b = f7 * (-1.0f);
                a aVar = bVar.f16232d;
                int i9 = aVar.f16227h;
                for (int i10 = 0; i9 != -1 && i10 < aVar.f16220a; i10++) {
                    float[] fArr = aVar.f16226g;
                    fArr[i9] = fArr[i9] * (-1.0f);
                    i9 = aVar.f16225f[i9];
                }
            }
            int iD2 = bVar.f16232d.d();
            float f8 = 0.0f;
            float f9 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            boolean z9 = false;
            boolean z10 = false;
            for (int i11 = 0; i11 < iD2; i11++) {
                float f10 = bVar.f16232d.f(i11);
                f fVarE2 = bVar.f16232d.e(i11);
                if (fVarE2.f16257C == 1) {
                    if (fVar2 == null) {
                        if (fVarE2.f16256B <= 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        fVar2 = fVarE2;
                        f8 = f10;
                    } else {
                        if (f8 > f10) {
                            if (fVarE2.f16256B > 1) {
                                z9 = false;
                            }
                            fVar2 = fVarE2;
                            f8 = f10;
                        } else if (z9 || fVarE2.f16256B > 1) {
                        }
                        z9 = true;
                        fVar2 = fVarE2;
                        f8 = f10;
                    }
                } else if (fVar2 == null && f10 < 0.0f) {
                    if (fVar3 == null) {
                        if (fVarE2.f16256B <= 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fVar3 = fVarE2;
                        f9 = f10;
                    } else {
                        if (f9 > f10) {
                            if (fVarE2.f16256B > 1) {
                                z10 = false;
                            }
                            fVar3 = fVarE2;
                            f9 = f10;
                        } else if (z10 || fVarE2.f16256B > 1) {
                        }
                        z10 = true;
                        fVar3 = fVarE2;
                        f9 = f10;
                    }
                }
            }
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z7 = true;
            } else {
                bVar.g(fVar2);
                z7 = false;
            }
            if (bVar.f16232d.d() == 0) {
                bVar.f16233e = true;
            }
            if (z7) {
                if (this.f16244i + 1 >= this.f16240e) {
                    o();
                }
                f fVarA = a(3);
                int i12 = this.f16237b + 1;
                this.f16237b = i12;
                this.f16244i++;
                fVarA.f16259b = i12;
                C1017n0 c1017n0 = this.f16246l;
                ((f[]) c1017n0.f17813d)[i12] = fVarA;
                bVar.f16229a = fVarA;
                int i13 = this.j;
                h(bVar);
                if (this.j == i13 + 1) {
                    b bVar2 = this.f16249o;
                    bVar2.f16229a = null;
                    bVar2.f16232d.b();
                    for (int i14 = 0; i14 < bVar.f16232d.d(); i14++) {
                        bVar2.f16232d.a(bVar.f16232d.e(i14), bVar.f16232d.f(i14), true);
                    }
                    r(this.f16249o);
                    if (fVarA.f16260c == -1) {
                        if (bVar.f16229a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.f16233e) {
                            bVar.f16229a.f(this, bVar);
                        }
                        ((O.c) c1017n0.f17811b).b(bVar);
                        this.j--;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            f fVar4 = bVar.f16229a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.f16257C != 1 && bVar.f16230b < 0.0f) {
                return;
            }
        }
        if (z4) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i7) {
        int i8 = fVar.f16260c;
        if (i8 == -1) {
            fVar.d(this, i7);
            for (int i9 = 0; i9 < this.f16237b + 1; i9++) {
                f fVar2 = ((f[]) this.f16246l.f17813d)[i9];
            }
            return;
        }
        if (i8 == -1) {
            b bVarL = l();
            bVarL.f16229a = fVar;
            float f7 = i7;
            fVar.f16262e = f7;
            bVarL.f16230b = f7;
            bVarL.f16233e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f16241f[i8];
        if (bVar.f16233e) {
            bVar.f16230b = i7;
            return;
        }
        if (bVar.f16232d.d() == 0) {
            bVar.f16233e = true;
            bVar.f16230b = i7;
            return;
        }
        b bVarL2 = l();
        if (i7 < 0) {
            bVarL2.f16230b = i7 * (-1);
            bVarL2.f16232d.g(fVar, 1.0f);
        } else {
            bVarL2.f16230b = i7;
            bVarL2.f16232d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i7, int i8) {
        if (i8 == 8 && fVar2.f16263f && fVar.f16260c == -1) {
            fVar.d(this, fVar2.f16262e + i7);
            return;
        }
        b bVarL = l();
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            bVarL.f16230b = i7;
        }
        if (z4) {
            bVarL.f16232d.g(fVar, 1.0f);
            bVarL.f16232d.g(fVar2, -1.0f);
        } else {
            bVarL.f16232d.g(fVar, -1.0f);
            bVarL.f16232d.g(fVar2, 1.0f);
        }
        if (i8 != 8) {
            bVarL.a(this, i8);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i7, int i8) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f16261d = 0;
        bVarL.b(fVar, fVar2, fVarM, i7);
        if (i8 != 8) {
            bVarL.f16232d.g(j(i8), (int) (bVarL.f16232d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i7, int i8) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f16261d = 0;
        bVarL.c(fVar, fVar2, fVarM, i7);
        if (i8 != 8) {
            bVarL.f16232d.g(j(i8), (int) (bVarL.f16232d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i7;
        if (bVar.f16233e) {
            bVar.f16229a.d(this, bVar.f16230b);
        } else {
            b[] bVarArr = this.f16241f;
            int i8 = this.j;
            bVarArr[i8] = bVar;
            f fVar = bVar.f16229a;
            fVar.f16260c = i8;
            this.j = i8 + 1;
            fVar.f(this, bVar);
        }
        if (this.f16236a) {
            int i9 = 0;
            while (i9 < this.j) {
                if (this.f16241f[i9] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f16241f[i9];
                if (bVar2 != null && bVar2.f16233e) {
                    bVar2.f16229a.d(this, bVar2.f16230b);
                    ((O.c) this.f16246l.f17811b).b(bVar2);
                    this.f16241f[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.j;
                        if (i10 >= i7) {
                            break;
                        }
                        b[] bVarArr2 = this.f16241f;
                        int i12 = i10 - 1;
                        b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        f fVar2 = bVar3.f16229a;
                        if (fVar2.f16260c == i10) {
                            fVar2.f16260c = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f16241f[i11] = null;
                    }
                    this.j = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f16236a = false;
        }
    }

    public final void i() {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f16241f[i7];
            bVar.f16229a.f16262e = bVar.f16230b;
        }
    }

    public final f j(int i7) {
        if (this.f16244i + 1 >= this.f16240e) {
            o();
        }
        f fVarA = a(4);
        int i8 = this.f16237b + 1;
        this.f16237b = i8;
        this.f16244i++;
        fVarA.f16259b = i8;
        fVarA.f16261d = i7;
        ((f[]) this.f16246l.f17813d)[i8] = fVarA;
        d dVar = this.f16238c;
        dVar.f16253i.f12447b = fVarA;
        float[] fArr = fVarA.f16265y;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f16261d] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f16244i + 1 >= this.f16240e) {
            o();
        }
        if (obj instanceof p149v.c) {
            p149v.c cVar = (p149v.c) obj;
            fVar = cVar.f16917i;
            if (fVar == null) {
                cVar.k();
                fVar = cVar.f16917i;
            }
            int i7 = fVar.f16259b;
            C1017n0 c1017n0 = this.f16246l;
            if (i7 == -1 || i7 > this.f16237b || ((f[]) c1017n0.f17813d)[i7] == null) {
                if (i7 != -1) {
                    fVar.c();
                }
                int i8 = this.f16237b + 1;
                this.f16237b = i8;
                this.f16244i++;
                fVar.f16259b = i8;
                fVar.f16257C = 1;
                ((f[]) c1017n0.f17813d)[i8] = fVar;
            }
        }
        return fVar;
    }

    public final b l() {
        Object obj;
        C1017n0 c1017n0 = this.f16246l;
        O.c cVar = (O.c) c1017n0.f17811b;
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
            return new b(c1017n0);
        }
        bVar.f16229a = null;
        bVar.f16232d.b();
        bVar.f16230b = 0.0f;
        bVar.f16233e = false;
        return bVar;
    }

    public final f m() {
        if (this.f16244i + 1 >= this.f16240e) {
            o();
        }
        f fVarA = a(3);
        int i7 = this.f16237b + 1;
        this.f16237b = i7;
        this.f16244i++;
        fVarA.f16259b = i7;
        ((f[]) this.f16246l.f17813d)[i7] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i7 = this.f16239d * 2;
        this.f16239d = i7;
        this.f16241f = (b[]) Arrays.copyOf(this.f16241f, i7);
        C1017n0 c1017n0 = this.f16246l;
        c1017n0.f17813d = (f[]) Arrays.copyOf((f[]) c1017n0.f17813d, this.f16239d);
        int i8 = this.f16239d;
        this.f16243h = new boolean[i8];
        this.f16240e = i8;
        this.f16245k = i8;
    }

    public final void p() {
        d dVar = this.f16238c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f16242g) {
            q(dVar);
            return;
        }
        for (int i7 = 0; i7 < this.j; i7++) {
            if (!this.f16241f[i7].f16233e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i7 = 0; i7 < this.j; i7++) {
            b bVar = this.f16241f[i7];
            int i8 = 1;
            if (bVar.f16229a.f16257C != 1) {
                float f7 = 0.0f;
                if (bVar.f16230b < 0.0f) {
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
                            b bVar2 = this.f16241f[i12];
                            if (bVar2.f16229a.f16257C != i8 && !bVar2.f16233e && bVar2.f16230b < f7) {
                                int iD = bVar2.f16232d.d();
                                int i14 = 0;
                                while (i14 < iD) {
                                    f fVarE = bVar2.f16232d.e(i14);
                                    float fC = bVar2.f16232d.c(fVarE);
                                    if (fC > f7) {
                                        for (int i15 = 0; i15 < 9; i15++) {
                                            float f9 = fVarE.f16264x[i15] / fC;
                                            if ((f9 < f8 && i15 == i13) || i15 > i13) {
                                                i13 = i15;
                                                i11 = fVarE.f16259b;
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
                            b bVar3 = this.f16241f[i10];
                            bVar3.f16229a.f16260c = -1;
                            bVar3.g(((f[]) this.f16246l.f17813d)[i11]);
                            f fVar = bVar3.f16229a;
                            fVar.f16260c = i10;
                            fVar.f(this, bVar3);
                        } else {
                            z4 = true;
                        }
                        if (i9 > this.f16244i / 2) {
                            z4 = true;
                        }
                        f7 = 0.0f;
                        i8 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z4;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f16244i; i8++) {
            this.f16243h[i8] = false;
        }
        boolean z7 = false;
        int i9 = 0;
        while (!z7) {
            int i10 = 1;
            i9++;
            if (i9 >= this.f16244i * 2) {
                return;
            }
            f fVar = bVar.f16229a;
            if (fVar != null) {
                this.f16243h[fVar.f16259b] = true;
            }
            f fVarD = bVar.d(this.f16243h);
            if (fVarD != null) {
                boolean[] zArr = this.f16243h;
                int i11 = fVarD.f16259b;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (fVarD != null) {
                float f7 = Float.MAX_VALUE;
                int i12 = i7;
                int i13 = -1;
                while (i12 < this.j) {
                    b bVar2 = this.f16241f[i12];
                    if (bVar2.f16229a.f16257C != i10 && !bVar2.f16233e) {
                        a aVar = bVar2.f16232d;
                        int i14 = aVar.f16227h;
                        if (i14 == -1) {
                            z4 = false;
                            break;
                        }
                        int i15 = 0;
                        while (true) {
                            if (i14 == -1 || i15 >= aVar.f16220a) {
                                z4 = false;
                                break;
                            } else if (aVar.f16224e[i14] == fVarD.f16259b) {
                                z4 = true;
                                break;
                            } else {
                                i14 = aVar.f16225f[i14];
                                i15++;
                            }
                        }
                        if (z4) {
                            float fC = bVar2.f16232d.c(fVarD);
                            if (fC < 0.0f) {
                                float f8 = (-bVar2.f16230b) / fC;
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
                    b bVar3 = this.f16241f[i13];
                    bVar3.f16229a.f16260c = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.f16229a;
                    fVar2.f16260c = i13;
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
            b bVar = this.f16241f[i7];
            if (bVar != null) {
                ((O.c) this.f16246l.f17811b).b(bVar);
            }
            this.f16241f[i7] = null;
        }
    }

    public final void t() {
        C1017n0 c1017n0;
        int i7 = 0;
        while (true) {
            c1017n0 = this.f16246l;
            f[] fVarArr = (f[]) c1017n0.f17813d;
            if (i7 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i7];
            if (fVar != null) {
                fVar.c();
            }
            i7++;
        }
        O.c cVar = (O.c) c1017n0.f17812c;
        f[] fVarArr2 = this.f16247m;
        int length = this.f16248n;
        cVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i8 = 0; i8 < length; i8++) {
            f fVar2 = fVarArr2[i8];
            int i9 = cVar.f4827b;
            Object[] objArr = cVar.f4826a;
            if (i9 < objArr.length) {
                objArr[i9] = fVar2;
                cVar.f4827b = i9 + 1;
            }
        }
        this.f16248n = 0;
        Arrays.fill((f[]) c1017n0.f17813d, (Object) null);
        this.f16237b = 0;
        d dVar = this.f16238c;
        dVar.f16252h = 0;
        dVar.f16230b = 0.0f;
        this.f16244i = 1;
        for (int i10 = 0; i10 < this.j; i10++) {
            b bVar = this.f16241f[i10];
        }
        s();
        this.j = 0;
        this.f16249o = new b(c1017n0);
    }
}
