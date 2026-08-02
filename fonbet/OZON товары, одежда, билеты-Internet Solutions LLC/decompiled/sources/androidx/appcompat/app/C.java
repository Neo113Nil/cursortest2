package androidx.appcompat.app;

/* loaded from: classes8.dex */
final class C {

    /* renamed from: d, reason: collision with root package name */
    private static C f37065d;

    /* renamed from: a, reason: collision with root package name */
    public long f37066a;

    /* renamed from: b, reason: collision with root package name */
    public long f37067b;

    /* renamed from: c, reason: collision with root package name */
    public int f37068c;

    static C b() {
        if (f37065d == null) {
            f37065d = new C();
        }
        return f37065d;
    }

    public final void a(double d11, double d12, long j11) {
        double d13 = (0.01720197f * ((j11 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d13) * 0.03341960161924362d) + d13 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d13) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d12) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d14 = 0.01745329238474369d * d11;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d14))) / (Math.cos(asin) * Math.cos(d14));
        if (sin3 >= 1.0d) {
            this.f37068c = 1;
            this.f37066a = -1L;
            this.f37067b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f37068c = 0;
                this.f37066a = -1L;
                this.f37067b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f37066a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f37067b = round;
            if (round >= j11 || this.f37066a <= j11) {
                this.f37068c = 1;
            } else {
                this.f37068c = 0;
            }
        }
    }
}
