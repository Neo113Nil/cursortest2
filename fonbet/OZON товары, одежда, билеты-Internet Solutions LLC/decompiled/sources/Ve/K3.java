package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SdkAuthResponseBody;

/* loaded from: classes10.dex */
public final class K3 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final SdkAuthResponseBody f29333a;

    public K3(SdkAuthResponseBody sdkAuthResponseBody) {
        Intrinsics.checkNotNullParameter(sdkAuthResponseBody, "sdkAuthResponseBody");
        this.f29333a = sdkAuthResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K3) && Intrinsics.d(this.f29333a, ((K3) obj).f29333a);
    }

    public final int hashCode() {
        return this.f29333a.hashCode();
    }

    public final String toString() {
        return "HandleSdkAuthData(sdkAuthResponseBody=" + this.f29333a + ")";
    }
}
