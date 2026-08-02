package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* loaded from: classes10.dex */
public final class C8 extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f28745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(FraudMonCheckResult fraudMonCheckResult) {
        super(7);
        Intrinsics.checkNotNullParameter(fraudMonCheckResult, "fraudMonCheckResult");
        this.f28745b = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8) && Intrinsics.d(this.f28745b, ((C8) obj).f28745b);
    }

    public final int hashCode() {
        return this.f28745b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return "Deny(fraudMonCheckResult=" + this.f28745b + ")";
    }
}
