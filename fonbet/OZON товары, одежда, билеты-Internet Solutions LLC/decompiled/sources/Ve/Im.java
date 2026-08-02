package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Im extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ AbstractC4245fi f29243d;

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Im im = new Im(3, (kotlin.coroutines.d) obj3);
        im.f29243d = (AbstractC4245fi) obj;
        Unit unit = Unit.f71690a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(unit);
        return im.f29243d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return this.f29243d;
    }
}
