package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.lk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4420lk extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f31534a;

    public C4420lk(ErrorEntity sPayApiError) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f31534a = sPayApiError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4420lk) && Intrinsics.d(this.f31534a, ((C4420lk) obj).f31534a);
    }

    public final int hashCode() {
        return this.f31534a.hashCode();
    }

    public final String toString() {
        return "Error(sPayApiError=" + this.f31534a + ")";
    }
}
