package o0;

/* loaded from: classes.dex */
public final class o implements p0.InterfaceC0950b {

    /* renamed from: a, reason: collision with root package name */
    public final n0.InterfaceC0939c f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.C0942a f8169b;

    /* renamed from: c, reason: collision with root package name */
    public p0.InterfaceC0953e f8170c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f8171d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8172e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0.c f8173f;

    public o(o0.c cVar, n0.InterfaceC0939c interfaceC0939c, o0.C0942a c0942a) {
        this.f8173f = cVar;
        this.f8168a = interfaceC0939c;
        this.f8169b = c0942a;
    }

    @Override // p0.InterfaceC0950b
    public final void a(m0.b bVar) {
        this.f8173f.f8145m.post(new D0.f(6, this, bVar));
    }

    public final void b(m0.b bVar) {
        o0.m mVar = (o0.m) this.f8173f.f8142j.get(this.f8169b);
        if (mVar != null) {
            mVar.p(bVar);
        }
    }
}
