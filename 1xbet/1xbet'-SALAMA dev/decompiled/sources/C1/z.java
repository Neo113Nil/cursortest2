package C1;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static void a(AudioTrack audioTrack, B1.p pVar) {
        B1.o oVar = pVar.f1045a;
        oVar.getClass();
        LogSessionId logSessionId = oVar.f1044a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
