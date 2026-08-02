package J2;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class i {
    public static final i i = new i(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final i f2712j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f2713k;

    /* renamed from: a, reason: collision with root package name */
    public final int f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2716c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2717d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2718e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2719g;

    /* renamed from: h, reason: collision with root package name */
    public int f2720h;

    static {
        new i(468, 60, "468x60_as");
        new i(320, 100, "320x100_as");
        new i(728, 90, "728x90_as");
        new i(300, 250, "300x250_as");
        new i(160, 600, "160x600_as");
        new i(-1, -2, "smart_banner");
        f2712j = new i(-3, -4, "fluid");
        f2713k = new i(0, 0, "invalid");
        new i(50, 50, "50x50_mb");
        new i(-3, 0, "search_v2");
    }

    public i(int i5, int i6) {
        this(i5, i6, (i5 == -1 ? "FULL" : String.valueOf(i5)) + "x" + (i6 == -2 ? "AUTO" : String.valueOf(i6)) + "_as");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2714a == iVar.f2714a && this.f2715b == iVar.f2715b && this.f2716c.equals(iVar.f2716c);
    }

    public final int hashCode() {
        return this.f2716c.hashCode();
    }

    public final String toString() {
        return this.f2716c;
    }

    public i(int i5, int i6, String str) {
        if (i5 < 0 && i5 != -1 && i5 != -3) {
            throw new IllegalArgumentException(AbstractC2107A.q("Invalid width for AdSize: ", i5));
        }
        if (i6 < 0 && i6 != -2 && i6 != -4) {
            throw new IllegalArgumentException(AbstractC2107A.q("Invalid height for AdSize: ", i6));
        }
        this.f2714a = i5;
        this.f2715b = i6;
        this.f2716c = str;
    }
}
