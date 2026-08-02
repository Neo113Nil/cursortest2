package A1;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder g(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder j() {
        return new PlaybackStateEvent.Builder();
    }
}
