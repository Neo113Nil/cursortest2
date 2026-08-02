package If0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$emitEvent$1", f = "DomainReachabilityViewModel.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12391d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f12392e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ H f12393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(K k11, H h11, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f12392e = k11;
        this.f12393f = h11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new L(this.f12392e, this.f12393f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12391d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f12392e.f12378c;
            this.f12391d = 1;
            if (c02.emit(this.f12393f, this) == aVar) {
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
