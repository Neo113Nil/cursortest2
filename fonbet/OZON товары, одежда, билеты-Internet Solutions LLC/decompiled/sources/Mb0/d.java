package Mb0;

import Ib0.h;
import Kb0.K;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.B0;
import xe.M;

@e(c = "ru.ozon.id.forceLogout.ForceLogoutUseCase$onExecute$finishOnMain$2", f = "ForceLogoutUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f17815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(h hVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f17815d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f17815d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        K k11 = Tb0.a.f26975d;
        if (k11 != null) {
            return k11.p().getValue().i(this.f17815d);
        }
        throw new Lb0.a();
    }
}
