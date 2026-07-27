package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* renamed from: M.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078g extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public int f1685a;

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new C0078g(1, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        C0078g c0078g = (C0078g) create((InterfaceC1218d) obj);
        f4.v vVar = f4.v.f5689a;
        c0078g.invokeSuspend(vVar);
        return vVar;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1685a;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1685a = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e5.g.y(obj);
        return f4.v.f5689a;
    }
}
