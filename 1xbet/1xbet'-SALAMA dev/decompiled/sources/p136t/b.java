package p136t;

import java.util.ArrayList;
import p031e1.k;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f16232d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f16229a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16230b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16231c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16233e = false;

    public b(C1017n0 c1017n0) {
        this.f16232d = new a(this, c1017n0);
    }

    public final void a(c cVar, int i7) {
        this.f16232d.g(cVar.j(i7), 1.0f);
        this.f16232d.g(cVar.j(i7), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i7) {
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            this.f16230b = i7;
        }
        if (z4) {
            this.f16232d.g(fVar, 1.0f);
            this.f16232d.g(fVar2, -1.0f);
            this.f16232d.g(fVar3, -1.0f);
        } else {
            this.f16232d.g(fVar, -1.0f);
            this.f16232d.g(fVar2, 1.0f);
            this.f16232d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i7) {
        boolean z4 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z4 = true;
            }
            this.f16230b = i7;
        }
        if (z4) {
            this.f16232d.g(fVar, 1.0f);
            this.f16232d.g(fVar2, -1.0f);
            this.f16232d.g(fVar3, 1.0f);
        } else {
            this.f16232d.g(fVar, -1.0f);
            this.f16232d.g(fVar2, 1.0f);
            this.f16232d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f16229a == null && this.f16230b == 0.0f && this.f16232d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i7;
        int iD = this.f16232d.d();
        f fVar2 = null;
        float f7 = 0.0f;
        for (int i8 = 0; i8 < iD; i8++) {
            float f8 = this.f16232d.f(i8);
            if (f8 < 0.0f) {
                f fVarE = this.f16232d.e(i8);
                if ((zArr == null || !zArr[fVarE.f16259b]) && fVarE != fVar && (((i7 = fVarE.f16257C) == 3 || i7 == 4) && f8 < f7)) {
                    f7 = f8;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f16229a;
        if (fVar2 != null) {
            this.f16232d.g(fVar2, -1.0f);
            this.f16229a.f16260c = -1;
            this.f16229a = null;
        }
        float fH = this.f16232d.h(fVar, true) * (-1.0f);
        this.f16229a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f16230b /= fH;
        a aVar = this.f16232d;
        int i7 = aVar.f16227h;
        for (int i8 = 0; i7 != -1 && i8 < aVar.f16220a; i8++) {
            float[] fArr = aVar.f16226g;
            fArr[i7] = fArr[i7] / fH;
            i7 = aVar.f16225f[i7];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar == null || !fVar.f16263f) {
            return;
        }
        float fC = this.f16232d.c(fVar);
        this.f16230b = (fVar.f16262e * fC) + this.f16230b;
        this.f16232d.h(fVar, z4);
        if (z4) {
            fVar.b(this);
        }
        if (this.f16232d.d() == 0) {
            this.f16233e = true;
            cVar.f16236a = true;
        }
    }

    public void i(c cVar, b bVar, boolean z4) {
        a aVar = this.f16232d;
        aVar.getClass();
        float fC = aVar.c(bVar.f16229a);
        aVar.h(bVar.f16229a, z4);
        a aVar2 = bVar.f16232d;
        int iD = aVar2.d();
        for (int i7 = 0; i7 < iD; i7++) {
            f fVarE = aVar2.e(i7);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z4);
        }
        this.f16230b = (bVar.f16230b * fC) + this.f16230b;
        if (z4) {
            bVar.f16229a.b(this);
        }
        if (this.f16229a == null || this.f16232d.d() != 0) {
            return;
        }
        this.f16233e = true;
        cVar.f16236a = true;
    }

    public String toString() {
        boolean z4;
        String strE = k.e(this.f16229a == null ? "0" : "" + this.f16229a, " = ");
        if (this.f16230b != 0.0f) {
            StringBuilder sbC = e.c(strE);
            sbC.append(this.f16230b);
            strE = sbC.toString();
            z4 = true;
        } else {
            z4 = false;
        }
        int iD = this.f16232d.d();
        for (int i7 = 0; i7 < iD; i7++) {
            f fVarE = this.f16232d.e(i7);
            if (fVarE != null) {
                float f7 = this.f16232d.f(i7);
                if (f7 != 0.0f) {
                    String string = fVarE.toString();
                    if (z4) {
                        if (f7 > 0.0f) {
                            strE = k.e(strE, " + ");
                        } else {
                            strE = k.e(strE, " - ");
                            f7 *= -1.0f;
                        }
                    } else if (f7 < 0.0f) {
                        strE = k.e(strE, "- ");
                        f7 *= -1.0f;
                    }
                    strE = f7 == 1.0f ? k.e(strE, string) : strE + f7 + " " + string;
                    z4 = true;
                }
            }
        }
        return !z4 ? k.e(strE, "0.0") : strE;
    }
}
