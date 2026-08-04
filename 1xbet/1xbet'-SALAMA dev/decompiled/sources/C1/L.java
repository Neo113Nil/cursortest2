package C1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f1430i;
    public short[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f1432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f1434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1441u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
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
        short[] sArrC = c(this.f1432l, this.f1433m, i8);
        this.f1432l = sArrC;
        int i9 = this.f1423b;
        System.arraycopy(sArr, i7 * i9, sArrC, this.f1433m * i9, i9 * i8);
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
            int iAbs = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                iAbs += Math.abs(sArr[i10 + i15] - sArr[(i10 + i8) + i15]);
            }
            if (iAbs * i13 < i12 * i8) {
                i13 = i8;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * i8) {
                i11 = i8;
                i14 = iAbs;
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
        int iD;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f1433m;
        float f8 = this.f1424c;
        float f9 = this.f1425d;
        float f10 = f8 / f9;
        float f11 = this.f1426e * f9;
        double d7 = f10;
        int i18 = this.f1422a;
        int i19 = this.f1423b;
        int i20 = 1;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i21 = this.f1431k;
            int i22 = this.f1429h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f1438r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.j, i23, iMin);
                        this.f1438r -= iMin;
                        i23 += iMin;
                        i8 = i17;
                        f7 = f11;
                        i7 = i18;
                    } else {
                        short[] sArr = this.j;
                        int i25 = i18 > 4000 ? i18 / 4000 : i20;
                        int i26 = this.f1428g;
                        int i27 = this.f1427f;
                        if (i19 == i20 && i25 == i20) {
                            iD = d(sArr, i23, i27, i26);
                            i8 = i17;
                            f7 = f11;
                            i7 = i18;
                        } else {
                            b(sArr, i23, i25);
                            i7 = i18;
                            i8 = i17;
                            short[] sArr2 = this.f1430i;
                            f7 = f11;
                            int iD2 = d(sArr2, 0, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = iD2 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f1441u;
                        int i33 = this.f1442v;
                        if (i32 == 0 || (i9 = this.f1439s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f1440t * 3) {
                            i9 = iD;
                        }
                        this.f1440t = i32;
                        this.f1439s = iD;
                        if (d7 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f10 >= 2.0f) {
                                i11 = (int) (i9 / (f10 - 1.0f));
                            } else {
                                this.f1438r = (int) (((2.0f - f10) * i9) / (f10 - 1.0f));
                                i11 = i9;
                            }
                            short[] sArrC = c(this.f1432l, this.f1433m, i11);
                            this.f1432l = sArrC;
                            int i34 = i23;
                            e(i11, this.f1423b, sArrC, this.f1433m, sArr3, i34, sArr3, i23 + i9);
                            this.f1433m += i11;
                            i23 = i9 + i11 + i34;
                        } else {
                            int i35 = i23;
                            short[] sArr4 = this.j;
                            if (f10 < 0.5f) {
                                i10 = (int) ((i9 * f10) / (1.0f - f10));
                            } else {
                                this.f1438r = (int) ((((2.0f * f10) - 1.0f) * i9) / (1.0f - f10));
                                i10 = i9;
                            }
                            int i36 = i9 + i10;
                            short[] sArrC2 = c(this.f1432l, this.f1433m, i36);
                            this.f1432l = sArrC2;
                            System.arraycopy(sArr4, i35 * i19, sArrC2, this.f1433m * i19, i9 * i19);
                            e(i10, this.f1423b, this.f1432l, this.f1433m + i9, sArr4, i35 + i9, sArr4, i35);
                            this.f1433m += i36;
                            i23 = i35 + i10;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    i18 = i7;
                    i17 = i8;
                    f11 = f7;
                    i20 = 1;
                }
                int i37 = this.f1431k - i23;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i23 * i19, sArr5, 0, i37 * i19);
                this.f1431k = i37;
            }
            if (f7 != 1.0f || this.f1433m == (i12 = i8)) {
            }
            int i38 = i7;
            int i39 = (int) (i38 / f7);
            int i40 = i38;
            while (true) {
                if (i39 <= 16384 && i40 <= 16384) {
                    break;
                }
                i39 /= 2;
                i40 /= 2;
            }
            int i41 = this.f1433m - i12;
            short[] sArrC3 = c(this.f1434n, this.f1435o, i41);
            this.f1434n = sArrC3;
            System.arraycopy(this.f1432l, i12 * i19, sArrC3, this.f1435o * i19, i41 * i19);
            this.f1433m = i12;
            this.f1435o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f1435o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f1436p + 1;
                    int i43 = i15 * i39;
                    i16 = this.f1437q;
                    if (i43 <= i16 * i40) {
                        break;
                    }
                    this.f1432l = c(this.f1432l, this.f1433m, 1);
                    for (int i44 = 0; i44 < i19; i44++) {
                        short[] sArr6 = this.f1432l;
                        int i45 = (this.f1433m * i19) + i44;
                        short[] sArr7 = this.f1434n;
                        int i46 = (i42 * i19) + i44;
                        short s7 = sArr7[i46];
                        short s8 = sArr7[i46 + i19];
                        int i47 = this.f1437q * i40;
                        int i48 = this.f1436p;
                        int i49 = i48 * i39;
                        int i50 = (i48 + 1) * i39;
                        int i51 = i50 - i47;
                        int i52 = i50 - i49;
                        sArr6[i45] = (short) ((((i52 - i51) * s8) + (s7 * i51)) / i52);
                    }
                    this.f1437q++;
                    this.f1433m++;
                }
                this.f1436p = i15;
                if (i15 == i40) {
                    this.f1436p = 0;
                    p151v2.a.h(i16 == i39);
                    this.f1437q = 0;
                }
                i42++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f1434n;
            System.arraycopy(sArr8, i14 * i19, sArr8, 0, (i13 - i14) * i19);
            this.f1435o -= i14;
            return;
        }
        a(this.j, 0, this.f1431k);
        this.f1431k = 0;
        i8 = i17;
        f7 = f11;
        i7 = i18;
        if (f7 != 1.0f) {
        }
    }
}
