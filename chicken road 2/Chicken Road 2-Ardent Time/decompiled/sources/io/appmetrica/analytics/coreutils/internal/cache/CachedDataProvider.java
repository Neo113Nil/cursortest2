package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f3732a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f3733b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f3734c;

        /* renamed from: d, reason: collision with root package name */
        private long f3735d = 0;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Object f3736e = null;

        public CachedData(long j2, long j3, java.lang.String str) {
            this.f3732a = "[CachedData-" + str + "]";
            this.f3733b = j2;
            this.f3734c = j3;
        }

        public T getData() {
            return (T) this.f3736e;
        }

        public long getExpiryTime() {
            return this.f3734c;
        }

        public long getRefreshTime() {
            return this.f3733b;
        }

        public final boolean isEmpty() {
            return this.f3736e == null;
        }

        public void setData(T t) {
            this.f3736e = t;
            this.f3735d = java.lang.System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j2, long j3) {
            this.f3733b = j2;
            this.f3734c = j3;
        }

        public final boolean shouldClearData() {
            if (this.f3735d == 0) {
                return false;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f3735d;
            return currentTimeMillis > this.f3734c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f3735d;
            return currentTimeMillis > this.f3733b || currentTimeMillis < 0;
        }

        public java.lang.String toString() {
            return "CachedData{tag='" + this.f3732a + "', refreshTime=" + this.f3733b + ", expiryTime=" + this.f3734c + ", mCachedTime=" + this.f3735d + ", mCachedData=" + this.f3736e + '}';
        }
    }
}
