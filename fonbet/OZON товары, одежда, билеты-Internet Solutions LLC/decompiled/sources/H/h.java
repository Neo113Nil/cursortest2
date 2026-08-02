package H;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes8.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f10349a;

    private h() {
    }

    static ScheduledExecutorService a() {
        if (f10349a != null) {
            return f10349a;
        }
        synchronized (h.class) {
            try {
                if (f10349a == null) {
                    f10349a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10349a;
    }
}
