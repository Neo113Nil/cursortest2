package F1;

/* JADX INFO: loaded from: classes.dex */
public class g implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2530g;

    public g(long j, long j3, int i7, int i8, boolean z4) {
        this.f2524a = j;
        this.f2525b = j3;
        this.f2526c = i8 == -1 ? 1 : i8;
        this.f2528e = i7;
        this.f2530g = z4;
        if (j == -1) {
            this.f2527d = -1L;
            this.f2529f = -9223372036854775807L;
        } else {
            long j7 = j - j3;
            this.f2527d = j7;
            this.f2529f = (Math.max(0L, j7) * 8000000) / ((long) i7);
        }
    }

    @Override // F1.s
    public final boolean d() {
        return this.f2527d != -1 || this.f2530g;
    }

    @Override // F1.s
    public final r h(long j) {
        long j3 = this.f2527d;
        long j7 = this.f2525b;
        if (j3 == -1 && !this.f2530g) {
            t tVar = new t(0L, j7);
            return new r(tVar, tVar);
        }
        int i7 = this.f2528e;
        long j8 = this.f2526c;
        long jMin = (((((long) i7) * j) / 8000000) / j8) * j8;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j8);
        }
        long jMax = Math.max(jMin, 0L) + j7;
        long jMax2 = (Math.max(0L, jMax - j7) * 8000000) / ((long) i7);
        t tVar2 = new t(jMax2, jMax);
        if (j3 != -1 && jMax2 < j) {
            long j9 = jMax + j8;
            if (j9 < this.f2524a) {
                return new r(tVar2, new t((Math.max(0L, j9 - j7) * 8000000) / ((long) i7), j9));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override // F1.s
    public final long i() {
        return this.f2529f;
    }
}
