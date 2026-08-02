package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 extends C0129d8 {

    /* JADX INFO: renamed from: f */
    public a91[] f2528f;

    /* JADX INFO: renamed from: g */
    public a91[] f2529g;

    /* JADX INFO: renamed from: h */
    public int f2530h;

    /* JADX INFO: renamed from: i */
    public f50 f2531i;

    @Override // p000.C0129d8
    /* JADX INFO: renamed from: d */
    public final a91 mo1133d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f2530h; i2++) {
            a91[] a91VarArr = this.f2528f;
            a91 a91Var = a91VarArr[i2];
            if (!zArr[a91Var.f85k]) {
                f50 f50Var = this.f2531i;
                f50Var.f2313k = a91Var;
                int i3 = 8;
                if (i != -1) {
                    a91 a91Var2 = a91VarArr[i];
                    while (i3 >= 0) {
                        float f = a91Var2.f91q[i3];
                        float f2 = ((a91) f50Var.f2313k).f91q[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((a91) f50Var.f2313k).f91q[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2528f[i];
    }

    @Override // p000.C0129d8
    /* JADX INFO: renamed from: e */
    public final boolean mo1134e() {
        return this.f2530h == 0;
    }

    @Override // p000.C0129d8
    /* JADX INFO: renamed from: i */
    public final void mo1138i(gi0 gi0Var, C0129d8 c0129d8, boolean z) {
        a91 a91Var = c0129d8.f1576a;
        if (a91Var == null) {
            return;
        }
        float[] fArr = a91Var.f91q;
        C0793v7 c0793v7 = c0129d8.f1579d;
        int iM5107d = c0793v7.m5107d();
        for (int i = 0; i < iM5107d; i++) {
            a91 a91VarM5108e = c0793v7.m5108e(i);
            float fM5109f = c0793v7.m5109f(i);
            f50 f50Var = this.f2531i;
            f50Var.f2313k = a91VarM5108e;
            if (a91VarM5108e.f84j) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((a91) f50Var.f2313k).f91q;
                    float f = (fArr[i2] * fM5109f) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((a91) f50Var.f2313k).f91q[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((fx0) f50Var.f2314l).m1897k((a91) f50Var.f2313k);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM5109f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((a91) f50Var.f2313k).f91q[i3] = f3;
                    } else {
                        ((a91) f50Var.f2313k).f91q[i3] = 0.0f;
                    }
                }
                m1896j(a91VarM5108e);
            }
            this.f1577b = (c0129d8.f1577b * fM5109f) + this.f1577b;
        }
        m1897k(a91Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m1896j(a91 a91Var) {
        int i;
        a91[] a91VarArr;
        int i2 = this.f2530h + 1;
        a91[] a91VarArr2 = this.f2528f;
        if (i2 > a91VarArr2.length) {
            a91[] a91VarArr3 = (a91[]) Arrays.copyOf(a91VarArr2, a91VarArr2.length * 2);
            this.f2528f = a91VarArr3;
            this.f2529g = (a91[]) Arrays.copyOf(a91VarArr3, a91VarArr3.length * 2);
        }
        a91[] a91VarArr4 = this.f2528f;
        int i3 = this.f2530h;
        a91VarArr4[i3] = a91Var;
        int i4 = i3 + 1;
        this.f2530h = i4;
        if (i4 > 1 && a91VarArr4[i3].f85k > a91Var.f85k) {
            int i5 = 0;
            while (true) {
                i = this.f2530h;
                a91VarArr = this.f2529g;
                if (i5 >= i) {
                    break;
                }
                a91VarArr[i5] = this.f2528f[i5];
                i5++;
            }
            Arrays.sort(a91VarArr, 0, i, new ol0(1));
            for (int i6 = 0; i6 < this.f2530h; i6++) {
                this.f2528f[i6] = this.f2529g[i6];
            }
        }
        a91Var.f84j = true;
        a91Var.m143a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m1897k(a91 a91Var) {
        int i = 0;
        while (i < this.f2530h) {
            if (this.f2528f[i] == a91Var) {
                while (true) {
                    int i2 = this.f2530h;
                    if (i >= i2 - 1) {
                        this.f2530h = i2 - 1;
                        a91Var.f84j = false;
                        return;
                    } else {
                        a91[] a91VarArr = this.f2528f;
                        int i3 = i + 1;
                        a91VarArr[i] = a91VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.C0129d8
    public final String toString() {
        f50 f50Var = this.f2531i;
        String str = " goal -> (" + this.f1577b + ") : ";
        for (int i = 0; i < this.f2530h; i++) {
            f50Var.f2313k = this.f2528f[i];
            str = str + f50Var + " ";
        }
        return str;
    }
}
