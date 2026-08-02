package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.n1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4459n1 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f31619a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31620b;

    public C4459n1(ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11) {
        this.f31619a = tool;
        this.f31620b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4459n1)) {
            return false;
        }
        C4459n1 c4459n1 = (C4459n1) obj;
        return Intrinsics.d(this.f31619a, c4459n1.f31619a) && this.f31620b == c4459n1.f31620b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f31619a;
        int hashCode = (tool == null ? 0 : tool.hashCode()) * 31;
        boolean z11 = this.f31620b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final String toString() {
        return "OnPerformPayOrderAction(selectedPaymentToolInfo=" + this.f31619a + ", bnplEnabled=" + this.f31620b + ")";
    }
}
