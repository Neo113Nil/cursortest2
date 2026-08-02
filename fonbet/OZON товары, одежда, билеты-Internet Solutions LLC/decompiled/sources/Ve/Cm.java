package Ve;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public abstract class Cm {
    public static C4221en a(boolean z11, boolean z12, boolean z13, ListOfCardsResponseBody.PaymentToolInfo.Tool tool) {
        Sr a11;
        String precalculateBonuses;
        String precalculateBonuses2;
        String precalculateBonuses3;
        String precalculateBonuses4;
        String productName;
        String precalculateBonuses5;
        String productName2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        Integer num = null;
        if (z11) {
            int i11 = R.string.spay_currency_pattern;
            String c11 = (tool == null || (amountData2 = tool.getAmountData()) == null) ? null : AbstractC4656tp.c(amountData2.getAmount());
            if (c11 == null) {
                c11 = "";
            }
            String currency = (tool == null || (amountData = tool.getAmountData()) == null) ? null : amountData.getCurrency();
            if (currency == null) {
                currency = "";
            }
            Object[] args = {c11, currency};
            Intrinsics.checkNotNullParameter(args, "args");
            a11 = new Pq(i11, C7705l.f0(args));
        } else {
            String paymentSystemType = tool != null ? tool.getPaymentSystemType() : null;
            if (paymentSystemType == null) {
                paymentSystemType = "";
            }
            a11 = D40.b.a(paymentSystemType, "text", paymentSystemType);
        }
        Sr sr = a11;
        if (z11 && z12 && !z13) {
            String obj = (tool == null || (productName2 = tool.getProductName()) == null) ? null : kotlin.text.h.z0(productName2).toString();
            String str = obj == null ? "" : obj;
            int i12 = R.string.spay_card_compound_wallet_number_pattern;
            Integer valueOf = Integer.valueOf(R.plurals.spay_order_compound_wallet_f);
            String cardNumber = tool != null ? tool.getCardNumber() : null;
            String str2 = cardNumber == null ? "" : cardNumber;
            Integer countAdditionalCards = tool != null ? tool.getCountAdditionalCards() : null;
            String cardLogoUrl = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses5 = tool.getPrecalculateBonuses()) != null) {
                num = Integer.valueOf(Integer.parseInt(precalculateBonuses5));
            }
            return new C4221en(sr, str, i12, valueOf, str2, countAdditionalCards, cardLogoUrl, false, Integer.valueOf(AbstractC4656tp.a(num)));
        }
        if (z11 && !z12 && !z13) {
            String obj2 = (tool == null || (productName = tool.getProductName()) == null) ? null : kotlin.text.h.z0(productName).toString();
            String str3 = obj2 == null ? "" : obj2;
            int i13 = R.string.spay_card_number_pattern;
            String cardNumber2 = tool != null ? tool.getCardNumber() : null;
            String str4 = cardNumber2 == null ? "" : cardNumber2;
            String cardLogoUrl2 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses4 = tool.getPrecalculateBonuses()) != null) {
                num = Integer.valueOf(M1.b.o(precalculateBonuses4));
            }
            return new C4221en(sr, str3, i13, null, str4, null, cardLogoUrl2, false, num, 40);
        }
        if (z13) {
            int i14 = R.string.spay_payment_account_pattern;
            String cardNumber3 = tool != null ? tool.getCardNumber() : null;
            String str5 = cardNumber3 == null ? "" : cardNumber3;
            String cardLogoUrl3 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses3 = tool.getPrecalculateBonuses()) != null) {
                num = Integer.valueOf(M1.b.o(precalculateBonuses3));
            }
            return new C4221en(sr, "", i14, null, str5, null, cardLogoUrl3, true, num, 40);
        }
        if (z11 || !z12) {
            int i15 = R.string.spay_card_number_pattern_old;
            String cardNumber4 = tool != null ? tool.getCardNumber() : null;
            String str6 = cardNumber4 == null ? "" : cardNumber4;
            String cardLogoUrl4 = tool != null ? tool.getCardLogoUrl() : null;
            if (tool != null && (precalculateBonuses = tool.getPrecalculateBonuses()) != null) {
                num = Integer.valueOf(Integer.parseInt(precalculateBonuses));
            }
            return new C4221en(sr, "", i15, null, str6, null, cardLogoUrl4, true, Integer.valueOf(AbstractC4656tp.a(num)), 40);
        }
        int i16 = R.string.spay_card_compound_wallet_number_pattern_old;
        Integer valueOf2 = Integer.valueOf(R.plurals.spay_order_compound_wallet_old_f);
        String cardNumber5 = tool != null ? tool.getCardNumber() : null;
        String str7 = cardNumber5 == null ? "" : cardNumber5;
        Integer countAdditionalCards2 = tool != null ? tool.getCountAdditionalCards() : null;
        String cardLogoUrl5 = tool != null ? tool.getCardLogoUrl() : null;
        if (tool != null && (precalculateBonuses2 = tool.getPrecalculateBonuses()) != null) {
            num = Integer.valueOf(M1.b.o(precalculateBonuses2));
        }
        return new C4221en(sr, "", i16, valueOf2, str7, countAdditionalCards2, cardLogoUrl5, true, num);
    }
}
