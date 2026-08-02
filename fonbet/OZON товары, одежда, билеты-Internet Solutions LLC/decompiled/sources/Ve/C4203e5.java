package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.e5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4203e5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f30912d;

    public C4203e5() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4203e5 c4203e5 = new C4203e5(2, dVar);
        c4203e5.f30912d = ((Boolean) obj).booleanValue();
        return c4203e5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C4203e5 c4203e5 = new C4203e5(2, (kotlin.coroutines.d) obj2);
        c4203e5.f30912d = bool.booleanValue();
        return c4203e5.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return Boolean.valueOf(this.f30912d);
    }
}
