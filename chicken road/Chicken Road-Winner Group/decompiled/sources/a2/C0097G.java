package a2;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: a2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097G extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1810e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1811g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097G(N.d dVar, long j3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = dVar;
        this.f1811g = j3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0097G c0097g = new C0097G(this.f, this.f1811g, interfaceC0319c);
        c0097g.f1810e = obj;
        return c0097g;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        ((N.b) this.f1810e).d(this.f, new Long(this.f1811g));
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0097G c0097g = (C0097G) b((InterfaceC0319c) obj2, (N.b) obj);
        C0279i c0279i = C0279i.f4852a;
        c0097g.g(c0279i);
        return c0279i;
    }
}
