package a2;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: a2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091A extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1794e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091A(N.d dVar, boolean z3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = dVar;
        this.f1795g = z3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0091A c0091a = new C0091A(this.f, this.f1795g, interfaceC0319c);
        c0091a.f1794e = obj;
        return c0091a;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        ((N.b) this.f1794e).d(this.f, Boolean.valueOf(this.f1795g));
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0091A c0091a = (C0091A) b((InterfaceC0319c) obj2, (N.b) obj);
        C0279i c0279i = C0279i.f4852a;
        c0091a.g(c0279i);
        return c0279i;
    }
}
