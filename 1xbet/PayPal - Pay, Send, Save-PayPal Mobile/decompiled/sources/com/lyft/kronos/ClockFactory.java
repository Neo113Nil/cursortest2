package com.lyft.kronos;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/lyft/kronos/ClockFactory;", "", "<init>", "()V", "Lcom/lyft/kronos/Clock;", "localClock", "Lcom/lyft/kronos/SyncResponseCache;", "syncResponseCache", "Lcom/lyft/kronos/SyncListener;", "syncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lcom/lyft/kronos/KronosClock;", "createKronosClock", "(Lcom/lyft/kronos/Clock;Lcom/lyft/kronos/SyncResponseCache;Lcom/lyft/kronos/SyncListener;Ljava/util/List;JJJJ)Lcom/lyft/kronos/KronosClock;"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class ClockFactory {
    public static final com.lyft.kronos.ClockFactory INSTANCE = new com.lyft.kronos.ClockFactory();

    private ClockFactory() {
    }

    public static /* synthetic */ com.lyft.kronos.KronosClock createKronosClock$default(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List list, long j, long j2, long j3, long j4, int i, java.lang.Object obj) {
        return createKronosClock(clock, syncResponseCache, (i & 4) != 0 ? null : syncListener, (i & 8) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getNTP_HOSTS() : list, (i & 16) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getTIMEOUT_MS() : j, (i & 32) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMIN_WAIT_TIME_BETWEEN_SYNC_MS() : j2, (i & 64) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getCACHE_EXPIRATION_MS() : j3, (i & 128) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMAX_NTP_RESPONSE_TIME_MS() : j4);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock localClock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> ntpHosts, long requestTimeoutMs, long minWaitTimeBetweenSyncMs, long cacheExpirationMs, long maxNtpResponseTimeMs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localClock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResponseCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ntpHosts, "");
        if (localClock instanceof com.lyft.kronos.KronosClock) {
            throw new java.lang.IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
        }
        return new com.lyft.kronos.internal.KronosClockImpl(new com.lyft.kronos.internal.ntp.SntpServiceImpl(new com.lyft.kronos.internal.ntp.SntpClient(localClock, new com.lyft.kronos.internal.ntp.DnsResolverImpl(), new com.lyft.kronos.internal.ntp.DatagramFactoryImpl()), localClock, new com.lyft.kronos.internal.ntp.SntpResponseCacheImpl(syncResponseCache, localClock), syncListener, ntpHosts, requestTimeoutMs, minWaitTimeBetweenSyncMs, cacheExpirationMs, maxNtpResponseTimeMs), localClock);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2, long j3) {
        return createKronosClock$default(clock, syncResponseCache, syncListener, list, j, j2, j3, 0L, 128, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2) {
        return createKronosClock$default(clock, syncResponseCache, syncListener, list, j, j2, 0L, 0L, 192, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j) {
        return createKronosClock$default(clock, syncResponseCache, syncListener, list, j, 0L, 0L, 0L, 224, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list) {
        return createKronosClock$default(clock, syncResponseCache, syncListener, list, 0L, 0L, 0L, 0L, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.SyncListener syncListener) {
        return createKronosClock$default(clock, syncResponseCache, syncListener, null, 0L, 0L, 0L, 0L, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.lyft.kronos.KronosClock createKronosClock(com.lyft.kronos.Clock clock, com.lyft.kronos.SyncResponseCache syncResponseCache) {
        return createKronosClock$default(clock, syncResponseCache, null, null, 0L, 0L, 0L, 0L, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }
}
