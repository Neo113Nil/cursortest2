package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Qb extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f29765a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29766b;

    public Qb(InterfaceC4733wg mode, boolean z11) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f29765a = mode;
        this.f29766b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qb)) {
            return false;
        }
        Qb qb2 = (Qb) obj;
        return Intrinsics.d(this.f29765a, qb2.f29765a) && this.f29766b == qb2.f29766b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f29765a.hashCode() * 31;
        boolean z11 = this.f29766b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return (hashCode + i11) * 31;
    }

    public final String toString() {
        return "OrderScreenData(mode=" + this.f29765a + ", noCardsAvailable=" + this.f29766b + ", selectedCard=null)";
    }
}
