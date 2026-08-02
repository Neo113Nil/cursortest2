package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Dp extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f28882a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28883b;

    public Dp(ErrorEntity errorResponse, boolean z11) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f28882a = errorResponse;
        this.f28883b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dp)) {
            return false;
        }
        Dp dp = (Dp) obj;
        return Intrinsics.d(this.f28882a, dp.f28882a) && this.f28883b == dp.f28883b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f28882a.hashCode() * 31;
        boolean z11 = this.f28883b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final String toString() {
        return "HandleBindingError(errorResponse=" + this.f28882a + ", needUpdateBinding=" + this.f28883b + ")";
    }
}
