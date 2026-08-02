package M;

import n.AbstractC2107A;

/* renamed from: M.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3334b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3335c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3336d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3337e;

    public C0236g(float f, float f5, float f6, float f7, float f8) {
        this.f3333a = f;
        this.f3334b = f5;
        this.f3335c = f6;
        this.f3336d = f7;
        this.f3337e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0236g)) {
            return false;
        }
        C0236g c0236g = (C0236g) obj;
        return W0.f.a(this.f3333a, c0236g.f3333a) && W0.f.a(this.f3334b, c0236g.f3334b) && W0.f.a(this.f3335c, c0236g.f3335c) && W0.f.a(this.f3336d, c0236g.f3336d) && W0.f.a(this.f3337e, c0236g.f3337e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3337e) + AbstractC2107A.n(this.f3336d, AbstractC2107A.n(this.f3335c, AbstractC2107A.n(this.f3334b, Float.floatToIntBits(this.f3333a) * 31, 31), 31), 31);
    }
}
