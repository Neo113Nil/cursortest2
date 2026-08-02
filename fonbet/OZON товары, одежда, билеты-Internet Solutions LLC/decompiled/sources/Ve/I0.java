package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class I0 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f29196a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29197b;

    /* renamed from: c, reason: collision with root package name */
    public final C4112b0 f29198c;

    public I0(ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11, C4112b0 c4112b0) {
        this.f29196a = tool;
        this.f29197b = z11;
        this.f29198c = c4112b0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return Intrinsics.d(this.f29196a, i02.f29196a) && this.f29197b == i02.f29197b && Intrinsics.d(this.f29198c, i02.f29198c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f29196a;
        int hashCode = (tool == null ? 0 : tool.hashCode()) * 31;
        boolean z11 = this.f29197b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        C4112b0 c4112b0 = this.f29198c;
        return i12 + (c4112b0 != null ? c4112b0.hashCode() : 0);
    }

    public final String toString() {
        return "OnPayOnlineAction(selectedPaymentToolInfo=" + this.f29196a + ", isBnplEnabled=" + this.f29197b + ", bonuses=" + this.f29198c + ")";
    }
}
