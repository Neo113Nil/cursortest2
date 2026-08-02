package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Nk extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f29562a;

    /* renamed from: b, reason: collision with root package name */
    public final C4613sb f29563b;

    public Nk(ErrorEntity sPayApiError, C4613sb payInFull) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        Intrinsics.checkNotNullParameter(payInFull, "payInFull");
        this.f29562a = sPayApiError;
        this.f29563b = payInFull;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nk)) {
            return false;
        }
        Nk nk = (Nk) obj;
        return Intrinsics.d(this.f29562a, nk.f29562a) && Intrinsics.d(this.f29563b, nk.f29563b);
    }

    public final int hashCode() {
        return this.f29563b.hashCode() + (this.f29562a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorWithBnplEnabled(sPayApiError=" + this.f29562a + ", payInFull=" + this.f29563b + ")";
    }
}
