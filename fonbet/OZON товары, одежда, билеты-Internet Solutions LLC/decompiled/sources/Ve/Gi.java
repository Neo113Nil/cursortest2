package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;

/* loaded from: classes10.dex */
public final class Gi extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentPlanBnplResponseBody f29079a;

    public Gi(PaymentPlanBnplResponseBody bnplResponseBody) {
        Intrinsics.checkNotNullParameter(bnplResponseBody, "bnplResponseBody");
        this.f29079a = bnplResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gi) && Intrinsics.d(this.f29079a, ((Gi) obj).f29079a);
    }

    public final int hashCode() {
        return this.f29079a.hashCode();
    }

    public final String toString() {
        return "BnplResult(bnplResponseBody=" + this.f29079a + ")";
    }
}
