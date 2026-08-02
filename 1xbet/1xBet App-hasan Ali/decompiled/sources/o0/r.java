package o0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class r extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18581b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18582c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18583d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18584e;

    public r(float f, float f5, float f6, float f7) {
        super(2);
        this.f18581b = f;
        this.f18582c = f5;
        this.f18583d = f6;
        this.f18584e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f18581b, rVar.f18581b) == 0 && Float.compare(this.f18582c, rVar.f18582c) == 0 && Float.compare(this.f18583d, rVar.f18583d) == 0 && Float.compare(this.f18584e, rVar.f18584e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18584e) + AbstractC2107A.n(this.f18583d, AbstractC2107A.n(this.f18582c, Float.floatToIntBits(this.f18581b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f18581b);
        sb.append(", dy1=");
        sb.append(this.f18582c);
        sb.append(", dx2=");
        sb.append(this.f18583d);
        sb.append(", dy2=");
        return AbstractC2107A.s(sb, this.f18584e, ')');
    }
}
