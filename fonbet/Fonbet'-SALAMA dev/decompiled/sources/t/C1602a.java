package t;

import e1.k;
import java.util.Arrays;
import w1.C1726n0;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602a {

    /* renamed from: b, reason: collision with root package name */
    public final b f16215b;

    /* renamed from: c, reason: collision with root package name */
    public final C1726n0 f16216c;

    /* renamed from: a, reason: collision with root package name */
    public int f16214a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16217d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f16218e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f16219f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f16220g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f16221h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f16222i = -1;
    public boolean j = false;

    public C1602a(b bVar, C1726n0 c1726n0) {
        this.f16215b = bVar;
        this.f16216c = c1726n0;
    }

    public final void a(f fVar, float f7, boolean z4) {
        if (f7 <= -0.001f || f7 >= 0.001f) {
            int i7 = this.f16221h;
            b bVar = this.f16215b;
            if (i7 == -1) {
                this.f16221h = 0;
                this.f16220g[0] = f7;
                this.f16218e[0] = fVar.f16253b;
                this.f16219f[0] = -1;
                fVar.f16250B++;
                fVar.a(bVar);
                this.f16214a++;
                if (this.j) {
                    return;
                }
                int i8 = this.f16222i + 1;
                this.f16222i = i8;
                int[] iArr = this.f16218e;
                if (i8 >= iArr.length) {
                    this.j = true;
                    this.f16222i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f16214a; i10++) {
                int i11 = this.f16218e[i7];
                int i12 = fVar.f16253b;
                if (i11 == i12) {
                    float[] fArr = this.f16220g;
                    float f8 = fArr[i7] + f7;
                    if (f8 > -0.001f && f8 < 0.001f) {
                        f8 = 0.0f;
                    }
                    fArr[i7] = f8;
                    if (f8 == 0.0f) {
                        if (i7 == this.f16221h) {
                            this.f16221h = this.f16219f[i7];
                        } else {
                            int[] iArr2 = this.f16219f;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z4) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f16222i = i7;
                        }
                        fVar.f16250B--;
                        this.f16214a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f16219f[i7];
            }
            int i13 = this.f16222i;
            int i14 = i13 + 1;
            if (this.j) {
                int[] iArr3 = this.f16218e;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f16218e;
            if (i13 >= iArr4.length && this.f16214a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f16218e;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f16218e;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f16217d * 2;
                this.f16217d = i16;
                this.j = false;
                this.f16222i = i13 - 1;
                this.f16220g = Arrays.copyOf(this.f16220g, i16);
                this.f16218e = Arrays.copyOf(this.f16218e, this.f16217d);
                this.f16219f = Arrays.copyOf(this.f16219f, this.f16217d);
            }
            this.f16218e[i13] = fVar.f16253b;
            this.f16220g[i13] = f7;
            if (i9 != -1) {
                int[] iArr7 = this.f16219f;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f16219f[i13] = this.f16221h;
                this.f16221h = i13;
            }
            fVar.f16250B++;
            fVar.a(bVar);
            this.f16214a++;
            if (!this.j) {
                this.f16222i++;
            }
            int i17 = this.f16222i;
            int[] iArr8 = this.f16218e;
            if (i17 >= iArr8.length) {
                this.j = true;
                this.f16222i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i7 = this.f16221h;
        for (int i8 = 0; i7 != -1 && i8 < this.f16214a; i8++) {
            f fVar = ((f[]) this.f16216c.f17807d)[this.f16218e[i7]];
            if (fVar != null) {
                fVar.b(this.f16215b);
            }
            i7 = this.f16219f[i7];
        }
        this.f16221h = -1;
        this.f16222i = -1;
        this.j = false;
        this.f16214a = 0;
    }

    public final float c(f fVar) {
        int i7 = this.f16221h;
        for (int i8 = 0; i7 != -1 && i8 < this.f16214a; i8++) {
            if (this.f16218e[i7] == fVar.f16253b) {
                return this.f16220g[i7];
            }
            i7 = this.f16219f[i7];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f16214a;
    }

    public final f e(int i7) {
        int i8 = this.f16221h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16214a; i9++) {
            if (i9 == i7) {
                return ((f[]) this.f16216c.f17807d)[this.f16218e[i8]];
            }
            i8 = this.f16219f[i8];
        }
        return null;
    }

    public final float f(int i7) {
        int i8 = this.f16221h;
        for (int i9 = 0; i8 != -1 && i9 < this.f16214a; i9++) {
            if (i9 == i7) {
                return this.f16220g[i8];
            }
            i8 = this.f16219f[i8];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f7) {
        if (f7 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i7 = this.f16221h;
        b bVar = this.f16215b;
        if (i7 == -1) {
            this.f16221h = 0;
            this.f16220g[0] = f7;
            this.f16218e[0] = fVar.f16253b;
            this.f16219f[0] = -1;
            fVar.f16250B++;
            fVar.a(bVar);
            this.f16214a++;
            if (this.j) {
                return;
            }
            int i8 = this.f16222i + 1;
            this.f16222i = i8;
            int[] iArr = this.f16218e;
            if (i8 >= iArr.length) {
                this.j = true;
                this.f16222i = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f16214a; i10++) {
            int i11 = this.f16218e[i7];
            int i12 = fVar.f16253b;
            if (i11 == i12) {
                this.f16220g[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f16219f[i7];
        }
        int i13 = this.f16222i;
        int i14 = i13 + 1;
        if (this.j) {
            int[] iArr2 = this.f16218e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f16218e;
        if (i13 >= iArr3.length && this.f16214a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f16218e;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f16218e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f16217d * 2;
            this.f16217d = i16;
            this.j = false;
            this.f16222i = i13 - 1;
            this.f16220g = Arrays.copyOf(this.f16220g, i16);
            this.f16218e = Arrays.copyOf(this.f16218e, this.f16217d);
            this.f16219f = Arrays.copyOf(this.f16219f, this.f16217d);
        }
        this.f16218e[i13] = fVar.f16253b;
        this.f16220g[i13] = f7;
        if (i9 != -1) {
            int[] iArr6 = this.f16219f;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f16219f[i13] = this.f16221h;
            this.f16221h = i13;
        }
        fVar.f16250B++;
        fVar.a(bVar);
        int i17 = this.f16214a + 1;
        this.f16214a = i17;
        if (!this.j) {
            this.f16222i++;
        }
        int[] iArr7 = this.f16218e;
        if (i17 >= iArr7.length) {
            this.j = true;
        }
        if (this.f16222i >= iArr7.length) {
            this.j = true;
            this.f16222i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i7 = this.f16221h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f16214a) {
            if (this.f16218e[i7] == fVar.f16253b) {
                if (i7 == this.f16221h) {
                    this.f16221h = this.f16219f[i7];
                } else {
                    int[] iArr = this.f16219f;
                    iArr[i9] = iArr[i7];
                }
                if (z4) {
                    fVar.b(this.f16215b);
                }
                fVar.f16250B--;
                this.f16214a--;
                this.f16218e[i7] = -1;
                if (this.j) {
                    this.f16222i = i7;
                }
                return this.f16220g[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f16219f[i7];
        }
        return 0.0f;
    }

    public final String toString() {
        int i7 = this.f16221h;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f16214a; i8++) {
            StringBuilder c3 = e.c(k.e(str, " -> "));
            c3.append(this.f16220g[i7]);
            c3.append(" : ");
            StringBuilder c4 = e.c(c3.toString());
            c4.append(((f[]) this.f16216c.f17807d)[this.f16218e[i7]]);
            str = c4.toString();
            i7 = this.f16219f[i7];
        }
        return str;
    }
}
