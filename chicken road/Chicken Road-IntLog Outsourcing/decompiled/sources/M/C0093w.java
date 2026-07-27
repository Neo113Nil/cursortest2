package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* renamed from: M.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093w extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public int f1761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f1762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093w(G g6, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.f1762b = g6;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new C0093w(this.f1762b, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        return ((C0093w) create((InterfaceC1218d) obj)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1761a;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1761a = 1;
            obj = this.f1762b.invoke(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return obj;
    }
}
