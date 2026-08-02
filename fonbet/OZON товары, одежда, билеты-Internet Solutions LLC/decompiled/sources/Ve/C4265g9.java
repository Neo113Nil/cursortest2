package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* renamed from: Ve.g9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4265g9 extends Lf.a {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f31099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4265g9(FraudMonCheckResult fraudMonCheckResult) {
        super(7);
        Intrinsics.checkNotNullParameter(fraudMonCheckResult, "fraudMonCheckResult");
        this.f31099b = fraudMonCheckResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4265g9) && Intrinsics.d(this.f31099b, ((C4265g9) obj).f31099b);
    }

    public final int hashCode() {
        return this.f31099b.hashCode();
    }

    @Override // Lf.a
    public final String toString() {
        return "DenyBlock(fraudMonCheckResult=" + this.f31099b + ")";
    }
}
