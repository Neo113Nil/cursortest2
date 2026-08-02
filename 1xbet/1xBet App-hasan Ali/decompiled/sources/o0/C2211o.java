package o0;

import n.AbstractC2107A;

/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18573b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18574c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18575d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18576e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18577g;

    public C2211o(float f, float f5, float f6, float f7, float f8, float f9) {
        super(2);
        this.f18573b = f;
        this.f18574c = f5;
        this.f18575d = f6;
        this.f18576e = f7;
        this.f = f8;
        this.f18577g = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2211o)) {
            return false;
        }
        C2211o c2211o = (C2211o) obj;
        return Float.compare(this.f18573b, c2211o.f18573b) == 0 && Float.compare(this.f18574c, c2211o.f18574c) == 0 && Float.compare(this.f18575d, c2211o.f18575d) == 0 && Float.compare(this.f18576e, c2211o.f18576e) == 0 && Float.compare(this.f, c2211o.f) == 0 && Float.compare(this.f18577g, c2211o.f18577g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18577g) + AbstractC2107A.n(this.f, AbstractC2107A.n(this.f18576e, AbstractC2107A.n(this.f18575d, AbstractC2107A.n(this.f18574c, Float.floatToIntBits(this.f18573b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f18573b);
        sb.append(", dy1=");
        sb.append(this.f18574c);
        sb.append(", dx2=");
        sb.append(this.f18575d);
        sb.append(", dy2=");
        sb.append(this.f18576e);
        sb.append(", dx3=");
        sb.append(this.f);
        sb.append(", dy3=");
        return AbstractC2107A.s(sb, this.f18577g, ')');
    }
}
