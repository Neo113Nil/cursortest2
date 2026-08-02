package d6;

import U5.EnumC0446m;
import U5.K;
import U5.L;
import U5.N;
import U5.O;
import U5.l0;
import W5.C0499f;
import a.AbstractC0603a;

/* renamed from: d6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0971e extends N {

    /* renamed from: o, reason: collision with root package name */
    public static final C0499f f12414o = new C0499f(1);

    /* renamed from: f, reason: collision with root package name */
    public final C0969c f12415f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0967a f12416g;

    /* renamed from: h, reason: collision with root package name */
    public O f12417h;

    /* renamed from: i, reason: collision with root package name */
    public N f12418i;
    public O j;

    /* renamed from: k, reason: collision with root package name */
    public N f12419k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0446m f12420l;

    /* renamed from: m, reason: collision with root package name */
    public L f12421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12422n;

    public C0971e(AbstractC0967a abstractC0967a) {
        C0969c c0969c = new C0969c(this);
        this.f12415f = c0969c;
        this.f12418i = c0969c;
        this.f12419k = c0969c;
        this.f12416g = abstractC0967a;
    }

    @Override // U5.N
    public final boolean b() {
        return g().b();
    }

    @Override // U5.N
    public final void c(l0 l0Var) {
        g().c(l0Var);
    }

    @Override // U5.N
    public final void d(K k7) {
        g().d(k7);
    }

    @Override // U5.N
    public final void e() {
        g().e();
    }

    @Override // U5.N
    public final void f() {
        this.f12419k.f();
        this.f12418i.f();
    }

    public final N g() {
        N n2 = this.f12419k;
        return n2 == this.f12415f ? this.f12418i : n2;
    }

    public final void h() {
        this.f12416g.r(this.f12420l, this.f12421m);
        this.f12418i.f();
        this.f12418i = this.f12419k;
        this.f12417h = this.j;
        this.f12419k = this.f12415f;
        this.j = null;
    }

    public final void i(O o7) {
        p3.f.k(o7, "newBalancerFactory");
        if (o7.equals(this.j)) {
            return;
        }
        this.f12419k.f();
        this.f12419k = this.f12415f;
        this.j = null;
        this.f12420l = EnumC0446m.f6550a;
        this.f12421m = f12414o;
        if (o7.equals(this.f12417h)) {
            return;
        }
        C0970d c0970d = new C0970d(this);
        N d7 = o7.d(c0970d);
        c0970d.f12412e = d7;
        this.f12419k = d7;
        this.j = o7;
        if (this.f12422n) {
            return;
        }
        h();
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(g(), "delegate");
        return u02.toString();
    }
}
