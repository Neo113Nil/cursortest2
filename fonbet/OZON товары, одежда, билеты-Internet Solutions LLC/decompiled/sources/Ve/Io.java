package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Io {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f29244a;

    public Io(InterfaceC4733wg mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f29244a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Io) && Intrinsics.d(this.f29244a, ((Io) obj).f29244a);
    }

    public final int hashCode() {
        return this.f29244a.hashCode();
    }

    public final String toString() {
        return "CardSelectionData(mode=" + this.f29244a + ")";
    }
}
