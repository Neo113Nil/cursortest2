package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Sd extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f29970a;

    public Sd(ErrorEntity sPayApiError) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f29970a = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Sd) && Intrinsics.d(this.f29970a, ((Sd) obj).f29970a);
    }

    public final int hashCode() {
        return this.f29970a.hashCode();
    }

    public final String toString() {
        return "Error(sPayApiError=" + this.f29970a + ")";
    }
}
