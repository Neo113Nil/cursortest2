package Z1;

import F3.G;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f35317a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35318b;

    public e(float f7, float f11) {
        this.f35317a = f7;
        this.f35318b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f35317a, eVar.f35317a) == 0 && Float.compare(this.f35318b, eVar.f35318b) == 0;
    }

    @Override // Z1.d
    public final float g() {
        return this.f35317a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35318b) + (Float.hashCode(this.f35317a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f35317a);
        sb2.append(", fontScale=");
        return G.a(sb2, this.f35318b, ')');
    }

    @Override // Z1.k
    public final float u1() {
        return this.f35318b;
    }
}
