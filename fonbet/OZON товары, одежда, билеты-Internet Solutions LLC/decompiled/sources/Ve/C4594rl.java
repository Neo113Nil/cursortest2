package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody;

/* renamed from: Ve.rl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4594rl extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentTokenResponseBody f31983a;

    public C4594rl(PaymentTokenResponseBody paymentTokenResponseBody) {
        Intrinsics.checkNotNullParameter(paymentTokenResponseBody, "paymentTokenResponseBody");
        this.f31983a = paymentTokenResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4594rl) && Intrinsics.d(this.f31983a, ((C4594rl) obj).f31983a);
    }

    public final int hashCode() {
        return this.f31983a.hashCode();
    }

    public final String toString() {
        return "Success(paymentTokenResponseBody=" + this.f31983a + ")";
    }
}
