package X0;

import P.q0;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final U0.b f7456a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f7457b;

    public m(U0.b bVar, q0 q0Var) {
        t6.h.e(q0Var, "_windowInsetsCompat");
        this.f7456a = bVar;
        this.f7457b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t6.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        return t6.h.a(this.f7456a, mVar.f7456a) && t6.h.a(this.f7457b, mVar.f7457b);
    }

    public final int hashCode() {
        return this.f7457b.hashCode() + (this.f7456a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f7456a + ", windowInsetsCompat=" + this.f7457b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Rect rect, q0 q0Var) {
        this(new U0.b(rect), q0Var);
        t6.h.e(q0Var, "insets");
    }
}
