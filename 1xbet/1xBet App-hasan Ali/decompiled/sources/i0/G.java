package i0;

/* loaded from: classes.dex */
public final class G implements W0.c {

    /* renamed from: A, reason: collision with root package name */
    public D f17226A;

    /* renamed from: k, reason: collision with root package name */
    public int f17227k;

    /* renamed from: l, reason: collision with root package name */
    public float f17228l;

    /* renamed from: m, reason: collision with root package name */
    public float f17229m;

    /* renamed from: n, reason: collision with root package name */
    public float f17230n;

    /* renamed from: o, reason: collision with root package name */
    public float f17231o;

    /* renamed from: p, reason: collision with root package name */
    public long f17232p;

    /* renamed from: q, reason: collision with root package name */
    public long f17233q;

    /* renamed from: r, reason: collision with root package name */
    public float f17234r;

    /* renamed from: s, reason: collision with root package name */
    public float f17235s;

    /* renamed from: t, reason: collision with root package name */
    public long f17236t;

    /* renamed from: u, reason: collision with root package name */
    public J f17237u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17238v;

    /* renamed from: w, reason: collision with root package name */
    public long f17239w;

    /* renamed from: x, reason: collision with root package name */
    public W0.c f17240x;

    /* renamed from: y, reason: collision with root package name */
    public W0.m f17241y;

    /* renamed from: z, reason: collision with root package name */
    public int f17242z;

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    public final void a(float f) {
        if (this.f17230n == f) {
            return;
        }
        this.f17227k |= 4;
        this.f17230n = f;
    }

    public final void b(long j5) {
        if (p.c(this.f17232p, j5)) {
            return;
        }
        this.f17227k |= 64;
        this.f17232p = j5;
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f17240x.c();
    }

    public final void e(boolean z3) {
        if (this.f17238v != z3) {
            this.f17227k |= 16384;
            this.f17238v = z3;
        }
    }

    public final void f(float f) {
        if (this.f17228l == f) {
            return;
        }
        this.f17227k |= 1;
        this.f17228l = f;
    }

    public final void g(float f) {
        if (this.f17229m == f) {
            return;
        }
        this.f17227k |= 2;
        this.f17229m = f;
    }

    public final void h(float f) {
        if (this.f17231o == f) {
            return;
        }
        this.f17227k |= 32;
        this.f17231o = f;
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    public final void j(J j5) {
        if (kotlin.jvm.internal.l.a(this.f17237u, j5)) {
            return;
        }
        this.f17227k |= 8192;
        this.f17237u = j5;
    }

    public final void k(long j5) {
        if (p.c(this.f17233q, j5)) {
            return;
        }
        this.f17227k |= 128;
        this.f17233q = j5;
    }

    public final void l(long j5) {
        if (N.a(this.f17236t, j5)) {
            return;
        }
        this.f17227k |= 4096;
        this.f17236t = j5;
    }

    @Override // W0.c
    public final float n() {
        return this.f17240x.n();
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
