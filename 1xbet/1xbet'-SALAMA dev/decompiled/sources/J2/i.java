package J2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f3824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3825d;

    public i(int i7, int i8, double d7, boolean z4) {
        this.f3822a = i7;
        this.f3823b = i8;
        this.f3824c = d7;
        this.f3825d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f3822a == ((i) qVar).f3822a) {
                i iVar = (i) qVar;
                if (this.f3823b == iVar.f3823b && Double.doubleToLongBits(this.f3824c) == Double.doubleToLongBits(iVar.f3824c) && this.f3825d == iVar.f3825d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d7 = this.f3824c;
        return ((((int) (Double.doubleToLongBits(d7) ^ (Double.doubleToLongBits(d7) >>> 32))) ^ ((((this.f3822a ^ 1000003) * 1000003) ^ this.f3823b) * 1000003)) * 1000003) ^ (true != this.f3825d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f3822a + ", initialBackoffMs=" + this.f3823b + ", backoffMultiplier=" + this.f3824c + ", bufferAfterMaxAttempts=" + this.f3825d + "}";
    }
}
