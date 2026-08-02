package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Cl {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f28774a;

    public Cl(Pq title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f28774a = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cl) && Intrinsics.d(this.f28774a, ((Cl) obj).f28774a);
    }

    public final int hashCode() {
        return this.f28774a.hashCode();
    }

    public final String toString() {
        return "CardListHeaderItem(title=" + this.f28774a + ")";
    }
}
