package a2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.List;
import w2.InterfaceC1241u;

/* renamed from: a2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125u extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1875e;
    public final /* synthetic */ C0100J f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0125u(C0100J c0100j, List list, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = c0100j;
        this.f1876g = list;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0125u(this.f, this.f1876g, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1875e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return obj;
        }
        X0.a.L(obj);
        this.f1875e = 1;
        Object o3 = C0100J.o(this.f, this.f1876g, this);
        return o3 == enumC0326a ? enumC0326a : o3;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0125u) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
