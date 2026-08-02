package F5;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f9078a;

    private /* synthetic */ v(int i11) {
        this.f9078a = i11;
    }

    public static final /* synthetic */ v a(int i11) {
        return new v(i11);
    }

    public final /* synthetic */ int b() {
        return this.f9078a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f9078a == ((v) obj).f9078a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9078a);
    }

    public final String toString() {
        return K00.b.e(this.f9078a, ")", new StringBuilder("RawRes(resId="));
    }
}
