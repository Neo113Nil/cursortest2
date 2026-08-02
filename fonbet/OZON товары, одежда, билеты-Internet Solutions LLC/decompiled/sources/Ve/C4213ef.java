package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ef, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4213ef extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final String f30926a;

    public C4213ef(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f30926a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4213ef) && Intrinsics.d(this.f30926a, ((C4213ef) obj).f30926a);
    }

    public final int hashCode() {
        return this.f30926a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("StartBindingOTP(sessionId="), this.f30926a, ")");
    }
}
