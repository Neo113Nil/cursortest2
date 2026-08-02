package Ib0;

import Ae.C0;
import Ib0.b;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.result.OzonIdAuthEventsImpl$emitVKIDSuccessEvent$1", f = "OzonIdAuthEventsImpl.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12151d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f12152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f12152e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f12152e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12151d;
        if (i11 == 0) {
            s.b(obj);
            c02 = this.f12152e.f12136d;
            b.a aVar2 = b.a.f12131a;
            this.f12151d = 1;
            if (c02.emit(aVar2, this) == aVar) {
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
