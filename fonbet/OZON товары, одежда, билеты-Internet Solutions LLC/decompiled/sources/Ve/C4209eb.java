package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.eb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4209eb extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final M9 f30923a;

    public C4209eb(M9 loadingStatus) {
        Intrinsics.checkNotNullParameter(loadingStatus, "loadingStatus");
        this.f30923a = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4209eb) && Intrinsics.d(this.f30923a, ((C4209eb) obj).f30923a);
    }

    public final int hashCode() {
        return this.f30923a.hashCode();
    }

    public final String toString() {
        return "ShowLoadingScreen(loadingStatus=" + this.f30923a + ")";
    }
}
