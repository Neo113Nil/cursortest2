package W0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: k, reason: collision with root package name */
    public final float f6001k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6002l;

    public d(float f, float f5) {
        this.f6001k = f;
        this.f6002l = f5;
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f6001k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6001k, dVar.f6001k) == 0 && Float.compare(this.f6002l, dVar.f6002l) == 0;
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6002l) + (Float.floatToIntBits(this.f6001k) * 31);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f6002l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6001k);
        sb.append(", fontScale=");
        return AbstractC2107A.s(sb, this.f6002l, ')');
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
