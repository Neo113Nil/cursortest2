package b0;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f7151a;

    public e(float f) {
        this.f7151a = f;
    }

    @Override // b0.d
    public final long a(long j5, long j6, W0.m mVar) {
        long j7 = ((((int) (j6 >> 32)) - ((int) (j5 >> 32))) << 32) | ((((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) & 4294967295L);
        float f = 1;
        float f5 = (this.f7151a + f) * (((int) (j7 >> 32)) / 2.0f);
        float f6 = (f - 1.0f) * (((int) (j7 & 4294967295L)) / 2.0f);
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Float.compare(this.f7151a, ((e) obj).f7151a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f7151a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f7151a + ", verticalBias=-1.0)";
    }
}
