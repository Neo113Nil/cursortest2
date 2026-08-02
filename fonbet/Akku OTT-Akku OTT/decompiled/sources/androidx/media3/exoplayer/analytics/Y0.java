package androidx.media3.exoplayer.analytics;

import android.media.metrics.PlaybackMetrics;
import androidx.media3.exoplayer.offline.DownloadHelper;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Y0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaMetricsListener) this.b).lambda$finishCurrentSession$4((PlaybackMetrics) this.c);
                break;
            default:
                ((DownloadHelper) this.b).lambda$onMediaPreparationFailed$3((IOException) this.c);
                break;
        }
    }
}
