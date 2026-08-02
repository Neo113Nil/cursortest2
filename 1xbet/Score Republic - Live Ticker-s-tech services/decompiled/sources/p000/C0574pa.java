package p000;

/* JADX INFO: renamed from: pa */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574pa {

    /* JADX INFO: renamed from: a */
    public final long f6037a;

    /* JADX INFO: renamed from: b */
    public final long f6038b;

    /* JADX INFO: renamed from: c */
    public final long f6039c;

    public C0574pa(long j, long j2, long j3) {
        this.f6037a = j;
        this.f6038b = j2;
        this.f6039c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0574pa) {
            C0574pa c0574pa = (C0574pa) obj;
            if (this.f6037a == c0574pa.f6037a && this.f6038b == c0574pa.f6038b && this.f6039c == c0574pa.f6039c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f6037a;
        long j2 = this.f6038b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f6039c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f6037a + ", elapsedRealtime=" + this.f6038b + ", uptimeMillis=" + this.f6039c + "}";
    }
}
