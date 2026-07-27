package M;

import f4.C0430g;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class C extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f1557a;

    /* renamed from: b, reason: collision with root package name */
    public int f1558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f1559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p5, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.f1559c = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new C(this.f1559c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        return ((C) create((InterfaceC1218d) obj)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        k0 k0Var;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1558b;
        P p5 = this.f1559c;
        try {
        } catch (Throwable th2) {
            j0 g6 = p5.g();
            this.f1557a = th2;
            this.f1558b = 2;
            Integer a6 = g6.a();
            if (a6 == enumC1260a) {
                return enumC1260a;
            }
            th = th2;
            obj = a6;
        }
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1558b = 1;
            obj = P.f(p5, true, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f1557a;
                e5.g.y(obj);
                k0Var = new d0(((Number) obj).intValue(), th);
                return new C0430g(k0Var, Boolean.TRUE);
            }
            e5.g.y(obj);
        }
        k0Var = (k0) obj;
        return new C0430g(k0Var, Boolean.TRUE);
    }
}
