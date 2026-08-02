package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f27914a;

    private /* synthetic */ h(int i11) {
        this.f27914a = i11;
    }

    public static final /* synthetic */ h a(int i11) {
        return new h(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == 1 ? "Left" : i11 == 2 ? "Right" : i11 == 3 ? "Center" : i11 == 4 ? "Justify" : i11 == 5 ? "Start" : i11 == 6 ? "End" : i11 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f27914a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f27914a == ((h) obj).f27914a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27914a);
    }

    @NotNull
    public final String toString() {
        return b(this.f27914a);
    }
}
