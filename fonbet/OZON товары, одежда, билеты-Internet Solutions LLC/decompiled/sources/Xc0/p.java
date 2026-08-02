package Xc0;

import Ae.x0;
import Sc.s;
import Xc0.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$updateOtpTimerState$1", f = "OtpViewModel.kt", l = {416}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34388d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f34389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(d dVar, kotlin.coroutines.d<? super p> dVar2) {
        super(1, dVar2);
        this.f34389e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new p(this.f34389e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34388d;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.f34389e.f34322u;
            b.a aVar2 = b.a.f34285a;
            this.f34388d = 1;
            if (x0Var.emit(aVar2, this) == aVar) {
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
