package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class J extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f764e;
    public final /* synthetic */ i2.g f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0036d f765g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(o2.p pVar, C0036d c0036d, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = (i2.g) pVar;
        this.f765g = c0036d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new J(this.f, this.f765g, interfaceC0319c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f764e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return obj;
        }
        X0.a.L(obj);
        Object obj2 = this.f765g.f829b;
        this.f764e = 1;
        Object invoke = this.f.invoke(obj2, this);
        return invoke == enumC0326a ? enumC0326a : invoke;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
