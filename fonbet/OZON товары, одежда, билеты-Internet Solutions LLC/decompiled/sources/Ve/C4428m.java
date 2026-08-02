package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4428m extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31545d;

    public C4428m() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4428m c4428m = new C4428m(2, dVar);
        c4428m.f31545d = obj;
        return c4428m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4428m c4428m = new C4428m(2, (kotlin.coroutines.d) obj2);
        c4428m.f31545d = (Bq) obj;
        return c4428m.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return ((Bq) this.f31545d).f28729a;
    }
}
