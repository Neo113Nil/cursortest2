package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Rh extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final M9 f29856a;

    public Rh(M9 loadingStatus) {
        Intrinsics.checkNotNullParameter(loadingStatus, "loadingStatus");
        this.f29856a = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Rh) && Intrinsics.d(this.f29856a, ((Rh) obj).f29856a);
    }

    public final int hashCode() {
        return this.f29856a.hashCode();
    }

    public final String toString() {
        return "ShowLoading(loadingStatus=" + this.f29856a + ")";
    }
}
