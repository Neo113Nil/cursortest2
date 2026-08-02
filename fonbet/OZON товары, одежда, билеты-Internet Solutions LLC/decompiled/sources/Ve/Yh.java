package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.SessionIdRequestBody;

/* loaded from: classes10.dex */
public final class Yh {

    /* renamed from: a, reason: collision with root package name */
    public final String f30466a;

    /* renamed from: b, reason: collision with root package name */
    public final SessionIdRequestBody f30467b;

    public Yh(String authorization, SessionIdRequestBody sessionIdRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(sessionIdRequestBody, "sessionIdRequestBody");
        this.f30466a = authorization;
        this.f30467b = sessionIdRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yh)) {
            return false;
        }
        Yh yh2 = (Yh) obj;
        return Intrinsics.d(this.f30466a, yh2.f30466a) && Intrinsics.d(this.f30467b, yh2.f30467b);
    }

    public final int hashCode() {
        return this.f30467b.hashCode() + (this.f30466a.hashCode() * 31);
    }

    public final String toString() {
        return "GetSessionIdUseCaseRequestParams(authorization=" + this.f30466a + ", sessionIdRequestBody=" + this.f30467b + ")";
    }
}
