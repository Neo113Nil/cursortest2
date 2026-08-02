package v;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1658i extends C1654e {

    /* renamed from: u0, reason: collision with root package name */
    public float f17049u0 = -1.0f;

    /* renamed from: v0, reason: collision with root package name */
    public int f17050v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public int f17051w0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public C1652c f17052x0 = this.f16927K;

    /* renamed from: y0, reason: collision with root package name */
    public int f17053y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f17054z0;

    public C1658i() {
        this.f16935S.clear();
        this.f16935S.add(this.f17052x0);
        int length = this.f16934R.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f16934R[i7] = this.f17052x0;
        }
    }

    @Override // v.C1654e
    public final boolean B() {
        return this.f17054z0;
    }

    @Override // v.C1654e
    public final boolean C() {
        return this.f17054z0;
    }

    @Override // v.C1654e
    public final void R(t.c cVar, boolean z4) {
        if (this.f16938V == null) {
            return;
        }
        C1652c c1652c = this.f17052x0;
        cVar.getClass();
        int n2 = t.c.n(c1652c);
        if (this.f17053y0 == 1) {
            this.f16944a0 = n2;
            this.f16946b0 = 0;
            M(this.f16938V.l());
            P(0);
            return;
        }
        this.f16944a0 = 0;
        this.f16946b0 = n2;
        P(this.f16938V.r());
        M(0);
    }

    public final void S(int i7) {
        this.f17052x0.l(i7);
        this.f17054z0 = true;
    }

    public final void T(int i7) {
        if (this.f17053y0 == i7) {
            return;
        }
        this.f17053y0 = i7;
        ArrayList arrayList = this.f16935S;
        arrayList.clear();
        if (this.f17053y0 == 1) {
            this.f17052x0 = this.f16926J;
        } else {
            this.f17052x0 = this.f16927K;
        }
        arrayList.add(this.f17052x0);
        C1652c[] c1652cArr = this.f16934R;
        int length = c1652cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            c1652cArr[i8] = this.f17052x0;
        }
    }

    @Override // v.C1654e
    public final void b(t.c cVar, boolean z4) {
        C1655f c1655f = (C1655f) this.f16938V;
        if (c1655f == null) {
            return;
        }
        Object j = c1655f.j(2);
        Object j3 = c1655f.j(4);
        C1654e c1654e = this.f16938V;
        EnumC1653d enumC1653d = EnumC1653d.f16913b;
        boolean z7 = c1654e != null && c1654e.f16937U[0] == enumC1653d;
        if (this.f17053y0 == 0) {
            j = c1655f.j(3);
            j3 = c1655f.j(5);
            C1654e c1654e2 = this.f16938V;
            z7 = c1654e2 != null && c1654e2.f16937U[1] == enumC1653d;
        }
        if (this.f17054z0) {
            C1652c c1652c = this.f17052x0;
            if (c1652c.f16905c) {
                t.f k7 = cVar.k(c1652c);
                cVar.d(k7, this.f17052x0.d());
                if (this.f17050v0 != -1) {
                    if (z7) {
                        cVar.f(cVar.k(j3), k7, 0, 5);
                    }
                } else if (this.f17051w0 != -1 && z7) {
                    t.f k8 = cVar.k(j3);
                    cVar.f(k7, cVar.k(j), 0, 5);
                    cVar.f(k8, k7, 0, 5);
                }
                this.f17054z0 = false;
                return;
            }
        }
        if (this.f17050v0 != -1) {
            t.f k9 = cVar.k(this.f17052x0);
            cVar.e(k9, cVar.k(j), this.f17050v0, 8);
            if (z7) {
                cVar.f(cVar.k(j3), k9, 0, 5);
                return;
            }
            return;
        }
        if (this.f17051w0 != -1) {
            t.f k10 = cVar.k(this.f17052x0);
            t.f k11 = cVar.k(j3);
            cVar.e(k10, k11, -this.f17051w0, 8);
            if (z7) {
                cVar.f(k10, cVar.k(j), 0, 5);
                cVar.f(k11, k10, 0, 5);
                return;
            }
            return;
        }
        if (this.f17049u0 != -1.0f) {
            t.f k12 = cVar.k(this.f17052x0);
            t.f k13 = cVar.k(j3);
            float f7 = this.f17049u0;
            t.b l7 = cVar.l();
            l7.f16226d.g(k12, -1.0f);
            l7.f16226d.g(k13, f7);
            cVar.c(l7);
        }
    }

    @Override // v.C1654e
    public final boolean c() {
        return true;
    }

    @Override // v.C1654e
    public final void g(C1654e c1654e, HashMap hashMap) {
        super.g(c1654e, hashMap);
        C1658i c1658i = (C1658i) c1654e;
        this.f17049u0 = c1658i.f17049u0;
        this.f17050v0 = c1658i.f17050v0;
        this.f17051w0 = c1658i.f17051w0;
        T(c1658i.f17053y0);
    }

    @Override // v.C1654e
    public final C1652c j(int i7) {
        int e7 = t.e.e(i7);
        if (e7 != 1) {
            if (e7 != 2) {
                if (e7 != 3) {
                    if (e7 != 4) {
                        return null;
                    }
                }
            }
            if (this.f17053y0 == 0) {
                return this.f17052x0;
            }
            return null;
        }
        if (this.f17053y0 == 1) {
            return this.f17052x0;
        }
        return null;
    }
}
