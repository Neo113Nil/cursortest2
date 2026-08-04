package p143u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f16502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f16503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f16504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f16505h;

    public d(String str) {
        super(0);
        this.f16509b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f16502e = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i7 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i7);
        this.f16503f = Double.parseDouble(str.substring(i7, iIndexOf3).trim());
        int i8 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i8);
        this.f16504g = Double.parseDouble(str.substring(i8, iIndexOf4).trim());
        int i9 = iIndexOf4 + 1;
        this.f16505h = Double.parseDouble(str.substring(i9, str.indexOf(41, i9)).trim());
    }

    @Override // p143u.e
    public final double a(double d7) {
        if (d7 <= 0.0d) {
            return 0.0d;
        }
        if (d7 >= 1.0d) {
            return 1.0d;
        }
        double d8 = 0.5d;
        double d9 = 0.5d;
        while (d8 > 0.01d) {
            d8 *= 0.5d;
            d9 = e(d9) < d7 ? d9 + d8 : d9 - d8;
        }
        double d10 = d9 - d8;
        double dE = e(d10);
        double d11 = d9 + d8;
        double dE2 = e(d11);
        double dF = f(d10);
        return (((d7 - dE) * (f(d11) - dF)) / (dE2 - dE)) + dF;
    }

    @Override // p143u.e
    public final double b(double d7) {
        double d8 = 0.5d;
        double d9 = 0.5d;
        while (d8 > 1.0E-4d) {
            d8 *= 0.5d;
            d9 = e(d9) < d7 ? d9 + d8 : d9 - d8;
        }
        double d10 = d9 - d8;
        double d11 = d9 + d8;
        return (f(d11) - f(d10)) / (e(d11) - e(d10));
    }

    public final double e(double d7) {
        double d8 = 1.0d - d7;
        double d9 = 3.0d * d8;
        double d10 = d8 * d9 * d7;
        double d11 = d9 * d7 * d7;
        return (this.f16504g * d11) + (this.f16502e * d10) + (d7 * d7 * d7);
    }

    public final double f(double d7) {
        double d8 = 1.0d - d7;
        double d9 = 3.0d * d8;
        double d10 = d8 * d9 * d7;
        double d11 = d9 * d7 * d7;
        return (this.f16505h * d11) + (this.f16503f * d10) + (d7 * d7 * d7);
    }
}
