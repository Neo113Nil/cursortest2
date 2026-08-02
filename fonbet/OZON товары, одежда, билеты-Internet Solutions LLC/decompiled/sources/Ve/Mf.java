package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;

/* loaded from: classes10.dex */
public final class Mf {

    /* renamed from: a, reason: collision with root package name */
    public final String f29473a;

    /* renamed from: b, reason: collision with root package name */
    public final CreateOtpSdkRequestBody f29474b;

    public Mf(String authorization, CreateOtpSdkRequestBody createOtpSdkRequest) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(createOtpSdkRequest, "createOtpSdkRequest");
        this.f29473a = authorization;
        this.f29474b = createOtpSdkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mf)) {
            return false;
        }
        Mf mf2 = (Mf) obj;
        return Intrinsics.d(this.f29473a, mf2.f29473a) && Intrinsics.d(this.f29474b, mf2.f29474b);
    }

    public final int hashCode() {
        return Long.hashCode(45000L) + ((this.f29474b.hashCode() + (this.f29473a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreateOtpSdkUseCaseParams(authorization=" + this.f29473a + ", createOtpSdkRequest=" + this.f29474b + ", timerTime=45000)";
    }
}
