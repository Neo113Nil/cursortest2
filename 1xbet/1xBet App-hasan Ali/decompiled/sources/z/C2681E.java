package z;

import n.AbstractC2107A;

/* renamed from: z.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2681E {

    /* renamed from: a, reason: collision with root package name */
    public final float f21474a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21475b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21476c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21477d;

    public C2681E(float f, float f5, float f6, float f7) {
        this.f21474a = f;
        this.f21475b = f5;
        this.f21476c = f6;
        this.f21477d = f7;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    public final float a(W0.m mVar) {
        return mVar == W0.m.f6016k ? this.f21474a : this.f21476c;
    }

    public final float b(W0.m mVar) {
        return mVar == W0.m.f6016k ? this.f21476c : this.f21474a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2681E)) {
            return false;
        }
        C2681E c2681e = (C2681E) obj;
        return W0.f.a(this.f21474a, c2681e.f21474a) && W0.f.a(this.f21475b, c2681e.f21475b) && W0.f.a(this.f21476c, c2681e.f21476c) && W0.f.a(this.f21477d, c2681e.f21477d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21477d) + AbstractC2107A.n(this.f21476c, AbstractC2107A.n(this.f21475b, Float.floatToIntBits(this.f21474a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) W0.f.b(this.f21474a)) + ", top=" + ((Object) W0.f.b(this.f21475b)) + ", end=" + ((Object) W0.f.b(this.f21476c)) + ", bottom=" + ((Object) W0.f.b(this.f21477d)) + ')';
    }
}
