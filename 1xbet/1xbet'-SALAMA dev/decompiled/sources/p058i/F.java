package p058i;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static F f13623d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13626c;

    public final void a(long j, double d7, double d8) {
        float f7 = (j - 946728000000L) / 8.64E7f;
        float f8 = (0.01720197f * f7) + 6.24006f;
        double d9 = f8;
        double dSin = (Math.sin(f8 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f8) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double d10 = (-d8) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + ((double) (Math.round(((double) (f7 - 9.0E-4f)) - d10) + 9.0E-4f)) + d10;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d11 = 0.01745329238474369d * d7;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d11))) / (Math.cos(dAsin) * Math.cos(d11));
        if (dSin3 >= 1.0d) {
            this.f13626c = 1;
            this.f13624a = -1L;
            this.f13625b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f13626c = 0;
                this.f13624a = -1L;
                this.f13625b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f13624a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f13625b = jRound;
            if (jRound >= j || this.f13624a <= j) {
                this.f13626c = 1;
            } else {
                this.f13626c = 0;
            }
        }
    }
}
