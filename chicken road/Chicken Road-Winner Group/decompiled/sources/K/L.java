package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class L extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f769e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f770g = o3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        L l3 = new L(this.f770g, interfaceC0319c);
        l3.f = obj;
        return l3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f769e;
        if (i3 == 0) {
            X0.a.L(obj);
            b0 b0Var = (b0) this.f;
            this.f769e = 1;
            if (O.c(this.f770g, b0Var, this) == enumC0326a) {
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
        return ((L) b((InterfaceC0319c) obj2, (b0) obj)).g(C0279i.f4852a);
    }
}
