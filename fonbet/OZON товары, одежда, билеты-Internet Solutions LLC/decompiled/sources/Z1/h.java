package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: a, reason: collision with root package name */
    private final float f35322a;

    public static final class a {
    }

    private /* synthetic */ h(float f7) {
        this.f35322a = f7;
    }

    public static final /* synthetic */ h a(float f7) {
        return new h(f7);
    }

    public static final boolean b(float f7, float f11) {
        return Float.compare(f7, f11) == 0;
    }

    @NotNull
    public static String c(float f7) {
        if (Float.isNaN(f7)) {
            return "Dp.Unspecified";
        }
        return f7 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return Float.compare(this.f35322a, hVar.f35322a);
    }

    public final /* synthetic */ float d() {
        return this.f35322a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return Float.compare(this.f35322a, ((h) obj).f35322a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35322a);
    }

    @NotNull
    public final String toString() {
        return c(this.f35322a);
    }
}
