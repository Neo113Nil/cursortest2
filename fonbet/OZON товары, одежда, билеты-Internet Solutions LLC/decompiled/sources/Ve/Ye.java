package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ye extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final String f30458a;

    public Ye(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f30458a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ye) && Intrinsics.d(this.f30458a, ((Ye) obj).f30458a);
    }

    public final int hashCode() {
        return this.f30458a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("StartBindingOTP(sessionId="), this.f30458a, ")");
    }
}
