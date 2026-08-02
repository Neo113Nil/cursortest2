package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* renamed from: Ve.p4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4520p4 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final SessionIdResponseBody f31761a;

    public C4520p4(SessionIdResponseBody sessionIdResponseBody) {
        Intrinsics.checkNotNullParameter(sessionIdResponseBody, "sessionIdResponseBody");
        this.f31761a = sessionIdResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4520p4) && Intrinsics.d(this.f31761a, ((C4520p4) obj).f31761a);
    }

    public final int hashCode() {
        return this.f31761a.hashCode();
    }

    public final String toString() {
        return "HandleSessionIdData(sessionIdResponseBody=" + this.f31761a + ")";
    }
}
