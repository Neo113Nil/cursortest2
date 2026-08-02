package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.j9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4351j9 extends M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f31351a = E.d(R.string.spay_pay_loading_text);

    @Override // Ve.M9
    public final Pq a() {
        return this.f31351a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4351j9) && Intrinsics.d(this.f31351a, ((C4351j9) obj).f31351a);
    }

    public final int hashCode() {
        Pq pq = this.f31351a;
        if (pq == null) {
            return 0;
        }
        return pq.hashCode();
    }

    public final String toString() {
        return "PaymentLoading(text=" + this.f31351a + ")";
    }
}
