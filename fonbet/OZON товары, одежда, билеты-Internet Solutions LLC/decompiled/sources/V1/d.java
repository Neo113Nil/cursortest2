package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f27903a;

    private /* synthetic */ d(int i11) {
        this.f27903a = i11;
    }

    public static final /* synthetic */ d a(int i11) {
        return new d(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == 1 ? "Hyphens.None" : i11 == 2 ? "Hyphens.Auto" : i11 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f27903a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f27903a == ((d) obj).f27903a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27903a);
    }

    @NotNull
    public final String toString() {
        return b(this.f27903a);
    }
}
