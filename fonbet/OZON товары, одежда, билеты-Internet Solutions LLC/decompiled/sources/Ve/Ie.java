package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ie extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC4801z0 f29227a;

    public Ie(EnumC4801z0 reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f29227a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ie) && this.f29227a == ((Ie) obj).f29227a;
    }

    public final int hashCode() {
        return this.f29227a.hashCode();
    }

    public final String toString() {
        return "PhoneNumber(reason=" + this.f29227a + ")";
    }
}
