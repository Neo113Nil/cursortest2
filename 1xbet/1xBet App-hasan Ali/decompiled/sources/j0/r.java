package j0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f17475a;

    /* renamed from: b, reason: collision with root package name */
    public final double f17476b;

    /* renamed from: c, reason: collision with root package name */
    public final double f17477c;

    /* renamed from: d, reason: collision with root package name */
    public final double f17478d;

    /* renamed from: e, reason: collision with root package name */
    public final double f17479e;
    public final double f;

    /* renamed from: g, reason: collision with root package name */
    public final double f17480g;

    public /* synthetic */ r(double d5, double d6, double d7, double d8, double d9) {
        this(d5, d6, d7, d8, d9, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f17475a, rVar.f17475a) == 0 && Double.compare(this.f17476b, rVar.f17476b) == 0 && Double.compare(this.f17477c, rVar.f17477c) == 0 && Double.compare(this.f17478d, rVar.f17478d) == 0 && Double.compare(this.f17479e, rVar.f17479e) == 0 && Double.compare(this.f, rVar.f) == 0 && Double.compare(this.f17480g, rVar.f17480g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f17475a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f17476b);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.f17477c);
        int i5 = (i + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        long doubleToLongBits4 = Double.doubleToLongBits(this.f17478d);
        int i6 = (i5 + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31;
        long doubleToLongBits5 = Double.doubleToLongBits(this.f17479e);
        int i7 = (i6 + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31;
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i8 = (i7 + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31;
        long doubleToLongBits7 = Double.doubleToLongBits(this.f17480g);
        return i8 + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f17475a + ", a=" + this.f17476b + ", b=" + this.f17477c + ", c=" + this.f17478d + ", d=" + this.f17479e + ", e=" + this.f + ", f=" + this.f17480g + ')';
    }

    public r(double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.f17475a = d5;
        this.f17476b = d6;
        this.f17477c = d7;
        this.f17478d = d8;
        this.f17479e = d9;
        this.f = d10;
        this.f17480g = d11;
        if (Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 == -2.0d || d5 == -3.0d) {
            return;
        }
        if (d9 < 0.0d || d9 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d9);
        }
        if (d9 == 0.0d && (d6 == 0.0d || d5 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d9 >= 1.0d && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == 0.0d || d5 == 0.0d) && d8 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < 0.0d || d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
