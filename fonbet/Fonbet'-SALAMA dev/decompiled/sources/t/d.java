package t;

import C0.C0090i;
import d6.C0977k;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f16244f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f16245g;

    /* renamed from: h, reason: collision with root package name */
    public int f16246h;

    /* renamed from: i, reason: collision with root package name */
    public C0977k f16247i;

    @Override // t.b
    public final f d(boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f16246h; i8++) {
            f[] fVarArr = this.f16244f;
            f fVar = fVarArr[i8];
            if (!zArr[fVar.f16253b]) {
                C0977k c0977k = this.f16247i;
                c0977k.f12441b = fVar;
                int i9 = 8;
                if (i7 == -1) {
                    while (i9 >= 0) {
                        float f7 = ((f) c0977k.f12441b).f16259y[i9];
                        if (f7 <= 0.0f) {
                            if (f7 < 0.0f) {
                                i7 = i8;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i7];
                    while (true) {
                        if (i9 >= 0) {
                            float f8 = fVar2.f16259y[i9];
                            float f9 = ((f) c0977k.f12441b).f16259y[i9];
                            if (f9 == f8) {
                                i9--;
                            } else if (f9 >= f8) {
                            }
                        }
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f16244f[i7];
    }

    @Override // t.b
    public final boolean e() {
        return this.f16246h == 0;
    }

    @Override // t.b
    public final void i(c cVar, b bVar, boolean z4) {
        f fVar = bVar.f16223a;
        if (fVar == null) {
            return;
        }
        C1602a c1602a = bVar.f16226d;
        int d7 = c1602a.d();
        for (int i7 = 0; i7 < d7; i7++) {
            f e7 = c1602a.e(i7);
            float f7 = c1602a.f(i7);
            C0977k c0977k = this.f16247i;
            c0977k.f12441b = e7;
            boolean z7 = e7.f16252a;
            float[] fArr = fVar.f16259y;
            if (z7) {
                boolean z8 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = ((f) c0977k.f12441b).f16259y;
                    float f8 = (fArr[i8] * f7) + fArr2[i8];
                    fArr2[i8] = f8;
                    if (Math.abs(f8) < 1.0E-4f) {
                        ((f) c0977k.f12441b).f16259y[i8] = 0.0f;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    ((d) c0977k.f12442c).k((f) c0977k.f12441b);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f9 = fArr[i9];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f7;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        ((f) c0977k.f12441b).f16259y[i9] = f10;
                    } else {
                        ((f) c0977k.f12441b).f16259y[i9] = 0.0f;
                    }
                }
                j(e7);
            }
            this.f16224b = (bVar.f16224b * f7) + this.f16224b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i7;
        int i8 = this.f16246h + 1;
        f[] fVarArr = this.f16244f;
        if (i8 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f16244f = fVarArr2;
            this.f16245g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f16244f;
        int i9 = this.f16246h;
        fVarArr3[i9] = fVar;
        int i10 = i9 + 1;
        this.f16246h = i10;
        if (i10 > 1 && fVarArr3[i9].f16253b > fVar.f16253b) {
            int i11 = 0;
            while (true) {
                i7 = this.f16246h;
                if (i11 >= i7) {
                    break;
                }
                this.f16245g[i11] = this.f16244f[i11];
                i11++;
            }
            Arrays.sort(this.f16245g, 0, i7, new C0090i(4));
            for (int i12 = 0; i12 < this.f16246h; i12++) {
                this.f16244f[i12] = this.f16245g[i12];
            }
        }
        fVar.f16252a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i7 = 0;
        while (i7 < this.f16246h) {
            if (this.f16244f[i7] == fVar) {
                while (true) {
                    int i8 = this.f16246h;
                    if (i7 >= i8 - 1) {
                        this.f16246h = i8 - 1;
                        fVar.f16252a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f16244f;
                        int i9 = i7 + 1;
                        fVarArr[i7] = fVarArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // t.b
    public final String toString() {
        String str = " goal -> (" + this.f16224b + ") : ";
        for (int i7 = 0; i7 < this.f16246h; i7++) {
            f fVar = this.f16244f[i7];
            C0977k c0977k = this.f16247i;
            c0977k.f12441b = fVar;
            str = str + c0977k + " ";
        }
        return str;
    }
}
