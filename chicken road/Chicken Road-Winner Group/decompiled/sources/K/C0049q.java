package K;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: K.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049q extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f890e;
    public final /* synthetic */ j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049q(j0 j0Var, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = j0Var;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0049q c0049q = new C0049q(this.f, interfaceC0319c);
        c0049q.f890e = obj;
        return c0049q;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        j0 j0Var = (j0) this.f890e;
        return Boolean.valueOf((j0Var instanceof C0036d) && j0Var.f862a <= this.f.f862a);
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0049q) b((InterfaceC0319c) obj2, (j0) obj)).g(C0279i.f4852a);
    }
}
