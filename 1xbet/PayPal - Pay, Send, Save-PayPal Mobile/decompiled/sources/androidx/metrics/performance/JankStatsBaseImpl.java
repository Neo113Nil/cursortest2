package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl;", "", "Landroidx/metrics/performance/JankStats;", "jankStats", "<init>", "(Landroidx/metrics/performance/JankStats;)V", "", "enable", "", "setupFrameTimer", "(Z)V", "Landroidx/metrics/performance/JankStats;", "getJankStats", "()Landroidx/metrics/performance/JankStats;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class JankStatsBaseImpl {
    public static final int NANOS_PER_MS = 1000000;
    private final androidx.metrics.performance.JankStats jankStats;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.metrics.performance.JankStatsBaseImpl.Companion INSTANCE = new androidx.metrics.performance.JankStatsBaseImpl.Companion(null);
    private static long frameDuration = -1;

    public void setupFrameTimer(boolean enable) {
    }

    public JankStatsBaseImpl(androidx.metrics.performance.JankStats jankStats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStats, "");
        this.jankStats = jankStats;
    }

    public final androidx.metrics.performance.JankStats getJankStats() {
        return this.jankStats;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Landroidx/metrics/performance/JankStatsBaseImpl$Companion;", "", "<init>", "()V", "", "NANOS_PER_MS", com.visa.cbp.getEncExpo.warmup, "", "frameDuration", "J", "getFrameDuration", "()J", "setFrameDuration", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getFrameDuration() {
            return androidx.metrics.performance.JankStatsBaseImpl.frameDuration;
        }

        public final void setFrameDuration(long j) {
            androidx.metrics.performance.JankStatsBaseImpl.frameDuration = j;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
