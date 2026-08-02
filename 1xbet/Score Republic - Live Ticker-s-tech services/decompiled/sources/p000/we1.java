package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 {

    /* JADX INFO: renamed from: d */
    public static we1 f8524d;

    /* JADX INFO: renamed from: a */
    public long f8525a;

    /* JADX INFO: renamed from: b */
    public long f8526b;

    /* JADX INFO: renamed from: c */
    public int f8527c;

    /* JADX INFO: renamed from: a */
    public final void m5322a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f8527c = 1;
            this.f8525a = -1L;
            this.f8526b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f8527c = 0;
                this.f8525a = -1L;
                this.f8526b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f8525a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f8526b = jRound;
            if (jRound >= j || this.f8525a <= j) {
                this.f8527c = 1;
            } else {
                this.f8527c = 0;
            }
        }
    }
}
