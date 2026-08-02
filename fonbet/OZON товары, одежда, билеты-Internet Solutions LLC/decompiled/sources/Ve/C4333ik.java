package Ve;

import kotlin.Unit;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* renamed from: Ve.ik, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4333ik extends kotlin.coroutines.jvm.internal.j implements fd.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody.PaymentToolInfo.Tool f31307d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ SpasiboBonusesResponseBody f31308e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f31309f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f31310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f31311h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Vm f31312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4333ik(C4318i4 c4318i4, Vm vm, kotlin.coroutines.d dVar) {
        super(5, dVar);
        this.f31311h = c4318i4;
        this.f31312i = vm;
    }

    @Override // fd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C4333ik c4333ik = new C4333ik(this.f31311h, this.f31312i, (kotlin.coroutines.d) obj5);
        c4333ik.f31307d = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj;
        c4333ik.f31308e = (SpasiboBonusesResponseBody) obj2;
        c4333ik.f31309f = booleanValue;
        c4333ik.f31310g = (ListOfCardsResponseBody) obj4;
        return c4333ik.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SpasiboBonusesResponseBody.PrecalculateBonusesInfo precalculateBonusesInfo;
        Integer bonusesIsDeducted;
        SpasiboBonusesResponseBody.PrecalculateBonusesInfo precalculateBonusesInfo2;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f31307d;
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.f31308e;
        boolean z11 = this.f31309f;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f31310g;
        Integer num = null;
        Long l11 = (listOfCardsResponseBody == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : new Long(orderAmount.getAmount());
        int i11 = 0;
        boolean z12 = (l11 != null ? l11.longValue() : 0L) == 0;
        kotlin.reflect.m[] mVarArr = C4318i4.f31236E;
        C4318i4 c4318i4 = this.f31311h;
        boolean h02 = c4318i4.h0();
        boolean z13 = Lf.a.r0(c4318i4.f31241d, EnumC4290h5.S_BONUSES, null) && ((PayStrategy) ((C4654tn) this.f31312i).f32129F.getValue()).getToolType() != SPaymentTool.PAYMENT_ACCOUNTS;
        if (z11) {
            if (spasiboBonusesResponseBody != null && (precalculateBonusesInfo = spasiboBonusesResponseBody.getPrecalculateBonusesInfo()) != null) {
                bonusesIsDeducted = precalculateBonusesInfo.getBonusesIsDeducted();
            }
            bonusesIsDeducted = null;
        } else {
            if (spasiboBonusesResponseBody != null && (precalculateBonusesInfo2 = spasiboBonusesResponseBody.getPrecalculateBonusesInfo()) != null) {
                bonusesIsDeducted = precalculateBonusesInfo2.getBonusesWithoutDeduction();
            }
            bonusesIsDeducted = null;
        }
        Integer num2 = new Integer(bonusesIsDeducted != null ? bonusesIsDeducted.intValue() : 0);
        if (!h02 || z12) {
            num2 = null;
        }
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            Integer num3 = new Integer(M1.b.o(tool != null ? tool.getPrecalculateBonuses() : null));
            if (z13 && !z12) {
                num = num3;
            }
            if (num != null) {
                i11 = num.intValue();
            }
        }
        return new Integer(i11);
    }
}
