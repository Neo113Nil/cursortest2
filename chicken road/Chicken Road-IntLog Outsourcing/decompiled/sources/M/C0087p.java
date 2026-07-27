package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: M.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087p extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1741a;

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        C0087p c0087p = new C0087p(2, interfaceC1218d);
        c0087p.f1741a = obj;
        return c0087p;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0087p) create((k0) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        e5.g.y(obj);
        return Boolean.valueOf(!(((k0) this.f1741a) instanceof b0));
    }
}
