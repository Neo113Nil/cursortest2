package p136t;

import C0.C0090i;
import java.util.Arrays;
import p028d6.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f[] f16250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f[] f16251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f16253i;

    @Override // p136t.b
    public final f d(boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f16252h; i8++) {
            f[] fVarArr = this.f16250f;
            f fVar = fVarArr[i8];
            if (!zArr[fVar.f16259b]) {
                k kVar = this.f16253i;
                kVar.f12447b = fVar;
                int i9 = 8;
                if (i7 != -1) {
                    f fVar2 = fVarArr[i7];
                    while (i9 >= 0) {
                        float f7 = fVar2.f16265y[i9];
                        float f8 = ((f) kVar.f12447b).f16265y[i9];
                        if (f8 != f7) {
                            if (f8 >= f7) {
                                break;
                            }
                            i7 = i8;
                            break;
                            break;
                        }
                        i9--;
                    }
                } else {
                    while (i9 >= 0) {
                        float f9 = ((f) kVar.f12447b).f16265y[i9];
                        if (f9 > 0.0f) {
                            break;
                        }
                        if (f9 < 0.0f) {
                            i7 = i8;
                            break;
                        }
                        i9--;
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f16250f[i7];
    }

    @Override // p136t.b
    public final boolean e() {
        return this.f16252h == 0;
    }

    @Override // p136t.b
    public final void i(c cVar, b bVar, boolean z4) {
        f fVar = bVar.f16229a;
        if (fVar == null) {
            return;
        }
        a aVar = bVar.f16232d;
        int iD = aVar.d();
        for (int i7 = 0; i7 < iD; i7++) {
            f fVarE = aVar.e(i7);
            float f7 = aVar.f(i7);
            k kVar = this.f16253i;
            kVar.f12447b = fVarE;
            boolean z7 = fVarE.f16258a;
            float[] fArr = fVar.f16265y;
            if (z7) {
                boolean z8 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = ((f) kVar.f12447b).f16265y;
                    float f8 = (fArr[i8] * f7) + fArr2[i8];
                    fArr2[i8] = f8;
                    if (Math.abs(f8) < 1.0E-4f) {
                        ((f) kVar.f12447b).f16265y[i8] = 0.0f;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    ((d) kVar.f12448c).k((f) kVar.f12447b);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f9 = fArr[i9];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f7;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        ((f) kVar.f12447b).f16265y[i9] = f10;
                    } else {
                        ((f) kVar.f12447b).f16265y[i9] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f16230b = (bVar.f16230b * f7) + this.f16230b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i7;
        int i8 = this.f16252h + 1;
        f[] fVarArr = this.f16250f;
        if (i8 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f16250f = fVarArr2;
            this.f16251g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f16250f;
        int i9 = this.f16252h;
        fVarArr3[i9] = fVar;
        int i10 = i9 + 1;
        this.f16252h = i10;
        if (i10 > 1 && fVarArr3[i9].f16259b > fVar.f16259b) {
            int i11 = 0;
            while (true) {
                i7 = this.f16252h;
                if (i11 >= i7) {
                    break;
                }
                this.f16251g[i11] = this.f16250f[i11];
                i11++;
            }
            Arrays.sort(this.f16251g, 0, i7, new C0090i(4));
            for (int i12 = 0; i12 < this.f16252h; i12++) {
                this.f16250f[i12] = this.f16251g[i12];
            }
        }
        fVar.f16258a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i7 = 0;
        while (i7 < this.f16252h) {
            if (this.f16250f[i7] == fVar) {
                while (true) {
                    int i8 = this.f16252h;
                    if (i7 >= i8 - 1) {
                        this.f16252h = i8 - 1;
                        fVar.f16258a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f16250f;
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

    @Override // p136t.b
    public final String toString() {
        String str = " goal -> (" + this.f16230b + ") : ";
        for (int i7 = 0; i7 < this.f16252h; i7++) {
            f fVar = this.f16250f[i7];
            k kVar = this.f16253i;
            kVar.f12447b = fVar;
            str = str + kVar + " ";
        }
        return str;
    }
}
