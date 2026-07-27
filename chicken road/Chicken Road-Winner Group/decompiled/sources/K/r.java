package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class r extends i2.g implements o2.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f891e = 1;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f892g;

    public /* synthetic */ r(int i3, InterfaceC0319c interfaceC0319c) {
        super(i3, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        switch (this.f891e) {
            case 0:
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                int i3 = this.f;
                if (i3 == 0) {
                    X0.a.L(obj);
                    this.f = 1;
                    if (O.a((O) this.f892g, this) == enumC0326a) {
                        return enumC0326a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X0.a.L(obj);
                }
                return C0279i.f4852a;
            default:
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X0.a.L(obj);
                    return obj;
                }
                X0.a.L(obj);
                Q q3 = (Q) this.f892g;
                this.f = 1;
                q3.getClass();
                Object a3 = Q.a(q3, this);
                return a3 == enumC0326a2 ? enumC0326a2 : a3;
        }
    }

    public final Object i(Object obj, Object obj2, AbstractC0343b abstractC0343b) {
        switch (this.f891e) {
            case 0:
                return new r((O) this.f892g, abstractC0343b).g(C0279i.f4852a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, abstractC0343b);
                rVar.f892g = (Q) obj;
                return rVar.g(C0279i.f4852a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(O o3, InterfaceC0319c interfaceC0319c) {
        super(3, interfaceC0319c);
        this.f892g = o3;
    }
}
