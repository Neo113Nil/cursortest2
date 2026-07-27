package P4;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f2392e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final N4.e f2393a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.j f2394b;

    /* renamed from: c, reason: collision with root package name */
    public long f2395c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2396d;

    public r(N4.e descriptor, R4.j jVar) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f2393a = descriptor;
        this.f2394b = jVar;
        int d6 = descriptor.d();
        if (d6 <= 64) {
            this.f2395c = d6 != 64 ? (-1) << d6 : 0L;
            this.f2396d = f2392e;
            return;
        }
        this.f2395c = 0L;
        int i2 = (d6 - 1) >>> 6;
        long[] jArr = new long[i2];
        if ((d6 & 63) != 0) {
            jArr[i2 - 1] = (-1) << d6;
        }
        this.f2396d = jArr;
    }
}
