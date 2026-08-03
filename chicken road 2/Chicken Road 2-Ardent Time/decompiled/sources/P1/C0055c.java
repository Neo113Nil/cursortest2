package P1;

/* renamed from: P1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055c {

    /* renamed from: d, reason: collision with root package name */
    public static final V1.j f1452d;

    /* renamed from: e, reason: collision with root package name */
    public static final V1.j f1453e;

    /* renamed from: f, reason: collision with root package name */
    public static final V1.j f1454f;

    /* renamed from: g, reason: collision with root package name */
    public static final V1.j f1455g;

    /* renamed from: h, reason: collision with root package name */
    public static final V1.j f1456h;

    /* renamed from: i, reason: collision with root package name */
    public static final V1.j f1457i;

    /* renamed from: a, reason: collision with root package name */
    public final V1.j f1458a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.j f1459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1460c;

    static {
        V1.j jVar = V1.j.f1765d;
        f1452d = m0.j.j(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        f1453e = m0.j.j(":status");
        f1454f = m0.j.j(":method");
        f1455g = m0.j.j(":path");
        f1456h = m0.j.j(":scheme");
        f1457i = m0.j.j(":authority");
    }

    public C0055c(V1.j name, V1.j value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f1458a = name;
        this.f1459b = value;
        this.f1460c = value.a() + name.a() + 32;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1.C0055c)) {
            return false;
        }
        P1.C0055c c0055c = (P1.C0055c) obj;
        return kotlin.jvm.internal.i.a(this.f1458a, c0055c.f1458a) && kotlin.jvm.internal.i.a(this.f1459b, c0055c.f1459b);
    }

    public final int hashCode() {
        return this.f1459b.hashCode() + (this.f1458a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return this.f1458a.h() + ": " + this.f1459b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0055c(java.lang.String name, java.lang.String value) {
        this(m0.j.j(name), m0.j.j(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        V1.j jVar = V1.j.f1765d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0055c(V1.j name, java.lang.String value) {
        this(name, m0.j.j(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        V1.j jVar = V1.j.f1765d;
    }
}
