package u;

import n.AbstractC2107A;

/* renamed from: u.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468o extends AbstractC2470q {

    /* renamed from: a, reason: collision with root package name */
    public float f19887a;

    /* renamed from: b, reason: collision with root package name */
    public float f19888b;

    /* renamed from: c, reason: collision with root package name */
    public float f19889c;

    public C2468o(float f, float f5, float f6) {
        this.f19887a = f;
        this.f19888b = f5;
        this.f19889c = f6;
    }

    @Override // u.AbstractC2470q
    public final float a(int i) {
        if (i == 0) {
            return this.f19887a;
        }
        if (i == 1) {
            return this.f19888b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f19889c;
    }

    @Override // u.AbstractC2470q
    public final int b() {
        return 3;
    }

    @Override // u.AbstractC2470q
    public final AbstractC2470q c() {
        return new C2468o(0.0f, 0.0f, 0.0f);
    }

    @Override // u.AbstractC2470q
    public final void d() {
        this.f19887a = 0.0f;
        this.f19888b = 0.0f;
        this.f19889c = 0.0f;
    }

    @Override // u.AbstractC2470q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f19887a = f;
        } else if (i == 1) {
            this.f19888b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f19889c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2468o)) {
            return false;
        }
        C2468o c2468o = (C2468o) obj;
        return c2468o.f19887a == this.f19887a && c2468o.f19888b == this.f19888b && c2468o.f19889c == this.f19889c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19889c) + AbstractC2107A.n(this.f19888b, Float.floatToIntBits(this.f19887a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f19887a + ", v2 = " + this.f19888b + ", v3 = " + this.f19889c;
    }
}
