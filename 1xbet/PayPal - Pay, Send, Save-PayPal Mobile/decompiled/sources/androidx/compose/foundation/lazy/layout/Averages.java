package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\bR\"\u0010\u001d\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\bR\"\u0010#\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\bR\"\u0010&\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\bR\"\u0010)\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Averages;", "", "<init>", "()V", "", "timeNanos", "", "saveCompositionTimeNanos", "(J)V", "saveResumeTimeNanos", "savePauseTimeNanos", "saveApplyTimeNanos", "saveMeasureTimeNanos", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "saveNestedPrefetchCount", "(I)V", "p0", "p1", "getHighSpeedVideoFpsRanges", "(JJ)J", "getHighResolutionOutputSizeshNQ4ISI", "(II)I", "clearMeasureTime", "compositionTimeNanos", "J", "getCompositionTimeNanos", "()J", "setCompositionTimeNanos", "resumeTimeNanos", "getResumeTimeNanos", "setResumeTimeNanos", "pauseTimeNanos", "getPauseTimeNanos", "setPauseTimeNanos", "applyTimeNanos", "getApplyTimeNanos", "setApplyTimeNanos", "measureTimeNanos", "getMeasureTimeNanos", "setMeasureTimeNanos", "nestedPrefetchCount", com.visa.cbp.getEncExpo.warmup, "getNestedPrefetchCount", "()I", "setNestedPrefetchCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Averages {
    public static final int $stable = 8;
    private long applyTimeNanos;
    private long compositionTimeNanos;
    private long measureTimeNanos;
    private int nestedPrefetchCount = -1;
    private long pauseTimeNanos;
    private long resumeTimeNanos;

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final void setCompositionTimeNanos(long j) {
        this.compositionTimeNanos = j;
    }

    public final long getResumeTimeNanos() {
        return this.resumeTimeNanos;
    }

    public final void setResumeTimeNanos(long j) {
        this.resumeTimeNanos = j;
    }

    public final long getPauseTimeNanos() {
        return this.pauseTimeNanos;
    }

    public final void setPauseTimeNanos(long j) {
        this.pauseTimeNanos = j;
    }

    public final long getApplyTimeNanos() {
        return this.applyTimeNanos;
    }

    public final void setApplyTimeNanos(long j) {
        this.applyTimeNanos = j;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final void setMeasureTimeNanos(long j) {
        this.measureTimeNanos = j;
    }

    public final int getNestedPrefetchCount() {
        return this.nestedPrefetchCount;
    }

    public final void setNestedPrefetchCount(int i) {
        this.nestedPrefetchCount = i;
    }

    public final void saveCompositionTimeNanos(long timeNanos) {
        this.compositionTimeNanos = getHighSpeedVideoFpsRanges(timeNanos, this.compositionTimeNanos);
    }

    public final void saveResumeTimeNanos(long timeNanos) {
        this.resumeTimeNanos = getHighSpeedVideoFpsRanges(timeNanos, this.resumeTimeNanos);
    }

    public final void savePauseTimeNanos(long timeNanos) {
        this.pauseTimeNanos = getHighSpeedVideoFpsRanges(timeNanos, this.pauseTimeNanos);
    }

    public final void saveApplyTimeNanos(long timeNanos) {
        this.applyTimeNanos = getHighSpeedVideoFpsRanges(timeNanos, this.applyTimeNanos);
    }

    public final void saveMeasureTimeNanos(long timeNanos) {
        this.measureTimeNanos = getHighSpeedVideoFpsRanges(timeNanos, this.measureTimeNanos);
    }

    public final void saveNestedPrefetchCount(int count) {
        this.nestedPrefetchCount = getHighResolutionOutputSizeshNQ4ISI(count, this.nestedPrefetchCount);
    }

    private static long getHighSpeedVideoFpsRanges(long p0, long p1) {
        return p1 == 0 ? p0 : ((p1 / 4) * 3) + (p0 / 4);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        return p1 == -1 ? p0 : ((p1 * 3) + p0) / 4;
    }

    public final void clearMeasureTime() {
        this.measureTimeNanos = 0L;
    }
}
