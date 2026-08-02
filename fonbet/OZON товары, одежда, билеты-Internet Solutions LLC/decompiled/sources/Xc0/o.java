package Xc0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$updateCallInTimerState$1", f = "OtpViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f34386d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ OtpDTO.CallInCell.CallInCellTimer f34387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(d dVar, OtpDTO.CallInCell.CallInCellTimer callInCellTimer, kotlin.coroutines.d<? super o> dVar2) {
        super(1, dVar2);
        this.f34386d = dVar;
        this.f34387e = callInCellTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new o(this.f34386d, this.f34387e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        d.l0(this.f34386d).v(this.f34387e.getDeeplink());
        return Unit.f71690a;
    }
}
