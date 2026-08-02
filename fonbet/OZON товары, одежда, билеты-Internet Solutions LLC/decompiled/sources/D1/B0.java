package D1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class B0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B1.W f5218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final V f5219b;

    public B0(@NotNull B1.W w11, @NotNull V v11) {
        this.f5218a = w11;
        this.f5219b = v11;
    }

    @NotNull
    public final V a() {
        return this.f5219b;
    }

    @NotNull
    public final B1.W b() {
        return this.f5218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return Intrinsics.d(this.f5218a, b02.f5218a) && Intrinsics.d(this.f5219b, b02.f5219b);
    }

    public final int hashCode() {
        return this.f5219b.hashCode() + (this.f5218a.hashCode() * 31);
    }

    @Override // D1.y0
    public final boolean m0() {
        return this.f5219b.c1().I();
    }

    @NotNull
    public final String toString() {
        return "PlaceableResult(result=" + this.f5218a + ", placeable=" + this.f5219b + ')';
    }
}
