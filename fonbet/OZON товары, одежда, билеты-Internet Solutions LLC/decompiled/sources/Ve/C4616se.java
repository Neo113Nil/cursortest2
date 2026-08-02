package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.se, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4616se {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f32047a;

    /* renamed from: b, reason: collision with root package name */
    public final Pq f32048b;

    public C4616se(Pq amount, Pq pq) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f32047a = amount;
        this.f32048b = pq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4616se)) {
            return false;
        }
        C4616se c4616se = (C4616se) obj;
        return Intrinsics.d(this.f32047a, c4616se.f32047a) && Intrinsics.d(this.f32048b, c4616se.f32048b);
    }

    public final int hashCode() {
        int hashCode = this.f32047a.hashCode() * 31;
        Pq pq = this.f32048b;
        return hashCode + (pq == null ? 0 : pq.hashCode());
    }

    public final String toString() {
        return "OrderAmountState(amount=" + this.f32047a + ", oldAmount=" + this.f32048b + ")";
    }
}
