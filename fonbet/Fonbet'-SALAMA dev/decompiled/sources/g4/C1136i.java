package g4;

/* renamed from: g4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1136i {

    /* renamed from: a, reason: collision with root package name */
    public final C1144q f13206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13208c;

    public C1136i(int i7, int i8, Class cls) {
        this(C1144q.a(cls), i7, i8);
    }

    public static C1136i a(Class cls) {
        return new C1136i(0, 1, cls);
    }

    public static C1136i b(Class cls) {
        return new C1136i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1136i)) {
            return false;
        }
        C1136i c1136i = (C1136i) obj;
        return this.f13206a.equals(c1136i.f13206a) && this.f13207b == c1136i.f13207b && this.f13208c == c1136i.f13208c;
    }

    public final int hashCode() {
        return ((((this.f13206a.hashCode() ^ 1000003) * 1000003) ^ this.f13207b) * 1000003) ^ this.f13208c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f13206a);
        sb.append(", type=");
        int i7 = this.f13207b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i8 = this.f13208c;
        if (i8 == 0) {
            str = "direct";
        } else if (i8 == 1) {
            str = "provider";
        } else {
            if (i8 != 2) {
                throw new AssertionError(e1.k.d(i8, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return e1.k.i(sb, str, "}");
    }

    public C1136i(C1144q c1144q, int i7, int i8) {
        p3.f.l(c1144q, "Null dependency anInterface.");
        this.f13206a = c1144q;
        this.f13207b = i7;
        this.f13208c = i8;
    }
}
