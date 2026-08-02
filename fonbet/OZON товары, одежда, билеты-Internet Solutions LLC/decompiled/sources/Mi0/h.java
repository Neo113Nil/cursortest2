package Mi0;

import P0.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.presentation.screen.events.ProductTrackerEventsScreen$ScreenContent$1$1$1", f = "ProductTrackerEventsScreen.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f18103d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N1 f18104e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Qi0.d f18105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(N1 n12, Qi0.d dVar, kotlin.coroutines.d<? super h> dVar2) {
        super(2, dVar2);
        this.f18104e = n12;
        this.f18105f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f18104e, this.f18105f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18103d;
        if (i11 == 0) {
            Sc.s.b(obj);
            String a11 = this.f18105f.a();
            this.f18103d = 1;
            if (N1.c(this.f18104e, a11, this) == aVar) {
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
