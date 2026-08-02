package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class U1 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4182dc f30089a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30090b;

    public U1(AbstractC4182dc state, long j11) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f30089a = state;
        this.f30090b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return false;
        }
        U1 u12 = (U1) obj;
        return Intrinsics.d(this.f30089a, u12.f30089a) && this.f30090b == u12.f30090b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30090b) + (this.f30089a.hashCode() * 31);
    }

    public final String toString() {
        return "OneTimePassword(state=" + this.f30089a + ", timerTime=" + this.f30090b + ")";
    }
}
