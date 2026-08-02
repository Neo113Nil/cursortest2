package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Xd extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f30352a;

    /* renamed from: b, reason: collision with root package name */
    public final C4580r7 f30353b;

    public Xd(InterfaceC4733wg mode, C4580r7 listOfCards) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(listOfCards, "listOfCards");
        this.f30352a = mode;
        this.f30353b = listOfCards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xd)) {
            return false;
        }
        Xd xd2 = (Xd) obj;
        return Intrinsics.d(this.f30352a, xd2.f30352a) && Intrinsics.d(this.f30353b, xd2.f30353b);
    }

    public final int hashCode() {
        return this.f30353b.hashCode() + (this.f30352a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSelectCardScreenEvent(mode=" + this.f30352a + ", listOfCards=" + this.f30353b + ")";
    }
}
