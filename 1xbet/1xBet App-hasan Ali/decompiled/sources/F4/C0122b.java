package F4;

import L4.C0229l;

/* renamed from: F4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0229l f1568d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0229l f1569e;
    public static final C0229l f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0229l f1570g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0229l f1571h;
    public static final C0229l i;

    /* renamed from: a, reason: collision with root package name */
    public final C0229l f1572a;

    /* renamed from: b, reason: collision with root package name */
    public final C0229l f1573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1574c;

    static {
        C0229l c0229l = C0229l.f3092n;
        f1568d = j3.i.q(":");
        f1569e = j3.i.q(":status");
        f = j3.i.q(":method");
        f1570g = j3.i.q(":path");
        f1571h = j3.i.q(":scheme");
        i = j3.i.q(":authority");
    }

    public C0122b(C0229l c0229l, C0229l c0229l2) {
        kotlin.jvm.internal.l.f("name", c0229l);
        kotlin.jvm.internal.l.f("value", c0229l2);
        this.f1572a = c0229l;
        this.f1573b = c0229l2;
        this.f1574c = c0229l2.c() + c0229l.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0122b)) {
            return false;
        }
        C0122b c0122b = (C0122b) obj;
        return kotlin.jvm.internal.l.a(this.f1572a, c0122b.f1572a) && kotlin.jvm.internal.l.a(this.f1573b, c0122b.f1573b);
    }

    public final int hashCode() {
        return this.f1573b.hashCode() + (this.f1572a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1572a.p() + ": " + this.f1573b.p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0122b(String str, String str2) {
        this(j3.i.q(str), j3.i.q(str2));
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("value", str2);
        C0229l c0229l = C0229l.f3092n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0122b(C0229l c0229l, String str) {
        this(c0229l, j3.i.q(str));
        kotlin.jvm.internal.l.f("name", c0229l);
        kotlin.jvm.internal.l.f("value", str);
        C0229l c0229l2 = C0229l.f3092n;
    }
}
