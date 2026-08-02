package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.d8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4178d8 extends M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f30859a = E.d(R.string.spay_wait_a_second);

    @Override // Ve.M9
    public final Pq a() {
        return this.f30859a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4178d8) && Intrinsics.d(this.f30859a, ((C4178d8) obj).f30859a);
    }

    public final int hashCode() {
        Pq pq = this.f30859a;
        if (pq == null) {
            return 0;
        }
        return pq.hashCode();
    }

    public final String toString() {
        return "JustASecond(text=" + this.f30859a + ")";
    }
}
