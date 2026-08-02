package u;

import n.AbstractC2107A;

/* renamed from: u.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2469p extends AbstractC2470q {

    /* renamed from: a, reason: collision with root package name */
    public float f19893a;

    /* renamed from: b, reason: collision with root package name */
    public float f19894b;

    /* renamed from: c, reason: collision with root package name */
    public float f19895c;

    /* renamed from: d, reason: collision with root package name */
    public float f19896d;

    public C2469p(float f, float f5, float f6, float f7) {
        this.f19893a = f;
        this.f19894b = f5;
        this.f19895c = f6;
        this.f19896d = f7;
    }

    @Override // u.AbstractC2470q
    public final float a(int i) {
        if (i == 0) {
            return this.f19893a;
        }
        if (i == 1) {
            return this.f19894b;
        }
        if (i == 2) {
            return this.f19895c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f19896d;
    }

    @Override // u.AbstractC2470q
    public final int b() {
        return 4;
    }

    @Override // u.AbstractC2470q
    public final AbstractC2470q c() {
        return new C2469p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // u.AbstractC2470q
    public final void d() {
        this.f19893a = 0.0f;
        this.f19894b = 0.0f;
        this.f19895c = 0.0f;
        this.f19896d = 0.0f;
    }

    @Override // u.AbstractC2470q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f19893a = f;
            return;
        }
        if (i == 1) {
            this.f19894b = f;
        } else if (i == 2) {
            this.f19895c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f19896d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2469p)) {
            return false;
        }
        C2469p c2469p = (C2469p) obj;
        return c2469p.f19893a == this.f19893a && c2469p.f19894b == this.f19894b && c2469p.f19895c == this.f19895c && c2469p.f19896d == this.f19896d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19896d) + AbstractC2107A.n(this.f19895c, AbstractC2107A.n(this.f19894b, Float.floatToIntBits(this.f19893a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f19893a + ", v2 = " + this.f19894b + ", v3 = " + this.f19895c + ", v4 = " + this.f19896d;
    }
}
