package p143u;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f16517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f16518f;

    @Override // p143u.e
    public final double a(double d7) {
        double d8 = this.f16518f;
        double d9 = this.f16517e;
        if (d7 < d8) {
            return (d8 * d7) / (((d8 - d7) * d9) + d7);
        }
        return ((d7 - 1.0d) * (1.0d - d8)) / ((1.0d - d7) - ((d8 - d7) * d9));
    }

    @Override // p143u.e
    public final double b(double d7) {
        double d8 = this.f16518f;
        double d9 = this.f16517e;
        if (d7 < d8) {
            double d10 = d9 * d8 * d8;
            double d11 = ((d8 - d7) * d9) + d7;
            return d10 / (d11 * d11);
        }
        double d12 = d8 - 1.0d;
        double d13 = (((d8 - d7) * (-d9)) - d7) + 1.0d;
        return ((d12 * d9) * d12) / (d13 * d13);
    }
}
