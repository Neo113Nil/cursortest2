package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.v5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4694v5 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final M1.b f32258a;

    public C4694v5(M1.b paymentTokenStatus) {
        Intrinsics.checkNotNullParameter(paymentTokenStatus, "paymentTokenStatus");
        this.f32258a = paymentTokenStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4694v5) && Intrinsics.d(this.f32258a, ((C4694v5) obj).f32258a);
    }

    public final int hashCode() {
        return this.f32258a.hashCode();
    }

    public final String toString() {
        return "PaymentTokenResult(paymentTokenStatus=" + this.f32258a + ")";
    }
}
