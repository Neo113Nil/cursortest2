package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.g7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4263g7 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f31090a;

    /* renamed from: b, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f31091b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f31092c;

    /* renamed from: d, reason: collision with root package name */
    public final C4112b0 f31093d;

    public C4263g7(Boolean bool, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, Boolean bool2, C4112b0 c4112b0) {
        this.f31090a = bool;
        this.f31091b = tool;
        this.f31092c = bool2;
        this.f31093d = c4112b0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4263g7)) {
            return false;
        }
        C4263g7 c4263g7 = (C4263g7) obj;
        return Intrinsics.d(this.f31090a, c4263g7.f31090a) && Intrinsics.d(this.f31091b, c4263g7.f31091b) && Intrinsics.d(this.f31092c, c4263g7.f31092c) && Intrinsics.d(this.f31093d, c4263g7.f31093d);
    }

    public final int hashCode() {
        Boolean bool = this.f31090a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f31091b;
        int hashCode2 = (hashCode + (tool == null ? 0 : tool.hashCode())) * 31;
        Boolean bool2 = this.f31092c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C4112b0 c4112b0 = this.f31093d;
        return hashCode3 + (c4112b0 != null ? c4112b0.hashCode() : 0);
    }

    public final String toString() {
        return "PerformPayOrderAction(isRequestOTPRequired=" + this.f31090a + ", selectedPaymentToolInfo=" + this.f31091b + ", isBnplEnabled=" + this.f31092c + ", bonuses=" + this.f31093d + ")";
    }
}
