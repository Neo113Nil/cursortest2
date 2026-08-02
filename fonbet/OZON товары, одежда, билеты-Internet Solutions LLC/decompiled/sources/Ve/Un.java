package Ve;

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
public interface Un {
    Object a(String str, kotlin.coroutines.d dVar);

    Object a(String str, SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.d dVar);

    Object a(kotlin.coroutines.d dVar);

    Object a(BindingSessionIdRequestBody bindingSessionIdRequestBody, kotlin.coroutines.d dVar);

    Object a(BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, kotlin.coroutines.d dVar);

    Object a(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, kotlin.coroutines.d dVar);

    Object a(ConfirmOtpRequestBody confirmOtpRequestBody, kotlin.coroutines.d dVar);

    Object a(CreateBindingOtpRequestBody createBindingOtpRequestBody, kotlin.coroutines.d dVar);

    Object a(CreateOtpSdkRequestBody createOtpSdkRequestBody, kotlin.coroutines.d dVar);

    Object a(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar);

    Object a(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar);

    Object a(PayOnlineRequestBody payOnlineRequestBody, kotlin.coroutines.d dVar);

    Object a(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar);

    Object a(PaymentOrderRequestBody paymentOrderRequestBody, kotlin.coroutines.d dVar);

    Object a(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.d dVar);

    Object a(SessionIdRequestBody sessionIdRequestBody, kotlin.coroutines.d dVar);

    Object a(SpasiboBonusesRequestBody spasiboBonusesRequestBody, kotlin.coroutines.d dVar);

    Object b(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.d dVar);

    Object b(PayBindingRequestBody payBindingRequestBody, kotlin.coroutines.d dVar);

    Object b(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.d dVar);

    Object b(PaymentTokenRequestBody paymentTokenRequestBody, C4536pk c4536pk);
}
