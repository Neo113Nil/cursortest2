package u;

import java.lang.reflect.Array;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618g extends q4.d {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f16507a;

    /* renamed from: b, reason: collision with root package name */
    public final double[][] f16508b;

    /* renamed from: c, reason: collision with root package name */
    public final double[][] f16509c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f16510d;

    public C1618g(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f16510d = new double[length2];
        int i7 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i7, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i8 = 0; i8 < length2; i8++) {
            int i9 = 0;
            while (i9 < i7) {
                int i10 = i9 + 1;
                double d7 = dArr[i10] - dArr[i9];
                double[] dArr5 = dArr3[i9];
                double d8 = (dArr2[i10][i8] - dArr2[i9][i8]) / d7;
                dArr5[i8] = d8;
                if (i9 == 0) {
                    dArr4[i9][i8] = d8;
                } else {
                    dArr4[i9][i8] = (dArr3[i9 - 1][i8] + d8) * 0.5d;
                }
                i9 = i10;
            }
            dArr4[i7][i8] = dArr3[length - 2][i8];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < length2; i12++) {
                double d9 = dArr3[i11][i12];
                if (d9 == 0.0d) {
                    dArr4[i11][i12] = 0.0d;
                    dArr4[i11 + 1][i12] = 0.0d;
                } else {
                    double d10 = dArr4[i11][i12] / d9;
                    int i13 = i11 + 1;
                    double d11 = dArr4[i13][i12] / d9;
                    double hypot = Math.hypot(d10, d11);
                    if (hypot > 9.0d) {
                        double d12 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i11];
                        double[] dArr7 = dArr3[i11];
                        dArr6[i12] = d10 * d12 * dArr7[i12];
                        dArr4[i13][i12] = d12 * d11 * dArr7[i12];
                    }
                }
            }
        }
        this.f16507a = dArr;
        this.f16508b = dArr2;
        this.f16509c = dArr4;
    }

    public static double l(double d7, double d8, double d9, double d10, double d11, double d12) {
        double d13 = d8 * d8;
        double d14 = d8 * 6.0d;
        double d15 = 6.0d * d13 * d9;
        double d16 = 3.0d * d7;
        return (d7 * d11) + (((((d16 * d11) * d13) + (((d16 * d12) * d13) + ((d15 + ((d14 * d10) + (((-6.0d) * d13) * d10))) - (d14 * d9)))) - (((2.0d * d7) * d12) * d8)) - (((4.0d * d7) * d11) * d8));
    }

    public static double m(double d7, double d8, double d9, double d10, double d11, double d12) {
        double d13 = d8 * d8;
        double d14 = d13 * d8;
        double d15 = 3.0d * d13;
        double d16 = d14 * 2.0d * d9;
        double d17 = ((d16 + ((d15 * d10) + (((-2.0d) * d14) * d10))) - (d15 * d9)) + d9;
        double d18 = d7 * d12;
        double d19 = (d18 * d14) + d17;
        double d20 = d7 * d11;
        return (d20 * d8) + ((((d14 * d20) + d19) - (d18 * d13)) - (((2.0d * d7) * d11) * d13));
    }

    @Override // q4.d
    public final double d(double d7) {
        double d8;
        double d9;
        double g3;
        double[] dArr = this.f16507a;
        int length = dArr.length;
        double d10 = dArr[0];
        double[][] dArr2 = this.f16508b;
        if (d7 <= d10) {
            d8 = dArr2[0][0];
            d9 = d7 - d10;
            g3 = g(d10);
        } else {
            int i7 = length - 1;
            double d11 = dArr[i7];
            if (d7 < d11) {
                int i8 = 0;
                while (i8 < i7) {
                    double d12 = dArr[i8];
                    if (d7 == d12) {
                        return dArr2[i8][0];
                    }
                    int i9 = i8 + 1;
                    double d13 = dArr[i9];
                    if (d7 < d13) {
                        double d14 = d13 - d12;
                        double d15 = (d7 - d12) / d14;
                        double d16 = dArr2[i8][0];
                        double d17 = dArr2[i9][0];
                        double[][] dArr3 = this.f16509c;
                        return m(d14, d15, d16, d17, dArr3[i8][0], dArr3[i9][0]);
                    }
                    i8 = i9;
                }
                return 0.0d;
            }
            d8 = dArr2[i7][0];
            d9 = d7 - d11;
            g3 = g(d11);
        }
        return (g3 * d9) + d8;
    }

    @Override // q4.d
    public final void e(double d7, double[] dArr) {
        double[] dArr2 = this.f16507a;
        int length = dArr2.length;
        double[][] dArr3 = this.f16508b;
        int i7 = 0;
        int length2 = dArr3[0].length;
        double d8 = dArr2[0];
        double[] dArr4 = this.f16510d;
        if (d7 <= d8) {
            h(d8, dArr4);
            for (int i8 = 0; i8 < length2; i8++) {
                dArr[i8] = ((d7 - dArr2[0]) * dArr4[i8]) + dArr3[0][i8];
            }
            return;
        }
        int i9 = length - 1;
        double d9 = dArr2[i9];
        if (d7 >= d9) {
            h(d9, dArr4);
            while (i7 < length2) {
                dArr[i7] = ((d7 - dArr2[i9]) * dArr4[i7]) + dArr3[i9][i7];
                i7++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < length - 1) {
            if (d7 == dArr2[i10]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = dArr3[i10][i11];
                }
            }
            int i12 = i10 + 1;
            double d10 = dArr2[i12];
            if (d7 < d10) {
                double d11 = dArr2[i10];
                double d12 = d10 - d11;
                double d13 = (d7 - d11) / d12;
                while (i7 < length2) {
                    double d14 = dArr3[i10][i7];
                    double d15 = dArr3[i12][i7];
                    double[][] dArr5 = this.f16509c;
                    dArr[i7] = m(d12, d13, d14, d15, dArr5[i10][i7], dArr5[i12][i7]);
                    i7++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // q4.d
    public final void f(double d7, float[] fArr) {
        double[] dArr = this.f16507a;
        int length = dArr.length;
        double[][] dArr2 = this.f16508b;
        int i7 = 0;
        int length2 = dArr2[0].length;
        double d8 = dArr[0];
        double[] dArr3 = this.f16510d;
        if (d7 <= d8) {
            h(d8, dArr3);
            for (int i8 = 0; i8 < length2; i8++) {
                fArr[i8] = (float) (((d7 - dArr[0]) * dArr3[i8]) + dArr2[0][i8]);
            }
            return;
        }
        int i9 = length - 1;
        double d9 = dArr[i9];
        if (d7 >= d9) {
            h(d9, dArr3);
            while (i7 < length2) {
                fArr[i7] = (float) (((d7 - dArr[i9]) * dArr3[i7]) + dArr2[i9][i7]);
                i7++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < length - 1) {
            if (d7 == dArr[i10]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) dArr2[i10][i11];
                }
            }
            int i12 = i10 + 1;
            double d10 = dArr[i12];
            if (d7 < d10) {
                double d11 = dArr[i10];
                double d12 = d10 - d11;
                double d13 = (d7 - d11) / d12;
                while (i7 < length2) {
                    double d14 = dArr2[i10][i7];
                    double d15 = dArr2[i12][i7];
                    double[][] dArr4 = this.f16509c;
                    fArr[i7] = (float) m(d12, d13, d14, d15, dArr4[i10][i7], dArr4[i12][i7]);
                    i7++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // q4.d
    public final double g(double d7) {
        double[] dArr = this.f16507a;
        int length = dArr.length;
        double d8 = dArr[0];
        if (d7 >= d8) {
            d8 = dArr[length - 1];
            if (d7 < d8) {
                d8 = d7;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i8 = i7 + 1;
            double d9 = dArr[i8];
            if (d8 <= d9) {
                double d10 = dArr[i7];
                double d11 = d9 - d10;
                double[][] dArr2 = this.f16508b;
                double d12 = dArr2[i7][0];
                double d13 = dArr2[i8][0];
                double[][] dArr3 = this.f16509c;
                return l(d11, (d8 - d10) / d11, d12, d13, dArr3[i7][0], dArr3[i8][0]) / d11;
            }
            i7 = i8;
        }
        return 0.0d;
    }

    @Override // q4.d
    public final void h(double d7, double[] dArr) {
        double[] dArr2 = this.f16507a;
        int length = dArr2.length;
        double[][] dArr3 = this.f16508b;
        int length2 = dArr3[0].length;
        double d8 = dArr2[0];
        if (d7 > d8) {
            d8 = dArr2[length - 1];
            if (d7 < d8) {
                d8 = d7;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i8 = i7 + 1;
            double d9 = dArr2[i8];
            if (d8 <= d9) {
                double d10 = dArr2[i7];
                double d11 = d9 - d10;
                double d12 = (d8 - d10) / d11;
                for (int i9 = 0; i9 < length2; i9++) {
                    double d13 = dArr3[i7][i9];
                    double d14 = dArr3[i8][i9];
                    double[][] dArr4 = this.f16509c;
                    dArr[i9] = l(d11, d12, d13, d14, dArr4[i7][i9], dArr4[i8][i9]) / d11;
                }
                return;
            }
            i7 = i8;
        }
    }

    @Override // q4.d
    public final double[] i() {
        return this.f16507a;
    }
}
