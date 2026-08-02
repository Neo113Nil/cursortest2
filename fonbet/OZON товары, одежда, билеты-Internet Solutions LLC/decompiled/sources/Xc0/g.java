package Xc0;

import Sc.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.OtpVO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xc0.C10702a;
import xe.M;
import zc0.C11089d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.viewModel.OtpViewModel$load$1", f = "OtpViewModel.kt", l = {352}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    d f34359d;

    /* renamed from: e, reason: collision with root package name */
    int f34360e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f34361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(d dVar, kotlin.coroutines.d<? super g> dVar2) {
        super(2, dVar2);
        this.f34361f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f34361f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object q11;
        d dVar;
        OtpDTO otpDTO;
        C11089d c11089d;
        CharSequence A02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f34360e;
        d dVar2 = this.f34361f;
        if (i11 == 0) {
            s.b(obj);
            dVar2.M0().p();
            d.D0(dVar2);
            C10702a c10702a = (C10702a) dVar2.f34303b.getValue();
            Pc0.c l02 = d.l0(dVar2);
            str = dVar2.f34302a;
            String b11 = l02.o(str).b();
            this.f34359d = dVar2;
            this.f34360e = 1;
            q11 = c10702a.q(b11, this);
            if (q11 == aVar) {
                return aVar;
            }
            dVar = dVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.f34359d;
            s.b(obj);
            q11 = obj;
        }
        OtpDTO otpDTO2 = (OtpDTO) q11;
        kotlin.reflect.m<Object>[] mVarArr = d.f34291K;
        dVar.getClass();
        String B02 = kotlin.text.h.B0(otpDTO2.getTitle(), '\n');
        OzonSpannableString subtitle = otpDTO2.getSubtitle();
        otpDTO = otpDTO2.copy((r34 & 1) != 0 ? otpDTO2.pageType : null, (r34 & 2) != 0 ? otpDTO2.title : B02, (r34 & 4) != 0 ? otpDTO2.subtitle : (subtitle == null || (A02 = kotlin.text.h.A0(subtitle, '\n')) == null) ? null : OzonSpannableStringKt.toOzonSpannableString(A02), (r34 & 8) != 0 ? otpDTO2.messengerOtpCell : null, (r34 & 16) != 0 ? otpDTO2.input : null, (r34 & 32) != 0 ? otpDTO2.action : null, (r34 & 64) != 0 ? otpDTO2.data : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? otpDTO2.hintButtons : null, (r34 & 256) != 0 ? otpDTO2.otpLength : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? otpDTO2.phoneExample : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? otpDTO2.continueButton : null, (r34 & 2048) != 0 ? otpDTO2.agreementSheet : null, (r34 & 4096) != 0 ? otpDTO2.disclaimer : null, (r34 & 8192) != 0 ? otpDTO2.retryButton : null, (r34 & 16384) != 0 ? otpDTO2.errorLogoUrl : null, (r34 & 32768) != 0 ? otpDTO2.callInCell : null);
        c11089d = dVar2.f34306e;
        c11089d.getClass();
        Intrinsics.checkNotNullParameter(otpDTO, "otpDTO");
        d.C0(dVar2, new OtpVO(otpDTO.getPageType(), otpDTO.getTitle(), otpDTO.getSubtitle(), otpDTO.getMessengerOtpCell(), otpDTO.getInput(), otpDTO.getAction(), otpDTO.getData(), otpDTO.getHintButtons(), otpDTO.getOtpLength(), otpDTO.getPhoneExample(), otpDTO.getContinueButton(), otpDTO.getAgreementSheet(), otpDTO.getDisclaimer(), otpDTO.getRetryButton(), otpDTO.getErrorLogoUrl(), otpDTO.getCallInCell()));
        return Unit.f71690a;
    }
}
