package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* loaded from: classes10.dex */
public final class Rf {

    /* renamed from: a, reason: collision with root package name */
    public final String f29850a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkAuthRequestBody f29851b;

    public Rf(String authorization, SdkAuthRequestBody sdkAuthRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(sdkAuthRequestBody, "sdkAuthRequestBody");
        this.f29850a = authorization;
        this.f29851b = sdkAuthRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rf)) {
            return false;
        }
        Rf rf2 = (Rf) obj;
        return Intrinsics.d(this.f29850a, rf2.f29850a) && Intrinsics.d(this.f29851b, rf2.f29851b);
    }

    public final int hashCode() {
        return this.f29851b.hashCode() + (this.f29850a.hashCode() * 31);
    }

    public final String toString() {
        return "GetSdkAuthUseCaseRequestParams(authorization=" + this.f29850a + ", sdkAuthRequestBody=" + this.f29851b + ")";
    }
}
