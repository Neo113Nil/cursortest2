package A2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class t extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f120e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z2.e f121g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f121g = eVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        t tVar = new t(this.f121g, interfaceC0319c);
        tVar.f = obj;
        return tVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f120e;
        if (i3 == 0) {
            X0.a.L(obj);
            Object obj2 = this.f;
            this.f120e = 1;
            if (this.f121g.a(obj2, this) == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) b((InterfaceC0319c) obj2, obj)).g(C0279i.f4852a);
    }
}
