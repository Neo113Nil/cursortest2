package a2;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: a2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115k extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1847e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115k(N.d dVar, String str, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = dVar;
        this.f1848g = str;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0115k c0115k = new C0115k(this.f, this.f1848g, interfaceC0319c);
        c0115k.f1847e = obj;
        return c0115k;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        ((N.b) this.f1847e).d(this.f, this.f1848g);
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0115k c0115k = (C0115k) b((InterfaceC0319c) obj2, (N.b) obj);
        C0279i c0279i = C0279i.f4852a;
        c0115k.g(c0279i);
        return c0279i;
    }
}
