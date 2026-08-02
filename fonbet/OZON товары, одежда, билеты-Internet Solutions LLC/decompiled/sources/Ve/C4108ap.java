package Ve;

import java.util.Comparator;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.ap, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4108ap implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
        Long valueOf = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getAmountData();
        return Vc.a.b(valueOf, amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null);
    }
}
