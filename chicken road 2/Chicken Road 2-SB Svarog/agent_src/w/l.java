package w;

import m.r;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f1306a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1307b;

    public l(t.b bVar, r rVar) {
        g0.h.e(rVar, "_windowInsetsCompat");
        this.f1306a = bVar;
        this.f1307b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return g0.h.a(this.f1306a, lVar.f1306a) && g0.h.a(this.f1307b, lVar.f1307b);
    }

    public final int hashCode() {
        return this.f1307b.hashCode() + (this.f1306a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1306a + ", windowInsetsCompat=" + this.f1307b + ')';
    }
}
