package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0793v7 {

    /* JADX INFO: renamed from: b */
    public final C0129d8 f8115b;

    /* JADX INFO: renamed from: c */
    public final qd0 f8116c;

    /* JADX INFO: renamed from: a */
    public int f8114a = 0;

    /* JADX INFO: renamed from: d */
    public int f8117d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f8118e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f8119f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f8120g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f8121h = -1;

    /* JADX INFO: renamed from: i */
    public int f8122i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f8123j = false;

    public C0793v7(C0129d8 c0129d8, qd0 qd0Var) {
        this.f8115b = c0129d8;
        this.f8116c = qd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5104a(a91 a91Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f8121h;
            C0129d8 c0129d8 = this.f8115b;
            if (i == -1) {
                this.f8121h = 0;
                this.f8120g[0] = f;
                this.f8118e[0] = a91Var.f85k;
                this.f8119f[0] = -1;
                a91Var.f94t++;
                a91Var.m143a(c0129d8);
                this.f8114a++;
                if (this.f8123j) {
                    return;
                }
                int i2 = this.f8122i + 1;
                this.f8122i = i2;
                int[] iArr = this.f8118e;
                if (i2 >= iArr.length) {
                    this.f8123j = true;
                    this.f8122i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f8114a; i4++) {
                int i5 = this.f8118e[i];
                int i6 = a91Var.f85k;
                if (i5 == i6) {
                    float[] fArr = this.f8120g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        int i7 = this.f8121h;
                        int[] iArr2 = this.f8119f;
                        if (i == i7) {
                            this.f8121h = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            a91Var.m144b(c0129d8);
                        }
                        if (this.f8123j) {
                            this.f8122i = i;
                        }
                        a91Var.f94t--;
                        this.f8114a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f8119f[i];
            }
            int length = this.f8122i;
            int i8 = length + 1;
            if (this.f8123j) {
                int[] iArr3 = this.f8118e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f8118e;
            if (length >= iArr4.length && this.f8114a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f8118e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f8118e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f8117d * 2;
                this.f8117d = i10;
                this.f8123j = false;
                this.f8122i = length - 1;
                this.f8120g = Arrays.copyOf(this.f8120g, i10);
                this.f8118e = Arrays.copyOf(this.f8118e, this.f8117d);
                this.f8119f = Arrays.copyOf(this.f8119f, this.f8117d);
            }
            this.f8118e[length] = a91Var.f85k;
            this.f8120g[length] = f;
            int[] iArr7 = this.f8119f;
            if (i3 != -1) {
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                iArr7[length] = this.f8121h;
                this.f8121h = length;
            }
            a91Var.f94t++;
            a91Var.m143a(c0129d8);
            this.f8114a++;
            if (!this.f8123j) {
                this.f8122i++;
            }
            int i11 = this.f8122i;
            int[] iArr8 = this.f8118e;
            if (i11 >= iArr8.length) {
                this.f8123j = true;
                this.f8122i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5105b() {
        int i = this.f8121h;
        for (int i2 = 0; i != -1 && i2 < this.f8114a; i2++) {
            a91 a91Var = ((a91[]) this.f8116c.f6473m)[this.f8118e[i]];
            if (a91Var != null) {
                a91Var.m144b(this.f8115b);
            }
            i = this.f8119f[i];
        }
        this.f8121h = -1;
        this.f8122i = -1;
        this.f8123j = false;
        this.f8114a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m5106c(a91 a91Var) {
        int i = this.f8121h;
        for (int i2 = 0; i != -1 && i2 < this.f8114a; i2++) {
            if (this.f8118e[i] == a91Var.f85k) {
                return this.f8120g[i];
            }
            i = this.f8119f[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m5107d() {
        return this.f8114a;
    }

    /* JADX INFO: renamed from: e */
    public final a91 m5108e(int i) {
        int i2 = this.f8121h;
        for (int i3 = 0; i2 != -1 && i3 < this.f8114a; i3++) {
            if (i3 == i) {
                return ((a91[]) this.f8116c.f6473m)[this.f8118e[i2]];
            }
            i2 = this.f8119f[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m5109f(int i) {
        int i2 = this.f8121h;
        for (int i3 = 0; i2 != -1 && i3 < this.f8114a; i3++) {
            if (i3 == i) {
                return this.f8120g[i2];
            }
            i2 = this.f8119f[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m5110g(a91 a91Var, float f) {
        if (f == 0.0f) {
            m5111h(a91Var, true);
            return;
        }
        int i = this.f8121h;
        C0129d8 c0129d8 = this.f8115b;
        if (i == -1) {
            this.f8121h = 0;
            this.f8120g[0] = f;
            this.f8118e[0] = a91Var.f85k;
            this.f8119f[0] = -1;
            a91Var.f94t++;
            a91Var.m143a(c0129d8);
            this.f8114a++;
            if (this.f8123j) {
                return;
            }
            int i2 = this.f8122i + 1;
            this.f8122i = i2;
            int[] iArr = this.f8118e;
            if (i2 >= iArr.length) {
                this.f8123j = true;
                this.f8122i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f8114a; i4++) {
            int i5 = this.f8118e[i];
            int i6 = a91Var.f85k;
            if (i5 == i6) {
                this.f8120g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f8119f[i];
        }
        int length = this.f8122i;
        int i7 = length + 1;
        if (this.f8123j) {
            int[] iArr2 = this.f8118e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f8118e;
        if (length >= iArr3.length && this.f8114a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f8118e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f8118e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f8117d * 2;
            this.f8117d = i9;
            this.f8123j = false;
            this.f8122i = length - 1;
            this.f8120g = Arrays.copyOf(this.f8120g, i9);
            this.f8118e = Arrays.copyOf(this.f8118e, this.f8117d);
            this.f8119f = Arrays.copyOf(this.f8119f, this.f8117d);
        }
        this.f8118e[length] = a91Var.f85k;
        this.f8120g[length] = f;
        int[] iArr6 = this.f8119f;
        if (i3 != -1) {
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            iArr6[length] = this.f8121h;
            this.f8121h = length;
        }
        a91Var.f94t++;
        a91Var.m143a(c0129d8);
        int i10 = this.f8114a + 1;
        this.f8114a = i10;
        if (!this.f8123j) {
            this.f8122i++;
        }
        int[] iArr7 = this.f8118e;
        if (i10 >= iArr7.length) {
            this.f8123j = true;
        }
        if (this.f8122i >= iArr7.length) {
            this.f8123j = true;
            this.f8122i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m5111h(a91 a91Var, boolean z) {
        int i = this.f8121h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f8114a) {
            if (this.f8118e[i] == a91Var.f85k) {
                int i4 = this.f8121h;
                int[] iArr = this.f8119f;
                if (i == i4) {
                    this.f8121h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    a91Var.m144b(this.f8115b);
                }
                a91Var.f94t--;
                this.f8114a--;
                this.f8118e[i] = -1;
                if (this.f8123j) {
                    this.f8122i = i;
                }
                return this.f8120g[i];
            }
            i2++;
            i3 = i;
            i = this.f8119f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f8121h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f8114a; i2++) {
            str = (str.concat(" -> ") + this.f8120g[i] + " : ") + ((a91[]) this.f8116c.f6473m)[this.f8118e[i]];
            i = this.f8119f[i];
        }
        return str;
    }
}
