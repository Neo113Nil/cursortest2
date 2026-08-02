package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class S9 extends AbstractC4595rm {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f29950a;

    public S9(ErrorEntity errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f29950a = errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S9) && Intrinsics.d(this.f29950a, ((S9) obj).f29950a);
    }

    public final int hashCode() {
        return this.f29950a.hashCode();
    }

    public final String toString() {
        return "ShowCreateOtpSdkResultError(errorResponse=" + this.f29950a + ")";
    }
}
