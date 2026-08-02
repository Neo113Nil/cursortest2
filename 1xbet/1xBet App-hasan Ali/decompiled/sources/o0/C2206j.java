package o0;

import n.AbstractC2107A;

/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206j extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18559b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18560c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18561d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18562e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18563g;

    public C2206j(float f, float f5, float f6, float f7, float f8, float f9) {
        super(2);
        this.f18559b = f;
        this.f18560c = f5;
        this.f18561d = f6;
        this.f18562e = f7;
        this.f = f8;
        this.f18563g = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2206j)) {
            return false;
        }
        C2206j c2206j = (C2206j) obj;
        return Float.compare(this.f18559b, c2206j.f18559b) == 0 && Float.compare(this.f18560c, c2206j.f18560c) == 0 && Float.compare(this.f18561d, c2206j.f18561d) == 0 && Float.compare(this.f18562e, c2206j.f18562e) == 0 && Float.compare(this.f, c2206j.f) == 0 && Float.compare(this.f18563g, c2206j.f18563g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18563g) + AbstractC2107A.n(this.f, AbstractC2107A.n(this.f18562e, AbstractC2107A.n(this.f18561d, AbstractC2107A.n(this.f18560c, Float.floatToIntBits(this.f18559b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f18559b);
        sb.append(", y1=");
        sb.append(this.f18560c);
        sb.append(", x2=");
        sb.append(this.f18561d);
        sb.append(", y2=");
        sb.append(this.f18562e);
        sb.append(", x3=");
        sb.append(this.f);
        sb.append(", y3=");
        return AbstractC2107A.s(sb, this.f18563g, ')');
    }
}
