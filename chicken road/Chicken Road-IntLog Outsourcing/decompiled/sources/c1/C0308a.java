package c1;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0308a f4893f = new C0308a(10485760, 200, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f4894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4896c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4898e;

    public C0308a(long j2, int i2, int i3, long j6, int i6) {
        this.f4894a = j2;
        this.f4895b = i2;
        this.f4896c = i3;
        this.f4897d = j6;
        this.f4898e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0308a)) {
            return false;
        }
        C0308a c0308a = (C0308a) obj;
        return this.f4894a == c0308a.f4894a && this.f4895b == c0308a.f4895b && this.f4896c == c0308a.f4896c && this.f4897d == c0308a.f4897d && this.f4898e == c0308a.f4898e;
    }

    public final int hashCode() {
        long j2 = this.f4894a;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f4895b) * 1000003) ^ this.f4896c) * 1000003;
        long j6 = this.f4897d;
        return ((i2 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f4898e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f4894a + ", loadBatchSize=" + this.f4895b + ", criticalSectionEnterTimeoutMs=" + this.f4896c + ", eventCleanUpAge=" + this.f4897d + ", maxBlobByteSizePerRow=" + this.f4898e + "}";
    }
}
