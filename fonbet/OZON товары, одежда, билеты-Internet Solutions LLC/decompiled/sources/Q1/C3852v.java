package Q1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: Q1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3852v {

    /* renamed from: a, reason: collision with root package name */
    private final int f22919a;

    private /* synthetic */ C3852v(int i11) {
        this.f22919a = i11;
    }

    public static final /* synthetic */ C3852v a(int i11) {
        return new C3852v(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == -1 ? "Unspecified" : i11 == 0 ? "None" : i11 == 1 ? "Characters" : i11 == 2 ? "Words" : i11 == 3 ? "Sentences" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f22919a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3852v) {
            return this.f22919a == ((C3852v) obj).f22919a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22919a);
    }

    @NotNull
    public final String toString() {
        return b(this.f22919a);
    }
}
