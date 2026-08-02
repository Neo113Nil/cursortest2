package I10;

import ed.InterfaceC6346b;
import i10.InterfaceC6995a;

@InterfaceC6346b
/* loaded from: classes7.dex */
public final class c implements InterfaceC6995a {

    /* renamed from: a, reason: collision with root package name */
    private final int f11795a;

    private /* synthetic */ c(int i11) {
        this.f11795a = i11;
    }

    public static final /* synthetic */ c a(int i11) {
        return new c(i11);
    }

    public final /* synthetic */ int b() {
        return this.f11795a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f11795a == ((c) obj).f11795a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11795a);
    }

    public final String toString() {
        return K00.b.e(this.f11795a, ")", new StringBuilder("AppBarOverlapSize(value="));
    }
}
