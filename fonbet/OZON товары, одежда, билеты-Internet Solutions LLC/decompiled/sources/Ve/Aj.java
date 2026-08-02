package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* loaded from: classes10.dex */
public final class Aj extends AbstractC4335im {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f28616b;

    public Aj(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f28616b = fraudMonCheckResult;
    }

    @Override // Ve.AbstractC4335im
    public final FraudMonCheckResult a() {
        return this.f28616b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Aj) && Intrinsics.d(this.f28616b, ((Aj) obj).f28616b);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f28616b;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    public final String toString() {
        return "DenyBlockMode(fraudMonCheckResultParams=" + this.f28616b + ")";
    }
}
