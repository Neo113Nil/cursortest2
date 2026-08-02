package u;

/* renamed from: u.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2466m extends AbstractC2470q {

    /* renamed from: a, reason: collision with root package name */
    public float f19873a;

    public C2466m(float f) {
        this.f19873a = f;
    }

    @Override // u.AbstractC2470q
    public final float a(int i) {
        if (i == 0) {
            return this.f19873a;
        }
        return 0.0f;
    }

    @Override // u.AbstractC2470q
    public final int b() {
        return 1;
    }

    @Override // u.AbstractC2470q
    public final AbstractC2470q c() {
        return new C2466m(0.0f);
    }

    @Override // u.AbstractC2470q
    public final void d() {
        this.f19873a = 0.0f;
    }

    @Override // u.AbstractC2470q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f19873a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2466m) && ((C2466m) obj).f19873a == this.f19873a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19873a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f19873a;
    }
}
