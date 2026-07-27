package H0;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* loaded from: classes.dex */
public final class a {
    public static final a f = new a(10485760, 200, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f487c;

    /* renamed from: d, reason: collision with root package name */
    public final long f488d;

    /* renamed from: e, reason: collision with root package name */
    public final int f489e;

    public a(long j3, int i3, int i4, long j4, int i5) {
        this.f485a = j3;
        this.f486b = i3;
        this.f487c = i4;
        this.f488d = j4;
        this.f489e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f485a == aVar.f485a && this.f486b == aVar.f486b && this.f487c == aVar.f487c && this.f488d == aVar.f488d && this.f489e == aVar.f489e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f485a;
        int i3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f486b) * 1000003) ^ this.f487c) * 1000003;
        long j4 = this.f488d;
        return ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f489e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f485a + ", loadBatchSize=" + this.f486b + ", criticalSectionEnterTimeoutMs=" + this.f487c + ", eventCleanUpAge=" + this.f488d + ", maxBlobByteSizePerRow=" + this.f489e + "}";
    }
}
