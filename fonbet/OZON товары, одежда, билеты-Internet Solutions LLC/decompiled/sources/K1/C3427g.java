package K1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: K1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3427g {

    /* renamed from: a, reason: collision with root package name */
    private final int f15048a;

    private /* synthetic */ C3427g(int i11) {
        this.f15048a = i11;
    }

    public static final /* synthetic */ C3427g a(int i11) {
        return new C3427g(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == 0 ? "EmojiSupportMatch.Default" : i11 == 1 ? "EmojiSupportMatch.None" : i11 == 2 ? "EmojiSupportMatch.All" : P4.f.c("Invalid(value=", i11, ')');
    }

    public final /* synthetic */ int c() {
        return this.f15048a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3427g) {
            return this.f15048a == ((C3427g) obj).f15048a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15048a);
    }

    @NotNull
    public final String toString() {
        return b(this.f15048a);
    }
}
