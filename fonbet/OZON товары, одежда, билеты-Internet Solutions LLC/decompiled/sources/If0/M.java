package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$handle$3", f = "DomainReachabilityViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class M extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12394d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f12395e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ U f12396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M(K k11, U u11, kotlin.coroutines.d<? super M> dVar) {
        super(2, dVar);
        this.f12395e = k11;
        this.f12396f = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new M(this.f12395e, this.f12396f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((M) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12394d;
        if (i11 == 0) {
            Sc.s.b(obj);
            bVar = this.f12395e.f12376a;
            int a11 = this.f12396f.a();
            this.f12394d = 1;
            if (bVar.t(a11, this) == aVar) {
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
