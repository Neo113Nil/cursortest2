package s4;

import b4.EnumC0510a;

/* loaded from: classes.dex */
public final class x implements K, InterfaceC2368e, t4.q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f19316k;

    public x(v vVar) {
        this.f19316k = vVar;
    }

    @Override // s4.InterfaceC2368e
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        ((M) this.f19316k).a(interfaceC2369f, cVar);
        return EnumC0510a.f7289k;
    }

    @Override // t4.q
    public final InterfaceC2368e b(a4.h hVar, int i, r4.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != r4.a.f19107l) ? C.i(this, hVar, i, aVar) : this;
    }

    @Override // s4.K
    public final Object getValue() {
        return ((M) this.f19316k).getValue();
    }
}
