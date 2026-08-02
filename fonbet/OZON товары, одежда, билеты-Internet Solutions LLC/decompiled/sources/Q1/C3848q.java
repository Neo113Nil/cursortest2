package Q1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: Q1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3848q {

    /* renamed from: a, reason: collision with root package name */
    private final int f22907a;

    private /* synthetic */ C3848q(int i11) {
        this.f22907a = i11;
    }

    public static final /* synthetic */ C3848q a(int i11) {
        return new C3848q(i11);
    }

    @NotNull
    public static String b(int i11) {
        return i11 == -1 ? "Unspecified" : i11 == 0 ? "None" : i11 == 1 ? "Default" : i11 == 2 ? "Go" : i11 == 3 ? "Search" : i11 == 4 ? "Send" : i11 == 5 ? "Previous" : i11 == 6 ? "Next" : i11 == 7 ? "Done" : "Invalid";
    }

    public final /* synthetic */ int c() {
        return this.f22907a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3848q) {
            return this.f22907a == ((C3848q) obj).f22907a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22907a);
    }

    @NotNull
    public final String toString() {
        return b(this.f22907a);
    }
}
