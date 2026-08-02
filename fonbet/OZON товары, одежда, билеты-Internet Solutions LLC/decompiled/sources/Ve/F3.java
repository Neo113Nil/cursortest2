package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class F3 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f28964a;

    /* renamed from: b, reason: collision with root package name */
    public final C4580r7 f28965b;

    public F3(InterfaceC4733wg mode, C4580r7 preparedListOfCards) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(preparedListOfCards, "preparedListOfCards");
        this.f28964a = mode;
        this.f28965b = preparedListOfCards;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3)) {
            return false;
        }
        F3 f32 = (F3) obj;
        return Intrinsics.d(this.f28964a, f32.f28964a) && Intrinsics.d(this.f28965b, f32.f28965b);
    }

    public final int hashCode() {
        return this.f28965b.hashCode() + (this.f28964a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderScreenSelectCard(mode=" + this.f28964a + ", preparedListOfCards=" + this.f28965b + ")";
    }
}
