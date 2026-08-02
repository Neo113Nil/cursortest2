package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.h3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4288h3 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final E f31139a;

    public C4288h3(E result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f31139a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4288h3) && Intrinsics.d(this.f31139a, ((C4288h3) obj).f31139a);
    }

    public final int hashCode() {
        return this.f31139a.hashCode();
    }

    public final String toString() {
        return "HandleRevokeTokenResult(result=" + this.f31139a + ")";
    }
}
