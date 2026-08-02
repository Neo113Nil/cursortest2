package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ge, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4270ge extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final C4518p2 f31108a;

    public C4270ge(C4518p2 c4518p2) {
        this.f31108a = c4518p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4270ge) && Intrinsics.d(this.f31108a, ((C4270ge) obj).f31108a);
    }

    public final int hashCode() {
        return this.f31108a.hashCode();
    }

    public final String toString() {
        return "PayBonusesError(caller=" + this.f31108a + ")";
    }
}
