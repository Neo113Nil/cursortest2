package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* loaded from: classes10.dex */
public final class N8 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final SessionIdResponseBody f29532a;

    public N8(SessionIdResponseBody sessionIdResponseBody) {
        Intrinsics.checkNotNullParameter(sessionIdResponseBody, "sessionIdResponseBody");
        this.f29532a = sessionIdResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N8) && Intrinsics.d(this.f29532a, ((N8) obj).f29532a);
    }

    public final int hashCode() {
        return this.f29532a.hashCode();
    }

    public final String toString() {
        return "SessionIdResult(sessionIdResponseBody=" + this.f29532a + ")";
    }
}
