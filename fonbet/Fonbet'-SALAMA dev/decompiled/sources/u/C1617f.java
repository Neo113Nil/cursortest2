package u;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617f extends q4.d {

    /* renamed from: a, reason: collision with root package name */
    public double[] f16504a;

    /* renamed from: b, reason: collision with root package name */
    public double[][] f16505b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f16506c;

    @Override // q4.d
    public final double d(double d7) {
        double d8;
        double d9;
        double g3;
        double[] dArr = this.f16504a;
        int length = dArr.length;
        double d10 = dArr[0];
        double[][] dArr2 = this.f16505b;
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
                        double d14 = (d7 - d12) / (d13 - d12);
                        return (dArr2[i9][0] * d14) + ((1.0d - d14) * dArr2[i8][0]);
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
        double[] dArr2 = this.f16504a;
        int length = dArr2.length;
        double[][] dArr3 = this.f16505b;
        int i7 = 0;
        int length2 = dArr3[0].length;
        double d8 = dArr2[0];
        double[] dArr4 = this.f16506c;
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
                double d12 = (d7 - d11) / (d10 - d11);
                while (i7 < length2) {
                    dArr[i7] = (dArr3[i12][i7] * d12) + ((1.0d - d12) * dArr3[i10][i7]);
                    i7++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // q4.d
    public final void f(double d7, float[] fArr) {
        double[] dArr = this.f16504a;
        int length = dArr.length;
        double[][] dArr2 = this.f16505b;
        int i7 = 0;
        int length2 = dArr2[0].length;
        double d8 = dArr[0];
        double[] dArr3 = this.f16506c;
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
                double d12 = (d7 - d11) / (d10 - d11);
                while (i7 < length2) {
                    fArr[i7] = (float) ((dArr2[i12][i7] * d12) + ((1.0d - d12) * dArr2[i10][i7]));
                    i7++;
                }
                return;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r9 >= r3) goto L4;
     */
    @Override // q4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double g(double d7) {
        double[] dArr = this.f16504a;
        int length = dArr.length;
        double d8 = dArr[0];
        if (d7 >= d8) {
            d8 = dArr[length - 1];
        }
        d7 = d8;
        int i7 = 0;
        while (i7 < length - 1) {
            int i8 = i7 + 1;
            double d9 = dArr[i8];
            if (d7 <= d9) {
                double d10 = d9 - dArr[i7];
                double[][] dArr2 = this.f16505b;
                return (dArr2[i8][0] - dArr2[i7][0]) / d10;
            }
            i7 = i8;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r12 >= r5) goto L4;
     */
    @Override // q4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(double d7, double[] dArr) {
        double[] dArr2 = this.f16504a;
        int length = dArr2.length;
        double[][] dArr3 = this.f16505b;
        int length2 = dArr3[0].length;
        double d8 = dArr2[0];
        if (d7 > d8) {
            d8 = dArr2[length - 1];
        }
        d7 = d8;
        int i7 = 0;
        while (i7 < length - 1) {
            int i8 = i7 + 1;
            double d9 = dArr2[i8];
            if (d7 <= d9) {
                double d10 = d9 - dArr2[i7];
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = (dArr3[i8][i9] - dArr3[i7][i9]) / d10;
                }
                return;
            }
            i7 = i8;
        }
    }

    @Override // q4.d
    public final double[] i() {
        return this.f16504a;
    }
}
