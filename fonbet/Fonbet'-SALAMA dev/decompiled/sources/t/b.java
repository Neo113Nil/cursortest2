package t;

import e1.k;
import java.util.ArrayList;
import w1.C1726n0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final C1602a f16226d;

    /* renamed from: a, reason: collision with root package name */
    public f f16223a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f16224b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16225c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f16227e = false;

    public b(C1726n0 c1726n0) {
        this.f16226d = new C1602a(this, c1726n0);
    }

    public final void a(c cVar, int i7) {
        this.f16226d.g(cVar.j(i7), 1.0f);
        this.f16226d.g(cVar.j(i7), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i7) {
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            this.f16224b = i7;
        }
        if (z4) {
            this.f16226d.g(fVar, 1.0f);
            this.f16226d.g(fVar2, -1.0f);
            this.f16226d.g(fVar3, -1.0f);
        } else {
            this.f16226d.g(fVar, -1.0f);
            this.f16226d.g(fVar2, 1.0f);
            this.f16226d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i7) {
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            this.f16224b = i7;
        }
        if (z4) {
            this.f16226d.g(fVar, 1.0f);
            this.f16226d.g(fVar2, -1.0f);
            this.f16226d.g(fVar3, 1.0f);
        } else {
            this.f16226d.g(fVar, -1.0f);
            this.f16226d.g(fVar2, 1.0f);
            this.f16226d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f16223a == null && this.f16224b == 0.0f && this.f16226d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i7;
        int d7 = this.f16226d.d();
        f fVar2 = null;
        float f7 = 0.0f;
        for (int i8 = 0; i8 < d7; i8++) {
            float f8 = this.f16226d.f(i8);
            if (f8 < 0.0f) {
                f e7 = this.f16226d.e(i8);
                if ((zArr == null || !zArr[e7.f16253b]) && e7 != fVar && (((i7 = e7.f16251C) == 3 || i7 == 4) && f8 < f7)) {
                    f7 = f8;
                    fVar2 = e7;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f16223a;
        if (fVar2 != null) {
            this.f16226d.g(fVar2, -1.0f);
            this.f16223a.f16254c = -1;
            this.f16223a = null;
        }
        float h6 = this.f16226d.h(fVar, true) * (-1.0f);
        this.f16223a = fVar;
        if (h6 == 1.0f) {
            return;
        }
        this.f16224b /= h6;
        C1602a c1602a = this.f16226d;
        int i7 = c1602a.f16221h;
        for (int i8 = 0; i7 != -1 && i8 < c1602a.f16214a; i8++) {
            float[] fArr = c1602a.f16220g;
            fArr[i7] = fArr[i7] / h6;
            i7 = c1602a.f16219f[i7];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar == null || !fVar.f16257f) {
            return;
        }
        float c3 = this.f16226d.c(fVar);
        this.f16224b = (fVar.f16256e * c3) + this.f16224b;
        this.f16226d.h(fVar, z4);
        if (z4) {
            fVar.b(this);
        }
        if (this.f16226d.d() == 0) {
            this.f16227e = true;
            cVar.f16230a = true;
        }
    }

    public void i(c cVar, b bVar, boolean z4) {
        C1602a c1602a = this.f16226d;
        c1602a.getClass();
        float c3 = c1602a.c(bVar.f16223a);
        c1602a.h(bVar.f16223a, z4);
        C1602a c1602a2 = bVar.f16226d;
        int d7 = c1602a2.d();
        for (int i7 = 0; i7 < d7; i7++) {
            f e7 = c1602a2.e(i7);
            c1602a.a(e7, c1602a2.c(e7) * c3, z4);
        }
        this.f16224b = (bVar.f16224b * c3) + this.f16224b;
        if (z4) {
            bVar.f16223a.b(this);
        }
        if (this.f16223a == null || this.f16226d.d() != 0) {
            return;
        }
        this.f16227e = true;
        cVar.f16230a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z4;
        String e7 = k.e(this.f16223a == null ? "0" : "" + this.f16223a, " = ");
        if (this.f16224b != 0.0f) {
            StringBuilder c3 = e.c(e7);
            c3.append(this.f16224b);
            e7 = c3.toString();
            z4 = true;
        } else {
            z4 = false;
        }
        int d7 = this.f16226d.d();
        for (int i7 = 0; i7 < d7; i7++) {
            f e8 = this.f16226d.e(i7);
            if (e8 != null) {
                float f7 = this.f16226d.f(i7);
                if (f7 != 0.0f) {
                    String fVar = e8.toString();
                    if (!z4) {
                        if (f7 < 0.0f) {
                            e7 = k.e(e7, "- ");
                            f7 *= -1.0f;
                        }
                        e7 = f7 == 1.0f ? k.e(e7, fVar) : e7 + f7 + " " + fVar;
                        z4 = true;
                    } else if (f7 > 0.0f) {
                        e7 = k.e(e7, " + ");
                        if (f7 == 1.0f) {
                        }
                        z4 = true;
                    } else {
                        e7 = k.e(e7, " - ");
                        f7 *= -1.0f;
                        if (f7 == 1.0f) {
                        }
                        z4 = true;
                    }
                }
            }
        }
        return !z4 ? k.e(e7, "0.0") : e7;
    }
}
