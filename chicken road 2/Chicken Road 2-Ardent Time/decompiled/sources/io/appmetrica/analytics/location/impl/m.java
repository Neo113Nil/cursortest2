package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class m extends io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7232d = 200;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7233e = 50;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.l f7235a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7230b = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7231c = java.util.concurrent.TimeUnit.MINUTES.toMillis(2);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List<java.lang.String> f7234f = java.util.Arrays.asList("gps", "network");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m() {
        this(r1, r2, 2 * r2);
        io.appmetrica.analytics.location.impl.l lVar = new io.appmetrica.analytics.location.impl.l(f7231c);
        long j2 = f7230b;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(android.location.Location location) {
        return f7234f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (android.location.Location) this.mCachedData.getData(), this.f7235a.f7229a, 200L));
    }

    public m(io.appmetrica.analytics.location.impl.l lVar, long j2, long j3) {
        super(j2, j3, "location");
        this.f7235a = lVar;
    }

    public static boolean a(android.location.Location location, android.location.Location location2, long j2, long j3) {
        boolean equals;
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > j2;
        boolean z3 = time < (-j2);
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (z3) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0;
        boolean z6 = accuracy < 0;
        boolean z7 = ((long) accuracy) > j3;
        java.lang.String provider = location.getProvider();
        java.lang.String provider2 = location2.getProvider();
        if (provider == null) {
            equals = provider2 == null;
        } else {
            equals = provider.equals(provider2);
        }
        if (z6) {
            return true;
        }
        if (!z4 || z5) {
            return z4 && !z7 && equals;
        }
        return true;
    }
}
