package sg.bigo.ads.h0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.q0.ThreadFactoryC5440d;

/* loaded from: classes3.dex */
public final class c extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public static c f12951a;

    public c(TimeUnit timeUnit, LinkedBlockingQueue linkedBlockingQueue, ThreadFactoryC5440d threadFactoryC5440d, ThreadPoolExecutor.AbortPolicy abortPolicy) {
        super(5, 8, 3000L, timeUnit, linkedBlockingQueue, threadFactoryC5440d, abortPolicy);
    }

    public static synchronized void a(boolean z) {
        synchronized (c.class) {
            f12951a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5440d("Download", z), new ThreadPoolExecutor.AbortPolicy());
        }
    }
}
