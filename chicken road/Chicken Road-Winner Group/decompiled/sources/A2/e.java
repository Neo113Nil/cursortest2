package A2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class e extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f97e;
    public /* synthetic */ InterfaceC1241u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f98g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f98g = fVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        e eVar = new e(this.f98g, interfaceC0319c);
        eVar.f = (InterfaceC1241u) obj;
        return eVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f97e;
        if (i3 == 0) {
            X0.a.L(obj);
            y2.o oVar = (y2.o) this.f;
            this.f97e = 1;
            if (this.f98g.a(oVar, this) == enumC0326a) {
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
        return ((e) b((InterfaceC0319c) obj2, (y2.o) obj)).g(C0279i.f4852a);
    }
}
