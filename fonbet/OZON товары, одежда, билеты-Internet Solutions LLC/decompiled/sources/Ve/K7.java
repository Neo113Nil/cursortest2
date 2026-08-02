package Ve;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import spay.sdk.data.dto.response.PartsPaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentOrderResponseBodyDto;
import spay.sdk.data.dto.response.PaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentTokenResponseBodyDto;
import spay.sdk.data.dto.response.SdkAuthResponseBodyDto;
import spay.sdk.data.dto.response.SessionIdResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingSessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.CreateBindingOtpResponseBodyDto;
import spay.sdk.data.dto.response.binding.PayBindingResponseBodyDto;
import spay.sdk.data.dto.response.listOfCards.ListOfCardsResponseBodyDto;
import spay.sdk.data.dto.response.otp.ConfirmOtpResponseBodyDto;
import spay.sdk.data.dto.response.otp.CreateOtpSdkResponseBodyDto;
import spay.sdk.data.dto.response.spasibo.SpasiboBonusesResponseBodyDto;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.BindingV3SessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* loaded from: classes6.dex */
public final class K7 implements Un {

    /* renamed from: a, reason: collision with root package name */
    public final C4363jl f29337a;

    /* renamed from: b, reason: collision with root package name */
    public final C4248fl f29338b;

    public K7(C4363jl lazyNetworkModule, C4248fl featuresHandler) {
        Intrinsics.checkNotNullParameter(lazyNetworkModule, "lazyNetworkModule");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        this.f29337a = lazyNetworkModule;
        this.f29338b = featuresHandler;
    }

    @Override // Ve.Un
    public final Object a(SessionIdRequestBody sessionIdRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(sessionIdRequestBody, (kotlin.coroutines.d<? super Response<SessionIdResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object b(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().b(listOfCardsRequestBody, (kotlin.coroutines.d<? super Response<ListOfCardsResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(BindingSessionIdRequestBody bindingSessionIdRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(bindingSessionIdRequestBody, (kotlin.coroutines.d<? super Response<BindingSessionResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object b(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().b(paymentBnplPlanRequestBody, (kotlin.coroutines.d<? super Response<PaymentPlanBnplResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(bindingV3SessionIdRequestBody, (kotlin.coroutines.d<? super Response<BindingV3SessionResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object b(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().b(payBindingRequestBody, (kotlin.coroutines.d<? super Response<PayBindingResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(String str, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(str, (kotlin.coroutines.d<? super Response<Map<String, Object>>>) dVar);
    }

    @Override // Ve.Un
    public final Object b(PaymentTokenRequestBody paymentTokenRequestBody, C4536pk c4536pk) {
        Object b11 = this.f29337a.a().b(paymentTokenRequestBody, c4536pk);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    @Override // Ve.Un
    public final Object a(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(ListOfCardsRequestBody.copy$default(listOfCardsRequestBody, null, null, null, null, 11, null), (kotlin.coroutines.d<? super Response<ListOfCardsResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(SpasiboBonusesRequestBody spasiboBonusesRequestBody, kotlin.coroutines.d dVar) {
        Qk qk2 = Qk.f29795c;
        C4248fl c4248fl = this.f29338b;
        String str = "v2";
        if (!Lf.a.u0(c4248fl, qk2) && !Lf.a.u0(c4248fl, Qk.f29794b)) {
            if (!Lf.a.u0(c4248fl, Qk.f29793a)) {
                throw new IllegalArgumentException("SBonuses Feature disabled");
            }
            str = "v1";
        }
        Object a11 = this.f29337a.a().a(spasiboBonusesRequestBody, str, (kotlin.coroutines.d<? super Response<SpasiboBonusesResponseBodyDto>>) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : (Response) a11;
    }

    @Override // Ve.Un
    public final Object a(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(paymentTokenRequestBody, (kotlin.coroutines.d<? super Response<PaymentTokenResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(PaymentOrderRequestBody paymentOrderRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(paymentOrderRequestBody, (kotlin.coroutines.d<? super Response<PaymentOrderResponseBodyDto>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r1 != null) goto L14;
     */
    @Override // Ve.Un
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PayOnlineRequestBody payOnlineRequestBody, kotlin.coroutines.d dVar) {
        PayOnlineRequestBody payOnlineRequestBody2;
        if (payOnlineRequestBody.getSumBonuses() != null) {
            Qk qk2 = Qk.f29795c;
            C4248fl c4248fl = this.f29338b;
            if (!Lf.a.u0(c4248fl, qk2) && !Lf.a.u0(c4248fl, Qk.f29794b)) {
                payOnlineRequestBody2 = PayOnlineRequestBody.copy$default(payOnlineRequestBody, null, null, null, null, 0, null, null, false, null, null, Integer.valueOf(Integer.parseInt(String.valueOf(payOnlineRequestBody.getSumBonuses()))), 1023, null);
            } else {
                String valueOf = String.valueOf(payOnlineRequestBody.getSumBonuses());
                int G11 = kotlin.text.h.G(valueOf) - 2;
                Intrinsics.checkNotNullParameter(valueOf, "<this>");
                StringBuilder sb2 = new StringBuilder(valueOf);
                sb2.insert(G11, '.');
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(this).appl…index, char) }.toString()");
                payOnlineRequestBody2 = PayOnlineRequestBody.copy$default(payOnlineRequestBody, null, null, null, null, 0, null, null, false, null, null, sb3, 1023, null);
            }
        }
        payOnlineRequestBody2 = payOnlineRequestBody;
        Object a11 = this.f29337a.a().a(payOnlineRequestBody2, (kotlin.coroutines.d<? super Response<Unit>>) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : (Response) a11;
    }

    @Override // Ve.Un
    public final Object a(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(paymentBnplPlanRequestBody, (kotlin.coroutines.d<? super Response<PartsPaymentPlanBnplResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(String str, SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(str, sdkAuthRequestBody, (kotlin.coroutines.d<? super Response<SdkAuthResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(ConfirmOtpRequestBody confirmOtpRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(confirmOtpRequestBody, (kotlin.coroutines.d<? super Response<ConfirmOtpResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(CreateOtpSdkRequestBody createOtpSdkRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(createOtpSdkRequestBody, (kotlin.coroutines.d<? super Response<CreateOtpSdkResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(dVar);
    }

    @Override // Ve.Un
    public final Object a(CreateBindingOtpRequestBody createBindingOtpRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(createBindingOtpRequestBody, (kotlin.coroutines.d<? super Response<CreateBindingOtpResponseBodyDto>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(confirmBindingOtpRequestBody, (kotlin.coroutines.d<? super Response<Unit>>) dVar);
    }

    @Override // Ve.Un
    public final Object a(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar) {
        return this.f29337a.a().a(payBindingRequestBody, (kotlin.coroutines.d<? super Response<Unit>>) dVar);
    }
}
