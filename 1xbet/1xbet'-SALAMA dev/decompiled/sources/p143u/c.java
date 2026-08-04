package p143u;

import p120q4.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f16501b;

    @Override // p120q4.d
    public final double d(double d7) {
        return this.f16501b[0];
    }

    @Override // p120q4.d
    public final void e(double d7, double[] dArr) {
        double[] dArr2 = this.f16501b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p120q4.d
    public final void f(double d7, float[] fArr) {
        int i7 = 0;
        while (true) {
            double[] dArr = this.f16501b;
            if (i7 >= dArr.length) {
                return;
            }
            fArr[i7] = (float) dArr[i7];
            i7++;
        }
    }

    @Override // p120q4.d
    public final double g(double d7) {
        return 0.0d;
    }

    @Override // p120q4.d
    public final void h(double d7, double[] dArr) {
        for (int i7 = 0; i7 < this.f16501b.length; i7++) {
            dArr[i7] = 0.0d;
        }
    }

    @Override // p120q4.d
    public final double[] i() {
        return new double[]{this.f16500a};
    }
}
