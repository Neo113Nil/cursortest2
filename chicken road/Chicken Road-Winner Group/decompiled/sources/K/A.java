package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.C1233l;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class A extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f730e;
    public final /* synthetic */ O f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = o3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new A(this.f, interfaceC0319c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r8 == r0) goto L23;
     */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f730e;
        C0279i c0279i = C0279i.f4852a;
        O o3 = this.f;
        if (i3 == 0) {
            X0.a.L(obj);
            this.f730e = 1;
            Object S2 = ((C1233l) o3.f787i.f262b).S(this);
            if (S2 != enumC0326a) {
                S2 = c0279i;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X0.a.L(obj);
                return c0279i;
            }
            X0.a.L(obj);
        }
        z2.d dVar = o3.g().f858c;
        z2.d a3 = dVar instanceof A2.j ? A2.l.a((A2.j) dVar, null, 0, 2, 1) : new A2.h(dVar, g2.i.f4981a, 0, 2);
        C0057z c0057z = new C0057z(0, o3);
        this.f730e = 2;
        return a3.l(c0057z, this) == enumC0326a ? enumC0326a : c0279i;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
