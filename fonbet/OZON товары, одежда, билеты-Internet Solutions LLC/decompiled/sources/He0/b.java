package He0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.m;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f10907a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f10908b;

    public b(@NotNull m southWest, @NotNull m northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        this.f10907a = southWest;
        this.f10908b = northEast;
    }

    @NotNull
    public final m a() {
        return this.f10908b;
    }

    @NotNull
    public final m b() {
        return this.f10907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f10907a, bVar.f10907a) && Intrinsics.d(this.f10908b, bVar.f10908b);
    }

    public final int hashCode() {
        return this.f10908b.hashCode() + (this.f10907a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LocationBounds(southWest=" + this.f10907a + ", northEast=" + this.f10908b + ")";
    }
}
