package Mi0;

import Ae.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import ve.EnumC10311b;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.presentation.screen.events.ProductTrackerEventsViewModel$delayedHideNotification$1", f = "ProductTrackerEventsViewModel.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f18134d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f18135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f18135e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f18135e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18134d;
        if (i11 == 0) {
            Sc.s.b(obj);
            b.Companion companion = kotlin.time.b.INSTANCE;
            long g10 = kotlin.time.c.g(3, EnumC10311b.SECONDS);
            this.f18134d = 1;
            if (Y.c(g10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        o oVar = this.f18135e;
        x0Var = oVar.f18119c;
        x0Var2 = oVar.f18119c;
        x0Var.setValue(Pi0.a.a((Pi0.a) x0Var2.getValue(), null, null, null, null, null, null, 31));
        return Unit.f71690a;
    }
}
