package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Xc extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final M1.b f30351a;

    public Xc(M1.b payStatus) {
        Intrinsics.checkNotNullParameter(payStatus, "payStatus");
        this.f30351a = payStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Xc) && Intrinsics.d(this.f30351a, ((Xc) obj).f30351a);
    }

    public final int hashCode() {
        return this.f30351a.hashCode();
    }

    public final String toString() {
        return "Pay(payStatus=" + this.f30351a + ")";
    }
}
