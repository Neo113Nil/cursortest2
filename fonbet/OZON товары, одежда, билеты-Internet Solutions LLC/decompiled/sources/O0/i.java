package O0;

import F3.G;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final float f19759a;

    /* renamed from: b, reason: collision with root package name */
    private final float f19760b;

    /* renamed from: c, reason: collision with root package name */
    private final float f19761c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19762d;

    public i(float f7, float f11, float f12, float f13) {
        this.f19759a = f7;
        this.f19760b = f11;
        this.f19761c = f12;
        this.f19762d = f13;
    }

    public final float a() {
        return this.f19759a;
    }

    public final float b() {
        return this.f19760b;
    }

    public final float c() {
        return this.f19761c;
    }

    public final float d() {
        return this.f19762d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f19759a == iVar.f19759a && this.f19760b == iVar.f19760b && this.f19761c == iVar.f19761c && this.f19762d == iVar.f19762d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19762d) + Pk0.b.a(this.f19761c, Pk0.b.a(this.f19760b, Float.hashCode(this.f19759a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f19759a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f19760b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f19761c);
        sb2.append(", pressedAlpha=");
        return G.a(sb2, this.f19762d, ')');
    }
}
