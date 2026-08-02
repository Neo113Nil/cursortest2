package Xc0;

import Ae.x0;
import Sc.s;
import Xc0.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$updateOtpTimerState$2", f = "OtpViewModel.kt", l = {418}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f34390d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ int f34391e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f34392f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f34393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(d dVar, String str, kotlin.coroutines.d<? super q> dVar2) {
        super(2, dVar2);
        this.f34392f = dVar;
        this.f34393g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        q qVar = new q(this.f34392f, this.f34393g, dVar);
        qVar.f34391e = ((Number) obj).intValue();
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34390d;
        if (i11 == 0) {
            s.b(obj);
            int i12 = this.f34391e;
            x0Var = this.f34392f.f34322u;
            b.c cVar = new b.c(this.f34393g, i12);
            this.f34390d = 1;
            if (x0Var.emit(cVar, this) == aVar) {
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
