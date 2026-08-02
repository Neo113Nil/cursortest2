package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.view.BnplButtonCompositeView;

/* renamed from: Ve.b3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4115b3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f30702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f30703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vm f30704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Vl f30705d;

    public C4115b3(InterfaceC2397i interfaceC2397i, C4318i4 c4318i4, Vm vm, Vl vl) {
        this.f30702a = interfaceC2397i;
        this.f30703b = c4318i4;
        this.f30704c = vm;
        this.f30705d = vl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0370 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4747x2 c4747x2;
        int i11;
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody;
        boolean z11;
        String str;
        long j11;
        C4789yg c4789yg;
        Yg yg2;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        int i12;
        Yg yg3;
        ListOfCardsResponseBody.OrderInfo orderInfo2;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2;
        GraphBnpl graphBnpl;
        Pq pq;
        GraphBnpl graphBnpl2;
        ListOfCardsResponseBody.OrderInfo orderInfo3;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount3;
        if (dVar instanceof C4747x2) {
            c4747x2 = (C4747x2) dVar;
            int i13 = c4747x2.f32449e;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4747x2.f32449e = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4747x2.f32448d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4747x2.f32449e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    PaymentPlanBnplResponseBody paymentPlanBnplResponseBody2 = (PaymentPlanBnplResponseBody) obj;
                    C4318i4 c4318i4 = this.f30703b;
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) c4318i4.f31250m.getValue();
                    String currency = (listOfCardsResponseBody == null || (orderInfo3 = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount3 = orderInfo3.getOrderAmount()) == null) ? null : orderAmount3.getCurrency();
                    if (currency == null) {
                        currency = "";
                    }
                    String count = (paymentPlanBnplResponseBody2 == null || (graphBnpl2 = paymentPlanBnplResponseBody2.getGraphBnpl()) == null) ? null : graphBnpl2.getCount();
                    H4 h42 = c4318i4.f31245h;
                    C4248fl c4248fl = c4318i4.f31241d;
                    Ae.x0 x0Var = c4318i4.f31237A;
                    Te te2 = c4318i4.f30497a;
                    Ae.x0 x0Var2 = c4318i4.f31262y;
                    Vm vm = this.f30704c;
                    String str2 = currency;
                    if (count == null || paymentPlanBnplResponseBody2.getGraphBnpl().getPayments() == null) {
                        paymentPlanBnplResponseBody = paymentPlanBnplResponseBody2;
                        z11 = false;
                        str = str2;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        if (!Lf.a.r0(c4248fl, EnumC4290h5.BNPL, Z8.f30578b) || h42.f()) {
                            paymentPlanBnplResponseBody = paymentPlanBnplResponseBody2;
                            z11 = false;
                            str = str2;
                        } else {
                            Bi event = new Bi(Xf.LC_PAY_BNPL_AVAILABLE, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120);
                            Intrinsics.checkNotNullParameter(event, "event");
                            te2.b(event);
                            x0Var2.setValue(E.d(R.string.spay_pay_bnpl));
                            ((C4654tn) vm).f32145n.setValue(new Long(paymentPlanBnplResponseBody2.getGraphBnpl().getPayments().get(0).getAmount()));
                            Iterator<T> it = paymentPlanBnplResponseBody2.getGraphBnpl().getPayments().iterator();
                            while (it.hasNext()) {
                                j11 = ((BnplPayment) it.next()).getAmount() + j11;
                            }
                            String c11 = AbstractC4656tp.c(j11);
                            List<BnplPayment> payments = paymentPlanBnplResponseBody2.getGraphBnpl().getPayments();
                            ArrayList arrayList = new ArrayList(C7714v.z(payments, 10));
                            Iterator it2 = payments.iterator();
                            int i14 = 0;
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i15 = i14 + 1;
                                if (i14 < 0) {
                                    C7714v.O0();
                                    throw null;
                                }
                                BnplPayment bnplPayment = (BnplPayment) next;
                                String str3 = str2;
                                Pq b11 = AbstractC4656tp.b(bnplPayment.getAmount(), str3);
                                Vm vm2 = c4318i4.f30498b;
                                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody3 = paymentPlanBnplResponseBody2;
                                Iterator it3 = it2;
                                if ((((C4654tn) vm2).j() instanceof BnplMethod.SixPartPayment) && i14 == 0) {
                                    int i16 = ((C4654tn) vm2).f32154w;
                                    if (i16 != 0) {
                                        int i17 = R.string.spay_currency_pattern_with_commission_from_total;
                                        Object[] args = {c11, "₽", Integer.valueOf(i16 / 100), "₽"};
                                        Intrinsics.checkNotNullParameter(args, "args");
                                        pq = new Pq(i17, C7705l.f0(args));
                                    } else {
                                        int i18 = R.string.spay_currency_pattern_with_empty_commission_from_total;
                                        Object[] args2 = {c11, "₽"};
                                        Intrinsics.checkNotNullParameter(args2, "args");
                                        pq = new Pq(i18, C7705l.f0(args2));
                                    }
                                } else {
                                    int i19 = R.string.spay_currency_pattern_from_total;
                                    Object[] args3 = {c11, "₽", bnplPayment.getDate()};
                                    Intrinsics.checkNotNullParameter(args3, "args");
                                    pq = new Pq(i19, C7705l.f0(args3));
                                }
                                arrayList.add(new C4548q3(b11, pq));
                                i14 = i15;
                                str2 = str3;
                                it2 = it3;
                                paymentPlanBnplResponseBody2 = paymentPlanBnplResponseBody3;
                            }
                            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody4 = paymentPlanBnplResponseBody2;
                            x0Var.setValue(arrayList);
                            if (c4318i4.f31259v instanceof BnplMethod.SixPartPayment) {
                                BnplButtonCompositeView.f98858c = true;
                            }
                            C4318i4.e0(c4318i4, Boolean.FALSE);
                            yg3 = new Yg(String.valueOf(paymentPlanBnplResponseBody4.getGraphBnpl().getPayments().size()), new Long(paymentPlanBnplResponseBody4.getGraphBnpl().getPayments().get(0).getAmount()), Boolean.TRUE, paymentPlanBnplResponseBody4.getButtonBnpl(), 8);
                            i12 = 1;
                            c4747x2.f32449e = i12;
                            if (this.f30702a.emit(yg3, c4747x2) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    String count2 = (paymentPlanBnplResponseBody == null || (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) == null) ? null : graphBnpl.getCount();
                    Ae.M0 m02 = c4318i4.f31250m;
                    if (count2 == null || paymentPlanBnplResponseBody.getGraphBnpl().getPayments() == null || Lf.a.r0(c4248fl, EnumC4290h5.BNPL, Z8.f30578b) || h42.f()) {
                        Bi event2 = new Bi(Xf.LC_PAY_BNPL_UNAVAILABLE, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120);
                        Intrinsics.checkNotNullParameter(event2, "event");
                        te2.b(event2);
                        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) m02.getValue();
                        long amount = (listOfCardsResponseBody2 == null || (orderInfo = listOfCardsResponseBody2.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? j11 : orderAmount.getAmount();
                        C4654tn c4654tn = (C4654tn) vm;
                        c4654tn.f32145n.setValue(new Long(amount));
                        if (amount == j11) {
                            ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) c4654tn.f32152u.getValue();
                            if (merchantInfo != null ? Intrinsics.d(merchantInfo.getBindingIsNeeded(), Boolean.TRUE) : z11) {
                                x0Var2.setValue(E.d(R.string.spay_enable_text));
                                SPaySdkConfig sPaySdkConfig = ((C4712vn) this.f30705d).f32313c;
                                if (sPaySdkConfig == null) {
                                    throw C4317i3.f31235a;
                                }
                                String text = sPaySdkConfig.getLocalization().getEnableSPay();
                                Intrinsics.checkNotNullParameter(text, "text");
                                c4789yg = new C4789yg(new C4543pr(text), j11);
                                x0Var.setValue(C7714v.a0(c4789yg));
                                C4318i4.e0(c4318i4, Boolean.TRUE);
                                yg2 = new Yg(null, null, null, null, 23);
                            }
                        }
                        x0Var2.setValue(E.d(R.string.spay_pay_text));
                        c4789yg = new C4789yg(AbstractC4656tp.b(amount, str), amount);
                        x0Var.setValue(C7714v.a0(c4789yg));
                        C4318i4.e0(c4318i4, Boolean.TRUE);
                        yg2 = new Yg(null, null, null, null, 23);
                    } else {
                        Bi event3 = new Bi(Xf.LC_PAY_BNPL_AVAILABLE, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120);
                        Intrinsics.checkNotNullParameter(event3, "event");
                        te2.b(event3);
                        x0Var2.setValue(E.d(R.string.spay_pay_text));
                        ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) m02.getValue();
                        long amount2 = (listOfCardsResponseBody3 == null || (orderInfo2 = listOfCardsResponseBody3.getOrderInfo()) == null || (orderAmount2 = orderInfo2.getOrderAmount()) == null) ? j11 : orderAmount2.getAmount();
                        ((C4654tn) vm).f32145n.setValue(new Long(amount2));
                        x0Var.setValue(C7714v.a0(new C4789yg(AbstractC4656tp.b(amount2, str), amount2)));
                        C4318i4.e0(c4318i4, Boolean.TRUE);
                        yg2 = new Yg(null, null, Boolean.FALSE, paymentPlanBnplResponseBody.getButtonBnpl(), 11);
                    }
                    i12 = 1;
                    yg3 = yg2;
                    c4747x2.f32449e = i12;
                    if (this.f30702a.emit(yg3, c4747x2) == aVar) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        c4747x2 = new C4747x2(this, dVar);
        Object obj22 = c4747x2.f32448d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4747x2.f32449e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
