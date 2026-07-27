package K;

import d2.C0274d;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class D extends i2.g implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f740e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(O o3, InterfaceC0319c interfaceC0319c) {
        super(1, interfaceC0319c);
        this.f741g = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        Throwable th;
        j0 j0Var;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f;
        O o3 = this.f741g;
        try {
        } catch (Throwable th2) {
            i0 g3 = o3.g();
            this.f740e = th2;
            this.f = 2;
            Integer a3 = g3.a();
            if (a3 != enumC0326a) {
                th = th2;
                obj = a3;
            }
        }
        if (i3 == 0) {
            X0.a.L(obj);
            this.f = 1;
            obj = O.f(o3, true, this);
            if (obj == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f740e;
                X0.a.L(obj);
                j0Var = new c0(th, ((Number) obj).intValue());
                return new C0274d(j0Var, Boolean.TRUE);
            }
            X0.a.L(obj);
        }
        j0Var = (j0) obj;
        return new C0274d(j0Var, Boolean.TRUE);
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        return new D(this.f741g, (InterfaceC0319c) obj).g(C0279i.f4852a);
    }
}
