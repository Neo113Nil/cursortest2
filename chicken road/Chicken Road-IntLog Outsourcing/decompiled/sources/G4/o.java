package G4;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;
import t4.InterfaceC1446q;

/* loaded from: classes.dex */
public final class o extends m4.h implements InterfaceC1446q {

    /* renamed from: a, reason: collision with root package name */
    public int f1094a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f1095b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1445p f1097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(3, interfaceC1218d);
        this.f1097d = interfaceC1445p;
    }

    @Override // t4.InterfaceC1446q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.f1097d, (InterfaceC1218d) obj3);
        oVar.f1095b = (e) obj;
        oVar.f1096c = obj2;
        return oVar.invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1094a;
        if (i2 == 0) {
            e5.g.y(obj);
            eVar = this.f1095b;
            Object obj2 = this.f1096c;
            this.f1095b = eVar;
            this.f1094a = 1;
            obj = this.f1097d.invoke(obj2, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e5.g.y(obj);
                return f4.v.f5689a;
            }
            eVar = this.f1095b;
            e5.g.y(obj);
        }
        this.f1095b = null;
        this.f1094a = 2;
        if (eVar.b(obj, this) == enumC1260a) {
            return enumC1260a;
        }
        return f4.v.f5689a;
    }
}
