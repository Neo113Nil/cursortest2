package Bj0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import tj0.InterfaceC9881a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.traces.presentation.viewmodel.TrackerTracesViewModel$dispatchEvents$1", f = "TrackerTracesViewModel.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3891d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f3892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, kotlin.coroutines.d<? super d> dVar) {
        super(1, dVar);
        this.f3892e = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new d(this.f3892e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC9881a interfaceC9881a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3891d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC9881a = this.f3892e.f3902c;
            this.f3891d = 1;
            if (interfaceC9881a.invoke() == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
