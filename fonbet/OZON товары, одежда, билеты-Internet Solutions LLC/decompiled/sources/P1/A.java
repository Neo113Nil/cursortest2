package P1;

import Sc.InterfaceC3999a;
import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final int f21501a;

    @InterfaceC3999a
    private /* synthetic */ A(int i11) {
        this.f21501a = i11;
    }

    public static final /* synthetic */ A a(int i11) {
        return new A(i11);
    }

    public final /* synthetic */ int b() {
        return this.f21501a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f21501a == ((A) obj).f21501a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21501a);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f21501a;
        return i11 == 0 ? "Normal" : i11 == 1 ? "Italic" : "Invalid";
    }
}
