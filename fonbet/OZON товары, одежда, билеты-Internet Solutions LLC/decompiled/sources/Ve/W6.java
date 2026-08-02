package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class W6 extends M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f30250a = E.d(R.string.spay_empty_string);

    @Override // Ve.M9
    public final Pq a() {
        return this.f30250a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W6) && Intrinsics.d(this.f30250a, ((W6) obj).f30250a);
    }

    public final int hashCode() {
        Pq pq = this.f30250a;
        if (pq == null) {
            return 0;
        }
        return pq.hashCode();
    }

    public final String toString() {
        return "CommonLoading(text=" + this.f30250a + ")";
    }
}
