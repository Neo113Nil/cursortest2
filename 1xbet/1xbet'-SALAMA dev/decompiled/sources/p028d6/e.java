package p028d6;

import D3.j;
import U5.EnumC0446m;
import U5.K;
import U5.L;
import U5.N;
import U5.O;
import U5.l0;
import W5.C0499f;
import p003a.a;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends N {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0499f f12420o = new C0499f(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f12421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f12422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O f12423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N f12424i;
    public O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N f12425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC0446m f12426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public L f12427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12428n;

    public e(a aVar) {
        c cVar = new c(this);
        this.f12421f = cVar;
        this.f12424i = cVar;
        this.f12425k = cVar;
        this.f12422g = aVar;
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
        this.f12425k.f();
        this.f12424i.f();
    }

    public final N g() {
        N n2 = this.f12425k;
        return n2 == this.f12421f ? this.f12424i : n2;
    }

    public final void h() {
        this.f12422g.r(this.f12426l, this.f12427m);
        this.f12424i.f();
        this.f12424i = this.f12425k;
        this.f12423h = this.j;
        this.f12425k = this.f12421f;
        this.j = null;
    }

    public final void i(O o7) {
        f.k(o7, "newBalancerFactory");
        if (o7.equals(this.j)) {
            return;
        }
        this.f12425k.f();
        this.f12425k = this.f12421f;
        this.j = null;
        this.f12426l = EnumC0446m.f6550a;
        this.f12427m = f12420o;
        if (o7.equals(this.f12423h)) {
            return;
        }
        d dVar = new d(this);
        N nD = o7.d(dVar);
        dVar.f12418e = nD;
        this.f12425k = nD;
        this.j = o7;
        if (this.f12428n) {
            return;
        }
        h();
    }

    public final String toString() {
        j jVarU0 = a.u0(this);
        jVarU0.a(g(), "delegate");
        return jVarU0.toString();
    }
}
