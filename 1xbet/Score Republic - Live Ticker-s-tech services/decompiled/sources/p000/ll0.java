package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ll0 extends WeakReference {

    /* JADX INFO: renamed from: f */
    public static final boolean f4829f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g */
    public static final RuntimeException f4830g;

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f4831a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f4832b;

    /* JADX INFO: renamed from: c */
    public final String f4833c;

    /* JADX INFO: renamed from: d */
    public final SoftReference f4834d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f4835e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f4830g = runtimeException;
    }

    public ll0(ml0 ml0Var, jl0 jl0Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(ml0Var, referenceQueue);
        this.f4835e = new AtomicBoolean();
        this.f4834d = new SoftReference(f4829f ? new RuntimeException("ManagedChannel allocation site") : f4830g);
        this.f4833c = jl0Var.toString();
        this.f4831a = referenceQueue;
        this.f4832b = concurrentMap;
        concurrentMap.put(this, this);
        m3229a(referenceQueue);
    }

    /* JADX INFO: renamed from: a */
    public static void m3229a(ReferenceQueue referenceQueue) {
        while (true) {
            ll0 ll0Var = (ll0) referenceQueue.poll();
            if (ll0Var == null) {
                return;
            }
            SoftReference softReference = ll0Var.f4834d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            ll0Var.f4832b.remove(ll0Var);
            softReference.clear();
            if (!ll0Var.f4835e.get()) {
                Level level = Level.SEVERE;
                Logger logger = ml0.f5079d;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{ll0Var.f4833c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f4832b.remove(this);
        this.f4834d.clear();
        m3229a(this.f4831a);
    }
}
