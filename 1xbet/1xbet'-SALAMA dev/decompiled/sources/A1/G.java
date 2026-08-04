package A1;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static B1.p a(Context context, N n2, boolean z4) {
        MediaMetricsManager mediaMetricsManagerB = F.b(context.getSystemService("media_metrics"));
        B1.n nVar = mediaMetricsManagerB == null ? null : new B1.n(context, mediaMetricsManagerB.createPlaybackSession());
        if (nVar == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new B1.p(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z4) {
            n2.getClass();
            B1.h hVar = n2.f169q;
            hVar.getClass();
            hVar.f991f.a(nVar);
        }
        return new B1.p(nVar.f1020c.getSessionId());
    }
}
