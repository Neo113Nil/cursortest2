package R1;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class n {
    public static void a(i iVar, B1.p pVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        B1.o oVar = pVar.f1045a;
        oVar.getClass();
        LogSessionId logSessionId2 = oVar.f1044a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (equals) {
            return;
        }
        MediaFormat mediaFormat = iVar.f5920b;
        stringId = logSessionId2.getStringId();
        mediaFormat.setString("log-session-id", stringId);
    }
}
