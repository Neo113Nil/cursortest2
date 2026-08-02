package C1;

import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final int f1422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1425d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1426e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1428g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1429h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f1430i;
    public short[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f1431k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f1432l;

    /* renamed from: m, reason: collision with root package name */
    public int f1433m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f1434n;

    /* renamed from: o, reason: collision with root package name */
    public int f1435o;

    /* renamed from: p, reason: collision with root package name */
    public int f1436p;

    /* renamed from: q, reason: collision with root package name */
    public int f1437q;

    /* renamed from: r, reason: collision with root package name */
    public int f1438r;

    /* renamed from: s, reason: collision with root package name */
    public int f1439s;

    /* renamed from: t, reason: collision with root package name */
    public int f1440t;

    /* renamed from: u, reason: collision with root package name */
    public int f1441u;

    /* renamed from: v, reason: collision with root package name */
    public int f1442v;

    public L(int i7, int i8, float f7, float f8, int i9) {
        this.f1422a = i7;
        this.f1423b = i8;
        this.f1424c = f7;
        this.f1425d = f8;
        this.f1426e = i7 / i9;
        this.f1427f = i7 / 400;
        int i10 = i7 / 65;
        this.f1428g = i10;
        int i11 = i10 * 2;
        this.f1429h = i11;
        this.f1430i = new short[i11];
        this.j = new short[i11 * i8];
        this.f1432l = new short[i11 * i8];
        this.f1434n = new short[i11 * i8];
    }

    public static void e(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i7 - i16) * sArr2[i15])) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i8) {
        short[] c3 = c(this.f1432l, this.f1433m, i8);
        this.f1432l = c3;
        int i9 = this.f1423b;
        System.arraycopy(sArr, i7 * i9, c3, this.f1433m * i9, i9 * i8);
        this.f1433m += i8;
    }

    public final void b(short[] sArr, int i7, int i8) {
        int i9 = this.f1429h / i8;
        int i10 = this.f1423b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f1430i[i13] = (short) (i14 / i11);
        }
    }

    public final short[] c(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f1423b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int d(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f1423b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
            }
            if (i15 * i13 < i12 * i8) {
                i13 = i8;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i8) {
                i11 = i8;
                i14 = i15;
            }
            i8++;
        }
        this.f1441u = i12 / i13;
        this.f1442v = i14 / i11;
        return i13;
    }

    public final void f() {
        int i7;
        int i8;
        float f7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f1433m;
        float f8 = this.f1424c;
        float f9 = this.f1425d;
        float f10 = f8 / f9;
        float f11 = this.f1426e * f9;
        double d7 = f10;
        int i19 = this.f1422a;
        int i20 = this.f1423b;
        int i21 = 1;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i22 = this.f1431k;
            int i23 = this.f1429h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f1438r;
                    if (i25 > 0) {
                        int min = Math.min(i23, i25);
                        a(this.j, i24, min);
                        this.f1438r -= min;
                        i24 += min;
                        i8 = i18;
                        f7 = f11;
                        i7 = i19;
                    } else {
                        short[] sArr = this.j;
                        int i26 = i19 > 4000 ? i19 / 4000 : i21;
                        int i27 = this.f1428g;
                        int i28 = this.f1427f;
                        if (i20 == i21 && i26 == i21) {
                            i9 = d(sArr, i24, i28, i27);
                            i8 = i18;
                            f7 = f11;
                            i7 = i19;
                        } else {
                            b(sArr, i24, i26);
                            i7 = i19;
                            i8 = i18;
                            short[] sArr2 = this.f1430i;
                            f7 = f11;
                            int d8 = d(sArr2, 0, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = d8 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i20 == 1) {
                                    i9 = d(sArr, i24, i28, i27);
                                } else {
                                    b(sArr, i24, 1);
                                    i9 = d(sArr2, 0, i28, i27);
                                }
                            } else {
                                i9 = d8;
                            }
                        }
                        int i33 = this.f1441u;
                        int i34 = this.f1442v;
                        if (i33 == 0 || (i10 = this.f1439s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f1440t * 3) {
                            i10 = i9;
                        }
                        this.f1440t = i33;
                        this.f1439s = i9;
                        if (d7 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f10 >= 2.0f) {
                                i12 = (int) (i10 / (f10 - 1.0f));
                            } else {
                                this.f1438r = (int) (((2.0f - f10) * i10) / (f10 - 1.0f));
                                i12 = i10;
                            }
                            short[] c3 = c(this.f1432l, this.f1433m, i12);
                            this.f1432l = c3;
                            int i35 = i24;
                            e(i12, this.f1423b, c3, this.f1433m, sArr3, i35, sArr3, i24 + i10);
                            this.f1433m += i12;
                            i24 = i10 + i12 + i35;
                        } else {
                            int i36 = i24;
                            short[] sArr4 = this.j;
                            if (f10 < 0.5f) {
                                i11 = (int) ((i10 * f10) / (1.0f - f10));
                            } else {
                                this.f1438r = (int) ((((2.0f * f10) - 1.0f) * i10) / (1.0f - f10));
                                i11 = i10;
                            }
                            int i37 = i10 + i11;
                            short[] c4 = c(this.f1432l, this.f1433m, i37);
                            this.f1432l = c4;
                            System.arraycopy(sArr4, i36 * i20, c4, this.f1433m * i20, i10 * i20);
                            e(i11, this.f1423b, this.f1432l, this.f1433m + i10, sArr4, i36 + i10, sArr4, i36);
                            this.f1433m += i37;
                            i24 = i36 + i11;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    i19 = i7;
                    i18 = i8;
                    f11 = f7;
                    i21 = 1;
                }
                int i38 = this.f1431k - i24;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i24 * i20, sArr5, 0, i38 * i20);
                this.f1431k = i38;
                if (f7 != 1.0f || this.f1433m == (i13 = i8)) {
                }
                int i39 = i7;
                int i40 = (int) (i39 / f7);
                int i41 = i39;
                while (true) {
                    if (i40 <= 16384 && i41 <= 16384) {
                        break;
                    }
                    i40 /= 2;
                    i41 /= 2;
                }
                int i42 = this.f1433m - i13;
                short[] c7 = c(this.f1434n, this.f1435o, i42);
                this.f1434n = c7;
                System.arraycopy(this.f1432l, i13 * i20, c7, this.f1435o * i20, i42 * i20);
                this.f1433m = i13;
                this.f1435o += i42;
                int i43 = 0;
                while (true) {
                    i14 = this.f1435o;
                    i15 = i14 - 1;
                    if (i43 >= i15) {
                        break;
                    }
                    while (true) {
                        i16 = this.f1436p + 1;
                        int i44 = i16 * i40;
                        i17 = this.f1437q;
                        if (i44 <= i17 * i41) {
                            break;
                        }
                        this.f1432l = c(this.f1432l, this.f1433m, 1);
                        for (int i45 = 0; i45 < i20; i45++) {
                            short[] sArr6 = this.f1432l;
                            int i46 = (this.f1433m * i20) + i45;
                            short[] sArr7 = this.f1434n;
                            int i47 = (i43 * i20) + i45;
                            short s7 = sArr7[i47];
                            short s8 = sArr7[i47 + i20];
                            int i48 = this.f1437q * i41;
                            int i49 = this.f1436p;
                            int i50 = i49 * i40;
                            int i51 = (i49 + 1) * i40;
                            int i52 = i51 - i48;
                            int i53 = i51 - i50;
                            sArr6[i46] = (short) ((((i53 - i52) * s8) + (s7 * i52)) / i53);
                        }
                        this.f1437q++;
                        this.f1433m++;
                    }
                    this.f1436p = i16;
                    if (i16 == i41) {
                        this.f1436p = 0;
                        AbstractC1664a.h(i17 == i40);
                        this.f1437q = 0;
                    }
                    i43++;
                }
                if (i15 == 0) {
                    return;
                }
                short[] sArr8 = this.f1434n;
                System.arraycopy(sArr8, i15 * i20, sArr8, 0, (i14 - i15) * i20);
                this.f1435o -= i15;
                return;
            }
        } else {
            a(this.j, 0, this.f1431k);
            this.f1431k = 0;
        }
        i8 = i18;
        f7 = f11;
        i7 = i19;
        if (f7 != 1.0f) {
        }
    }
}
