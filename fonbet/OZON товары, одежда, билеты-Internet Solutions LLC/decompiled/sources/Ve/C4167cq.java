package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.cq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4167cq extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final ListOfCardsResponseBody f30834a;

    public C4167cq(ListOfCardsResponseBody listOfCardsResponseBody) {
        Intrinsics.checkNotNullParameter(listOfCardsResponseBody, "listOfCardsResponseBody");
        this.f30834a = listOfCardsResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4167cq) && Intrinsics.d(this.f30834a, ((C4167cq) obj).f30834a);
    }

    public final int hashCode() {
        return this.f30834a.hashCode();
    }

    public final String toString() {
        return "ListOfCardsResult(listOfCardsResponseBody=" + this.f30834a + ")";
    }
}
