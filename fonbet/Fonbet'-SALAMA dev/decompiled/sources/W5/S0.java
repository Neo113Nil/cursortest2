package W5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class S0 extends WeakReference {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f7019f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g, reason: collision with root package name */
    public static final RuntimeException f7020g;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7023c;

    /* renamed from: d, reason: collision with root package name */
    public final SoftReference f7024d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7025e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f7020g = runtimeException;
    }

    public S0(T0 t02, Q0 q02, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
        super(t02, referenceQueue);
        this.f7025e = new AtomicBoolean();
        this.f7024d = new SoftReference(f7019f ? new RuntimeException("ManagedChannel allocation site") : f7020g);
        this.f7023c = q02.toString();
        this.f7021a = referenceQueue;
        this.f7022b = concurrentHashMap;
        concurrentHashMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            S0 s02 = (S0) referenceQueue.poll();
            if (s02 == null) {
                return;
            }
            SoftReference softReference = s02.f7024d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            s02.f7022b.remove(s02);
            softReference.clear();
            if (!s02.f7025e.get()) {
                Level level = Level.SEVERE;
                Logger logger = T0.f7055h;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{s02.f7023c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f7022b.remove(this);
        this.f7024d.clear();
        a(this.f7021a);
    }
}
