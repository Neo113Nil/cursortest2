package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Ya extends AbstractC4595rm {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f30447a;

    /* renamed from: b, reason: collision with root package name */
    public final C4518p2 f30448b;

    public Ya(ErrorEntity sPayApiError, C4518p2 c4518p2) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f30447a = sPayApiError;
        this.f30448b = c4518p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya2 = (Ya) obj;
        return Intrinsics.d(this.f30447a, ya2.f30447a) && Intrinsics.d(this.f30448b, ya2.f30448b);
    }

    public final int hashCode() {
        return this.f30448b.hashCode() + (this.f30447a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowPayBonusesError(sPayApiError=" + this.f30447a + ", caller=" + this.f30448b + ")";
    }
}
