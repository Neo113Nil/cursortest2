package P;

import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class C implements G0 {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2280u f4253k;

    public C(InterfaceC2280u interfaceC2280u) {
        this.f4253k = interfaceC2280u;
    }

    @Override // P.G0
    public final void c() {
        InterfaceC2280u interfaceC2280u = this.f4253k;
        if (interfaceC2280u instanceof J0) {
            ((J0) interfaceC2280u).b();
        } else {
            AbstractC2282w.d(interfaceC2280u, new M(1));
        }
    }

    @Override // P.G0
    public final void e() {
        InterfaceC2280u interfaceC2280u = this.f4253k;
        if (interfaceC2280u instanceof J0) {
            ((J0) interfaceC2280u).b();
        } else {
            AbstractC2282w.d(interfaceC2280u, new M(1));
        }
    }

    @Override // P.G0
    public final void a() {
    }
}
