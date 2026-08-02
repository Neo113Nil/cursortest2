package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Nr extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f29575a;

    public Nr(ErrorEntity errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f29575a = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Nr) && Intrinsics.d(this.f29575a, ((Nr) obj).f29575a);
    }

    public final int hashCode() {
        return this.f29575a.hashCode();
    }

    public final String toString() {
        return "HandleCreateOtpSdkError(errorResponse=" + this.f29575a + ")";
    }
}
