package d1;

import java.util.HashSet;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950c {

    /* renamed from: i, reason: collision with root package name */
    public static final C0950c f12342i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12344b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12345c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12346d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12347e;

    /* renamed from: a, reason: collision with root package name */
    public int f12343a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f12348f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f12349g = -1;

    /* renamed from: h, reason: collision with root package name */
    public C0952e f12350h = new C0952e();

    static {
        C0952e c0952e = new C0952e();
        C0950c c0950c = new C0950c();
        c0950c.f12343a = 1;
        c0950c.f12348f = -1L;
        c0950c.f12349g = -1L;
        new HashSet();
        c0950c.f12344b = false;
        c0950c.f12345c = false;
        c0950c.f12343a = 1;
        c0950c.f12346d = false;
        c0950c.f12347e = false;
        c0950c.f12350h = c0952e;
        c0950c.f12348f = -1L;
        c0950c.f12349g = -1L;
        f12342i = c0950c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0950c.class != obj.getClass()) {
            return false;
        }
        C0950c c0950c = (C0950c) obj;
        if (this.f12344b == c0950c.f12344b && this.f12345c == c0950c.f12345c && this.f12346d == c0950c.f12346d && this.f12347e == c0950c.f12347e && this.f12348f == c0950c.f12348f && this.f12349g == c0950c.f12349g && this.f12343a == c0950c.f12343a) {
            return this.f12350h.equals(c0950c.f12350h);
        }
        return false;
    }

    public final int hashCode() {
        int e7 = ((((((((t.e.e(this.f12343a) * 31) + (this.f12344b ? 1 : 0)) * 31) + (this.f12345c ? 1 : 0)) * 31) + (this.f12346d ? 1 : 0)) * 31) + (this.f12347e ? 1 : 0)) * 31;
        long j = this.f12348f;
        int i7 = (e7 + ((int) (j ^ (j >>> 32)))) * 31;
        long j3 = this.f12349g;
        return this.f12350h.f12353a.hashCode() + ((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}
