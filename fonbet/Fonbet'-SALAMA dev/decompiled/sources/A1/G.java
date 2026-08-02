package A1;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class G {
    public static B1.p a(Context context, N n2, boolean z4) {
        PlaybackSession createPlaybackSession;
        B1.n nVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager b7 = F.b(context.getSystemService("media_metrics"));
        if (b7 == null) {
            nVar = null;
        } else {
            createPlaybackSession = b7.createPlaybackSession();
            nVar = new B1.n(context, createPlaybackSession);
        }
        if (nVar == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new B1.p(logSessionId);
        }
        if (z4) {
            n2.getClass();
            B1.h hVar = n2.f169q;
            hVar.getClass();
            hVar.f991f.a(nVar);
        }
        sessionId = nVar.f1020c.getSessionId();
        return new B1.p(sessionId);
    }
}
