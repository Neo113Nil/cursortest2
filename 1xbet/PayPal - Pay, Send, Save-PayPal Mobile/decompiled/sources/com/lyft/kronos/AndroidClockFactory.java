package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J[\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/lyft/kronos/AndroidClockFactory;", "", "<init>", "()V", "Lcom/lyft/kronos/Clock;", "createDeviceClock", "()Lcom/lyft/kronos/Clock;", "Landroid/content/Context;", "context", "Lcom/lyft/kronos/SyncListener;", "syncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lcom/lyft/kronos/KronosClock;", "createKronosClock", "(Landroid/content/Context;Lcom/lyft/kronos/SyncListener;Ljava/util/List;JJJJ)Lcom/lyft/kronos/KronosClock;"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class AndroidClockFactory {
    public static final com.lyft.kronos.AndroidClockFactory INSTANCE = new com.lyft.kronos.AndroidClockFactory();

    private AndroidClockFactory() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.Clock createDeviceClock() {
        return new com.lyft.kronos.internal.AndroidSystemClock();
    }

    public static /* synthetic */ com.lyft.kronos.KronosClock createKronosClock$default(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List list, long j, long j2, long j3, long j4, int i, java.lang.Object obj) {
        return createKronosClock(context, (i & 2) != 0 ? null : syncListener, (i & 4) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getNTP_HOSTS() : list, (i & 8) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getTIMEOUT_MS() : j, (i & 16) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMIN_WAIT_TIME_BETWEEN_SYNC_MS() : j2, (i & 32) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getCACHE_EXPIRATION_MS() : j3, (i & 64) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMAX_NTP_RESPONSE_TIME_MS() : j4);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> ntpHosts, long requestTimeoutMs, long minWaitTimeBetweenSyncMs, long cacheExpirationMs, long maxNtpResponseTimeMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ntpHosts, "");
        com.lyft.kronos.Clock createDeviceClock = createDeviceClock();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.lyft.kronos.internal.SharedPreferenceSyncResponseCache.SHARED_PREFERENCES_NAME, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return com.lyft.kronos.ClockFactory.createKronosClock(createDeviceClock, new com.lyft.kronos.internal.SharedPreferenceSyncResponseCache(sharedPreferences), syncListener, ntpHosts, requestTimeoutMs, minWaitTimeBetweenSyncMs, cacheExpirationMs, maxNtpResponseTimeMs);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2, long j3) {
        return createKronosClock$default(context, syncListener, list, j, j2, j3, 0L, 64, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2) {
        return createKronosClock$default(context, syncListener, list, j, j2, 0L, 0L, 96, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j) {
        return createKronosClock$default(context, syncListener, list, j, 0L, 0L, 0L, 112, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list) {
        return createKronosClock$default(context, syncListener, list, 0L, 0L, 0L, 0L, 120, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context, com.lyft.kronos.SyncListener syncListener) {
        return createKronosClock$default(context, syncListener, null, 0L, 0L, 0L, 0L, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(android.content.Context context) {
        return createKronosClock$default(context, null, null, 0L, 0L, 0L, 0L, 126, null);
    }
}
