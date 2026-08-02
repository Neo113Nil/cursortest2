package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* renamed from: Ve.k8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4379k8 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final SdkAuthResponseBody f31427a;

    public C4379k8(SdkAuthResponseBody sdkAuthResponseBody) {
        Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
        this.f31427a = sdkAuthResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4379k8) && Intrinsics.d(this.f31427a, ((C4379k8) obj).f31427a);
    }

    public final int hashCode() {
        return this.f31427a.hashCode();
    }

    public final String toString() {
        return "SdkAuthResult(sdkAuthResponseBody=" + this.f31427a + ")";
    }
}
