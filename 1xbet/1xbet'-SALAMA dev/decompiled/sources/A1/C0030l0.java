package A1;

/* JADX INFO: renamed from: A1.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p018c2.D f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f475i;

    public C0030l0(p018c2.D d7, long j, long j3, long j7, long j8, boolean z4, boolean z7, boolean z8, boolean z9) {
        boolean z10 = true;
        p151v2.a.f(!z9 || z7);
        p151v2.a.f(!z8 || z7);
        if (z4 && (z7 || z8 || z9)) {
            z10 = false;
        }
        p151v2.a.f(z10);
        this.f467a = d7;
        this.f468b = j;
        this.f469c = j3;
        this.f470d = j7;
        this.f471e = j8;
        this.f472f = z4;
        this.f473g = z7;
        this.f474h = z8;
        this.f475i = z9;
    }

    public final C0030l0 a(long j) {
        if (j == this.f469c) {
            return this;
        }
        return new C0030l0(this.f467a, this.f468b, j, this.f470d, this.f471e, this.f472f, this.f473g, this.f474h, this.f475i);
    }

    public final C0030l0 b(long j) {
        if (j == this.f468b) {
            return this;
        }
        return new C0030l0(this.f467a, j, this.f469c, this.f470d, this.f471e, this.f472f, this.f473g, this.f474h, this.f475i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0030l0.class != obj.getClass()) {
            return false;
        }
        C0030l0 c0030l0 = (C0030l0) obj;
        return this.f468b == c0030l0.f468b && this.f469c == c0030l0.f469c && this.f470d == c0030l0.f470d && this.f471e == c0030l0.f471e && this.f472f == c0030l0.f472f && this.f473g == c0030l0.f473g && this.f474h == c0030l0.f474h && this.f475i == c0030l0.f475i && p151v2.t.a(this.f467a, c0030l0.f467a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f467a.hashCode() + 527) * 31) + ((int) this.f468b)) * 31) + ((int) this.f469c)) * 31) + ((int) this.f470d)) * 31) + ((int) this.f471e)) * 31) + (this.f472f ? 1 : 0)) * 31) + (this.f473g ? 1 : 0)) * 31) + (this.f474h ? 1 : 0)) * 31) + (this.f475i ? 1 : 0);
    }
}
