package Z;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final W.b f1862a;

    /* renamed from: b, reason: collision with root package name */
    public final y.Q f1863b;

    public k(W.b bVar, y.Q _windowInsetsCompat) {
        kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f1862a = bVar;
        this.f1863b = _windowInsetsCompat;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Z.k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        Z.k kVar = (Z.k) obj;
        return kotlin.jvm.internal.i.a(this.f1862a, kVar.f1862a) && kotlin.jvm.internal.i.a(this.f1863b, kVar.f1863b);
    }

    public final int hashCode() {
        return this.f1863b.hashCode() + (this.f1862a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "WindowMetrics( bounds=" + this.f1862a + ", windowInsetsCompat=" + this.f1863b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(android.graphics.Rect rect, y.Q insets) {
        this(new W.b(rect), insets);
        kotlin.jvm.internal.i.e(insets, "insets");
    }
}
