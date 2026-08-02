package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/RecordingTimeBank;", "Lcom/datadog/android/sessionreplay/internal/recorder/TimeBank;", "", "maxTimeBalancePerSecondInMs", "<init>", "(J)V", "executionTime", "", "consume", "timestamp", "", "updateAndCheck", "(J)Z", "", "getHighResolutionOutputSizeshNQ4ISI", "D", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "J", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecordingTimeBank implements com.datadog.android.sessionreplay.internal.recorder.TimeBank {
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final double getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile long getHighResolutionOutputSizeshNQ4ISI;

    public RecordingTimeBank(long j) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = j / java.util.concurrent.TimeUnit.SECONDS.toMillis(1L);
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
    }

    public /* synthetic */ RecordingTimeBank(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 100L : j);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.TimeBank
    public final void consume(long executionTime) {
        this.getHighResolutionOutputSizeshNQ4ISI -= executionTime;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.TimeBank
    public final boolean updateAndCheck(long timestamp) {
        this.getHighResolutionOutputSizeshNQ4ISI += (long) ((timestamp - this.getHighSpeedVideoSizes) * this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.min(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.Camera2StreamConfigurationMap), this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes = timestamp;
        return this.getHighResolutionOutputSizeshNQ4ISI >= 0;
    }

    public RecordingTimeBank() {
        this(0L, 1, null);
    }
}
