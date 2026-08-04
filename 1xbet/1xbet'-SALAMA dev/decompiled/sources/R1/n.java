package R1;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(i iVar, B1.p pVar) {
        B1.o oVar = pVar.f1045a;
        oVar.getClass();
        LogSessionId logSessionId = oVar.f1044a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        iVar.f5920b.setString("log-session-id", logSessionId.getStringId());
    }
}
