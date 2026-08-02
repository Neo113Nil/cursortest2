package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$handle$7", f = "DomainReachabilityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f12404d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ W f12405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(K k11, W w11, kotlin.coroutines.d<? super Q> dVar) {
        super(2, dVar);
        this.f12404d = k11;
        this.f12405e = w11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Q(this.f12404d, this.f12405e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        bVar = this.f12404d.f12376a;
        String domain = this.f12405e.a();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        wf0.a b11 = wf0.c.b();
        if (b11 != null) {
            kotlin.time.b.INSTANCE.getClass();
            b11.a(0L, domain);
        }
        return Unit.f71690a;
    }
}
