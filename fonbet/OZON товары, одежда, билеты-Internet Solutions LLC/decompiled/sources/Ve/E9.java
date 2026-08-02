package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class E9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f28916a;

    public E9(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f28916a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E9) && Intrinsics.d(this.f28916a, ((E9) obj).f28916a);
    }

    public final int hashCode() {
        return this.f28916a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("CheckBindingUseCaseParams(sessionId="), this.f28916a, ")");
    }
}
