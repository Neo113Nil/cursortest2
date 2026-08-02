package Q1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: Q1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3853w {

    /* renamed from: a, reason: collision with root package name */
    private final int f22920a;

    private /* synthetic */ C3853w(int i11) {
        this.f22920a = i11;
    }

    public static final /* synthetic */ C3853w a(int i11) {
        return new C3853w(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == 0 ? "Unspecified" : i11 == 1 ? "Text" : i11 == 2 ? "Ascii" : i11 == 3 ? "Number" : i11 == 4 ? "Phone" : i11 == 5 ? "Uri" : i11 == 6 ? "Email" : i11 == 7 ? "Password" : i11 == 8 ? "NumberPassword" : i11 == 9 ? "Decimal" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f22920a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3853w) {
            return this.f22920a == ((C3853w) obj).f22920a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22920a);
    }

    @NotNull
    public final String toString() {
        return b(this.f22920a);
    }
}
