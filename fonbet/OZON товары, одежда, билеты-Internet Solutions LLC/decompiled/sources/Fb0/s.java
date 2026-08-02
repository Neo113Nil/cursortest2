package Fb0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$startAsyncWork$1$2", f = "OzonIdInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f9316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(K k11, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f9316d = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f9316d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        int i11 = o.f9295g;
        this.f9316d.l().p().getValue().f();
        return Unit.f71690a;
    }
}
