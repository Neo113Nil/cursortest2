package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.If, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615If {

    /* renamed from: a, reason: collision with root package name */
    public final int f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9568b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9569c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9570d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9571e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9572g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9573h;
    public final short[] i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f9574j;

    /* renamed from: k, reason: collision with root package name */
    public int f9575k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f9576l;

    /* renamed from: m, reason: collision with root package name */
    public int f9577m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f9578n;

    /* renamed from: o, reason: collision with root package name */
    public int f9579o;

    /* renamed from: p, reason: collision with root package name */
    public int f9580p;

    /* renamed from: q, reason: collision with root package name */
    public int f9581q;

    /* renamed from: r, reason: collision with root package name */
    public int f9582r;

    /* renamed from: s, reason: collision with root package name */
    public int f9583s;

    /* renamed from: t, reason: collision with root package name */
    public int f9584t;

    /* renamed from: u, reason: collision with root package name */
    public int f9585u;

    /* renamed from: v, reason: collision with root package name */
    public int f9586v;

    /* renamed from: w, reason: collision with root package name */
    public double f9587w;

    public C0615If(float f, float f5, int i, int i5, int i6) {
        this.f9567a = i;
        this.f9568b = i5;
        this.f9569c = f;
        this.f9570d = f5;
        this.f9571e = i / i6;
        this.f = i / 400;
        int i7 = i / 65;
        this.f9572g = i7;
        int i8 = i7 + i7;
        this.f9573h = i8;
        this.i = new short[i8];
        int i9 = i8 * i5;
        this.f9574j = new short[i9];
        this.f9576l = new short[i9];
        this.f9578n = new short[i9];
    }

    public static void d(int i, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i7 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i6 * i5) + i9;
            for (int i13 = 0; i13 < i; i13++) {
                sArr[i12] = (short) (((sArr3[i11] * i13) + ((i - i13) * sArr2[i10])) / i);
                i12 += i5;
                i10 += i5;
                i11 += i5;
            }
        }
    }

    public final int a(short[] sArr, int i, int i5, int i6) {
        int i7 = 1;
        int i8 = 255;
        int i9 = 0;
        int i10 = 0;
        while (i5 <= i6) {
            int i11 = 0;
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = this.f9568b * i;
                i11 += Math.abs(sArr[i13 + i12] - sArr[(i13 + i5) + i12]);
            }
            int i14 = i11 * i9;
            int i15 = i7 * i5;
            if (i14 < i15) {
                i7 = i11;
            }
            if (i14 < i15) {
                i9 = i5;
            }
            int i16 = i11 * i8;
            int i17 = i10 * i5;
            if (i16 > i17) {
                i10 = i11;
            }
            if (i16 > i17) {
                i8 = i5;
            }
            i5++;
        }
        this.f9585u = i7 / i9;
        this.f9586v = i10 / i8;
        return i9;
    }

    public final void b(short[] sArr, int i, int i5) {
        short[] f = f(this.f9576l, this.f9577m, i5);
        this.f9576l = f;
        int i6 = this.f9577m;
        int i7 = this.f9568b;
        System.arraycopy(sArr, i * i7, f, i6 * i7, i5 * i7);
        this.f9577m += i5;
    }

    public final void c(short[] sArr, int i, int i5) {
        int i6;
        for (int i7 = 0; i7 < this.f9573h / i5; i7++) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f9568b;
                i6 = i10 * i5;
                if (i8 < i6) {
                    i9 += sArr[(i6 * i7) + (i10 * i) + i8];
                    i8++;
                }
            }
            this.i[i7] = (short) (i9 / i6);
        }
    }

    public final void e() {
        float f;
        double d5;
        int i;
        int i5;
        int i6;
        int i7;
        float f5;
        int i8;
        int i9;
        int i10;
        long j5;
        long j6;
        float f6 = this.f9569c;
        float f7 = this.f9570d;
        double d6 = f6 / f7;
        int i11 = this.f9577m;
        int i12 = this.f9567a;
        int i13 = this.f9568b;
        int i14 = 0;
        int i15 = 1;
        if (d6 > 1.00001d || d6 < 0.99999d) {
            int i16 = this.f9575k;
            int i17 = this.f9573h;
            if (i16 >= i17) {
                int i18 = 0;
                while (true) {
                    int i19 = this.f9582r;
                    if (i19 > 0) {
                        int min = Math.min(i17, i19);
                        b(this.f9574j, i18, min);
                        this.f9582r -= min;
                        i18 += min;
                        f = f7;
                        d5 = d6;
                    } else {
                        short[] sArr = this.f9574j;
                        int i20 = i12 > 4000 ? i12 / 4000 : i15;
                        int i21 = this.f9572g;
                        int i22 = this.f;
                        if (i13 == i15 && i20 == i15) {
                            i = a(sArr, i18, i22, i21);
                            f = f7;
                            d5 = d6;
                        } else {
                            c(sArr, i18, i20);
                            f = f7;
                            d5 = d6;
                            short[] sArr2 = this.i;
                            int a5 = a(sArr2, i14, i22 / i20, i21 / i20);
                            if (i20 != 1) {
                                int i23 = a5 * i20;
                                int i24 = i20 * 4;
                                int i25 = i23 - i24;
                                if (i25 >= i22) {
                                    i22 = i25;
                                }
                                int i26 = i23 + i24;
                                if (i26 <= i21) {
                                    i21 = i26;
                                }
                                if (i13 == 1) {
                                    i = a(sArr, i18, i22, i21);
                                } else {
                                    c(sArr, i18, 1);
                                    i = a(sArr2, i14, i22, i21);
                                }
                            } else {
                                i = a5;
                            }
                        }
                        int i27 = this.f9585u;
                        int i28 = this.f9586v;
                        if (i27 == 0 || (i5 = this.f9583s) == 0 || i28 > i27 * 3 || i27 + i27 <= this.f9584t * 3) {
                            i5 = i;
                        }
                        int i29 = i18 + i5;
                        this.f9584t = i27;
                        this.f9583s = i;
                        double d7 = i5;
                        if (d5 > 1.0d) {
                            short[] sArr3 = this.f9574j;
                            double d8 = d5 - 1.0d;
                            if (d5 >= 2.0d) {
                                double d9 = (d7 / d8) + this.f9587w;
                                i7 = (int) Math.round(d9);
                                this.f9587w = d9 - i7;
                            } else {
                                double d10 = ((d7 * (2.0d - d5)) / d8) + this.f9587w;
                                int round = (int) Math.round(d10);
                                this.f9582r = round;
                                this.f9587w = d10 - round;
                                i7 = i5;
                            }
                            short[] f8 = f(this.f9576l, this.f9577m, i7);
                            this.f9576l = f8;
                            int i30 = i18;
                            int i31 = i7;
                            d(i31, this.f9568b, f8, this.f9577m, sArr3, i30, sArr3, i29);
                            this.f9577m += i31;
                            i18 = i5 + i31 + i30;
                        } else {
                            int i32 = i18;
                            short[] sArr4 = this.f9574j;
                            double d11 = 1.0d - d5;
                            if (d5 < 0.5d) {
                                double d12 = ((d7 * d5) / d11) + this.f9587w;
                                i6 = (int) Math.round(d12);
                                this.f9587w = d12 - i6;
                            } else {
                                double d13 = ((d7 * ((d5 + d5) - 1.0d)) / d11) + this.f9587w;
                                int round2 = (int) Math.round(d13);
                                this.f9582r = round2;
                                this.f9587w = d13 - round2;
                                i6 = i5;
                            }
                            int i33 = i5 + i6;
                            short[] f9 = f(this.f9576l, this.f9577m, i33);
                            this.f9576l = f9;
                            System.arraycopy(sArr4, i32 * i13, f9, this.f9577m * i13, i5 * i13);
                            int i34 = i6;
                            d(i34, this.f9568b, this.f9576l, this.f9577m + i5, sArr4, i29, sArr4, i32);
                            this.f9577m += i33;
                            i18 = i32 + i34;
                        }
                    }
                    if (i18 + i17 > i16) {
                        break;
                    }
                    i15 = 1;
                    f7 = f;
                    d6 = d5;
                    i14 = 0;
                }
                int i35 = this.f9575k - i18;
                short[] sArr5 = this.f9574j;
                System.arraycopy(sArr5, i18 * i13, sArr5, 0, i35 * i13);
                this.f9575k = i35;
                f5 = this.f9571e * f;
                if (f5 != 1.0f || this.f9577m == i11) {
                }
                long j7 = i12;
                long j8 = (long) (i12 / f5);
                while (j8 != 0 && j7 != 0 && j8 % 2 == 0 && j7 % 2 == 0) {
                    j8 /= 2;
                    j7 /= 2;
                }
                int i36 = this.f9577m - i11;
                short[] f10 = f(this.f9578n, this.f9579o, i36);
                this.f9578n = f10;
                System.arraycopy(this.f9576l, i11 * i13, f10, this.f9579o * i13, i36 * i13);
                this.f9577m = i11;
                this.f9579o += i36;
                int i37 = 0;
                while (true) {
                    i8 = this.f9579o;
                    i9 = i8 - 1;
                    if (i37 >= i9) {
                        break;
                    }
                    while (true) {
                        i10 = this.f9580p + 1;
                        j5 = i10;
                        long j9 = j5 * j8;
                        j6 = this.f9581q;
                        if (j9 <= j6 * j7) {
                            break;
                        }
                        this.f9576l = f(this.f9576l, this.f9577m, 1);
                        int i38 = 0;
                        while (i38 < i13) {
                            short[] sArr6 = this.f9576l;
                            int i39 = this.f9577m * i13;
                            short[] sArr7 = this.f9578n;
                            int i40 = (i37 * i13) + i38;
                            short s2 = sArr7[i40];
                            short s5 = sArr7[i40 + i13];
                            long j10 = j8;
                            long j11 = (r11 + 1) * j10;
                            long j12 = j11 - (this.f9580p * j10);
                            long j13 = j11 - (this.f9581q * j7);
                            sArr6[i39 + i38] = (short) ((((j12 - j13) * s5) + (j13 * s2)) / j12);
                            i38++;
                            j8 = j10;
                        }
                        this.f9581q++;
                        this.f9577m++;
                        j8 = j8;
                    }
                    long j14 = j8;
                    this.f9580p = i10;
                    if (j5 == j7) {
                        this.f9580p = 0;
                        AbstractC1668us.a0(j6 == j14);
                        this.f9581q = 0;
                    }
                    i37++;
                    j8 = j14;
                }
                if (i9 != 0) {
                    short[] sArr8 = this.f9578n;
                    System.arraycopy(sArr8, i9 * i13, sArr8, 0, (i8 - i9) * i13);
                    this.f9579o -= i9;
                    return;
                }
                return;
            }
        } else {
            b(this.f9574j, 0, this.f9575k);
            this.f9575k = 0;
        }
        f = f7;
        f5 = this.f9571e * f;
        if (f5 != 1.0f) {
        }
    }

    public final short[] f(short[] sArr, int i, int i5) {
        int length = sArr.length;
        int i6 = this.f9568b;
        int i7 = length / i6;
        return i + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }
}
