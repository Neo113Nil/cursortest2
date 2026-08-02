package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.h0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4285h0 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final Lf.a f31131a;

    public C4285h0(Lf.a deviceCheckStatus) {
        Intrinsics.checkNotNullParameter(deviceCheckStatus, "deviceCheckStatus");
        this.f31131a = deviceCheckStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4285h0) && Intrinsics.d(this.f31131a, ((C4285h0) obj).f31131a);
    }

    public final int hashCode() {
        return this.f31131a.hashCode();
    }

    public final String toString() {
        return "HandleDeviceCheck(deviceCheckStatus=" + this.f31131a + ")";
    }
}
