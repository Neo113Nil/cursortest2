package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/lyft/kronos/DefaultParam;", "", "<init>", "()V", "", "CACHE_EXPIRATION_MS", "J", "getCACHE_EXPIRATION_MS", "()J", "MAX_NTP_RESPONSE_TIME_MS", "getMAX_NTP_RESPONSE_TIME_MS", "MIN_WAIT_TIME_BETWEEN_SYNC_MS", "getMIN_WAIT_TIME_BETWEEN_SYNC_MS", "", "", "NTP_HOSTS", "Ljava/util/List;", "getNTP_HOSTS", "()Ljava/util/List;", "TIMEOUT_MS", "getTIMEOUT_MS"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class DefaultParam {
    public static final com.lyft.kronos.DefaultParam INSTANCE = new com.lyft.kronos.DefaultParam();
    private static final java.util.List<java.lang.String> NTP_HOSTS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org"});
    private static final long CACHE_EXPIRATION_MS = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);
    private static final long MIN_WAIT_TIME_BETWEEN_SYNC_MS = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);
    private static final long TIMEOUT_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(6);
    private static final long MAX_NTP_RESPONSE_TIME_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);

    private DefaultParam() {
    }

    public final java.util.List<java.lang.String> getNTP_HOSTS() {
        return NTP_HOSTS;
    }

    public final long getCACHE_EXPIRATION_MS() {
        return CACHE_EXPIRATION_MS;
    }

    public final long getMIN_WAIT_TIME_BETWEEN_SYNC_MS() {
        return MIN_WAIT_TIME_BETWEEN_SYNC_MS;
    }

    public final long getTIMEOUT_MS() {
        return TIMEOUT_MS;
    }

    public final long getMAX_NTP_RESPONSE_TIME_MS() {
        return MAX_NTP_RESPONSE_TIME_MS;
    }
}
