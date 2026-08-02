package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.a2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4085a2 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final M1.b f30624a;

    public C4085a2(M1.b payStatus) {
        Intrinsics.checkNotNullParameter(payStatus, "payStatus");
        this.f30624a = payStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4085a2) && Intrinsics.d(this.f30624a, ((C4085a2) obj).f30624a);
    }

    public final int hashCode() {
        return this.f30624a.hashCode();
    }

    public final String toString() {
        return "HandlePayResult(payStatus=" + this.f30624a + ")";
    }
}
