package N10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18405a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18406b;

    public c(@NotNull String type, int i11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f18405a = type;
        this.f18406b = i11;
    }

    public final int a() {
        return this.f18406b;
    }

    @NotNull
    public final String b() {
        return this.f18405a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c other = cVar;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.i(this.f18406b, other.f18406b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f18405a, cVar.f18405a) && this.f18406b == cVar.f18406b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18406b) + (this.f18405a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickyHeaderConfig(type=");
        sb2.append(this.f18405a);
        sb2.append(", position=");
        return K00.b.e(this.f18406b, ")", sb2);
    }
}
