package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Cb extends AbstractC4245fi implements InterfaceC4337io {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f28753a;

    public Cb(ErrorEntity sPayApiError) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f28753a = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cb) && Intrinsics.d(this.f28753a, ((Cb) obj).f28753a);
    }

    public final int hashCode() {
        return this.f28753a.hashCode();
    }

    public final String toString() {
        return "ShowPayResultError(sPayApiError=" + this.f28753a + ")";
    }
}
