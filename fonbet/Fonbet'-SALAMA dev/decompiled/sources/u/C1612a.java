package u;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612a {

    /* renamed from: s, reason: collision with root package name */
    public static final double[] f16474s = new double[91];

    /* renamed from: a, reason: collision with root package name */
    public double[] f16475a;

    /* renamed from: b, reason: collision with root package name */
    public double f16476b;

    /* renamed from: c, reason: collision with root package name */
    public double f16477c;

    /* renamed from: d, reason: collision with root package name */
    public double f16478d;

    /* renamed from: e, reason: collision with root package name */
    public double f16479e;

    /* renamed from: f, reason: collision with root package name */
    public double f16480f;

    /* renamed from: g, reason: collision with root package name */
    public double f16481g;

    /* renamed from: h, reason: collision with root package name */
    public double f16482h;

    /* renamed from: i, reason: collision with root package name */
    public double f16483i;
    public double j;

    /* renamed from: k, reason: collision with root package name */
    public double f16484k;

    /* renamed from: l, reason: collision with root package name */
    public double f16485l;

    /* renamed from: m, reason: collision with root package name */
    public double f16486m;

    /* renamed from: n, reason: collision with root package name */
    public double f16487n;

    /* renamed from: o, reason: collision with root package name */
    public double f16488o;

    /* renamed from: p, reason: collision with root package name */
    public double f16489p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16490q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16491r;

    public final double a() {
        double d7 = this.j * this.f16489p;
        double hypot = this.f16487n / Math.hypot(d7, (-this.f16484k) * this.f16488o);
        if (this.f16490q) {
            d7 = -d7;
        }
        return d7 * hypot;
    }

    public final double b() {
        double d7 = this.j * this.f16489p;
        double d8 = (-this.f16484k) * this.f16488o;
        double hypot = this.f16487n / Math.hypot(d7, d8);
        return this.f16490q ? (-d8) * hypot : d8 * hypot;
    }

    public final double c(double d7) {
        double d8 = (d7 - this.f16477c) * this.f16483i;
        double d9 = this.f16480f;
        double d10 = this.f16479e;
        return ((d9 - d10) * d8) + d10;
    }

    public final double d(double d7) {
        double d8 = (d7 - this.f16477c) * this.f16483i;
        double d9 = this.f16482h;
        double d10 = this.f16481g;
        return ((d9 - d10) * d8) + d10;
    }

    public final double e() {
        return (this.j * this.f16488o) + this.f16485l;
    }

    public final double f() {
        return (this.f16484k * this.f16489p) + this.f16486m;
    }

    public final void g(double d7) {
        double d8 = (this.f16490q ? this.f16478d - d7 : d7 - this.f16477c) * this.f16483i;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            d9 = 1.0d;
            if (d8 < 1.0d) {
                double[] dArr = this.f16475a;
                double length = d8 * (dArr.length - 1);
                int i7 = (int) length;
                double d10 = dArr[i7];
                d9 = ((dArr[i7 + 1] - d10) * (length - i7)) + d10;
            }
        }
        double d11 = d9 * 1.5707963267948966d;
        this.f16488o = Math.sin(d11);
        this.f16489p = Math.cos(d11);
    }
}
