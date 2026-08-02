package E10;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f7340c = new a(0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f7341a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7342b;

    public a(float f7, float f11) {
        this.f7341a = f7;
        this.f7342b = f11;
    }

    public final float b() {
        return this.f7342b;
    }

    public final float c() {
        return this.f7341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f7341a, aVar.f7341a) == 0 && Float.compare(this.f7342b, aVar.f7342b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7342b) + (Float.hashCode(this.f7341a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PrefetchDepth(topPrefetchMultiplier=" + this.f7341a + ", bottomPrefetchMultiplier=" + this.f7342b + ")";
    }
}
