package Ve;

import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Qj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.a f29792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qj(f.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29792e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Qj qj2 = new Qj(this.f29792e, dVar);
        qj2.f29791d = obj;
        return qj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Qj qj2 = new Qj(this.f29792e, (kotlin.coroutines.d) obj2);
        qj2.f29791d = (W2.b) obj;
        return qj2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ((W2.b) this.f29791d).h(this.f29792e);
        return Unit.f71690a;
    }
}
