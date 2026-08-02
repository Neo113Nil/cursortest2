package Ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.api.SPayHelpers;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public final C4248fl f29116a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f29117b;

    /* renamed from: c, reason: collision with root package name */
    public final Ib f29118c;

    /* renamed from: d, reason: collision with root package name */
    public final T8 f29119d;

    /* renamed from: e, reason: collision with root package name */
    public final Ae.x0 f29120e;

    /* renamed from: f, reason: collision with root package name */
    public final Ae.x0 f29121f;

    /* renamed from: g, reason: collision with root package name */
    public final Ae.M0 f29122g;

    public H4(C4248fl featuresHandler, Vm sPayDataContract, Ib sPayStorage, T8 sPaySdkMerchantOptionsRepository) {
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f29116a = featuresHandler;
        this.f29117b = sPayDataContract;
        this.f29118c = sPayStorage;
        this.f29119d = sPaySdkMerchantOptionsRepository;
        C4654tn c4654tn = (C4654tn) sPayDataContract;
        this.f29120e = c4654tn.f32149r;
        this.f29121f = c4654tn.f32148q;
        this.f29122g = c4654tn.f32152u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        List list;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Sr c4543pr;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        String text;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C4673ud c4673ud = (C4673ud) this.f29118c;
        AbstractC4245fi abstractC4245fi = c4673ud.a().f29004a;
        boolean z15 = false;
        boolean z16 = (abstractC4245fi instanceof To ? (To) abstractC4245fi : null) != null;
        AbstractC4245fi abstractC4245fi2 = c4673ud.a().f29004a;
        To to = abstractC4245fi2 instanceof To ? (To) abstractC4245fi2 : null;
        if (to == null || (list = to.f30074a.a()) == null) {
            list = kotlin.collections.K.f71697a;
        }
        if (z16 || !c() || b()) {
            if (!z16 && e() != 0 && c() && b()) {
                EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
                Z8 z82 = Z8.f30577a;
                C4248fl c4248fl = this.f29116a;
                if (Lf.a.r0(c4248fl, enumC4290h5, z82) && !Lf.a.r0(c4248fl, enumC4290h5, Z8.f30578b)) {
                    linkedHashSet.add(new C4671ub(2, E.d(R.string.spay_helper_hint_not_enough_money_but_enough_to_pay_BNPL)));
                }
            }
            Ae.M0 m02 = this.f29122g;
            if (!z16 && e() != 0) {
                ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) m02.getValue();
                if (merchantInfo != null ? Intrinsics.d(merchantInfo.getBindingIsNeeded(), Boolean.TRUE) : false) {
                    z11 = true;
                    if (z11) {
                        Vm vm = this.f29117b;
                        if (z16 && c() && !b()) {
                            C4654tn c4654tn = (C4654tn) vm;
                            if (c4654tn.f32156y.contains(SPayHelpers.CREDIT_CARD) && c4654tn.f32156y.contains(SPayHelpers.SBP)) {
                                z12 = true;
                                if (z12) {
                                    if (z16 && e() != 0 && c() && !b()) {
                                        C4654tn c4654tn2 = (C4654tn) vm;
                                        if (!c4654tn2.f32156y.contains(SPayHelpers.CREDIT_CARD) && c4654tn2.f32156y.contains(SPayHelpers.SBP)) {
                                            z13 = true;
                                            if (z13) {
                                                if (z16 && e() != 0 && c() && !b()) {
                                                    C4654tn c4654tn3 = (C4654tn) vm;
                                                    if (c4654tn3.f32156y.contains(SPayHelpers.CREDIT_CARD) && !c4654tn3.f32156y.contains(SPayHelpers.SBP)) {
                                                        z14 = true;
                                                        if (!z14) {
                                                            linkedHashSet.add(new C4671ub(2, E.d(R.string.spay_helper_hint_not_enough_money_credit_card)));
                                                        } else if (z16 && list.size() == 1 && ((ListOfCardsResponseBody.PromoInfo.BannerData) C7714v.K(list)).getHint() != null) {
                                                            if (Intrinsics.d(((ListOfCardsResponseBody.PromoInfo.BannerData) C7714v.K(list)).getType(), SPayHelpers.BNPL.getTag())) {
                                                                c4543pr = E.d(R.string.spay_bnpl_helper_text);
                                                            } else {
                                                                String text2 = ((ListOfCardsResponseBody.PromoInfo.BannerData) C7714v.K(list)).getHint();
                                                                Intrinsics.f(text2);
                                                                Intrinsics.checkNotNullParameter(text2, "text");
                                                                c4543pr = new C4543pr(text2);
                                                            }
                                                            linkedHashSet.add(new C4671ub(3, c4543pr));
                                                        } else {
                                                            if (z16 && list.size() > 1) {
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Object obj : list) {
                                                                    ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) obj;
                                                                    if (Intrinsics.d(bannerData.getType(), SPayHelpers.BNPL.getTag()) || Intrinsics.d(bannerData.getType(), SPayHelpers.CREDIT_CARD.getTag()) || Intrinsics.d(bannerData.getType(), SPayHelpers.SBP.getTag())) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                if (arrayList.size() >= 2) {
                                                                    z15 = true;
                                                                }
                                                            }
                                                            if (z15) {
                                                                linkedHashSet.add(new C4671ub(3, E.d(R.string.spay_all_helpers_text)));
                                                            }
                                                        }
                                                    }
                                                }
                                                z14 = false;
                                                if (!z14) {
                                                }
                                            } else {
                                                linkedHashSet.add(new C4671ub(2, E.d(R.string.spay_helper_hint_not_enough_money_transfer)));
                                            }
                                        }
                                    }
                                    z13 = false;
                                    if (z13) {
                                    }
                                } else {
                                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f29120e.getValue();
                                    if (listOfCardsResponseBody != null && (promoInfo = listOfCardsResponseBody.getPromoInfo()) != null && (text = promoInfo.getHint()) != null) {
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        linkedHashSet.add(new C4671ub(1, new C4543pr(text)));
                                    }
                                }
                            }
                        }
                        z12 = false;
                        if (z12) {
                        }
                    } else {
                        ListOfCardsResponseBody.MerchantInfo merchantInfo2 = (ListOfCardsResponseBody.MerchantInfo) m02.getValue();
                        String bindingSafeText = merchantInfo2 != null ? merchantInfo2.getBindingSafeText() : null;
                        if (bindingSafeText == null) {
                            bindingSafeText = "";
                        }
                        linkedHashSet.add(new C4671ub(0, D40.b.a(bindingSafeText, "text", bindingSafeText)));
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
        } else {
            linkedHashSet.add(new C4671ub(1, E.d(R.string.spay_helper_hint_not_enough_money)));
        }
        return C7714v.I0(new C4145c4(), linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        Long l11;
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        Ae.x0 x0Var = this.f29120e;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) x0Var.getValue();
        Long l12 = null;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2 = (listOfCardsResponseBody == null || (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo2.getToolList();
        if (toolList2 != null && !toolList2.isEmpty()) {
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) x0Var.getValue();
            if (listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) {
                l11 = null;
            } else {
                Iterator<T> it = toolList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it.next()).getAmountData();
                Long valueOf = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                l11 = Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
                while (it.hasNext()) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it.next()).getAmountData();
                    Long valueOf2 = amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null;
                    Long valueOf3 = Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L);
                    if (l11.compareTo(valueOf3) < 0) {
                        l11 = valueOf3;
                    }
                }
            }
            long longValue = l11 != null ? l11.longValue() : 0L;
            Ae.x0 x0Var2 = this.f29121f;
            PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) x0Var2.getValue();
            if (paymentPlanBnplResponseBody != null && (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) != null && (payments = graphBnpl.getPayments()) != null && (bnplPayment = payments.get(0)) != null) {
                l12 = Long.valueOf(bnplPayment.getAmount());
            }
            if (longValue >= (l12 != null ? l12.longValue() : 0L) && x0Var2.getValue() != 0) {
                if (Lf.a.r0(this.f29116a, EnumC4290h5.BNPL, Z8.f30577a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f29120e.getValue();
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = (listOfCardsResponseBody == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo.getToolList();
        return (toolList == null || toolList.isEmpty() || e() > d()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f29120e.getValue();
        Long valueOf = (listOfCardsResponseBody == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : Long.valueOf(orderAmount.getAmount());
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object obj;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((C4673ud) this.f29118c).a().f29005b;
        if (tool2 != null && (amountData3 = tool2.getAmountData()) != null) {
            return amountData3.getAmount();
        }
        Ae.x0 x0Var = this.f29120e;
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) x0Var.getValue();
        Long l11 = null;
        if (listOfCardsResponseBody != null && (paymentToolInfo2 = listOfCardsResponseBody.getPaymentToolInfo()) != null && (toolList2 = paymentToolInfo2.getToolList()) != null) {
            Iterator<T> it = toolList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getPriorityCard()) {
                    break;
                }
            }
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj;
            if (tool3 != null && (amountData2 = tool3.getAmountData()) != null) {
                return amountData2.getAmount();
            }
        }
        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) x0Var.getValue();
        if (listOfCardsResponseBody2 != null && (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) != null && (toolList = paymentToolInfo.getToolList()) != null && (tool = toolList.get(0)) != null && (amountData = tool.getAmountData()) != null) {
            l11 = Long.valueOf(amountData.getAmount());
        }
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    public final boolean f() {
        if (d() == 0) {
            ListOfCardsResponseBody.MerchantInfo merchantInfo = (ListOfCardsResponseBody.MerchantInfo) this.f29122g.getValue();
            if (merchantInfo != null ? Intrinsics.d(merchantInfo.getBindingIsNeeded(), Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }
}
