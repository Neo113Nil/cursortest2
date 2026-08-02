package i0;

import h0.C1988b;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: d, reason: collision with root package name */
    public static final I f17244d = new I(0.0f, F.d(4278190080L), 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f17245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17246b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17247c;

    public I(float f, long j5, long j6) {
        this.f17245a = j5;
        this.f17246b = j6;
        this.f17247c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return p.c(this.f17245a, i.f17245a) && C1988b.b(this.f17246b, i.f17246b) && this.f17247c == i.f17247c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17247c) + ((C1988b.f(this.f17246b) + (p.i(this.f17245a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC2107A.z(this.f17245a, sb, ", offset=");
        sb.append((Object) C1988b.j(this.f17246b));
        sb.append(", blurRadius=");
        return AbstractC2107A.s(sb, this.f17247c, ')');
    }
}
