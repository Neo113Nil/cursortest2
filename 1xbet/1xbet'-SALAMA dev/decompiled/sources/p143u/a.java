package p143u;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f16480s = new double[91];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f16481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f16483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f16484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f16485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f16486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f16487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f16488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f16489i;
    public double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f16490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f16491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f16492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f16493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f16494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f16495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16497r;

    public final double a() {
        double d7 = this.j * this.f16495p;
        double dHypot = this.f16493n / Math.hypot(d7, (-this.f16490k) * this.f16494o);
        if (this.f16496q) {
            d7 = -d7;
        }
        return d7 * dHypot;
    }

    public final double b() {
        double d7 = this.j * this.f16495p;
        double d8 = (-this.f16490k) * this.f16494o;
        double dHypot = this.f16493n / Math.hypot(d7, d8);
        return this.f16496q ? (-d8) * dHypot : d8 * dHypot;
    }

    public final double c(double d7) {
        double d8 = (d7 - this.f16483c) * this.f16489i;
        double d9 = this.f16486f;
        double d10 = this.f16485e;
        return ((d9 - d10) * d8) + d10;
    }

    public final double d(double d7) {
        double d8 = (d7 - this.f16483c) * this.f16489i;
        double d9 = this.f16488h;
        double d10 = this.f16487g;
        return ((d9 - d10) * d8) + d10;
    }

    public final double e() {
        return (this.j * this.f16494o) + this.f16491l;
    }

    public final double f() {
        return (this.f16490k * this.f16495p) + this.f16492m;
    }

    public final void g(double d7) {
        double d8 = (this.f16496q ? this.f16484d - d7 : d7 - this.f16483c) * this.f16489i;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            d9 = 1.0d;
            if (d8 < 1.0d) {
                double[] dArr = this.f16481a;
                double length = d8 * ((double) (dArr.length - 1));
                int i7 = (int) length;
                double d10 = dArr[i7];
                d9 = ((dArr[i7 + 1] - d10) * (length - ((double) i7))) + d10;
            }
        }
        double d11 = d9 * 1.5707963267948966d;
        this.f16494o = Math.sin(d11);
        this.f16495p = Math.cos(d11);
    }
}
