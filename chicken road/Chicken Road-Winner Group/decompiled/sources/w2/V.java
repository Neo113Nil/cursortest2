package w2;

import g2.InterfaceC0319c;

/* loaded from: classes.dex */
public final class V extends C1227f {

    /* renamed from: i, reason: collision with root package name */
    public final C1233l f10480i;

    public V(InterfaceC0319c interfaceC0319c, C1233l c1233l) {
        super(1, interfaceC0319c);
        this.f10480i = c1233l;
    }

    @Override // w2.C1227f
    public final Throwable r(Z z3) {
        Throwable d3;
        Object C2 = this.f10480i.C();
        return (!(C2 instanceof X) || (d3 = ((X) C2).d()) == null) ? C2 instanceof C1235n ? ((C1235n) C2).f10517a : z3.y() : d3;
    }

    @Override // w2.C1227f
    public final String y() {
        return "AwaitContinuation";
    }
}
