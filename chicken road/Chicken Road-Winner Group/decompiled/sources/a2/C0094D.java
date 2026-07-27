package a2;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: a2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094D extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1802e;
    public final /* synthetic */ N.d f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f1803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094D(N.d dVar, double d3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = dVar;
        this.f1803g = d3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0094D c0094d = new C0094D(this.f, this.f1803g, interfaceC0319c);
        c0094d.f1802e = obj;
        return c0094d;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        X0.a.L(obj);
        ((N.b) this.f1802e).d(this.f, new Double(this.f1803g));
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        C0094D c0094d = (C0094D) b((InterfaceC0319c) obj2, (N.b) obj);
        C0279i c0279i = C0279i.f4852a;
        c0094d.g(c0279i);
        return c0279i;
    }
}
