package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$onClearUserConfigClicked$1", f = "DomainReachabilityViewModel.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class S extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12406d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f12407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(K k11, kotlin.coroutines.d<? super S> dVar) {
        super(2, dVar);
        this.f12407e = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new S(this.f12407e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((S) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12406d;
        if (i11 == 0) {
            Sc.s.b(obj);
            bVar = this.f12407e.f12376a;
            this.f12406d = 1;
            if (bVar.i(this) == aVar) {
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
