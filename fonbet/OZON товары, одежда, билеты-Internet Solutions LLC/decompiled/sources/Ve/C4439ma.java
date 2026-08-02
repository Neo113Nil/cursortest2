package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* renamed from: Ve.ma, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4439ma extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f31573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4439ma(FraudMonCheckResult fraudMonCheckResult) {
        super(7);
        Intrinsics.checkNotNullParameter(fraudMonCheckResult, "fraudMonCheckResult");
        this.f31573b = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4439ma) && Intrinsics.d(this.f31573b, ((C4439ma) obj).f31573b);
    }

    public final int hashCode() {
        return this.f31573b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return "OtpReview(fraudMonCheckResult=" + this.f31573b + ")";
    }
}
