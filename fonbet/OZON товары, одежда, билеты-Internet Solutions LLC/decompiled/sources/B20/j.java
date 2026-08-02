package B20;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.data.OzonDebugMenuRepository$getBaseActions$3$1", f = "OzonDebugMenuRepository.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f2214d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f2215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(f fVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f2215e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f2215e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t20.e eVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f2214d;
        if (i11 == 0) {
            s.b(obj);
            eVar = this.f2215e.f2205f;
            this.f2214d = 1;
            if (eVar.a(this) == aVar) {
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
