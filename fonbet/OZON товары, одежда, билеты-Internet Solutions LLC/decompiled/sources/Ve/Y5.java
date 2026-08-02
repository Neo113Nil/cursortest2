package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Y5 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f30437a;

    /* renamed from: b, reason: collision with root package name */
    public final Da f30438b;

    public Y5(Mf request, Da actionOnSuccess) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(actionOnSuccess, "actionOnSuccess");
        this.f30437a = request;
        this.f30438b = actionOnSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y5)) {
            return false;
        }
        Y5 y52 = (Y5) obj;
        return Intrinsics.d(this.f30437a, y52.f30437a) && Intrinsics.d(this.f30438b, y52.f30438b);
    }

    public final int hashCode() {
        return this.f30438b.hashCode() + (this.f30437a.hashCode() * 31);
    }

    public final String toString() {
        return "PerformCreateOTPRequest(request=" + this.f30437a + ", actionOnSuccess=" + this.f30438b + ")";
    }
}
