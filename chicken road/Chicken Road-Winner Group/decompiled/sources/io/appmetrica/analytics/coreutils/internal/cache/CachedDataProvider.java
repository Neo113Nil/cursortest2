package io.appmetrica.analytics.coreutils.internal.cache;

import B0.c;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f5415a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f5416b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f5417c;

        /* renamed from: d, reason: collision with root package name */
        private long f5418d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f5419e = null;

        public CachedData(long j3, long j4, String str) {
            this.f5415a = c.k("[CachedData-", str, "]");
            this.f5416b = j3;
            this.f5417c = j4;
        }

        public T getData() {
            return (T) this.f5419e;
        }

        public long getExpiryTime() {
            return this.f5417c;
        }

        public long getRefreshTime() {
            return this.f5416b;
        }

        public final boolean isEmpty() {
            return this.f5419e == null;
        }

        public void setData(T t3) {
            this.f5419e = t3;
            this.f5418d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j3, long j4) {
            this.f5416b = j3;
            this.f5417c = j4;
        }

        public final boolean shouldClearData() {
            if (this.f5418d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f5418d;
            return currentTimeMillis > this.f5417c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f5418d;
            return currentTimeMillis > this.f5416b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f5415a + "', refreshTime=" + this.f5416b + ", expiryTime=" + this.f5417c + ", mCachedTime=" + this.f5418d + ", mCachedData=" + this.f5419e + '}';
        }
    }
}
