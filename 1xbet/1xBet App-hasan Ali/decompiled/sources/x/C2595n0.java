package x;

/* renamed from: x.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2595n0 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2599p0 f20833b;

    public C2595n0(C2604s0 c2604s0, C2599p0 c2599p0) {
        this.f20832a = c2604s0;
        this.f20833b = c2599p0;
    }

    @Override // x.U
    public final float a(float f) {
        C2604s0 c2604s0 = this.f20832a;
        long d5 = c2604s0.d(c2604s0.g(f));
        C2604s0 c2604s02 = this.f20833b.f20847a;
        c2604s02.f20868g = 2;
        v.k0 k0Var = c2604s02.f20864b;
        return c2604s0.c(c2604s0.f((k0Var == null || !(c2604s02.f20863a.c() || c2604s02.f20863a.a())) ? C2604s0.a(c2604s02, c2604s02.f20869h, d5, 2) : k0Var.a(d5, c2604s02.f20868g, c2604s02.f20870j)));
    }
}
