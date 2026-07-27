package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class M extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1599a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f1601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p5, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1601c = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        M m6 = new M(this.f1601c, interfaceC1218d);
        m6.f1600b = obj;
        return m6;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((c0) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1599a;
        if (i2 == 0) {
            e5.g.y(obj);
            c0 c0Var = (c0) this.f1600b;
            this.f1599a = 1;
            if (P.b(this.f1601c, c0Var, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return f4.v.f5689a;
    }
}
