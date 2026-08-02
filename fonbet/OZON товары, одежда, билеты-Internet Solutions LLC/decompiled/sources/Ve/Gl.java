package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* loaded from: classes10.dex */
public final class Gl extends AbstractC4335im {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f29086b;

    public Gl(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f29086b = fraudMonCheckResult;
    }

    @Override // Ve.AbstractC4335im
    public final FraudMonCheckResult a() {
        return this.f29086b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gl) && Intrinsics.d(this.f29086b, ((Gl) obj).f29086b);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f29086b;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    public final String toString() {
        return "ReviewHintMode(fraudMonCheckResultParams=" + this.f29086b + ")";
    }
}
