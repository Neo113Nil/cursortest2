package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.FraudMonInfo;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10720e0;

/* renamed from: Ve.bf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4127bf extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f30731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f30732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4112b0 f30733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f30734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4127bf(C4744x c4744x, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, C4112b0 c4112b0, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30731e = c4744x;
        this.f30732f = tool;
        this.f30733g = c4112b0;
        this.f30734h = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4127bf(this.f30731e, this.f30732f, this.f30733g, this.f30734h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4127bf) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30730d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f30731e;
            MerchantData m02 = c4744x.m0();
            String authorization = m02.getAuthorization();
            String sessionId = ((SessionIdResponseBody) C2399j.b(c4744x.f32402G).getValue()).getSessionId();
            C4654tn c4654tn = (C4654tn) c4744x.f32413b;
            String str = c4654tn.f32131H;
            int paymentId = this.f30732f.getPaymentId();
            String orderId = m02.getOrderId();
            String merchantLogin = m02.getMerchantLogin();
            FraudMonInfo fraudMonInfo = c4654tn.f32147p;
            C4112b0 c4112b0 = this.f30733g;
            C4087a4 c4087a4 = new C4087a4(authorization, new PayOnlineRequestBody(null, sessionId, merchantLogin, str, paymentId, null, orderId, this.f30734h, fraudMonInfo, c4112b0 != null ? Boolean.valueOf(c4112b0.f30698a) : null, c4112b0 != null ? c4112b0.f30699b : null, 33, null));
            this.f30730d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            if (c4744x.f32417f.f(c4087a4, He.b.f10879b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
