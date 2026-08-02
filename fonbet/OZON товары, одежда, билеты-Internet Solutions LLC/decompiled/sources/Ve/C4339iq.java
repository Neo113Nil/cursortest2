package Ve;

import java.util.Comparator;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.iq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4339iq implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Vc.a.b(Boolean.valueOf(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getPriorityCard()), Boolean.valueOf(((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getPriorityCard()));
    }
}
