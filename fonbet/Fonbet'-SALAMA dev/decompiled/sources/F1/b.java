package F1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2507b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2508c;

    /* renamed from: d, reason: collision with root package name */
    public long f2509d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f2510e;

    /* renamed from: f, reason: collision with root package name */
    public long f2511f;

    /* renamed from: g, reason: collision with root package name */
    public long f2512g;

    /* renamed from: h, reason: collision with root package name */
    public long f2513h;

    public b(long j, long j3, long j7, long j8, long j9, long j10) {
        this.f2506a = j;
        this.f2507b = j3;
        this.f2510e = j7;
        this.f2511f = j8;
        this.f2512g = j9;
        this.f2508c = j10;
        this.f2513h = a(j3, 0L, j7, j8, j9, j10);
    }

    public static long a(long j, long j3, long j7, long j8, long j9, long j10) {
        if (j8 + 1 >= j9 || j3 + 1 >= j7) {
            return j8;
        }
        long j11 = (long) ((j - j3) * ((j9 - j8) / (j7 - j3)));
        return v2.t.k(((j11 + j8) - j10) - (j11 / 20), j8, j9 - 1);
    }
}
