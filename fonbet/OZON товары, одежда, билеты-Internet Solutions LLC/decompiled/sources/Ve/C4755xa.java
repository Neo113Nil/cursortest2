package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* renamed from: Ve.xa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4755xa extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorEntity f32475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32476b;

    public C4755xa(ErrorEntity sPayApiError, boolean z11) {
        Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
        this.f32475a = sPayApiError;
        this.f32476b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4755xa)) {
            return false;
        }
        C4755xa c4755xa = (C4755xa) obj;
        return Intrinsics.d(this.f32475a, c4755xa.f32475a) && this.f32476b == c4755xa.f32476b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f32475a.hashCode() * 31;
        boolean z11 = this.f32476b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final String toString() {
        return "ShowPayBindingError(sPayApiError=" + this.f32475a + ", needUpdateBinding=" + this.f32476b + ")";
    }
}
