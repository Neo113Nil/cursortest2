package u;

/* renamed from: u.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2467n extends AbstractC2470q {

    /* renamed from: a, reason: collision with root package name */
    public float f19881a;

    /* renamed from: b, reason: collision with root package name */
    public float f19882b;

    public C2467n(float f, float f5) {
        this.f19881a = f;
        this.f19882b = f5;
    }

    @Override // u.AbstractC2470q
    public final float a(int i) {
        if (i == 0) {
            return this.f19881a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f19882b;
    }

    @Override // u.AbstractC2470q
    public final int b() {
        return 2;
    }

    @Override // u.AbstractC2470q
    public final AbstractC2470q c() {
        return new C2467n(0.0f, 0.0f);
    }

    @Override // u.AbstractC2470q
    public final void d() {
        this.f19881a = 0.0f;
        this.f19882b = 0.0f;
    }

    @Override // u.AbstractC2470q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f19881a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f19882b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2467n)) {
            return false;
        }
        C2467n c2467n = (C2467n) obj;
        return c2467n.f19881a == this.f19881a && c2467n.f19882b == this.f19882b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19882b) + (Float.floatToIntBits(this.f19881a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f19881a + ", v2 = " + this.f19882b;
    }
}
