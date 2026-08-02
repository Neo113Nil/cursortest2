package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* renamed from: Ve.bk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4132bk extends AbstractC4335im {

    /* renamed from: b, reason: collision with root package name */
    public final FraudMonCheckResult f30738b;

    public C4132bk(FraudMonCheckResult fraudMonCheckResult) {
        super(fraudMonCheckResult);
        this.f30738b = fraudMonCheckResult;
    }

    @Override // Ve.AbstractC4335im
    public final FraudMonCheckResult a() {
        return this.f30738b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4132bk) && Intrinsics.d(this.f30738b, ((C4132bk) obj).f30738b);
    }

    public final int hashCode() {
        FraudMonCheckResult fraudMonCheckResult = this.f30738b;
        if (fraudMonCheckResult == null) {
            return 0;
        }
        return fraudMonCheckResult.hashCode();
    }

    public final String toString() {
        return "DenyMode(fraudMonCheckResultParams=" + this.f30738b + ")";
    }
}
