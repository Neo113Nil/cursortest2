package D1;

/* loaded from: classes.dex */
public final class s implements k1.d, m1.InterfaceC0932c {

    /* renamed from: a, reason: collision with root package name */
    public final k1.d f251a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.i f252b;

    public s(k1.d dVar, k1.i iVar) {
        this.f251a = dVar;
        this.f252b = iVar;
    }

    @Override // m1.InterfaceC0932c
    public final m1.InterfaceC0932c f() {
        k1.d dVar = this.f251a;
        if (dVar instanceof m1.InterfaceC0932c) {
            return (m1.InterfaceC0932c) dVar;
        }
        return null;
    }

    @Override // k1.d
    public final k1.i getContext() {
        return this.f252b;
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        this.f251a.l(obj);
    }
}
