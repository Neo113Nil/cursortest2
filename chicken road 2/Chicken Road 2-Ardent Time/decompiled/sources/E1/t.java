package E1;

/* loaded from: classes.dex */
public class t extends z1.AbstractC1048a implements m1.InterfaceC0932c {

    /* renamed from: d, reason: collision with root package name */
    public final k1.d f301d;

    public t(k1.d dVar, k1.i iVar) {
        super(iVar, true);
        this.f301d = dVar;
    }

    @Override // z1.Z
    public final boolean I() {
        return true;
    }

    @Override // m1.InterfaceC0932c
    public final m1.InterfaceC0932c f() {
        k1.d dVar = this.f301d;
        if (dVar instanceof m1.InterfaceC0932c) {
            return (m1.InterfaceC0932c) dVar;
        }
        return null;
    }

    @Override // z1.Z
    public void p(java.lang.Object obj) {
        E1.AbstractC0000a.h(u0.AbstractC0995a.o(this.f301d), z1.AbstractC1068v.h(obj), null);
    }

    @Override // z1.Z
    public void q(java.lang.Object obj) {
        this.f301d.l(z1.AbstractC1068v.h(obj));
    }
}
