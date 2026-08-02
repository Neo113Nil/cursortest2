package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Lj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29430d;

    public Lj() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Lj lj2 = new Lj(2, dVar);
        lj2.f29430d = obj;
        return lj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Lj lj2 = new Lj(2, (kotlin.coroutines.d) obj2);
        lj2.f29430d = (String) obj;
        return lj2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        String str = (String) this.f29430d;
        if (str != null) {
            return M1.b.p(str);
        }
        return null;
    }
}
