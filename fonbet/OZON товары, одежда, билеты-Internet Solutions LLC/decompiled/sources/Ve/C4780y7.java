package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.y7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4780y7 extends M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f32541a = E.d(R.string.spay_load_cards);

    @Override // Ve.M9
    public final Pq a() {
        return this.f32541a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4780y7) && Intrinsics.d(this.f32541a, ((C4780y7) obj).f32541a);
    }

    public final int hashCode() {
        Pq pq = this.f32541a;
        if (pq == null) {
            return 0;
        }
        return pq.hashCode();
    }

    public final String toString() {
        return "FullEmissionLoading(text=" + this.f32541a + ")";
    }
}
