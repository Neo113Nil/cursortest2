package K;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: K.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048p extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f889e;

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0048p c0048p = new C0048p(2, interfaceC0319c);
        c0048p.f889e = obj;
        return c0048p;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        return Boolean.valueOf(!(((j0) this.f889e) instanceof a0));
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0048p) b((InterfaceC0319c) obj2, (j0) obj)).g(C0279i.f4852a);
    }
}
