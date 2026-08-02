package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Bm extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Jj f28722d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Jj f28723e;

    public Bm() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Bm bm = new Bm(3, (kotlin.coroutines.d) obj3);
        bm.f28722d = (Jj) obj;
        bm.f28723e = (Jj) obj2;
        return bm.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Jj jj2 = this.f28722d;
        return jj2 == null ? this.f28723e : jj2;
    }
}
