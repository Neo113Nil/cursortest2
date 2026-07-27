package M;

import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076e extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1670a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076e(List list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1672c = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0076e c0076e = new C0076e(this.f1672c, interfaceC1218d);
        c0076e.f1671b = obj;
        return c0076e;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0076e) create((C0083l) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1670a;
        if (i2 == 0) {
            e5.g.y(obj);
            C0083l c0083l = (C0083l) this.f1671b;
            this.f1670a = 1;
            if (K1.b.z(this.f1672c, c0083l, this) == enumC1260a) {
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
