package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;

/* renamed from: Ve.na, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4468na {

    /* renamed from: a, reason: collision with root package name */
    public final String f31650a;

    /* renamed from: b, reason: collision with root package name */
    public final PaymentBnplPlanRequestBody f31651b;

    public C4468na(String authorization, PaymentBnplPlanRequestBody paymentPlanBnplRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(paymentPlanBnplRequestBody, "paymentPlanBnplRequestBody");
        this.f31650a = authorization;
        this.f31651b = paymentPlanBnplRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4468na)) {
            return false;
        }
        C4468na c4468na = (C4468na) obj;
        return Intrinsics.d(this.f31650a, c4468na.f31650a) && Intrinsics.d(this.f31651b, c4468na.f31651b);
    }

    public final int hashCode() {
        return this.f31651b.hashCode() + (this.f31650a.hashCode() * 31);
    }

    public final String toString() {
        return "GetPaymentPlanBnplUseCaseRequestParams(authorization=" + this.f31650a + ", paymentPlanBnplRequestBody=" + this.f31651b + ")";
    }
}
