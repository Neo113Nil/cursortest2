package Ve;

import Ae.InterfaceC2397i;
import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SPayHelperConfig;
import spay.sdk.api.SPayHelpers;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.OrderScreenOutcome;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Bb implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f28688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4442md f28689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qd f28690c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe.I f28691d;

    public Bb(InterfaceC2397i interfaceC2397i, C4442md c4442md, Qd qd2, xe.I i11) {
        this.f28688a = interfaceC2397i;
        this.f28689b = c4442md;
        this.f28690c = qd2;
        this.f28691d = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Xa xa2;
        int i11;
        Fh a11;
        int i12;
        Ae.x0 x0Var;
        Unit unit;
        U8 u82;
        Fh fh2;
        H4 h42;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        Long l11;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Long l12;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        ListOfCardsResponseBody.PromoInfo promoInfo;
        List<ListOfCardsResponseBody.PromoInfo.BannerData> bannerList;
        ButtonBnpl buttonBnpl;
        if (dVar instanceof Xa) {
            xa2 = (Xa) dVar;
            int i13 = xa2.f30345e;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                xa2.f30345e = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = xa2.f30344d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = xa2.f30345e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    OrderScreenOutcome orderScreenOutcome = (OrderScreenOutcome) obj;
                    boolean isLoading = orderScreenOutcome.isLoading();
                    xe.I i14 = this.f28691d;
                    Qd qd2 = this.f28690c;
                    C4442md c4442md = this.f28689b;
                    if (!isLoading) {
                        SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) c4442md.f31587h).f32350a;
                        SPayHelperConfig helperConfig = sPaySdkInitConfig != null ? sPaySdkInitConfig.getHelperConfig() : null;
                        if (helperConfig != null && helperConfig.isHelperEnabled()) {
                            if ((orderScreenOutcome.getListCardsOutcome() instanceof Cb) || (orderScreenOutcome.getListCardsOutcome() instanceof Sm) || (orderScreenOutcome.getListCardsOutcome() instanceof C4761xg)) {
                                a11 = new Fh(new Sm("Системная или внутренняя ошибка"), 2);
                            } else if (orderScreenOutcome.getListCardsOutcome() instanceof Ql) {
                                a11 = new Fh(orderScreenOutcome.getListCardsOutcome(), 2);
                                i12 = 1;
                                xa2.f30345e = i12;
                                if (this.f28688a.emit(a11, xa2) == aVar) {
                                    return aVar;
                                }
                            } else {
                                H4 h43 = c4442md.f31586g;
                                SPaySdkInitConfig sPaySdkInitConfig2 = ((C4726w9) h43.f29119d).f32350a;
                                SPayHelperConfig helperConfig2 = sPaySdkInitConfig2 != null ? sPaySdkInitConfig2.getHelperConfig() : null;
                                Ae.x0 x0Var2 = h43.f29121f;
                                Vm vm = h43.f29117b;
                                if (helperConfig2 != null) {
                                    ArrayList helpersList = new ArrayList();
                                    EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
                                    Z8 z82 = Z8.f30577a;
                                    C4248fl c4248fl = h43.f29116a;
                                    SPayHelperConfig sPayHelperConfig = helperConfig2;
                                    x0Var = x0Var2;
                                    List b02 = C7714v.b0(Boolean.valueOf(Lf.a.r0(c4248fl, enumC4290h5, z82)), Boolean.valueOf(Lf.a.r0(c4248fl, EnumC4290h5.CARD_HELPER_SBP, null)), Boolean.valueOf(Lf.a.r0(c4248fl, EnumC4290h5.CARD_HELPER_CREDIT, null)), Boolean.valueOf(Lf.a.r0(c4248fl, EnumC4290h5.CARD_HELPER_DEBIT, null)));
                                    List b03 = C7714v.b0(SPayHelpers.BNPL, SPayHelpers.SBP, SPayHelpers.CREDIT_CARD, SPayHelpers.DEBIT_CARD);
                                    Iterator it = b02.iterator();
                                    Iterator it2 = b03.iterator();
                                    ArrayList arrayList = new ArrayList(Math.min(C7714v.z(b02, 10), C7714v.z(b03, 10)));
                                    while (it.hasNext() && it2.hasNext()) {
                                        Object next = it.next();
                                        SPayHelpers sPayHelpers = (SPayHelpers) it2.next();
                                        if (((Boolean) next).booleanValue()) {
                                            helpersList.add(sPayHelpers);
                                        }
                                        arrayList.add(Unit.f71690a);
                                    }
                                    if (!sPayHelperConfig.isHelperEnabled()) {
                                        helpersList.clear();
                                    }
                                    int size = helpersList.size();
                                    for (int i15 = 0; i15 < size; i15++) {
                                        List<SPayHelpers> disabledHelpers = sPayHelperConfig.getDisabledHelpers();
                                        SPayHelpers sPayHelpers2 = SPayHelpers.SBP;
                                        if (disabledHelpers.contains(sPayHelpers2) && helpersList.contains(sPayHelpers2)) {
                                            helpersList.remove(sPayHelpers2);
                                        } else {
                                            List<SPayHelpers> disabledHelpers2 = sPayHelperConfig.getDisabledHelpers();
                                            SPayHelpers sPayHelpers3 = SPayHelpers.CREDIT_CARD;
                                            if (disabledHelpers2.contains(sPayHelpers3) && helpersList.contains(sPayHelpers3)) {
                                                helpersList.remove(sPayHelpers3);
                                            } else {
                                                List<SPayHelpers> disabledHelpers3 = sPayHelperConfig.getDisabledHelpers();
                                                SPayHelpers sPayHelpers4 = SPayHelpers.DEBIT_CARD;
                                                if (disabledHelpers3.contains(sPayHelpers4) && helpersList.contains(sPayHelpers4)) {
                                                    helpersList.remove(sPayHelpers4);
                                                } else {
                                                    List<SPayHelpers> disabledHelpers4 = sPayHelperConfig.getDisabledHelpers();
                                                    SPayHelpers sPayHelpers5 = SPayHelpers.BNPL;
                                                    if ((!disabledHelpers4.contains(sPayHelpers5) || !helpersList.contains(sPayHelpers5)) && Lf.a.r0(c4248fl, EnumC4290h5.BNPL, Z8.f30577a)) {
                                                        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) x0Var.getValue();
                                                        if ((paymentPlanBnplResponseBody != null ? paymentPlanBnplResponseBody.getButtonBnpl() : null) != null && h43.b()) {
                                                        }
                                                    }
                                                    helpersList.remove(sPayHelpers5);
                                                }
                                            }
                                        }
                                    }
                                    C4654tn c4654tn = (C4654tn) vm;
                                    c4654tn.getClass();
                                    Intrinsics.checkNotNullParameter(helpersList, "helpersList");
                                    c4654tn.f32156y.addAll(helpersList);
                                    unit = Unit.f71690a;
                                } else {
                                    x0Var = x0Var2;
                                    unit = null;
                                }
                                if (unit == null) {
                                    a.b bVar = Lm0.a.f17149a;
                                    bVar.b("HELPER CONFIG EXCEPTION");
                                    bVar.e("SPayHelperConfig is null", new Object[0]);
                                }
                                Ae.x0 x0Var3 = h43.f29120e;
                                ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) x0Var3.getValue();
                                ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2 = listOfCardsResponseBody != null ? listOfCardsResponseBody.getPaymentToolInfo() : null;
                                ArrayList arrayList2 = new ArrayList();
                                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody2 = (PaymentPlanBnplResponseBody) x0Var.getValue();
                                if (paymentPlanBnplResponseBody2 != null && (buttonBnpl = paymentPlanBnplResponseBody2.getButtonBnpl()) != null) {
                                    arrayList2.add(new ListOfCardsResponseBody.PromoInfo.BannerData(SPayHelpers.BNPL.getTag(), buttonBnpl.getHeader(), buttonBnpl.getHeader(), buttonBnpl.getContent(), buttonBnpl.getActiveButtonLogo(), kotlin.collections.K.f71697a));
                                }
                                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) x0Var3.getValue();
                                if (listOfCardsResponseBody2 != null && (promoInfo = listOfCardsResponseBody2.getPromoInfo()) != null && (bannerList = promoInfo.getBannerList()) != null) {
                                    arrayList2.addAll(bannerList);
                                }
                                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3 = paymentToolInfo2 != null ? paymentToolInfo2.getToolList() : null;
                                C4233f6 c4233f6 = C4233f6.f31006a;
                                N7 n72 = N7.f29531a;
                                G6 g62 = G6.f29059a;
                                if ((toolList3 == null || toolList3.isEmpty()) && ((C4654tn) vm).f32156y.isEmpty()) {
                                    C4575r2 block = C4575r2.f31929b;
                                    Intrinsics.checkNotNullParameter(block, "block");
                                    u82 = g62;
                                } else {
                                    List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList4 = paymentToolInfo2 != null ? paymentToolInfo2.getToolList() : null;
                                    if (toolList4 == null || toolList4.isEmpty()) {
                                        C4654tn c4654tn2 = (C4654tn) vm;
                                        h42 = h43;
                                        paymentToolInfo = paymentToolInfo2;
                                        if (c4654tn2.f32156y.contains(SPayHelpers.DEBIT_CARD) && !arrayList2.isEmpty()) {
                                            V2 block2 = V2.f30171b;
                                            Intrinsics.checkNotNullParameter(block2, "block");
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                                Object next2 = it3.next();
                                                ListOfCardsResponseBody.PromoInfo.BannerData bannerData = (ListOfCardsResponseBody.PromoInfo.BannerData) next2;
                                                LinkedHashSet linkedHashSet = c4654tn2.f32156y;
                                                C4654tn c4654tn3 = c4654tn2;
                                                Iterator it4 = it3;
                                                ArrayList arrayList4 = new ArrayList(C7714v.z(linkedHashSet, 10));
                                                Iterator it5 = linkedHashSet.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList4.add(((SPayHelpers) it5.next()).getTag());
                                                }
                                                if (arrayList4.contains(bannerData.getType())) {
                                                    arrayList3.add(next2);
                                                }
                                                it3 = it4;
                                                c4654tn2 = c4654tn3;
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it6 = arrayList3.iterator();
                                            while (it6.hasNext()) {
                                                Object next3 = it6.next();
                                                if (Intrinsics.d(((ListOfCardsResponseBody.PromoInfo.BannerData) next3).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                                                    arrayList5.add(next3);
                                                }
                                            }
                                            u82 = new C4321i7(arrayList5);
                                        }
                                    } else {
                                        h42 = h43;
                                        paymentToolInfo = paymentToolInfo2;
                                    }
                                    List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList5 = paymentToolInfo != null ? paymentToolInfo.getToolList() : null;
                                    if (toolList5 != null && !toolList5.isEmpty()) {
                                        if (paymentToolInfo == null || (toolList2 = paymentToolInfo.getToolList()) == null) {
                                            l12 = null;
                                        } else {
                                            Iterator<T> it7 = toolList2.iterator();
                                            if (!it7.hasNext()) {
                                                throw new NoSuchElementException();
                                            }
                                            ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it7.next()).getAmountData();
                                            Long valueOf = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                                            l12 = Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
                                            while (it7.hasNext()) {
                                                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it7.next()).getAmountData();
                                                Long valueOf2 = amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null;
                                                Long valueOf3 = Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L);
                                                if (l12.compareTo(valueOf3) < 0) {
                                                    l12 = valueOf3;
                                                }
                                            }
                                        }
                                        if ((l12 != null ? l12.longValue() : 0L) < h42.d()) {
                                            C4654tn c4654tn4 = (C4654tn) vm;
                                            if (!c4654tn4.f32156y.contains(SPayHelpers.SBP) && !c4654tn4.f32156y.contains(SPayHelpers.CREDIT_CARD) && !c4654tn4.f32156y.contains(SPayHelpers.BNPL)) {
                                                C4804z3 block3 = C4804z3.f32621b;
                                                Intrinsics.checkNotNullParameter(block3, "block");
                                                u82 = n72;
                                            }
                                        }
                                    }
                                    List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList6 = paymentToolInfo != null ? paymentToolInfo.getToolList() : null;
                                    if (toolList6 != null && !toolList6.isEmpty()) {
                                        if (paymentToolInfo == null || (toolList = paymentToolInfo.getToolList()) == null) {
                                            l11 = null;
                                        } else {
                                            Iterator<T> it8 = toolList.iterator();
                                            if (!it8.hasNext()) {
                                                throw new NoSuchElementException();
                                            }
                                            ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it8.next()).getAmountData();
                                            Long valueOf4 = amountData3 != null ? Long.valueOf(amountData3.getAmount()) : null;
                                            Long valueOf5 = Long.valueOf(valueOf4 != null ? valueOf4.longValue() : 0L);
                                            while (it8.hasNext()) {
                                                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData4 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) it8.next()).getAmountData();
                                                Long valueOf6 = amountData4 != null ? Long.valueOf(amountData4.getAmount()) : null;
                                                Long valueOf7 = Long.valueOf(valueOf6 != null ? valueOf6.longValue() : 0L);
                                                if (valueOf5.compareTo(valueOf7) < 0) {
                                                    valueOf5 = valueOf7;
                                                }
                                            }
                                            l11 = valueOf5;
                                        }
                                        if ((l11 != null ? l11.longValue() : 0L) < h42.d()) {
                                            C4654tn c4654tn5 = (C4654tn) vm;
                                            if ((c4654tn5.f32156y.contains(SPayHelpers.SBP) || c4654tn5.f32156y.contains(SPayHelpers.CREDIT_CARD) || c4654tn5.f32156y.contains(SPayHelpers.BNPL)) && !arrayList2.isEmpty()) {
                                                M1 block4 = M1.f29445b;
                                                Intrinsics.checkNotNullParameter(block4, "block");
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = arrayList2.iterator();
                                                while (it9.hasNext()) {
                                                    Object next4 = it9.next();
                                                    ListOfCardsResponseBody.PromoInfo.BannerData bannerData2 = (ListOfCardsResponseBody.PromoInfo.BannerData) next4;
                                                    LinkedHashSet linkedHashSet2 = c4654tn5.f32156y;
                                                    Iterator it10 = it9;
                                                    C4654tn c4654tn6 = c4654tn5;
                                                    ArrayList arrayList7 = new ArrayList(C7714v.z(linkedHashSet2, 10));
                                                    Iterator it11 = linkedHashSet2.iterator();
                                                    while (it11.hasNext()) {
                                                        arrayList7.add(((SPayHelpers) it11.next()).getTag());
                                                    }
                                                    if (arrayList7.contains(bannerData2.getType())) {
                                                        arrayList6.add(next4);
                                                    }
                                                    it9 = it10;
                                                    c4654tn5 = c4654tn6;
                                                }
                                                ArrayList arrayList8 = new ArrayList();
                                                Iterator it12 = arrayList6.iterator();
                                                while (it12.hasNext()) {
                                                    Object next5 = it12.next();
                                                    if (!Intrinsics.d(((ListOfCardsResponseBody.PromoInfo.BannerData) next5).getType(), SPayHelpers.DEBIT_CARD.getTag())) {
                                                        arrayList8.add(next5);
                                                    }
                                                }
                                                u82 = new C4610s8(arrayList8);
                                            }
                                        }
                                    }
                                    u82 = c4233f6;
                                }
                                if (u82.equals(c4233f6)) {
                                    a11 = c4442md.a(qd2, orderScreenOutcome, i14);
                                } else if (u82.equals(g62)) {
                                    a11 = new Fh(new To(V6.f30178a), 6);
                                } else {
                                    if (u82 instanceof C4321i7) {
                                        fh2 = new Fh(new To(new C4752x7(u82.a())), 6);
                                    } else if (u82.equals(n72)) {
                                        a11 = new Fh(new To(C4149c8.f30785a), 2);
                                    } else {
                                        if (!(u82 instanceof C4610s8)) {
                                            throw new Sc.o();
                                        }
                                        fh2 = new Fh(new To(new F8(u82.a())), 6);
                                    }
                                    a11 = fh2;
                                }
                            }
                            i12 = 1;
                            xa2.f30345e = i12;
                            if (this.f28688a.emit(a11, xa2) == aVar) {
                            }
                        }
                    }
                    a11 = c4442md.a(qd2, orderScreenOutcome, i14);
                    i12 = 1;
                    xa2.f30345e = i12;
                    if (this.f28688a.emit(a11, xa2) == aVar) {
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
        xa2 = new Xa(this, dVar);
        Object obj22 = xa2.f30344d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xa2.f30345e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
