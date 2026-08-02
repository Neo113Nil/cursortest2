package o0;

import n.AbstractC2107A;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2210n extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f18569b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18570c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18571d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18572e;

    public C2210n(float f, float f5, float f6, float f7) {
        super(2);
        this.f18569b = f;
        this.f18570c = f5;
        this.f18571d = f6;
        this.f18572e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2210n)) {
            return false;
        }
        C2210n c2210n = (C2210n) obj;
        return Float.compare(this.f18569b, c2210n.f18569b) == 0 && Float.compare(this.f18570c, c2210n.f18570c) == 0 && Float.compare(this.f18571d, c2210n.f18571d) == 0 && Float.compare(this.f18572e, c2210n.f18572e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18572e) + AbstractC2107A.n(this.f18571d, AbstractC2107A.n(this.f18570c, Float.floatToIntBits(this.f18569b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f18569b);
        sb.append(", y1=");
        sb.append(this.f18570c);
        sb.append(", x2=");
        sb.append(this.f18571d);
        sb.append(", y2=");
        return AbstractC2107A.s(sb, this.f18572e, ')');
    }
}
