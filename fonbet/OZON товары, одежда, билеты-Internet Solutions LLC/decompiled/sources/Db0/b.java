package Db0;

import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ub0.C10014b;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.common.ActivityLifecycleCallback$onFirstActivityLaunch$1", f = "ActivityLifecycleCallback.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f6298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f6298d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f6298d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        interfaceC4008j = this.f6298d.f6307c;
        ((C10014b) interfaceC4008j.getValue()).j(C10014b.a.OnAuthAppLaunch);
        return Unit.f71690a;
    }
}
