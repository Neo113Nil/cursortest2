package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final long f5034j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentLinkedQueue f5035k;

    /* JADX INFO: renamed from: l */
    public final C0584pk f5036l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f5037m;

    /* JADX INFO: renamed from: n */
    public final ScheduledFuture f5038n;

    /* JADX INFO: renamed from: o */
    public final ThreadFactory f5039o;

    public mf0(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        mf0 mf0Var;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.f5034j = nanos;
        this.f5035k = new ConcurrentLinkedQueue();
        this.f5036l = new C0584pk(0);
        this.f5039o = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, pf0.f6127c);
            mf0Var = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(mf0Var, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            mf0Var = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        mf0Var.f5037m = scheduledExecutorServiceNewScheduledThreadPool;
        mf0Var.f5038n = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<of0> concurrentLinkedQueue = this.f5035k;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (of0 of0Var : concurrentLinkedQueue) {
            if (of0Var.f5716l > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(of0Var)) {
                this.f5036l.m3950d(of0Var);
            }
        }
    }
}
