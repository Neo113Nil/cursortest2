package G6;

import f6.C1116i;
import i6.InterfaceC1287d;
import w1.V0;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f3083a;

    public f(V0 v02) {
        this.f3083a = v02;
    }

    @Override // G6.g
    public final Object r(h hVar, InterfaceC1287d interfaceC1287d) {
        t6.p pVar = new t6.p();
        pVar.f16472a = H6.l.f3444a;
        Object r7 = this.f3083a.r(new e(this, pVar, hVar), interfaceC1287d);
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }
}
