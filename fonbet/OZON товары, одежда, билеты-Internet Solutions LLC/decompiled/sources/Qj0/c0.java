package Qj0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$invokeCallback$2", f = "TraceController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class c0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y f23617d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ApplicationLifecycleState f23618e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f23619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(Y y11, ApplicationLifecycleState applicationLifecycleState, int i11, kotlin.coroutines.d<? super c0> dVar) {
        super(2, dVar);
        this.f23617d = y11;
        this.f23618e = applicationLifecycleState;
        this.f23619f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c0(this.f23617d, this.f23618e, this.f23619f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        LinkedHashSet<InterfaceC3890j> y11 = this.f23617d.f23551b.y();
        if (y11 == null) {
            return null;
        }
        Iterator<T> it = y11.iterator();
        while (it.hasNext()) {
            ((InterfaceC3890j) it.next()).onForcedSynced(this.f23618e, this.f23619f);
        }
        return Unit.f71690a;
    }
}
