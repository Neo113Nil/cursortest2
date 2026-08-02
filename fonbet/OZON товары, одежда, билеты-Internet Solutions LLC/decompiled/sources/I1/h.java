package I1;

import kd.InterfaceC7663b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final h f11689c = new h(kotlin.ranges.h.l(0.0f, 0.0f), 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f11690a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7663b<Float> f11691b;

    public h(@NotNull InterfaceC7663b interfaceC7663b, float f7) {
        this.f11690a = f7;
        this.f11691b = interfaceC7663b;
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f11690a;
    }

    @NotNull
    public final InterfaceC7663b<Float> c() {
        return this.f11691b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11690a == hVar.f11690a && this.f11691b.equals(hVar.f11691b);
    }

    public final int hashCode() {
        return (this.f11691b.hashCode() + (Float.hashCode(this.f11690a) * 31)) * 31;
    }

    @NotNull
    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f11690a + ", range=" + this.f11691b + ", steps=0)";
    }
}
