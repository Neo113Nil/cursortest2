package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.q9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4554q9 extends AbstractC4595rm {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f31848a;

    public C4554q9(ErrorEntity sPayApiError) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f31848a = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4554q9) && Intrinsics.d(this.f31848a, ((C4554q9) obj).f31848a);
    }

    public final int hashCode() {
        return this.f31848a.hashCode();
    }

    public final String toString() {
        return "ShowConfirmOtpCodeResultError(sPayApiError=" + this.f31848a + ")";
    }
}
