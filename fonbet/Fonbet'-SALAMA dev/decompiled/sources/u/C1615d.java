package u;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615d extends C1616e {

    /* renamed from: e, reason: collision with root package name */
    public final double f16496e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16497f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16498g;

    /* renamed from: h, reason: collision with root package name */
    public final double f16499h;

    public C1615d(String str) {
        super(0);
        this.f16503b = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f16496e = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i7 = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i7);
        this.f16497f = Double.parseDouble(str.substring(i7, indexOf3).trim());
        int i8 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i8);
        this.f16498g = Double.parseDouble(str.substring(i8, indexOf4).trim());
        int i9 = indexOf4 + 1;
        this.f16499h = Double.parseDouble(str.substring(i9, str.indexOf(41, i9)).trim());
    }

    @Override // u.C1616e
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
        double e7 = e(d10);
        double d11 = d9 + d8;
        double e8 = e(d11);
        double f7 = f(d10);
        return (((d7 - e7) * (f(d11) - f7)) / (e8 - e7)) + f7;
    }

    @Override // u.C1616e
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
        return (this.f16498g * d11) + (this.f16496e * d10) + (d7 * d7 * d7);
    }

    public final double f(double d7) {
        double d8 = 1.0d - d7;
        double d9 = 3.0d * d8;
        double d10 = d8 * d9 * d7;
        double d11 = d9 * d7 * d7;
        return (this.f16499h * d11) + (this.f16497f * d10) + (d7 * d7 * d7);
    }
}
