package K0;

import a.AbstractC0444a;
import h0.C1989c;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final C0197b f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2865d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2866e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2867g;

    public t(C0197b c0197b, int i, int i5, int i6, int i7, float f, float f5) {
        this.f2862a = c0197b;
        this.f2863b = i;
        this.f2864c = i5;
        this.f2865d = i6;
        this.f2866e = i7;
        this.f = f;
        this.f2867g = f5;
    }

    public final C1989c a(C1989c c1989c) {
        return c1989c.g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j5, boolean z3) {
        if (z3) {
            long j6 = N.f2801b;
            if (N.a(j5, j6)) {
                return j6;
            }
        }
        int i = N.f2802c;
        int i5 = (int) (j5 >> 32);
        int i6 = this.f2863b;
        return F.b(i5 + i6, ((int) (j5 & 4294967295L)) + i6);
    }

    public final C1989c c(C1989c c1989c) {
        float f = -this.f;
        return c1989c.g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i5 = this.f2864c;
        int i6 = this.f2863b;
        return AbstractC0444a.t(i, i6, i5) - i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2862a.equals(tVar.f2862a) && this.f2863b == tVar.f2863b && this.f2864c == tVar.f2864c && this.f2865d == tVar.f2865d && this.f2866e == tVar.f2866e && Float.compare(this.f, tVar.f) == 0 && Float.compare(this.f2867g, tVar.f2867g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2867g) + AbstractC2107A.n(this.f, ((((((((this.f2862a.hashCode() * 31) + this.f2863b) * 31) + this.f2864c) * 31) + this.f2865d) * 31) + this.f2866e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f2862a);
        sb.append(", startIndex=");
        sb.append(this.f2863b);
        sb.append(", endIndex=");
        sb.append(this.f2864c);
        sb.append(", startLineIndex=");
        sb.append(this.f2865d);
        sb.append(", endLineIndex=");
        sb.append(this.f2866e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return AbstractC2107A.s(sb, this.f2867g, ')');
    }
}
