package C1;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class z {
    public static void a(AudioTrack audioTrack, B1.p pVar) {
        LogSessionId logSessionId;
        boolean equals;
        B1.o oVar = pVar.f1045a;
        oVar.getClass();
        LogSessionId logSessionId2 = oVar.f1044a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId2);
    }
}
