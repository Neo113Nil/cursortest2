package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;

/* loaded from: classes10.dex */
public final class Hd {

    /* renamed from: a, reason: collision with root package name */
    public final String f29149a;

    /* renamed from: b, reason: collision with root package name */
    public final PaymentTokenRequestBody f29150b;

    public Hd(String authorization, PaymentTokenRequestBody paymentTokenRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(paymentTokenRequestBody, "paymentTokenRequestBody");
        this.f29149a = authorization;
        this.f29150b = paymentTokenRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hd)) {
            return false;
        }
        Hd hd2 = (Hd) obj;
        return Intrinsics.d(this.f29149a, hd2.f29149a) && Intrinsics.d(this.f29150b, hd2.f29150b);
    }

    public final int hashCode() {
        return this.f29150b.hashCode() + (this.f29149a.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentTokenUseCaseRequestParams(authorization=" + this.f29149a + ", paymentTokenRequestBody=" + this.f29150b + ")";
    }
}
