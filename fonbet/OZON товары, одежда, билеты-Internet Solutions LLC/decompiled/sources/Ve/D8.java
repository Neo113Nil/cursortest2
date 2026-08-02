package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;

/* loaded from: classes10.dex */
public final class D8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28842a;

    /* renamed from: b, reason: collision with root package name */
    public final PaymentOrderRequestBody f28843b;

    public D8(String authorization, PaymentOrderRequestBody paymentOrderRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(paymentOrderRequestBody, "paymentOrderRequestBody");
        this.f28842a = authorization;
        this.f28843b = paymentOrderRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d82 = (D8) obj;
        return Intrinsics.d(this.f28842a, d82.f28842a) && Intrinsics.d(this.f28843b, d82.f28843b);
    }

    public final int hashCode() {
        return this.f28843b.hashCode() + (this.f28842a.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentOrderUseCaseRequestParams(authorization=" + this.f28842a + ", paymentOrderRequestBody=" + this.f28843b + ")";
    }
}
