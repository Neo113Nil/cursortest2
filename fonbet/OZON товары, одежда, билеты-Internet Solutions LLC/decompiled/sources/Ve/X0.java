package Ve;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class X0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Long f30310d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f30311e;

    public X0() {
        super(3, null);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        X0 x02 = new X0(3, (kotlin.coroutines.d) obj3);
        x02.f30310d = (Long) obj;
        x02.f30311e = (String) obj2;
        return x02.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Long l11 = this.f30310d;
        String str = this.f30311e;
        if (l11 != null) {
            return new L2(l11.longValue(), str);
        }
        return null;
    }
}
