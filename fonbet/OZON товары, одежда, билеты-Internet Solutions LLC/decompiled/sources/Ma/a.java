package Ma;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f17755a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17756b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17757c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17758d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17759e;

    /* renamed from: f, reason: collision with root package name */
    private final long f17760f;

    /* renamed from: g, reason: collision with root package name */
    private final long f17761g;

    /* renamed from: h, reason: collision with root package name */
    private final long f17762h;

    /* renamed from: i, reason: collision with root package name */
    private final long f17763i;

    /* renamed from: j, reason: collision with root package name */
    private final long f17764j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f17765k;

    /* renamed from: l, reason: collision with root package name */
    private final long f17766l;

    /* renamed from: m, reason: collision with root package name */
    private final long f17767m;

    /* renamed from: n, reason: collision with root package name */
    private final long f17768n;

    /* renamed from: o, reason: collision with root package name */
    private final long f17769o;

    public a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, boolean z11) {
        this.f17755a = j11;
        this.f17756b = j12;
        this.f17757c = j13;
        this.f17758d = j14;
        this.f17759e = j15;
        this.f17760f = j16;
        long j22 = j17;
        this.f17761g = j22;
        this.f17762h = j18;
        long j23 = j19;
        this.f17763i = j23;
        long j24 = j21;
        this.f17764j = j24;
        this.f17765k = z11;
        j22 = j13 != 0 ? j13 : j22;
        this.f17766l = j22;
        this.f17767m = j22 == 0 ? 0L : j23;
        this.f17768n = j22;
        this.f17769o = j22 == 0 ? 0L : j24;
    }

    public final long a() {
        return this.f17758d;
    }

    public final long b() {
        return this.f17757c;
    }

    public final long c() {
        return this.f17756b;
    }

    public final long d() {
        return this.f17755a;
    }

    public final long e() {
        return this.f17762h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17755a == aVar.f17755a && this.f17756b == aVar.f17756b && this.f17757c == aVar.f17757c && this.f17758d == aVar.f17758d && this.f17759e == aVar.f17759e && this.f17760f == aVar.f17760f && this.f17761g == aVar.f17761g && this.f17762h == aVar.f17762h && this.f17763i == aVar.f17763i && this.f17764j == aVar.f17764j && this.f17765k == aVar.f17765k;
    }

    public final long f() {
        return this.f17764j;
    }

    public final long g() {
        return this.f17763i;
    }

    public final boolean h() {
        return this.f17765k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17765k) + Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Pk0.c.a(Long.hashCode(this.f17755a) * 31, 31, this.f17756b), 31, this.f17757c), 31, this.f17758d), 31, this.f17759e), 31, this.f17760f), 31, this.f17761g), 31, this.f17762h), 31, this.f17763i), 31, this.f17764j);
    }

    public final long i() {
        return this.f17760f;
    }

    public final long j() {
        return this.f17759e;
    }

    public final long k() {
        return this.f17767m;
    }

    public final long l() {
        return this.f17766l;
    }

    public final long m() {
        return this.f17769o;
    }

    public final long n() {
        return this.f17768n;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpMetricPoints(dnsStart=");
        sb2.append(this.f17755a);
        sb2.append(", dnsEnd=");
        sb2.append(this.f17756b);
        sb2.append(", connectStart=");
        sb2.append(this.f17757c);
        sb2.append(", connectEnd=");
        sb2.append(this.f17758d);
        sb2.append(", sslStart=");
        sb2.append(this.f17759e);
        sb2.append(", sslEnd=");
        sb2.append(this.f17760f);
        sb2.append(", requestStart=");
        sb2.append(this.f17761g);
        sb2.append(", requestEnd=");
        sb2.append(this.f17762h);
        sb2.append(", responseStart=");
        sb2.append(this.f17763i);
        sb2.append(", responseEnd=");
        sb2.append(this.f17764j);
        sb2.append(", socketReused=");
        return Pk0.a.a(")", sb2, this.f17765k);
    }
}
