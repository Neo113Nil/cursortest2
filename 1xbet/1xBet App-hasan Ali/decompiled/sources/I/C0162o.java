package I;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162o {

    /* renamed from: a, reason: collision with root package name */
    public final C0161n f2505a;

    /* renamed from: b, reason: collision with root package name */
    public final C0161n f2506b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2507c;

    public C0162o(C0161n c0161n, C0161n c0161n2, boolean z3) {
        this.f2505a = c0161n;
        this.f2506b = c0161n2;
        this.f2507c = z3;
    }

    public static C0162o a(C0162o c0162o, C0161n c0161n, C0161n c0161n2, boolean z3, int i) {
        if ((i & 1) != 0) {
            c0161n = c0162o.f2505a;
        }
        if ((i & 2) != 0) {
            c0161n2 = c0162o.f2506b;
        }
        c0162o.getClass();
        return new C0162o(c0161n, c0161n2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0162o)) {
            return false;
        }
        C0162o c0162o = (C0162o) obj;
        return kotlin.jvm.internal.l.a(this.f2505a, c0162o.f2505a) && kotlin.jvm.internal.l.a(this.f2506b, c0162o.f2506b) && this.f2507c == c0162o.f2507c;
    }

    public final int hashCode() {
        return ((this.f2506b.hashCode() + (this.f2505a.hashCode() * 31)) * 31) + (this.f2507c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.f2505a + ", end=" + this.f2506b + ", handlesCrossed=" + this.f2507c + ')';
    }
}
