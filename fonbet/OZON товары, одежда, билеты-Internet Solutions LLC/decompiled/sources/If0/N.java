package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$handle$4", f = "DomainReachabilityViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class N extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12397d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f12398e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Z f12399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(K k11, Z z11, kotlin.coroutines.d<? super N> dVar) {
        super(2, dVar);
        this.f12398e = k11;
        this.f12399f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new N(this.f12398e, this.f12399f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((N) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12397d;
        if (i11 == 0) {
            Sc.s.b(obj);
            bVar = this.f12398e.f12376a;
            int a11 = this.f12399f.a();
            this.f12397d = 1;
            if (bVar.u(a11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
