package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.qd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4558qd extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31857d;

    public C4558qd() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4558qd c4558qd = new C4558qd(2, dVar);
        c4558qd.f31857d = obj;
        return c4558qd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4558qd c4558qd = new C4558qd(2, (kotlin.coroutines.d) obj2);
        c4558qd.f31857d = (Fh) obj;
        return c4558qd.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return new L5(Boolean.valueOf(!(((Fh) this.f31857d).f29004a instanceof C4770xp)));
    }
}
