package Ve;

import android.telephony.CellInfo;
import android.telephony.CellSignalStrength;
import java.util.Comparator;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Gp implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29093a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CellSignalStrength cellSignalStrength;
        CellSignalStrength cellSignalStrength2;
        switch (this.f29093a) {
            case 0:
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
                Long valueOf = amountData != null ? Long.valueOf(amountData.getAmount()) : null;
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getAmountData();
                return Vc.a.b(valueOf, amountData2 != null ? Long.valueOf(amountData2.getAmount()) : null);
            default:
                cellSignalStrength = ((CellInfo) obj2).getCellSignalStrength();
                Integer valueOf2 = Integer.valueOf(cellSignalStrength.getDbm());
                cellSignalStrength2 = ((CellInfo) obj).getCellSignalStrength();
                return Vc.a.b(valueOf2, Integer.valueOf(cellSignalStrength2.getDbm()));
        }
    }
}
