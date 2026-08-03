package H1;

/* loaded from: classes.dex */
public final class c implements z1.InterfaceC1052e, z1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.C1053f f623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H1.d f624b;

    public c(H1.d dVar, z1.C1053f c1053f) {
        this.f624b = dVar;
        this.f623a = c1053f;
    }

    @Override // z1.l0
    public final void a(E1.u uVar, int i2) {
        this.f623a.a(uVar, i2);
    }

    @Override // z1.InterfaceC1052e
    public final C.j c(java.lang.Object obj, s1.l lVar) {
        H1.d dVar = this.f624b;
        H1.b bVar = new H1.b(1, dVar, this);
        C.j c2 = this.f623a.c((h1.C0177i) obj, bVar);
        if (c2 != null) {
            H1.d.f625g.set(dVar, null);
        }
        return c2;
    }

    @Override // z1.InterfaceC1052e
    public final void d(java.lang.Object obj, s1.l lVar) {
        h1.C0177i c0177i = h1.C0177i.f3302a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H1.d.f625g;
        H1.d dVar = this.f624b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f623a.d(c0177i, new H1.b(0, dVar, this));
    }

    @Override // k1.d
    public final k1.i getContext() {
        return this.f623a.f8567e;
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        this.f623a.l(obj);
    }

    @Override // z1.InterfaceC1052e
    public final void n(java.lang.Object obj) {
        this.f623a.n(obj);
    }
}
