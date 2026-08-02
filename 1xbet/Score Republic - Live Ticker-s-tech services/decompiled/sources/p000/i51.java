package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i51 {

    /* JADX INFO: renamed from: a */
    public static final boolean f3438a;

    /* JADX INFO: renamed from: b */
    public static final int f3439b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f3440c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f3441d = new ConcurrentHashMap();

    static {
        boolean zEquals;
        int i;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        f3438a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        f3439b = i;
        if (!f3438a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f3440c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new b41("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    RunnableC0393ke runnableC0393ke = new RunnableC0393ke(4);
                    long j = f3439b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC0393ke, j, j, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
