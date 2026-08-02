package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTracker;", "", "Lcom/paypal/oslo/downloads/impl/engine/Clock;", "clock", "<init>", "(Lcom/paypal/oslo/downloads/impl/engine/Clock;)V", "", "reset", "()V", "", "downloadedBytes", "totalBytes", "Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "trackProgress", "(JJ)Lcom/paypal/oslo/downloads/api/model/DownloadProgress;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/impl/engine/Clock;", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadProgressTracker {
    private static final com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker.Companion Companion = new com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker.Companion(null);

    @java.lang.Deprecated
    public static final long MILLIS_PER_SECOND = 1000;

    @java.lang.Deprecated
    public static final long PROGRESS_THROTTLE_MS = 500;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.engine.Clock getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighResolutionOutputSizeshNQ4ISI;

    public DownloadProgressTracker(com.paypal.oslo.downloads.impl.engine.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        this.getHighSpeedVideoSizes = clock;
    }

    public /* synthetic */ DownloadProgressTracker(com.paypal.oslo.downloads.impl.engine.SystemClock systemClock, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.downloads.impl.engine.SystemClock.INSTANCE : systemClock);
    }

    public final void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
        this.getHighSpeedVideoFpsRangesFor = 0L;
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.currentTimeMillis();
    }

    public final com.paypal.oslo.downloads.api.model.DownloadProgress trackProgress(long downloadedBytes, long totalBytes) {
        long currentTimeMillis = this.getHighSpeedVideoSizes.currentTimeMillis();
        if (currentTimeMillis - this.getHighResolutionOutputSizeshNQ4ISI < 500) {
            return null;
        }
        long j = (currentTimeMillis - this.Camera2StreamConfigurationMap) / 1000;
        long j2 = j > 0 ? downloadedBytes / j : 0L;
        long j3 = (totalBytes <= 0 || j2 <= 0) ? -1L : ((totalBytes - downloadedBytes) / j2) * 1000;
        this.getHighResolutionOutputSizeshNQ4ISI = currentTimeMillis;
        this.getHighSpeedVideoFpsRangesFor = downloadedBytes;
        return new com.paypal.oslo.downloads.api.model.DownloadProgress(downloadedBytes, totalBytes, j2, j3);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTracker$Companion;", "", "<init>", "()V", "", "PROGRESS_THROTTLE_MS", "J", "MILLIS_PER_SECOND"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadProgressTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
