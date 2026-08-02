package Ib0;

import Ae.C0;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.result.OzonIdAuthEventsImpl$emit$3", f = "OzonIdAuthEventsImpl.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12148d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f12149e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a f12150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f12149e = eVar;
        this.f12150f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f12149e, this.f12150f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12148d;
        if (i11 == 0) {
            s.b(obj);
            c02 = this.f12149e.f12135c;
            this.f12148d = 1;
            if (c02.emit(this.f12150f, this) == aVar) {
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
