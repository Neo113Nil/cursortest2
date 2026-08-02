package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;
import spay.sdk.domain.model.OrderScreenOutcome;

/* loaded from: classes10.dex */
public final class R9 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ AbstractC4245fi f29839d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ AbstractC4245fi f29840e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        R9 r92 = new R9(3, (kotlin.coroutines.d) obj3);
        r92.f29839d = (AbstractC4245fi) obj;
        r92.f29840e = (AbstractC4245fi) obj2;
        return r92.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return new OrderScreenOutcome(this.f29839d, null, this.f29840e);
    }
}
