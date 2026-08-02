package u;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614c extends q4.d {

    /* renamed from: a, reason: collision with root package name */
    public double f16494a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f16495b;

    @Override // q4.d
    public final double d(double d7) {
        return this.f16495b[0];
    }

    @Override // q4.d
    public final void e(double d7, double[] dArr) {
        double[] dArr2 = this.f16495b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // q4.d
    public final void f(double d7, float[] fArr) {
        int i7 = 0;
        while (true) {
            double[] dArr = this.f16495b;
            if (i7 >= dArr.length) {
                return;
            }
            fArr[i7] = (float) dArr[i7];
            i7++;
        }
    }

    @Override // q4.d
    public final double g(double d7) {
        return 0.0d;
    }

    @Override // q4.d
    public final void h(double d7, double[] dArr) {
        for (int i7 = 0; i7 < this.f16495b.length; i7++) {
            dArr[i7] = 0.0d;
        }
    }

    @Override // q4.d
    public final double[] i() {
        return new double[]{this.f16494a};
    }
}
