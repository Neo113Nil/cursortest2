package h0;

import n.AbstractC2107A;
import t3.AbstractC2425d;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989c {

    /* renamed from: e, reason: collision with root package name */
    public static final C1989c f17192e = new C1989c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f17193a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17194b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17195c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17196d;

    public C1989c(float f, float f5, float f6, float f7) {
        this.f17193a = f;
        this.f17194b = f5;
        this.f17195c = f6;
        this.f17196d = f7;
    }

    public final long a() {
        float f = this.f17195c;
        float f5 = this.f17193a;
        float f6 = ((f - f5) / 2.0f) + f5;
        float f7 = this.f17196d;
        float f8 = this.f17194b;
        return (Float.floatToRawIntBits(((f7 - f8) / 2.0f) + f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public final long b() {
        float f = this.f17195c - this.f17193a;
        float f5 = this.f17196d - this.f17194b;
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final C1989c c(C1989c c1989c) {
        return new C1989c(Math.max(this.f17193a, c1989c.f17193a), Math.max(this.f17194b, c1989c.f17194b), Math.min(this.f17195c, c1989c.f17195c), Math.min(this.f17196d, c1989c.f17196d));
    }

    public final boolean d() {
        return (this.f17193a >= this.f17195c) | (this.f17194b >= this.f17196d);
    }

    public final boolean e(C1989c c1989c) {
        return (this.f17193a < c1989c.f17195c) & (c1989c.f17193a < this.f17195c) & (this.f17194b < c1989c.f17196d) & (c1989c.f17194b < this.f17196d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1989c)) {
            return false;
        }
        C1989c c1989c = (C1989c) obj;
        return Float.compare(this.f17193a, c1989c.f17193a) == 0 && Float.compare(this.f17194b, c1989c.f17194b) == 0 && Float.compare(this.f17195c, c1989c.f17195c) == 0 && Float.compare(this.f17196d, c1989c.f17196d) == 0;
    }

    public final C1989c f(float f, float f5) {
        return new C1989c(this.f17193a + f, this.f17194b + f5, this.f17195c + f, this.f17196d + f5);
    }

    public final C1989c g(long j5) {
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        return new C1989c(Float.intBitsToFloat(i) + this.f17193a, Float.intBitsToFloat(i5) + this.f17194b, Float.intBitsToFloat(i) + this.f17195c, Float.intBitsToFloat(i5) + this.f17196d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17196d) + AbstractC2107A.n(this.f17195c, AbstractC2107A.n(this.f17194b, Float.floatToIntBits(this.f17193a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC2425d.M(this.f17193a) + ", " + AbstractC2425d.M(this.f17194b) + ", " + AbstractC2425d.M(this.f17195c) + ", " + AbstractC2425d.M(this.f17196d) + ')';
    }
}
