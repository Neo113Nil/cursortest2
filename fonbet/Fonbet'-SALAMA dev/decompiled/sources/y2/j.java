package y2;

import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final j f18155i = new j(320, 50, "320x50_mb");
    public static final j j = new j(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final j f18156k = new j(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final j f18157l = new j(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final j f18158m = new j(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final j f18159n = new j(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    public static final j f18160o = new j(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final j f18161p = new j(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final j f18162q = new j(0, 0, "invalid");

    /* renamed from: r, reason: collision with root package name */
    public static final j f18163r = new j(50, 50, "50x50_mb");

    /* renamed from: a, reason: collision with root package name */
    public final int f18164a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18166c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18167d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18168e;

    /* renamed from: f, reason: collision with root package name */
    public int f18169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18170g;

    /* renamed from: h, reason: collision with root package name */
    public int f18171h;

    static {
        new j(-3, 0, "search_v2");
    }

    public j(int i7, int i8) {
        this(i7, i8, AbstractC1663a.o(i7 == -1 ? "FULL" : String.valueOf(i7), "x", i8 == -2 ? "AUTO" : String.valueOf(i8), "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f18164a == jVar.f18164a && this.f18165b == jVar.f18165b && this.f18166c.equals(jVar.f18166c);
    }

    public final int hashCode() {
        return this.f18166c.hashCode();
    }

    public final String toString() {
        return this.f18166c;
    }

    public j(int i7, int i8, String str) {
        if (i7 < 0 && i7 != -1 && i7 != -3) {
            throw new IllegalArgumentException(e1.k.d(i7, "Invalid width for AdSize: "));
        }
        if (i8 < 0 && i8 != -2 && i8 != -4) {
            throw new IllegalArgumentException(e1.k.d(i8, "Invalid height for AdSize: "));
        }
        this.f18164a = i7;
        this.f18165b = i8;
        this.f18166c = str;
    }
}
