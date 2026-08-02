package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* loaded from: classes10.dex */
public final class Oa extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f29606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(FraudMonCheckResult fraudMonCheckResult) {
        super(7);
        Intrinsics.checkNotNullParameter(fraudMonCheckResult, "fraudMonCheckResult");
        this.f29606b = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oa) && Intrinsics.d(this.f29606b, ((Oa) obj).f29606b);
    }

    public final int hashCode() {
        return this.f29606b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return "ReviewHint(fraudMonCheckResult=" + this.f29606b + ")";
    }
}
