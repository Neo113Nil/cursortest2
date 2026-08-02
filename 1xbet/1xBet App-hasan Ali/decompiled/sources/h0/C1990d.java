package h0;

import a3.AbstractC0467k;
import n.AbstractC2107A;
import r0.AbstractC2346c;
import t3.AbstractC2425d;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1990d {

    /* renamed from: a, reason: collision with root package name */
    public final float f17197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17198b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17199c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17201e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17202g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17203h;

    static {
        N4.b.c(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C1990d(float f, float f5, float f6, float f7, long j5, long j6, long j7, long j8) {
        this.f17197a = f;
        this.f17198b = f5;
        this.f17199c = f6;
        this.f17200d = f7;
        this.f17201e = j5;
        this.f = j6;
        this.f17202g = j7;
        this.f17203h = j8;
    }

    public final float a() {
        return this.f17200d - this.f17198b;
    }

    public final float b() {
        return this.f17199c - this.f17197a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1990d)) {
            return false;
        }
        C1990d c1990d = (C1990d) obj;
        return Float.compare(this.f17197a, c1990d.f17197a) == 0 && Float.compare(this.f17198b, c1990d.f17198b) == 0 && Float.compare(this.f17199c, c1990d.f17199c) == 0 && Float.compare(this.f17200d, c1990d.f17200d) == 0 && AbstractC2346c.m(this.f17201e, c1990d.f17201e) && AbstractC2346c.m(this.f, c1990d.f) && AbstractC2346c.m(this.f17202g, c1990d.f17202g) && AbstractC2346c.m(this.f17203h, c1990d.f17203h);
    }

    public final int hashCode() {
        int n5 = AbstractC2107A.n(this.f17200d, AbstractC2107A.n(this.f17199c, AbstractC2107A.n(this.f17198b, Float.floatToIntBits(this.f17197a) * 31, 31), 31), 31);
        long j5 = this.f17201e;
        long j6 = this.f;
        int i = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + n5) * 31)) * 31;
        long j7 = this.f17202g;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i) * 31;
        long j8 = this.f17203h;
        return ((int) (j8 ^ (j8 >>> 32))) + i5;
    }

    public final String toString() {
        String str = AbstractC2425d.M(this.f17197a) + ", " + AbstractC2425d.M(this.f17198b) + ", " + AbstractC2425d.M(this.f17199c) + ", " + AbstractC2425d.M(this.f17200d);
        long j5 = this.f17201e;
        long j6 = this.f;
        boolean m5 = AbstractC2346c.m(j5, j6);
        long j7 = this.f17202g;
        long j8 = this.f17203h;
        if (!m5 || !AbstractC2346c.m(j6, j7) || !AbstractC2346c.m(j7, j8)) {
            StringBuilder w5 = AbstractC0467k.w("RoundRect(rect=", str, ", topLeft=");
            w5.append((Object) AbstractC2346c.G(j5));
            w5.append(", topRight=");
            w5.append((Object) AbstractC2346c.G(j6));
            w5.append(", bottomRight=");
            w5.append((Object) AbstractC2346c.G(j7));
            w5.append(", bottomLeft=");
            w5.append((Object) AbstractC2346c.G(j8));
            w5.append(')');
            return w5.toString();
        }
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i5)) {
            StringBuilder w6 = AbstractC0467k.w("RoundRect(rect=", str, ", radius=");
            w6.append(AbstractC2425d.M(Float.intBitsToFloat(i)));
            w6.append(')');
            return w6.toString();
        }
        StringBuilder w7 = AbstractC0467k.w("RoundRect(rect=", str, ", x=");
        w7.append(AbstractC2425d.M(Float.intBitsToFloat(i)));
        w7.append(", y=");
        w7.append(AbstractC2425d.M(Float.intBitsToFloat(i5)));
        w7.append(')');
        return w7.toString();
    }
}
