package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f30126a;

    /* renamed from: b, reason: collision with root package name */
    public final C4543pr f30127b;

    public Uf(Pq amount, C4543pr merchantName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f30126a = amount;
        this.f30127b = merchantName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uf)) {
            return false;
        }
        Uf uf2 = (Uf) obj;
        return Intrinsics.d(this.f30126a, uf2.f30126a) && Intrinsics.d(this.f30127b, uf2.f30127b);
    }

    public final int hashCode() {
        return this.f30127b.f31818a.hashCode() + (this.f30126a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderData(amount=" + this.f30126a + ", merchantName=" + this.f30127b + ")";
    }
}
