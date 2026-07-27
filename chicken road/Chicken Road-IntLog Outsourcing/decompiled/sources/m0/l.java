package m0;

import E.b0;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final j0.b f11118a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f11119b;

    public l(j0.b bVar, b0 _windowInsetsCompat) {
        kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f11118a = bVar;
        this.f11119b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return kotlin.jvm.internal.i.a(this.f11118a, lVar.f11118a) && kotlin.jvm.internal.i.a(this.f11119b, lVar.f11119b);
    }

    public final int hashCode() {
        return this.f11119b.hashCode() + (this.f11118a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f11118a + ", windowInsetsCompat=" + this.f11119b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, b0 insets) {
        this(new j0.b(rect), insets);
        kotlin.jvm.internal.i.e(insets, "insets");
    }
}
