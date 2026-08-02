package Ve;

import Lm0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Hl extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Hn f29166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4395ko f29167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hl(Hn hn, C4395ko c4395ko, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29166e = hn;
        this.f29167f = c4395ko;
        this.f29168g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Hl hl = new Hl(this.f29166e, this.f29167f, this.f29168g, dVar);
        hl.f29165d = obj;
        return hl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Hl) create((AbstractC4245fi) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> listOfCards;
        long longValue;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        int i11;
        boolean z11;
        Ib ib2;
        boolean z12;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> list;
        Sr a11;
        Ak ak;
        Sr a12;
        C4608s6 c4608s6;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        int i12 = 0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        AbstractC4245fi abstractC4245fi = (AbstractC4245fi) this.f29165d;
        boolean z13 = abstractC4245fi instanceof C4167cq;
        Hn hn = this.f29166e;
        C4395ko c4395ko = this.f29167f;
        Y9 y92 = hn.f29170b;
        if (z13) {
            Vm vm = hn.f29171c;
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) ((C4654tn) vm).f32149r.getValue();
            if (listOfCardsResponseBody2 == null || (paymentToolInfo = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (listOfCards = paymentToolInfo.getToolList()) == null) {
                listOfCards = kotlin.collections.K.f71697a;
            }
            Iterator<ListOfCardsResponseBody.PaymentToolInfo.Tool> it = listOfCards.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                String cardNumber = it.next().getCardNumber();
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((C4673ud) hn.f29175g).a().f29005b;
                if (Intrinsics.d(cardNumber, tool != null ? tool.getCardNumber() : null)) {
                    break;
                }
                i13++;
            }
            int a13 = AbstractC4656tp.a(i13 == -1 ? null : new Integer(i13));
            EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
            Z8 z82 = Z8.f30578b;
            C4248fl c4248fl = hn.f29173e;
            if (Lf.a.r0(c4248fl, enumC4290h5, z82) && Lf.a.r0(c4248fl, enumC4290h5, Z8.f30577a)) {
                longValue = ((C4654tn) vm).a();
            } else {
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((C4654tn) vm).f32141j.getValue();
                Long valueOf = (orderScreenDataResponse == null || (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) == null || (orderInfo = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : Long.valueOf(orderAmount.getAmount());
                longValue = valueOf != null ? valueOf.longValue() : 0L;
            }
            boolean z14 = ((C4654tn) vm).j().getToolType() == SPaymentTool.PAYMENT_ACCOUNTS;
            Nq nq2 = hn.f29174f;
            nq2.getClass();
            Intrinsics.checkNotNullParameter(listOfCards, "listOfCards");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listOfCards) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
                Long valueOf2 = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                if ((valueOf2 != null ? valueOf2.longValue() : 0L) >= longValue) {
                    arrayList.add(obj2);
                }
            }
            EnumC4290h5 enumC4290h52 = EnumC4290h5.CARD_LIST_SORT;
            C4248fl c4248fl2 = nq2.f29574b;
            Collection collection = arrayList;
            if (Lf.a.r0(c4248fl2, enumC4290h52, null)) {
                collection = C7714v.I0(new C4339iq(), C7714v.I0(new Gp(0), arrayList));
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(collection, 10));
            Iterator it2 = collection.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                i11 = i12;
                z11 = z14;
                ib2 = nq2.f29573a;
                if (!hasNext) {
                    break;
                }
                ListOfCardsResponseBody.PaymentToolInfo.Tool card = (ListOfCardsResponseBody.PaymentToolInfo.Tool) it2.next();
                Nq nq3 = nq2;
                boolean r02 = Lf.a.r0(c4248fl2, EnumC4290h5.CARD_BALANCE, null);
                Integer countAdditionalCards = card.getCountAdditionalCards();
                int i14 = (countAdditionalCards == null || countAdditionalCards.intValue() <= 0) ? i11 : 1;
                String cardNumber2 = card.getCardNumber();
                int i15 = i14;
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((Fh) ((C4673ud) ib2).f32205b.getValue()).f29005b;
                int i16 = Intrinsics.d(cardNumber2, tool2 != null ? tool2.getCardNumber() : null) ? R.color.spay_card_selected_background_12 : R.color.spay_card_selection_background;
                int i17 = listOfCards.indexOf(card) == a13 ? R.drawable.spay_ic_selected : R.drawable.spay_ic_unselected;
                boolean r03 = Lf.a.r0(c4248fl2, EnumC4290h5.S_BONUSES, null);
                Intrinsics.checkNotNullParameter(card, "card");
                if (r02) {
                    int i18 = R.string.spay_currency_pattern;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = card.getAmountData();
                    String c11 = amountData2 != null ? AbstractC4656tp.c(amountData2.getAmount()) : null;
                    if (c11 == null) {
                        c11 = "";
                    }
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3 = card.getAmountData();
                    String currency = amountData3 != null ? amountData3.getCurrency() : null;
                    if (currency == null) {
                        currency = "";
                    }
                    Object[] args = {c11, currency};
                    Intrinsics.checkNotNullParameter(args, "args");
                    a12 = new Pq(i18, C7705l.f0(args));
                } else {
                    String paymentSystemType = card.getPaymentSystemType();
                    if (paymentSystemType == null) {
                        paymentSystemType = "";
                    }
                    a12 = D40.b.a(paymentSystemType, "text", paymentSystemType);
                }
                Sr sr = a12;
                if (r02 && i15 != 0 && !z11) {
                    int paymentId = card.getPaymentId();
                    String cardNumber3 = card.getCardNumber();
                    String str = cardNumber3 == null ? "" : cardNumber3;
                    String cardLogoUrl = card.getCardLogoUrl();
                    int i19 = R.string.spay_card_compound_wallet_number_pattern;
                    int i21 = R.plurals.spay_order_compound_wallet_f;
                    Integer countAdditionalCards2 = card.getCountAdditionalCards();
                    String obj3 = kotlin.text.h.z0(card.getProductName()).toString();
                    String precalculateBonuses = card.getPrecalculateBonuses();
                    c4608s6 = new C4608s6(paymentId, i16, i17, i19, Integer.valueOf(i21), str, countAdditionalCards2, sr, obj3, cardLogoUrl, false, r03 ? precalculateBonuses != null ? Integer.valueOf(M1.b.o(precalculateBonuses)) : null : Integer.valueOf(i11));
                } else if (r02 && i15 == 0 && !z11) {
                    int paymentId2 = card.getPaymentId();
                    String cardNumber4 = card.getCardNumber();
                    String str2 = cardNumber4 == null ? "" : cardNumber4;
                    String cardLogoUrl2 = card.getCardLogoUrl();
                    int i22 = R.string.spay_card_number_pattern;
                    String obj4 = kotlin.text.h.z0(card.getProductName()).toString();
                    String precalculateBonuses2 = card.getPrecalculateBonuses();
                    c4608s6 = new C4608s6(paymentId2, i16, i17, i22, null, str2, null, sr, obj4, cardLogoUrl2, false, r03 ? precalculateBonuses2 != null ? Integer.valueOf(M1.b.o(precalculateBonuses2)) : null : Integer.valueOf(i11));
                } else if (z11) {
                    int paymentId3 = card.getPaymentId();
                    String cardLogoUrl3 = card.getCardLogoUrl();
                    int i23 = R.string.spay_payment_account_pattern;
                    String cardNumber5 = card.getCardNumber();
                    String str3 = cardNumber5 == null ? "" : cardNumber5;
                    String precalculateBonuses3 = card.getPrecalculateBonuses();
                    c4608s6 = new C4608s6(paymentId3, i16, i17, i23, null, str3, null, sr, "", cardLogoUrl3, true, r03 ? precalculateBonuses3 != null ? Integer.valueOf(M1.b.o(precalculateBonuses3)) : null : Integer.valueOf(i11));
                } else if (r02 || i15 == 0) {
                    int paymentId4 = card.getPaymentId();
                    String cardLogoUrl4 = card.getCardLogoUrl();
                    int i24 = R.string.spay_card_number_pattern_old;
                    String cardNumber6 = card.getCardNumber();
                    String str4 = cardNumber6 == null ? "" : cardNumber6;
                    String precalculateBonuses4 = card.getPrecalculateBonuses();
                    c4608s6 = new C4608s6(paymentId4, i16, i17, i24, null, str4, null, sr, "", cardLogoUrl4, true, r03 ? precalculateBonuses4 != null ? Integer.valueOf(M1.b.o(precalculateBonuses4)) : null : Integer.valueOf(i11));
                } else {
                    int paymentId5 = card.getPaymentId();
                    String cardLogoUrl5 = card.getCardLogoUrl();
                    int i25 = R.string.spay_card_compound_wallet_number_pattern_old;
                    int i26 = R.plurals.spay_order_compound_wallet_old_f;
                    Integer countAdditionalCards3 = card.getCountAdditionalCards();
                    String cardNumber7 = card.getCardNumber();
                    String str5 = cardNumber7 == null ? "" : cardNumber7;
                    String precalculateBonuses5 = card.getPrecalculateBonuses();
                    c4608s6 = new C4608s6(paymentId5, i16, i17, i25, Integer.valueOf(i26), str5, countAdditionalCards3, sr, "", cardLogoUrl5, true, r03 ? precalculateBonuses5 != null ? Integer.valueOf(M1.b.o(precalculateBonuses5)) : null : Integer.valueOf(i11));
                }
                arrayList2.add(c4608s6);
                i12 = i11;
                z14 = z11;
                nq2 = nq3;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : listOfCards) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData4 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj5).getAmountData();
                Long valueOf3 = amountData4 != null ? Long.valueOf(amountData4.getAmount()) : null;
                if ((valueOf3 != null ? valueOf3.longValue() : 0L) < longValue) {
                    arrayList3.add(obj5);
                }
            }
            Collection collection2 = arrayList3;
            if (Lf.a.r0(c4248fl2, EnumC4290h5.CARD_LIST_SORT, null)) {
                collection2 = C7714v.I0(new C4108ap(), arrayList3);
            }
            ArrayList arrayList4 = new ArrayList(C7714v.z(collection2, 10));
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool card2 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) it3.next();
                boolean r04 = Lf.a.r0(c4248fl2, EnumC4290h5.CARD_BALANCE, null);
                Integer countAdditionalCards4 = card2.getCountAdditionalCards();
                int i27 = (countAdditionalCards4 == null || countAdditionalCards4.intValue() <= 0) ? i11 : 1;
                String cardNumber8 = card2.getCardNumber();
                Iterator it4 = it3;
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 = ((Fh) ((C4673ud) ib2).f32205b.getValue()).f29005b;
                int i28 = Intrinsics.d(cardNumber8, tool3 != null ? tool3.getCardNumber() : null) ? R.color.spay_card_selected_background_12 : R.color.spay_card_selection_background;
                int i29 = listOfCards.indexOf(card2) == a13 ? R.drawable.spay_ic_selected : R.drawable.spay_ic_unselected;
                boolean r05 = Lf.a.r0(c4248fl2, EnumC4290h5.S_BONUSES, null);
                Intrinsics.checkNotNullParameter(card2, "card");
                if (r04) {
                    int i31 = R.string.spay_currency_pattern;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData5 = card2.getAmountData();
                    String c12 = amountData5 != null ? AbstractC4656tp.c(amountData5.getAmount()) : null;
                    z12 = r05;
                    String str6 = c12 == null ? "" : c12;
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData6 = card2.getAmountData();
                    String currency2 = amountData6 != null ? amountData6.getCurrency() : null;
                    list = listOfCards;
                    Object[] args2 = {str6, currency2 == null ? "" : currency2};
                    Intrinsics.checkNotNullParameter(args2, "args");
                    a11 = new Pq(i31, C7705l.f0(args2));
                } else {
                    z12 = r05;
                    list = listOfCards;
                    String paymentSystemType2 = card2.getPaymentSystemType();
                    if (paymentSystemType2 == null) {
                        paymentSystemType2 = "";
                    }
                    a11 = D40.b.a(paymentSystemType2, "text", paymentSystemType2);
                }
                Sr sr2 = a11;
                if (r04 && i27 != 0 && !z11) {
                    int paymentId6 = card2.getPaymentId();
                    String cardNumber9 = card2.getCardNumber();
                    String str7 = cardNumber9 == null ? "" : cardNumber9;
                    String cardLogoUrl6 = card2.getCardLogoUrl();
                    int i32 = R.string.spay_card_compound_wallet_number_pattern;
                    int i33 = R.plurals.spay_order_compound_wallet_f;
                    Integer countAdditionalCards5 = card2.getCountAdditionalCards();
                    String obj6 = kotlin.text.h.z0(card2.getProductName()).toString();
                    String precalculateBonuses6 = card2.getPrecalculateBonuses();
                    ak = new Ak(paymentId6, i28, i29, i32, Integer.valueOf(i33), str7, countAdditionalCards5, sr2, obj6, cardLogoUrl6, false, z12 ? precalculateBonuses6 != null ? Integer.valueOf(M1.b.o(precalculateBonuses6)) : null : Integer.valueOf(i11));
                } else if (r04 && i27 == 0 && !z11) {
                    int paymentId7 = card2.getPaymentId();
                    String cardNumber10 = card2.getCardNumber();
                    String str8 = cardNumber10 == null ? "" : cardNumber10;
                    String cardLogoUrl7 = card2.getCardLogoUrl();
                    int i34 = R.string.spay_card_number_pattern;
                    String obj7 = kotlin.text.h.z0(card2.getProductName()).toString();
                    String precalculateBonuses7 = card2.getPrecalculateBonuses();
                    ak = new Ak(paymentId7, i28, i29, i34, null, str8, null, sr2, obj7, cardLogoUrl7, false, z12 ? precalculateBonuses7 != null ? Integer.valueOf(M1.b.o(precalculateBonuses7)) : null : Integer.valueOf(i11));
                } else if (z11) {
                    int paymentId8 = card2.getPaymentId();
                    String cardLogoUrl8 = card2.getCardLogoUrl();
                    int i35 = R.string.spay_payment_account_pattern;
                    String cardNumber11 = card2.getCardNumber();
                    String str9 = cardNumber11 == null ? "" : cardNumber11;
                    String precalculateBonuses8 = card2.getPrecalculateBonuses();
                    ak = new Ak(paymentId8, i28, i29, i35, null, str9, null, sr2, "", cardLogoUrl8, true, z12 ? precalculateBonuses8 != null ? Integer.valueOf(M1.b.o(precalculateBonuses8)) : null : Integer.valueOf(i11));
                } else if (r04 || i27 == 0) {
                    int paymentId9 = card2.getPaymentId();
                    String cardLogoUrl9 = card2.getCardLogoUrl();
                    int i36 = R.string.spay_card_number_pattern_old;
                    String cardNumber12 = card2.getCardNumber();
                    String str10 = cardNumber12 == null ? "" : cardNumber12;
                    String precalculateBonuses9 = card2.getPrecalculateBonuses();
                    ak = new Ak(paymentId9, i28, i29, i36, null, str10, null, sr2, "", cardLogoUrl9, true, z12 ? precalculateBonuses9 != null ? Integer.valueOf(M1.b.o(precalculateBonuses9)) : null : Integer.valueOf(i11));
                } else {
                    int paymentId10 = card2.getPaymentId();
                    String cardLogoUrl10 = card2.getCardLogoUrl();
                    int i37 = R.string.spay_card_compound_wallet_number_pattern_old;
                    int i38 = R.plurals.spay_order_compound_wallet_old_f;
                    Integer countAdditionalCards6 = card2.getCountAdditionalCards();
                    String cardNumber13 = card2.getCardNumber();
                    String str11 = cardNumber13 == null ? "" : cardNumber13;
                    String precalculateBonuses10 = card2.getPrecalculateBonuses();
                    ak = new Ak(paymentId10, i28, i29, i37, Integer.valueOf(i38), str11, countAdditionalCards6, sr2, "", cardLogoUrl10, true, z12 ? precalculateBonuses10 != null ? Integer.valueOf(M1.b.o(precalculateBonuses10)) : null : Integer.valueOf(i11));
                }
                arrayList4.add(ak);
                it3 = it4;
                listOfCards = list;
            }
            ArrayList arrayList5 = new ArrayList();
            if (!arrayList2.isEmpty()) {
                arrayList5.addAll(arrayList2);
            }
            if (!arrayList4.isEmpty()) {
                arrayList5.add(new Cl(E.d(z11 ? R.string.spay_payment_accounts_selection_header_not_enough_money : R.string.spay_card_selection_header_not_enough_money)));
                arrayList5.addAll(arrayList4);
            }
            ((C4238fb) y92).b(new Xd(c4395ko.f31470b.f29244a, new C4580r7(a13, arrayList5)));
        } else if (abstractC4245fi instanceof Jr) {
            ((C4238fb) y92).b(new O0(new Jr(new C4306hl(hn, c4395ko, this.f29168g, null))));
        } else {
            Intrinsics.checkNotNullParameter(y92, "<this>");
            a.b bVar = Lm0.a.f17149a;
            bVar.b("ELSE BRANCH ERROR");
            bVar.e("Unpredictable case", new Object[0]);
            ((C4238fb) y92).b(C4360ji.f31372a);
        }
        return Unit.f71690a;
    }
}
