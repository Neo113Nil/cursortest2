package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086o extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f1738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086o(P p5, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1738b = p5;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C0086o(this.f1738b, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0086o) create((G4.e) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1737a;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1737a = 1;
            if (P.d(this.f1738b, this) == enumC1260a) {
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
