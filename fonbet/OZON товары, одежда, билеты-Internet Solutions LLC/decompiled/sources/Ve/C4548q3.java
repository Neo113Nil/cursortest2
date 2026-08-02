package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.q3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4548q3 {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f31839a;

    /* renamed from: b, reason: collision with root package name */
    public final Pq f31840b;

    public C4548q3(Pq amount, Pq pq) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f31839a = amount;
        this.f31840b = pq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4548q3)) {
            return false;
        }
        C4548q3 c4548q3 = (C4548q3) obj;
        return Intrinsics.d(this.f31839a, c4548q3.f31839a) && Intrinsics.d(this.f31840b, c4548q3.f31840b);
    }

    public final int hashCode() {
        return this.f31840b.hashCode() + (this.f31839a.hashCode() * 31);
    }

    public final String toString() {
        return "BnplPaymentItem(amount=" + this.f31839a + ", details=" + this.f31840b + ")";
    }
}
