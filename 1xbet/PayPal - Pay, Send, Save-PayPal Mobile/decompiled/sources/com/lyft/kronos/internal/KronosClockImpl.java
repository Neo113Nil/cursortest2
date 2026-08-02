package com.lyft.kronos.internal;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/lyft/kronos/internal/KronosClockImpl;", "Lcom/lyft/kronos/KronosClock;", "Lcom/lyft/kronos/internal/ntp/SntpService;", "ntpService", "Lcom/lyft/kronos/Clock;", "fallbackClock", "<init>", "(Lcom/lyft/kronos/internal/ntp/SntpService;Lcom/lyft/kronos/Clock;)V", "", "getCurrentNtpTimeMs", "()Ljava/lang/Long;", "Lcom/lyft/kronos/KronosTime;", "getCurrentTime", "()Lcom/lyft/kronos/KronosTime;", "getElapsedTimeMs", "()J", "", "shutdown", "()V", "", "sync", "()Z", "syncInBackground", "getHighSpeedVideoSizes", "Lcom/lyft/kronos/Clock;", "Camera2StreamConfigurationMap", "Lcom/lyft/kronos/internal/ntp/SntpService;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class KronosClockImpl implements com.lyft.kronos.KronosClock {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.lyft.kronos.internal.ntp.SntpService getHighResolutionOutputSizeshNQ4ISI;
    private final com.lyft.kronos.Clock getHighSpeedVideoSizes;

    public KronosClockImpl(com.lyft.kronos.internal.ntp.SntpService sntpService, com.lyft.kronos.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sntpService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sntpService;
        this.getHighSpeedVideoSizes = clock;
    }

    @Override // com.lyft.kronos.KronosClock, com.lyft.kronos.Clock
    public final long getCurrentTimeMs() {
        return com.lyft.kronos.KronosClock.DefaultImpls.getCurrentTimeMs(this);
    }

    @Override // com.lyft.kronos.KronosClock
    public final boolean sync() {
        return this.getHighResolutionOutputSizeshNQ4ISI.sync();
    }

    @Override // com.lyft.kronos.KronosClock
    public final void syncInBackground() {
        this.getHighResolutionOutputSizeshNQ4ISI.syncInBackground();
    }

    @Override // com.lyft.kronos.KronosClock
    public final void shutdown() {
        this.getHighResolutionOutputSizeshNQ4ISI.shutdown();
    }

    @Override // com.lyft.kronos.Clock
    public final long getElapsedTimeMs() {
        return this.getHighSpeedVideoSizes.getElapsedTimeMs();
    }

    @Override // com.lyft.kronos.KronosClock
    public final com.lyft.kronos.KronosTime getCurrentTime() {
        com.lyft.kronos.KronosTime currentTime = this.getHighResolutionOutputSizeshNQ4ISI.currentTime();
        return currentTime != null ? currentTime : new com.lyft.kronos.KronosTime(this.getHighSpeedVideoSizes.getCurrentTimeMs(), null);
    }

    @Override // com.lyft.kronos.KronosClock
    public final java.lang.Long getCurrentNtpTimeMs() {
        com.lyft.kronos.KronosTime currentTime = this.getHighResolutionOutputSizeshNQ4ISI.currentTime();
        if (currentTime != null) {
            return java.lang.Long.valueOf(currentTime.getPosixTimeMs());
        }
        return null;
    }
}
