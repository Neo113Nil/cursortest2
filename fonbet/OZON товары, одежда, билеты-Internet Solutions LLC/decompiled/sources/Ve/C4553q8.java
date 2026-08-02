package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.q8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4553q8 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final String f31847a;

    public C4553q8(String localSessionId) {
        Intrinsics.checkNotNullParameter(localSessionId, "localSessionId");
        this.f31847a = localSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4553q8) && Intrinsics.d(this.f31847a, ((C4553q8) obj).f31847a);
    }

    public final int hashCode() {
        return this.f31847a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("SetLocalSessionId(localSessionId="), this.f31847a, ")");
    }
}
