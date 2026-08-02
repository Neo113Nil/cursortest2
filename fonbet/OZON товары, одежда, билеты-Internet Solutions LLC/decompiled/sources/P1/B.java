package P1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final int f21502a;

    private /* synthetic */ B(int i11) {
        this.f21502a = i11;
    }

    public static final /* synthetic */ B a(int i11) {
        return new B(i11);
    }

    public final /* synthetic */ int b() {
        return this.f21502a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return this.f21502a == ((B) obj).f21502a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21502a);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f21502a;
        return i11 == 0 ? "None" : i11 == 1 ? "All" : i11 == 2 ? "Weight" : i11 == 3 ? "Style" : "Invalid";
    }
}
