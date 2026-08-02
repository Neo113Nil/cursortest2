package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class r {
    private /* synthetic */ r() {
    }

    @NotNull
    public static String a(int i11) {
        return i11 == 1 ? "Clip" : i11 == 2 ? "Ellipsis" : i11 == 3 ? "Visible" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        ((r) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }

    @NotNull
    public final String toString() {
        return "Clip";
    }
}
