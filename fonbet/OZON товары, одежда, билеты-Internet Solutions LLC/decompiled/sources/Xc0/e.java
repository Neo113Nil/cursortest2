package Xc0;

import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import ru.ozon.id.nativeauth.data.models.OtpVO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$continueButtonEnabledFlow$1", f = "OtpViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<CharSequence, OtpVO, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ CharSequence f34356d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ OtpVO f34357e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(CharSequence charSequence, OtpVO otpVO, kotlin.coroutines.d<? super Boolean> dVar) {
        e eVar = new e(3, dVar);
        eVar.f34356d = charSequence;
        eVar.f34357e = otpVO;
        return eVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        CharSequence charSequence = this.f34356d;
        OtpVO otpVO = this.f34357e;
        return Boolean.valueOf((otpVO.getOtpLength() == null || otpVO.getInput() == null || charSequence.length() < otpVO.getOtpLength().intValue()) ? false : true);
    }
}
