package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* renamed from: Ve.gl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4277gl extends AbstractC4335im {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f31117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4277gl(FraudMonCheckResult fraudMonCheckResultParams) {
        super(fraudMonCheckResultParams);
        Intrinsics.checkNotNullParameter(fraudMonCheckResultParams, "fraudMonCheckResultParams");
        this.f31117b = fraudMonCheckResultParams;
    }

    @Override // Ve.AbstractC4335im
    public final FraudMonCheckResult a() {
        return this.f31117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4277gl) && Intrinsics.d(this.f31117b, ((C4277gl) obj).f31117b);
    }

    public final int hashCode() {
        return this.f31117b.hashCode();
    }

    public final String toString() {
        return "OtpReviewMode(fraudMonCheckResultParams=" + this.f31117b + ")";
    }
}
