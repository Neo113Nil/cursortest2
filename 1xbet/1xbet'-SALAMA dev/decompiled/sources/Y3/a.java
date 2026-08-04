package Y3;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7648c;

    public a(long j, long j3, long j7) {
        this.f7646a = j;
        this.f7647b = j3;
        this.f7648c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7646a == aVar.f7646a && this.f7647b == aVar.f7647b && this.f7648c == aVar.f7648c;
    }

    public final int hashCode() {
        long j = this.f7646a;
        long j3 = this.f7647b;
        int i7 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j7 = this.f7648c;
        return i7 ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f7646a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f7647b);
        sb.append(", uptimeMillis=");
        return AbstractC0486a1.i(sb, this.f7648c, "}");
    }
}
