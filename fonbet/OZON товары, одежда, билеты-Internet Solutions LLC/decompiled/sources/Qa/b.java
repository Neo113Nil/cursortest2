package Qa;

import B0.C2454a;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f23184a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23185b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23186c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23187d;

    /* renamed from: e, reason: collision with root package name */
    private final long f23188e;

    /* renamed from: f, reason: collision with root package name */
    private final long f23189f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23190g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23191h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23192i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f23193j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f23194k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23195l;

    /* renamed from: m, reason: collision with root package name */
    private final String f23196m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23197n;

    public b(c cVar, boolean z11, boolean z12, long j11, long j12, long j13, int i11, int i12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17) {
        this.f23184a = cVar;
        this.f23185b = z11;
        this.f23186c = z12;
        this.f23187d = j11;
        this.f23188e = j12;
        this.f23189f = j13;
        this.f23190g = i11;
        this.f23191h = i12;
        this.f23192i = z13;
        this.f23193j = z14;
        this.f23194k = z15;
        this.f23195l = z16;
        this.f23196m = str;
        this.f23197n = z17;
    }

    public final boolean a() {
        return this.f23192i;
    }

    public final long b() {
        return this.f23187d;
    }

    public final boolean c() {
        return this.f23193j;
    }

    public final boolean d() {
        return this.f23194k;
    }

    public final int e() {
        return this.f23190g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f23184a, bVar.f23184a) && this.f23185b == bVar.f23185b && this.f23186c == bVar.f23186c && this.f23187d == bVar.f23187d && this.f23188e == bVar.f23188e && this.f23189f == bVar.f23189f && this.f23190g == bVar.f23190g && this.f23191h == bVar.f23191h && this.f23192i == bVar.f23192i && this.f23193j == bVar.f23193j && this.f23194k == bVar.f23194k && this.f23195l == bVar.f23195l && Intrinsics.d(this.f23196m, bVar.f23196m) && this.f23197n == bVar.f23197n;
    }

    public final int f() {
        return this.f23191h;
    }

    public final c g() {
        return this.f23184a;
    }

    public final long h() {
        return this.f23188e;
    }

    public final int hashCode() {
        c cVar = this.f23184a;
        int a11 = C3532b.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.f23191h, C2454a.a(this.f23190g, Pk0.c.a(Pk0.c.a(Pk0.c.a(C3532b.a(C3532b.a((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.f23185b), 31, this.f23186c), 31, this.f23187d), 31, this.f23188e), 31, this.f23189f), 31), 31), 31, this.f23192i), 31, this.f23193j), 31, this.f23194k), 31, this.f23195l);
        String str = this.f23196m;
        return Boolean.hashCode(this.f23197n) + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.f23195l;
    }

    public final boolean j() {
        return this.f23185b;
    }

    public final boolean k() {
        return this.f23197n;
    }

    public final boolean l() {
        return this.f23186c;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CronetCoreConfig(quicConfig=");
        sb2.append(this.f23184a);
        sb2.append(", isEnableHttp2=");
        sb2.append(this.f23185b);
        sb2.append(", isUseBrotli=");
        sb2.append(this.f23186c);
        sb2.append(", connectTimeoutMs=");
        sb2.append(this.f23187d);
        sb2.append(", readTimeoutMs=");
        sb2.append(this.f23188e);
        sb2.append(", writeTimeoutMs=");
        sb2.append(this.f23189f);
        sb2.append(", maxConcurrentRequests=");
        sb2.append(this.f23190g);
        sb2.append(", maxConcurrentRequestsPerHost=");
        sb2.append(this.f23191h);
        sb2.append(", allowCronetRedirects=");
        sb2.append(this.f23192i);
        sb2.append(", followRedirects=");
        sb2.append(this.f23193j);
        sb2.append(", followSslRedirects=");
        sb2.append(this.f23194k);
        sb2.append(", isClearHosts=");
        sb2.append(this.f23195l);
        sb2.append(", userAgent=");
        sb2.append(this.f23196m);
        sb2.append(", isOftenReleaseThreads=");
        return Pk0.a.a(")", sb2, this.f23197n);
    }
}
