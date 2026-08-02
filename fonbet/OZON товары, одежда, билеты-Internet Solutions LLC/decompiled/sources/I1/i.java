package I1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f11692a;

    private /* synthetic */ i(int i11) {
        this.f11692a = i11;
    }

    public static final /* synthetic */ i a(int i11) {
        return new i(i11);
    }

    public final /* synthetic */ int b() {
        return this.f11692a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f11692a == ((i) obj).f11692a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11692a);
    }

    @NotNull
    public final String toString() {
        int i11 = this.f11692a;
        return i11 == 0 ? "Button" : i11 == 1 ? "Checkbox" : i11 == 2 ? "Switch" : i11 == 3 ? "RadioButton" : i11 == 4 ? "Tab" : i11 == 5 ? "Image" : i11 == 6 ? "DropdownList" : "Unknown";
    }
}
