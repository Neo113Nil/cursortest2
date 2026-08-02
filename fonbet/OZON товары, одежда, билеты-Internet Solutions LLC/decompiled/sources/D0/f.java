package D0;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f5199a;

    private /* synthetic */ f(int i11) {
        this.f5199a = i11;
    }

    public static final /* synthetic */ f a(int i11) {
        return new f(i11);
    }

    public final /* synthetic */ int b() {
        return this.f5199a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f5199a == ((f) obj).f5199a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5199a);
    }

    public final String toString() {
        return Ek.a.d(new StringBuilder("TextHighlightType(value="), this.f5199a, ')');
    }
}
