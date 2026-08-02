package com.lyft.kronos.internal.ntp;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/lyft/kronos/internal/ntp/SntpResponseCacheImpl;", "Lcom/lyft/kronos/internal/ntp/SntpResponseCache;", "Lcom/lyft/kronos/SyncResponseCache;", "syncResponseCache", "Lcom/lyft/kronos/Clock;", "deviceClock", "<init>", "(Lcom/lyft/kronos/SyncResponseCache;Lcom/lyft/kronos/Clock;)V", "", "clear", "()V", "Lcom/lyft/kronos/internal/ntp/SntpClient$Response;", "get", "()Lcom/lyft/kronos/internal/ntp/SntpClient$Response;", "response", "update", "(Lcom/lyft/kronos/internal/ntp/SntpClient$Response;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/lyft/kronos/Clock;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/lyft/kronos/SyncResponseCache;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class SntpResponseCacheImpl implements com.lyft.kronos.internal.ntp.SntpResponseCache {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.lyft.kronos.Clock getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.lyft.kronos.SyncResponseCache Camera2StreamConfigurationMap;

    public SntpResponseCacheImpl(com.lyft.kronos.SyncResponseCache syncResponseCache, com.lyft.kronos.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncResponseCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        this.Camera2StreamConfigurationMap = syncResponseCache;
        this.getHighSpeedVideoFpsRangesFor = clock;
    }

    @Override // com.lyft.kronos.internal.ntp.SntpResponseCache
    public final com.lyft.kronos.internal.ntp.SntpClient.Response get() {
        long currentTime = this.Camera2StreamConfigurationMap.getCurrentTime();
        long elapsedTime = this.Camera2StreamConfigurationMap.getElapsedTime();
        long currentOffset = this.Camera2StreamConfigurationMap.getCurrentOffset();
        if (elapsedTime == 0) {
            return null;
        }
        return new com.lyft.kronos.internal.ntp.SntpClient.Response(currentTime, elapsedTime, currentOffset, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.lyft.kronos.internal.ntp.SntpResponseCache
    public final void update(com.lyft.kronos.internal.ntp.SntpClient.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        synchronized (this) {
            this.Camera2StreamConfigurationMap.setCurrentTime(response.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap.setElapsedTime(response.getHighSpeedVideoFpsRangesFor);
            this.Camera2StreamConfigurationMap.setCurrentOffset(response.getOffsetMs());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.lyft.kronos.internal.ntp.SntpResponseCache
    public final void clear() {
        synchronized (this) {
            this.Camera2StreamConfigurationMap.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
