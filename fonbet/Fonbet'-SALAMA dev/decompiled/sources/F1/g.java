package F1;

/* loaded from: classes.dex */
public class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final long f2524a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2525b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2526c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2527d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2528e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2529f;

    /* renamed from: g, reason: collision with root package name */
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
            this.f2529f = (Math.max(0L, j7) * 8000000) / i7;
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
        long j9 = (((i7 * j) / 8000000) / j8) * j8;
        if (j3 != -1) {
            j9 = Math.min(j9, j3 - j8);
        }
        long max = Math.max(j9, 0L) + j7;
        long max2 = (Math.max(0L, max - j7) * 8000000) / i7;
        t tVar2 = new t(max2, max);
        if (j3 != -1 && max2 < j) {
            long j10 = max + j8;
            if (j10 < this.f2524a) {
                return new r(tVar2, new t((Math.max(0L, j10 - j7) * 8000000) / i7, j10));
            }
        }
        return new r(tVar2, tVar2);
    }

    @Override // F1.s
    public final long i() {
        return this.f2529f;
    }
}
