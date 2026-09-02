package A;

import android.graphics.Rect;
import n.r;
import x.C0857b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C0857b f32a;

    /* renamed from: b, reason: collision with root package name */
    public final r f33b;

    public m(C0857b c0857b, r _windowInsetsCompat) {
        kotlin.jvm.internal.j.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f32a = c0857b;
        this.f33b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        return kotlin.jvm.internal.j.a(this.f32a, mVar.f32a) && kotlin.jvm.internal.j.a(this.f33b, mVar.f33b);
    }

    public final int hashCode() {
        return this.f33b.hashCode() + (this.f32a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f32a + ", windowInsetsCompat=" + this.f33b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Rect rect, r insets) {
        this(new C0857b(rect), insets);
        kotlin.jvm.internal.j.e(insets, "insets");
    }
}
