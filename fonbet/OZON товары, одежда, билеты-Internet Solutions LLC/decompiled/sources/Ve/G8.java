package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class G8 extends M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f29064a = E.d(R.string.spay_empty_string);

    @Override // Ve.M9
    public final Pq a() {
        return this.f29064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G8) && Intrinsics.d(this.f29064a, ((G8) obj).f29064a);
    }

    public final int hashCode() {
        Pq pq = this.f29064a;
        if (pq == null) {
            return 0;
        }
        return pq.hashCode();
    }

    public final String toString() {
        return "ListOfCardsLoading(text=" + this.f29064a + ")";
    }
}
