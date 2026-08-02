package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Bq extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final M9 f28729a;

    public Bq(M9 loadingStatus) {
        Intrinsics.checkNotNullParameter(loadingStatus, "loadingStatus");
        this.f28729a = loadingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bq) && Intrinsics.d(this.f28729a, ((Bq) obj).f28729a);
    }

    public final int hashCode() {
        return this.f28729a.hashCode();
    }

    public final String toString() {
        return "Loading(loadingStatus=" + this.f28729a + ")";
    }
}
