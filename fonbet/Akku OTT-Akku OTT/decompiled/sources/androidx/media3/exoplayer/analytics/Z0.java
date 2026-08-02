package androidx.media3.exoplayer.analytics;

import android.media.metrics.PlaybackStateEvent;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.greedy.TimeLimiter;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class Z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaMetricsListener) this.b).lambda$maybeReportPlaybackStateChange$2((PlaybackStateEvent) this.c);
                break;
            case 1:
                ((OfflineLicenseHelper) this.b).lambda$releaseManagerOnHandlerThread$4((com.google.common.util.concurrent.x) this.c);
                break;
            case 2:
                ((DownloadHelper) this.b).lambda$prepare$1((DownloadHelper.Callback) this.c);
                break;
            case 3:
                TimeLimiter.track$lambda$0((TimeLimiter) this.b, (StartStopToken) this.c);
                break;
            case 4:
                ((com.google.common.util.concurrent.i) this.b).a((com.google.common.collect.E) this.c);
                break;
            default:
                ((FlutterFirebaseCrashlyticsPlugin) this.b).lambda$recordError$4((String) this.c);
                break;
        }
    }
}
