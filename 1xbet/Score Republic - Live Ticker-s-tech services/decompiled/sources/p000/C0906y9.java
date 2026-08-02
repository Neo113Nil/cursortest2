package p000;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906y9 {

    /* JADX INFO: renamed from: f */
    public static final C0906y9 f9221f = new C0906y9(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a */
    public final long f9222a;

    /* JADX INFO: renamed from: b */
    public final int f9223b;

    /* JADX INFO: renamed from: c */
    public final int f9224c;

    /* JADX INFO: renamed from: d */
    public final long f9225d;

    /* JADX INFO: renamed from: e */
    public final int f9226e;

    public C0906y9(long j, int i, int i2, long j2, int i3) {
        this.f9222a = j;
        this.f9223b = i;
        this.f9224c = i2;
        this.f9225d = j2;
        this.f9226e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0906y9) {
            C0906y9 c0906y9 = (C0906y9) obj;
            if (this.f9222a == c0906y9.f9222a && this.f9223b == c0906y9.f9223b && this.f9224c == c0906y9.f9224c && this.f9225d == c0906y9.f9225d && this.f9226e == c0906y9.f9226e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9222a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9223b) * 1000003) ^ this.f9224c) * 1000003;
        long j2 = this.f9225d;
        return this.f9226e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f9222a + ", loadBatchSize=" + this.f9223b + ", criticalSectionEnterTimeoutMs=" + this.f9224c + ", eventCleanUpAge=" + this.f9225d + ", maxBlobByteSizePerRow=" + this.f9226e + "}";
    }
}
