package sg.bigo.ads.i1;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import sg.bigo.ads.q0.ThreadFactoryC5440d;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f12995a = Executors.newFixedThreadPool(1, new ThreadFactoryC5440d("Callback-Worker", false));
    public static final Handler b;

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
    }

    public static void a(b bVar) {
        if (bVar != null) {
            bVar.b.set(true);
            Future future = bVar.c;
            if (future != null && future != null && !future.isCancelled() && !future.isDone()) {
                future.cancel(true);
            }
            b.removeCallbacks(bVar);
        }
    }

    public static Future a(Runnable runnable) {
        return f12995a.submit(new a(runnable));
    }
}
