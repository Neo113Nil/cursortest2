package A2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class g extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f102e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f103g = hVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        g gVar = new g(this.f103g, interfaceC0319c);
        gVar.f = obj;
        return gVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f102e;
        C0279i c0279i = C0279i.f4852a;
        if (i3 == 0) {
            X0.a.L(obj);
            z2.e eVar = (z2.e) this.f;
            this.f102e = 1;
            Object l3 = this.f103g.f104d.l(eVar, this);
            if (l3 != enumC0326a) {
                l3 = c0279i;
            }
            if (l3 == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        return c0279i;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) b((InterfaceC0319c) obj2, (z2.e) obj)).g(C0279i.f4852a);
    }
}
