package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$handle$6", f = "DomainReachabilityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f12402d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e0 f12403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(K k11, e0 e0Var, kotlin.coroutines.d<? super P> dVar) {
        super(2, dVar);
        this.f12402d = k11;
        this.f12403e = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new P(this.f12402d, this.f12403e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        bVar = this.f12402d.f12376a;
        bVar.s(this.f12403e.a());
        return Unit.f71690a;
    }
}
