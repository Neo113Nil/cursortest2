package C20;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.data.localization.LocalizationRepository$getLocalizationReport$3$2", f = "LocalizationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super D20.c>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f4372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f4372d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f4372d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super D20.c> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        f fVar = this.f4372d;
        D20.c a11 = a.a(f.a(fVar));
        fVar.f4378b = a11;
        return a11;
    }
}
