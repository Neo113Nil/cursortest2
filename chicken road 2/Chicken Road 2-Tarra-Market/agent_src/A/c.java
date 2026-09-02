package A;

import x.C0857b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0857b f10a;

    /* renamed from: b, reason: collision with root package name */
    public final b f11b;

    /* renamed from: c, reason: collision with root package name */
    public final b f12c;

    public c(C0857b c0857b, b bVar, b bVar2) {
        this.f10a = c0857b;
        this.f11b = bVar;
        this.f12c = bVar2;
        if (c0857b.b() == 0 && c0857b.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c0857b.f6756a != 0 && c0857b.f6757b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.j.a(this.f10a, cVar.f10a) && kotlin.jvm.internal.j.a(this.f11b, cVar.f11b) && kotlin.jvm.internal.j.a(this.f12c, cVar.f12c);
    }

    public final int hashCode() {
        return this.f12c.hashCode() + ((this.f11b.hashCode() + (this.f10a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f10a + ", type=" + this.f11b + ", state=" + this.f12c + " }";
    }
}
