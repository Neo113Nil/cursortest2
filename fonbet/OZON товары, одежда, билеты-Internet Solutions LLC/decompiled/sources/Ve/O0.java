package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class O0 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4245fi f29576a;

    public O0(AbstractC4245fi exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f29576a = exception;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O0) && Intrinsics.d(this.f29576a, ((O0) obj).f29576a);
    }

    public final int hashCode() {
        return this.f29576a.hashCode();
    }

    public final String toString() {
        return "HandleException(exception=" + this.f29576a + ")";
    }
}
