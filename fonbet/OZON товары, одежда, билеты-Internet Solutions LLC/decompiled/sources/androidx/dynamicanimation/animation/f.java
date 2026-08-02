package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b;

/* loaded from: classes8.dex */
public final class f extends b<f> {

    /* renamed from: u, reason: collision with root package name */
    private g f42672u;

    /* renamed from: v, reason: collision with root package name */
    private float f42673v;

    public <K> f(K k11, d<K> dVar) {
        super(k11, dVar);
        this.f42672u = null;
        this.f42673v = Float.MAX_VALUE;
    }

    @Override // androidx.dynamicanimation.animation.b
    public final void l() {
        g gVar = this.f42672u;
        if (gVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a11 = gVar.a();
        if (a11 > this.f42657g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a11 < this.f42658h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        this.f42672u.f(f());
        super.l();
    }

    @Override // androidx.dynamicanimation.animation.b
    final boolean m(long j11) {
        if (this.f42673v != Float.MAX_VALUE) {
            this.f42672u.getClass();
            long j12 = j11 / 2;
            b.p g10 = this.f42672u.g(this.f42652b, this.f42651a, j12);
            this.f42672u.d(this.f42673v);
            this.f42673v = Float.MAX_VALUE;
            b.p g11 = this.f42672u.g(g10.f42664a, g10.f42665b, j12);
            this.f42652b = g11.f42664a;
            this.f42651a = g11.f42665b;
        } else {
            b.p g12 = this.f42672u.g(this.f42652b, this.f42651a, j11);
            this.f42652b = g12.f42664a;
            this.f42651a = g12.f42665b;
        }
        float max = Math.max(this.f42652b, this.f42658h);
        this.f42652b = max;
        float min = Math.min(max, this.f42657g);
        this.f42652b = min;
        if (!this.f42672u.b(min, this.f42651a)) {
            return false;
        }
        this.f42652b = this.f42672u.a();
        this.f42651a = 0.0f;
        return true;
    }

    public final void n(float f7) {
        if (this.f42656f) {
            this.f42673v = f7;
            return;
        }
        if (this.f42672u == null) {
            this.f42672u = new g(f7);
        }
        this.f42672u.d(f7);
        l();
    }

    public final void o(g gVar) {
        this.f42672u = gVar;
    }
}
