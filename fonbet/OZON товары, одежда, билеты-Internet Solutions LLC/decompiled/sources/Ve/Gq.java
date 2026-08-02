package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Gq extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f29094a;

    public Gq(ErrorEntity errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f29094a = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gq) && Intrinsics.d(this.f29094a, ((Gq) obj).f29094a);
    }

    public final int hashCode() {
        return this.f29094a.hashCode();
    }

    public final String toString() {
        return "HandleConfirmOtpError(errorResponse=" + this.f29094a + ")";
    }
}
