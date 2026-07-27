package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1446q;

/* loaded from: classes.dex */
public final class r extends m4.h implements InterfaceC1446q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1744a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1745b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1746c;

    public /* synthetic */ r(int i2, InterfaceC1218d interfaceC1218d) {
        super(i2, interfaceC1218d);
    }

    @Override // t4.InterfaceC1446q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1744a) {
            case 0:
                return new r((P) this.f1746c, (InterfaceC1218d) obj3).invokeSuspend(f4.v.f5689a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (InterfaceC1218d) obj3);
                rVar.f1746c = (S) obj;
                return rVar.invokeSuspend(f4.v.f5689a);
        }
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1744a) {
            case 0:
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                int i2 = this.f1745b;
                if (i2 == 0) {
                    e5.g.y(obj);
                    this.f1745b = 1;
                    if (P.a((P) this.f1746c, this) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e5.g.y(obj);
                }
                return f4.v.f5689a;
            default:
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                int i3 = this.f1745b;
                if (i3 == 0) {
                    e5.g.y(obj);
                    S s2 = (S) this.f1746c;
                    this.f1745b = 1;
                    s2.getClass();
                    obj = S.a(s2, this);
                    if (obj == enumC1260a2) {
                        return enumC1260a2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e5.g.y(obj);
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(P p5, InterfaceC1218d interfaceC1218d) {
        super(3, interfaceC1218d);
        this.f1746c = p5;
    }
}
