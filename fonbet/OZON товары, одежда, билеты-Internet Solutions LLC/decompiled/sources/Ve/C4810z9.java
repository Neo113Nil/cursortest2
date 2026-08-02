package Ve;

import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.z9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4810z9 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Long f32629d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f32630e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ C4487o0 f32631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Vm f32632g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H4 f32633h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Vl f32634i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Ib f32635j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4810z9(Vm vm, H4 h42, Vl vl, Ib ib2, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.f32632g = vm;
        this.f32633h = h42;
        this.f32634i = vl;
        this.f32635j = ib2;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Vl vl = this.f32634i;
        Ib ib2 = this.f32635j;
        C4810z9 c4810z9 = new C4810z9(this.f32632g, this.f32633h, vl, ib2, (kotlin.coroutines.d) obj4);
        c4810z9.f32629d = (Long) obj;
        c4810z9.f32630e = (ListOfCardsResponseBody) obj2;
        c4810z9.f32631f = (C4487o0) obj3;
        return c4810z9.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long longValue;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Long l11 = this.f32629d;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f32630e;
        C4487o0 c4487o0 = this.f32631f;
        if (((C4654tn) this.f32632g).j() instanceof PayStrategy.PayWithBinding) {
            return E.d(R.string.spay_success_binding_payment_text);
        }
        if (l11 == null) {
            return null;
        }
        if (this.f32633h.f()) {
            int i11 = R.string.spay_card_number_pattern_success_payment;
            SPaySdkConfig sPaySdkConfig = ((C4712vn) this.f32634i).f32313c;
            if (sPaySdkConfig == null) {
                throw C4317i3.f31235a;
            }
            String successEnableSPay = sPaySdkConfig.getLocalization().getSuccessEnableSPay();
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((C4673ud) this.f32635j).a().f29005b;
            r2 = tool != null ? tool.getCardNumber() : null;
            Object[] args = {successEnableSPay, r2 != null ? r2 : ""};
            Intrinsics.checkNotNullParameter(args, "args");
            return new Pq(i11, C7705l.f0(args));
        }
        if (c4487o0.f31694b == null) {
            longValue = l11.longValue();
        } else {
            longValue = l11.longValue() - (c4487o0.f31694b.intValue() * 100);
            if (longValue < 0) {
                longValue = 0;
            }
        }
        if (listOfCardsResponseBody != null && (orderInfo = listOfCardsResponseBody.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
            r2 = orderAmount.getCurrency();
        }
        return AbstractC4656tp.b(longValue, r2 != null ? r2 : "");
    }
}
