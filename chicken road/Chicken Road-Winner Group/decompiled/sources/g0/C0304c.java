package g0;

import d0.C0262b;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304c {

    /* renamed from: a, reason: collision with root package name */
    public final C0262b f4956a;

    /* renamed from: b, reason: collision with root package name */
    public final C0303b f4957b;

    /* renamed from: c, reason: collision with root package name */
    public final C0303b f4958c;

    public C0304c(C0262b c0262b, C0303b c0303b, C0303b c0303b2) {
        this.f4956a = c0262b;
        this.f4957b = c0303b;
        this.f4958c = c0303b2;
        int i3 = c0262b.f4824c;
        int i4 = c0262b.f4822a;
        int i5 = i3 - i4;
        int i6 = c0262b.f4823b;
        if (i5 == 0 && c0262b.f4825d - i6 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i4 != 0 && i6 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0304c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0304c c0304c = (C0304c) obj;
        return kotlin.jvm.internal.j.a(this.f4956a, c0304c.f4956a) && kotlin.jvm.internal.j.a(this.f4957b, c0304c.f4957b) && kotlin.jvm.internal.j.a(this.f4958c, c0304c.f4958c);
    }

    public final int hashCode() {
        return this.f4958c.hashCode() + ((this.f4957b.hashCode() + (this.f4956a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0304c.class.getSimpleName() + " { " + this.f4956a + ", type=" + this.f4957b + ", state=" + this.f4958c + " }";
    }
}
