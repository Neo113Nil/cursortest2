package Dc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6387a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6388b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f6389c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    static final ConcurrentHashMap f6390d = new ConcurrentHashMap();

    static final class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = new ArrayList(n.f6390d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    n.f6390d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[LOOP:0: B:11:0x003f->B:19:0x0070, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[ORIG_RETURN, RETURN] */
    static {
        int i11;
        ScheduledExecutorService newScheduledThreadPool;
        Properties properties = System.getProperties();
        boolean parseBoolean = properties.containsKey("rx2.purge-enabled") ? Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled")) : true;
        if (parseBoolean && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                i11 = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
            }
            f6387a = parseBoolean;
            f6388b = i11;
            if (parseBoolean) {
                return;
            }
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f6389c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService != null) {
                    return;
                }
                newScheduledThreadPool = Executors.newScheduledThreadPool(1, new i("RxSchedulerPurge"));
                while (!atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    if (atomicReference.get() != scheduledExecutorService) {
                        break;
                    }
                }
                a aVar = new a();
                long j11 = f6388b;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, j11, j11, TimeUnit.SECONDS);
                return;
                newScheduledThreadPool.shutdownNow();
            }
        }
        i11 = 1;
        f6387a = parseBoolean;
        f6388b = i11;
        if (parseBoolean) {
        }
    }
}
