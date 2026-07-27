package K1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1377c;

    public a(long j2, long j6, long j7) {
        this.f1375a = j2;
        this.f1376b = j6;
        this.f1377c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1375a == aVar.f1375a && this.f1376b == aVar.f1376b && this.f1377c == aVar.f1377c;
    }

    public final int hashCode() {
        long j2 = this.f1375a;
        long j6 = this.f1376b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f1377c;
        return i2 ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f1375a + ", elapsedRealtime=" + this.f1376b + ", uptimeMillis=" + this.f1377c + "}";
    }
}
