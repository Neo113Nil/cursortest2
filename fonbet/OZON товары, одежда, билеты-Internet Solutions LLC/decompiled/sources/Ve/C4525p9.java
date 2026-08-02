package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;
import spay.sdk.domain.model.OrderScreenOutcome;

/* renamed from: Ve.p9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4525p9 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ AbstractC4245fi f31765d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ AbstractC4245fi f31766e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C4525p9 c4525p9 = new C4525p9(3, (kotlin.coroutines.d) obj3);
        c4525p9.f31765d = (AbstractC4245fi) obj;
        c4525p9.f31766e = (AbstractC4245fi) obj2;
        return c4525p9.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return new OrderScreenOutcome(this.f31765d, this.f31766e, null);
    }
}
