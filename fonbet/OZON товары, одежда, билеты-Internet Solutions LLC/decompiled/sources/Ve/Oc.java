package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Oc extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f29610a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29611b;

    public Oc(InterfaceC4733wg mode, boolean z11) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f29610a = mode;
        this.f29611b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oc)) {
            return false;
        }
        Oc oc2 = (Oc) obj;
        return Intrinsics.d(this.f29610a, oc2.f29610a) && this.f29611b == oc2.f29611b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f29610a.hashCode() * 31;
        boolean z11 = this.f29611b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowOrderScreenEvent(mode=");
        sb2.append(this.f29610a);
        sb2.append(", dropSelectedCardForBnpl=");
        return Pk0.a.a(")", sb2, this.f29611b);
    }
}
