package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001:B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\u001e\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0006*\u00020'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!R\u0014\u0010,\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010-\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00109\u001a\f\u0012\b\u0012\u0006*\u00020606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpServiceImpl;", "Lcom/lyft/kronos/internal/ntp/SntpService;", "Lcom/lyft/kronos/internal/ntp/SntpClient;", "sntpClient", "Lcom/lyft/kronos/Clock;", "deviceClock", "Lcom/lyft/kronos/internal/ntp/SntpResponseCache;", "responseCache", "Lcom/lyft/kronos/SyncListener;", "ntpSyncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "<init>", "(Lcom/lyft/kronos/internal/ntp/SntpClient;Lcom/lyft/kronos/Clock;Lcom/lyft/kronos/internal/ntp/SntpResponseCache;Lcom/lyft/kronos/SyncListener;Ljava/util/List;JJJJ)V", "Lcom/lyft/kronos/KronosTime;", "currentTime", "()Lcom/lyft/kronos/KronosTime;", "", "shutdown", "()V", "", "sync", "()Z", "p0", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Z", "syncInBackground", "J", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/lyft/kronos/Clock;", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "getOutputFormats", "getHighSpeedVideoSizesFor", "Ljava/util/List;", "getInputFormats", "getOutputMinFrameDuration", "Lcom/lyft/kronos/SyncListener;", "Lcom/lyft/kronos/internal/ntp/SntpResponseCache;", "getOutputStallDurationlomOqCM", "Lcom/lyft/kronos/internal/ntp/SntpClient;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/lyft/kronos/internal/ntp/SntpServiceImpl$State;", "getOutputMinFrameDurationlomOqCM", "Ljava/util/concurrent/atomic/AtomicReference;", "getOutputSizeshNQ4ISI", "State"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class SntpServiceImpl implements com.lyft.kronos.internal.ntp.SntpService {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;
    private final com.lyft.kronos.Clock getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.lyft.kronos.internal.ntp.SntpResponseCache getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizesFor;
    private final com.lyft.kronos.SyncListener getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.lyft.kronos.internal.ntp.SntpServiceImpl.State> getOutputSizeshNQ4ISI;
    private final com.lyft.kronos.internal.ntp.SntpClient getOutputStallDurationlomOqCM;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpServiceImpl$State;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 4, 0})
    enum State {
        IDLE,
        SYNCING,
        STOPPED
    }

    public SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2, long j3, long j4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sntpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sntpResponseCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getOutputStallDurationlomOqCM = sntpClient;
        this.getHighResolutionOutputSizeshNQ4ISI = clock;
        this.getInputSizeshNQ4ISI = sntpResponseCache;
        this.getOutputMinFrameDuration = syncListener;
        this.getInputFormats = list;
        this.getHighSpeedVideoSizesFor = j;
        this.getOutputFormats = j2;
        this.Camera2StreamConfigurationMap = j3;
        this.getHighSpeedVideoFpsRangesFor = j4;
        this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(com.lyft.kronos.internal.ntp.SntpServiceImpl.State.IDLE);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoFpsRanges = java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.lyft.kronos.internal.ntp.SntpServiceImpl$executor$1
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "kronos-android");
            }
        });
    }

    @Override // com.lyft.kronos.internal.ntp.SntpService
    public final long currentTimeMs() {
        return com.lyft.kronos.internal.ntp.SntpService.DefaultImpls.currentTimeMs(this);
    }

    public /* synthetic */ SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List list, long j, long j2, long j3, long j4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sntpClient, clock, sntpResponseCache, syncListener, list, (i & 32) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getTIMEOUT_MS() : j, (i & 64) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMIN_WAIT_TIME_BETWEEN_SYNC_MS() : j2, (i & 128) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getCACHE_EXPIRATION_MS() : j3, (i & 256) != 0 ? com.lyft.kronos.DefaultParam.INSTANCE.getMAX_NTP_RESPONSE_TIME_MS() : j4);
    }

    private final boolean getHighSpeedVideoSizes(java.lang.String p0) {
        if (this.getOutputSizeshNQ4ISI.getAndSet(com.lyft.kronos.internal.ntp.SntpServiceImpl.State.SYNCING) == com.lyft.kronos.internal.ntp.SntpServiceImpl.State.SYNCING) {
            return false;
        }
        long elapsedTimeMs = this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs();
        com.lyft.kronos.SyncListener syncListener = this.getOutputMinFrameDuration;
        if (syncListener != null) {
            syncListener.onStartSync(p0);
        }
        try {
            com.lyft.kronos.internal.ntp.SntpClient.Response requestTime = this.getOutputStallDurationlomOqCM.requestTime(p0, java.lang.Long.valueOf(this.getHighSpeedVideoSizesFor));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestTime, "");
            if (requestTime.getCurrentTimeMs() < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid time ");
                sb.append(requestTime.getCurrentTimeMs());
                sb.append(" received from ");
                sb.append(p0);
                throw new com.lyft.kronos.internal.ntp.NTPSyncException(sb.toString());
            }
            long elapsedTimeMs2 = this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs() - elapsedTimeMs;
            if (elapsedTimeMs2 > this.getHighSpeedVideoFpsRangesFor) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ignoring response from ");
                sb2.append(p0);
                sb2.append(" because the network latency (");
                sb2.append(elapsedTimeMs2);
                sb2.append(" ms) is longer than the required value (");
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                sb2.append(" ms");
                throw new com.lyft.kronos.internal.ntp.NTPSyncException(sb2.toString());
            }
            this.getInputSizeshNQ4ISI.update(requestTime);
            long offsetMs = requestTime.getOffsetMs();
            com.lyft.kronos.SyncListener syncListener2 = this.getOutputMinFrameDuration;
            if (syncListener2 != null) {
                syncListener2.onSuccess(offsetMs, elapsedTimeMs2);
            }
            this.getOutputSizeshNQ4ISI.set(com.lyft.kronos.internal.ntp.SntpServiceImpl.State.IDLE);
            this.getHighSpeedVideoSizes.set(this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs());
            return true;
        } catch (java.lang.Throwable th) {
            try {
                com.lyft.kronos.SyncListener syncListener3 = this.getOutputMinFrameDuration;
                if (syncListener3 != null) {
                    syncListener3.onError(p0, th);
                }
                return false;
            } finally {
                this.getOutputSizeshNQ4ISI.set(com.lyft.kronos.internal.ntp.SntpServiceImpl.State.IDLE);
                this.getHighSpeedVideoSizes.set(this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs());
            }
        }
    }

    @Override // com.lyft.kronos.internal.ntp.SntpService
    public final com.lyft.kronos.KronosTime currentTime() {
        if (this.getOutputSizeshNQ4ISI.get() == com.lyft.kronos.internal.ntp.SntpServiceImpl.State.STOPPED) {
            throw new java.lang.IllegalStateException("Service already shutdown");
        }
        com.lyft.kronos.internal.ntp.SntpClient.Response response = this.getInputSizeshNQ4ISI.get();
        if (this.getOutputSizeshNQ4ISI.get() == com.lyft.kronos.internal.ntp.SntpServiceImpl.State.IDLE && response != null) {
            if (java.lang.Math.abs((response.getHighSpeedVideoFpsRanges - response.getHighSpeedVideoFpsRangesFor) - (response.getHighResolutionOutputSizeshNQ4ISI.getCurrentTimeMs() - response.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs())) >= 1000) {
                this.getInputSizeshNQ4ISI.clear();
                response = null;
            }
        }
        if (response == null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs() - this.getHighSpeedVideoSizes.get() >= this.getOutputFormats) {
                syncInBackground();
            }
            return null;
        }
        long responseAge = response.getResponseAge();
        if (responseAge >= this.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI.getElapsedTimeMs() - this.getHighSpeedVideoSizes.get() >= this.getOutputFormats) {
            syncInBackground();
        }
        return new com.lyft.kronos.KronosTime(response.getCurrentTimeMs(), java.lang.Long.valueOf(responseAge));
    }

    @Override // com.lyft.kronos.internal.ntp.SntpService
    public final void shutdown() {
        if (this.getOutputSizeshNQ4ISI.get() != com.lyft.kronos.internal.ntp.SntpServiceImpl.State.STOPPED) {
            this.getOutputSizeshNQ4ISI.set(com.lyft.kronos.internal.ntp.SntpServiceImpl.State.STOPPED);
            this.getHighSpeedVideoFpsRanges.shutdown();
            return;
        }
        throw new java.lang.IllegalStateException("Service already shutdown");
    }

    @Override // com.lyft.kronos.internal.ntp.SntpService
    public final boolean sync() {
        if (this.getOutputSizeshNQ4ISI.get() != com.lyft.kronos.internal.ntp.SntpServiceImpl.State.STOPPED) {
            java.util.Iterator<java.lang.String> it = this.getInputFormats.iterator();
            while (it.hasNext()) {
                if (getHighSpeedVideoSizes(it.next())) {
                    return true;
                }
            }
            return false;
        }
        throw new java.lang.IllegalStateException("Service already shutdown");
    }

    @Override // com.lyft.kronos.internal.ntp.SntpService
    public final void syncInBackground() {
        if (this.getOutputSizeshNQ4ISI.get() != com.lyft.kronos.internal.ntp.SntpServiceImpl.State.STOPPED) {
            if (this.getOutputSizeshNQ4ISI.get() != com.lyft.kronos.internal.ntp.SntpServiceImpl.State.SYNCING) {
                this.getHighSpeedVideoFpsRanges.submit(new java.lang.Runnable() { // from class: com.lyft.kronos.internal.ntp.SntpServiceImpl$syncInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.lyft.kronos.internal.ntp.SntpServiceImpl.this.sync();
                    }
                });
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Service already shutdown");
    }

    public SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2, long j3) {
        this(sntpClient, clock, sntpResponseCache, syncListener, list, j, j2, j3, 0L, 256, null);
    }

    public SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j, long j2) {
        this(sntpClient, clock, sntpResponseCache, syncListener, list, j, j2, 0L, 0L, 384, null);
    }

    public SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list, long j) {
        this(sntpClient, clock, sntpResponseCache, syncListener, list, j, 0L, 0L, 0L, 448, null);
    }

    public SntpServiceImpl(com.lyft.kronos.internal.ntp.SntpClient sntpClient, com.lyft.kronos.Clock clock, com.lyft.kronos.internal.ntp.SntpResponseCache sntpResponseCache, com.lyft.kronos.SyncListener syncListener, java.util.List<java.lang.String> list) {
        this(sntpClient, clock, sntpResponseCache, syncListener, list, 0L, 0L, 0L, 0L, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
    }
}
