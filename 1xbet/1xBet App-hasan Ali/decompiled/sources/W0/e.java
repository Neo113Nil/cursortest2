package W0;

import k4.AbstractC2036a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: k, reason: collision with root package name */
    public final float f6003k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6004l;

    /* renamed from: m, reason: collision with root package name */
    public final X0.a f6005m;

    public e(float f, float f5, X0.a aVar) {
        this.f6003k = f;
        this.f6004l = f5;
        this.f6005m = aVar;
    }

    @Override // W0.c
    public final float D(long j5) {
        if (p.a(o.b(j5), 4294967296L)) {
            return this.f6005m.b(o.c(j5));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
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
        return AbstractC2036a.M(this.f6005m.a(i0(f)), 4294967296L);
    }

    @Override // W0.c
    public final float c() {
        return this.f6003k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f6003k, eVar.f6003k) == 0 && Float.compare(this.f6004l, eVar.f6004l) == 0 && kotlin.jvm.internal.l.a(this.f6005m, eVar.f6005m);
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    public final int hashCode() {
        return this.f6005m.hashCode() + AbstractC2107A.n(this.f6004l, Float.floatToIntBits(this.f6003k) * 31, 31);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f6004l;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f6003k + ", fontScale=" + this.f6004l + ", converter=" + this.f6005m + ')';
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
