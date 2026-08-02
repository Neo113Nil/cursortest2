package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class E2 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final M1.b f28896a;

    public E2(M1.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f28896a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E2) && Intrinsics.d(this.f28896a, ((E2) obj).f28896a);
    }

    public final int hashCode() {
        return this.f28896a.hashCode();
    }

    public final String toString() {
        return "HandlePaymentTokenStatus(result=" + this.f28896a + ")";
    }
}
