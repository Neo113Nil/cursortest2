package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f27919a;

    private /* synthetic */ j(int i11) {
        this.f27919a = i11;
    }

    public static final /* synthetic */ j a(int i11) {
        return new j(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == 1 ? "Ltr" : i11 == 2 ? "Rtl" : i11 == 3 ? "Content" : i11 == 4 ? "ContentOrLtr" : i11 == 5 ? "ContentOrRtl" : i11 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f27919a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f27919a == ((j) obj).f27919a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27919a);
    }

    @NotNull
    public final String toString() {
        return b(this.f27919a);
    }
}
