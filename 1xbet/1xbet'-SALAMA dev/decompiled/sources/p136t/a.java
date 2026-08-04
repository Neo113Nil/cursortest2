package p136t;

import java.util.Arrays;
import p031e1.k;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1017n0 f16222c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16220a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16223d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16224e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f16225f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f16226g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16227h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16228i = -1;
    public boolean j = false;

    public a(b bVar, C1017n0 c1017n0) {
        this.f16221b = bVar;
        this.f16222c = c1017n0;
    }

    public final void a(f fVar, float f7, boolean z4) {
        if (f7 <= -0.001f || f7 >= 0.001f) {
            int i7 = this.f16227h;
            b bVar = this.f16221b;
            if (i7 == -1) {
                this.f16227h = 0;
                this.f16226g[0] = f7;
                this.f16224e[0] = fVar.f16259b;
                this.f16225f[0] = -1;
                fVar.f16256B++;
                fVar.a(bVar);
                this.f16220a++;
                if (this.j) {
                    return;
                }
                int i8 = this.f16228i + 1;
                this.f16228i = i8;
                int[] iArr = this.f16224e;
                if (i8 >= iArr.length) {
                    this.j = true;
                    this.f16228i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f16220a; i10++) {
                int i11 = this.f16224e[i7];
                int i12 = fVar.f16259b;
                if (i11 == i12) {
                    float[] fArr = this.f16226g;
                    float f8 = fArr[i7] + f7;
                    if (f8 > -0.001f && f8 < 0.001f) {
                        f8 = 0.0f;
                    }
                    fArr[i7] = f8;
                    if (f8 == 0.0f) {
                        if (i7 == this.f16227h) {
                            this.f16227h = this.f16225f[i7];
                        } else {
                            int[] iArr2 = this.f16225f;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z4) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f16228i = i7;
                        }
                        fVar.f16256B--;
                        this.f16220a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f16225f[i7];
            }
            int length = this.f16228i;
            int i13 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f16224e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i13;
            }
            int[] iArr4 = this.f16224e;
            if (length >= iArr4.length && this.f16220a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f16224e;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        length = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f16224e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i15 = this.f16223d * 2;
                this.f16223d = i15;
                this.j = false;
                this.f16228i = length - 1;
                this.f16226g = Arrays.copyOf(this.f16226g, i15);
                this.f16224e = Arrays.copyOf(this.f16224e, this.f16223d);
                this.f16225f = Arrays.copyOf(this.f16225f, this.f16223d);
            }
            this.f16224e[length] = fVar.f16259b;
            this.f16226g[length] = f7;
            if (i9 != -1) {
                int[] iArr7 = this.f16225f;
                iArr7[length] = iArr7[i9];
                iArr7[i9] = length;
            } else {
                this.f16225f[length] = this.f16227h;
                this.f16227h = length;
            }
            fVar.f16256B++;
            fVar.a(bVar);
            this.f16220a++;
            if (!this.j) {
                this.f16228i++;
            }
            int i16 = this.f16228i;
            int[] iArr8 = this.f16224e;
            if (i16 >= iArr8.length) {
                this.j = true;
                this.f16228i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i7 = this.f16227h;
        for (int i8 = 0; i7 != -1 && i8 < this.f16220a; i8++) {
            f fVar = ((f[]) this.f16222c.f17813d)[this.f16224e[i7]];
            if (fVar != null) {
                fVar.b(this.f16221b);
            }
            i7 = this.f16225f[i7];
        }
        this.f16227h = -1;
        this.f16228i = -1;
        this.j = false;
        this.f16220a = 0;
    }

    public final float c(f fVar) {
        int i7 = this.f16227h;
        for (int i8 = 0; i7 != -1 && i8 < this.f16220a; i8++) {
            if (this.f16224e[i7] == fVar.f16259b) {
                return this.f16226g[i7];
            }
            i7 = this.f16225f[i7];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f16220a;
    }

    public final f e(int i7) {
        int i8 = this.f16227h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16220a; i9++) {
            if (i9 == i7) {
                return ((f[]) this.f16222c.f17813d)[this.f16224e[i8]];
            }
            i8 = this.f16225f[i8];
        }
        return null;
    }

    public final float f(int i7) {
        int i8 = this.f16227h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16220a; i9++) {
            if (i9 == i7) {
                return this.f16226g[i8];
            }
            i8 = this.f16225f[i8];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f7) {
        if (f7 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i7 = this.f16227h;
        b bVar = this.f16221b;
        if (i7 == -1) {
            this.f16227h = 0;
            this.f16226g[0] = f7;
            this.f16224e[0] = fVar.f16259b;
            this.f16225f[0] = -1;
            fVar.f16256B++;
            fVar.a(bVar);
            this.f16220a++;
            if (this.j) {
                return;
            }
            int i8 = this.f16228i + 1;
            this.f16228i = i8;
            int[] iArr = this.f16224e;
            if (i8 >= iArr.length) {
                this.j = true;
                this.f16228i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f16220a; i10++) {
            int i11 = this.f16224e[i7];
            int i12 = fVar.f16259b;
            if (i11 == i12) {
                this.f16226g[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f16225f[i7];
        }
        int length = this.f16228i;
        int i13 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f16224e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i13;
        }
        int[] iArr3 = this.f16224e;
        if (length >= iArr3.length && this.f16220a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f16224e;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    length = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f16224e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i15 = this.f16223d * 2;
            this.f16223d = i15;
            this.j = false;
            this.f16228i = length - 1;
            this.f16226g = Arrays.copyOf(this.f16226g, i15);
            this.f16224e = Arrays.copyOf(this.f16224e, this.f16223d);
            this.f16225f = Arrays.copyOf(this.f16225f, this.f16223d);
        }
        this.f16224e[length] = fVar.f16259b;
        this.f16226g[length] = f7;
        if (i9 != -1) {
            int[] iArr6 = this.f16225f;
            iArr6[length] = iArr6[i9];
            iArr6[i9] = length;
        } else {
            this.f16225f[length] = this.f16227h;
            this.f16227h = length;
        }
        fVar.f16256B++;
        fVar.a(bVar);
        int i16 = this.f16220a + 1;
        this.f16220a = i16;
        if (!this.j) {
            this.f16228i++;
        }
        int[] iArr7 = this.f16224e;
        if (i16 >= iArr7.length) {
            this.j = true;
        }
        if (this.f16228i >= iArr7.length) {
            this.j = true;
            this.f16228i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i7 = this.f16227h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f16220a) {
            if (this.f16224e[i7] == fVar.f16259b) {
                if (i7 == this.f16227h) {
                    this.f16227h = this.f16225f[i7];
                } else {
                    int[] iArr = this.f16225f;
                    iArr[i9] = iArr[i7];
                }
                if (z4) {
                    fVar.b(this.f16221b);
                }
                fVar.f16256B--;
                this.f16220a--;
                this.f16224e[i7] = -1;
                if (this.j) {
                    this.f16228i = i7;
                }
                return this.f16226g[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f16225f[i7];
        }
        return 0.0f;
    }

    public final String toString() {
        int i7 = this.f16227h;
        String string = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f16220a; i8++) {
            StringBuilder sbC = e.c(k.e(string, " -> "));
            sbC.append(this.f16226g[i7]);
            sbC.append(" : ");
            StringBuilder sbC2 = e.c(sbC.toString());
            sbC2.append(((f[]) this.f16222c.f17813d)[this.f16224e[i7]]);
            string = sbC2.toString();
            i7 = this.f16225f[i7];
        }
        return string;
    }
}
