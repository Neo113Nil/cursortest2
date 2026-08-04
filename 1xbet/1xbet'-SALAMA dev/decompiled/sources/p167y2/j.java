package p167y2;

import p031e1.k;
import p150v0.a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f18161i = new j(320, 50, "320x50_mb");
    public static final j j = new j(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f18162k = new j(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f18163l = new j(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f18164m = new j(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f18165n = new j(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f18166o = new j(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f18167p = new j(-3, -4, "fluid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f18168q = new j(0, 0, "invalid");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f18169r = new j(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18177h;

    static {
        new j(-3, 0, "search_v2");
    }

    public j(int i7, int i8) {
        this(i7, i8, a.o(i7 == -1 ? "FULL" : String.valueOf(i7), "x", i8 == -2 ? "AUTO" : String.valueOf(i8), "_as"));
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
        return this.f18170a == jVar.f18170a && this.f18171b == jVar.f18171b && this.f18172c.equals(jVar.f18172c);
    }

    public final int hashCode() {
        return this.f18172c.hashCode();
    }

    public final String toString() {
        return this.f18172c;
    }

    public j(int i7, int i8, String str) {
        if (i7 < 0 && i7 != -1 && i7 != -3) {
            throw new IllegalArgumentException(k.d(i7, "Invalid width for AdSize: "));
        }
        if (i8 < 0 && i8 != -2 && i8 != -4) {
            throw new IllegalArgumentException(k.d(i8, "Invalid height for AdSize: "));
        }
        this.f18170a = i7;
        this.f18171b = i8;
        this.f18172c = str;
    }
}
