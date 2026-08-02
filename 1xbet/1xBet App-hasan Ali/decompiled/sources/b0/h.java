package b0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f7154a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7155b;

    public h(float f, float f5) {
        this.f7154a = f;
        this.f7155b = f5;
    }

    @Override // b0.d
    public final long a(long j5, long j6, W0.m mVar) {
        float f = (((int) (j6 >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float f5 = (((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        W0.m mVar2 = W0.m.f6016k;
        float f6 = this.f7154a;
        if (mVar != mVar2) {
            f6 *= -1;
        }
        float f7 = 1;
        float f8 = (f6 + f7) * f;
        float f9 = (f7 + this.f7155b) * f5;
        return (Math.round(f9) & 4294967295L) | (Math.round(f8) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f7154a, hVar.f7154a) == 0 && Float.compare(this.f7155b, hVar.f7155b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7155b) + (Float.floatToIntBits(this.f7154a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f7154a);
        sb.append(", verticalBias=");
        return AbstractC2107A.s(sb, this.f7155b, ')');
    }
}
