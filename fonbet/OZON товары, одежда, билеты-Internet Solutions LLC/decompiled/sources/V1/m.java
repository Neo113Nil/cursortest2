package V1;

import F3.G;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final m f27923c = new m(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final float f27924a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27925b;

    public static final class a {
    }

    public m(float f7, float f11) {
        this.f27924a = f7;
        this.f27925b = f11;
    }

    public final float b() {
        return this.f27924a;
    }

    public final float c() {
        return this.f27925b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f27924a == mVar.f27924a && this.f27925b == mVar.f27925b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27925b) + (Float.hashCode(this.f27924a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f27924a);
        sb2.append(", skewX=");
        return G.a(sb2, this.f27925b, ')');
    }

    public m() {
        this(1.0f, 0.0f);
    }
}
