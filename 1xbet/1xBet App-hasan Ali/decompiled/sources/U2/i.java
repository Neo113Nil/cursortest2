package U2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f5876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5877b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5878c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5879d;

    public i(int i, int i5, double d5, boolean z3) {
        this.f5876a = i;
        this.f5877b = i5;
        this.f5878c = d5;
        this.f5879d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5876a == iVar.f5876a && this.f5877b == iVar.f5877b && Double.doubleToLongBits(this.f5878c) == Double.doubleToLongBits(iVar.f5878c) && this.f5879d == iVar.f5879d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d5 = this.f5878c;
        return ((((int) (Double.doubleToLongBits(d5) ^ (Double.doubleToLongBits(d5) >>> 32))) ^ ((((this.f5876a ^ 1000003) * 1000003) ^ this.f5877b) * 1000003)) * 1000003) ^ (true != this.f5879d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f5876a + ", initialBackoffMs=" + this.f5877b + ", backoffMultiplier=" + this.f5878c + ", bufferAfterMaxAttempts=" + this.f5879d + "}";
    }
}
