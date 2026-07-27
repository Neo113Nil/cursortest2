package com.bytedance.sdk.component.kj.sf;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class qf extends ThreadPoolExecutor {
    private int gm;
    private int oo;
    private final String pcc;
    private int sf;
    private boolean vj;

    private qf(pcc pccVar) {
        super(pccVar.sf, Integer.MAX_VALUE, pccVar.vj, pccVar.qf, (BlockingQueue<Runnable>) pccVar.vy, pccVar.ork);
        this.vj = false;
        new Object[]{"create poolType = ", pccVar.pcc, " coreSize=", Integer.valueOf(pccVar.sf), " maxSize=", Integer.valueOf(pccVar.gm), " keepAlive=", Long.valueOf(pccVar.vj), " createSize=", Integer.valueOf(pccVar.oo), " isUseConfig=", Boolean.valueOf(pccVar.kj), "  workQueue", pccVar.vy};
        this.pcc = pccVar.pcc;
        this.sf = pccVar.sf;
        this.gm = pccVar.gm;
        this.oo = pccVar.oo;
        allowCoreThreadTimeOut(pccVar.wh);
        this.vj = pccVar.kj;
    }

    public void pcc(pcc pccVar) {
        try {
            if (pccVar.sf >= 0 && this.sf != pccVar.sf) {
                int i = pccVar.sf;
                this.sf = i;
                setCorePoolSize(i);
            }
            this.gm = pccVar.gm;
            this.oo = pccVar.oo;
            allowCoreThreadTimeOut(pccVar.wh);
            this.vj = pccVar.kj;
        } catch (Throwable th) {
            th.getMessage();
        }
        new Object[]{"update poolType = ", pccVar.pcc, " coreSize=", Integer.valueOf(pccVar.sf), " maxSize=", Integer.valueOf(pccVar.gm), " keepAlive=", Long.valueOf(pccVar.vj), " createSize=", Integer.valueOf(pccVar.oo), " isUseConfig=", Boolean.valueOf(pccVar.kj), "  workQueue", pccVar.vy};
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof gm) {
            ((gm) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof gm;
        if (z) {
            ((gm) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            gm gmVar = (gm) runnable;
            new Object[]{"submit  poolType = ", this.pcc, " taskName=", gmVar.getName(), "    ", "priority = ", Integer.valueOf(gmVar.getPriority()), " SubmitTimestamp=", Long.valueOf(gmVar.getSubmitTimestamp()), "  BeforeTimestamp=", Long.valueOf(gmVar.getBeforeTimestamp()), "  AfterTimestamp=", Long.valueOf(gmVar.getAfterTimestamp())};
        }
        oo();
    }

    private void gm() {
        int corePoolSize;
        try {
            if (this.sf != 0 && (corePoolSize = getCorePoolSize()) < this.gm) {
                int size = getQueue().size();
                if (getActiveCount() < this.sf || size < this.oo) {
                    return;
                }
                setCorePoolSize(this.gm);
                new Object[]{this.pcc, " increaseToMaxThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.gm)};
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void oo() {
        int corePoolSize;
        int size;
        try {
            if (this.sf != 0 && (corePoolSize = getCorePoolSize()) > this.sf && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.sf);
                new Object[]{this.pcc, " reduceToCoreThread  queueSize=", Integer.valueOf(size), "    ", Integer.valueOf(corePoolSize), " --> ", Integer.valueOf(this.sf)};
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int i;
        String str;
        runnable.getClass();
        final RunnableFuture newTaskFor = newTaskFor(runnable, null);
        if (!(runnable instanceof gm)) {
            i = 6;
            str = "";
        } else {
            gm gmVar = (gm) runnable;
            i = gmVar.getPriority();
            str = gmVar.getName();
        }
        if (i == 0 || TextUtils.isEmpty(str)) {
            new RuntimeException();
        }
        execute(new gm(str, i) { // from class: com.bytedance.sdk.component.kj.sf.qf.1
            @Override // java.lang.Runnable
            public void run() {
                newTaskFor.run();
            }
        });
        return newTaskFor;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.kj.sf.pcc pcc2;
        if (!(runnable instanceof gm)) {
            runnable = new gm("unknown", runnable) { // from class: com.bytedance.sdk.component.kj.sf.qf.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.pcc)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(vj.pcc(this.pcc)) && (pcc2 = oo.pcc()) != null) {
                pcc2.pcc(this, (gm) runnable);
            }
        }
        ((gm) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            gm();
        } catch (Throwable th) {
            pcc(runnable, th);
        }
    }

    private void pcc(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler sf = oo.sf();
                if (sf != null) {
                    sf.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if ("aidl".equals(this.pcc)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.pcc)) {
            return;
        }
        super.shutdown();
    }

    public int pcc() {
        return this.gm;
    }

    public boolean sf() {
        return this.vj;
    }

    public static class pcc {
        private String pcc = "cache";
        private int sf = 4;
        private int gm = 100;
        private int oo = 0;
        private long vj = 30000;
        private boolean wh = false;
        private TimeUnit qf = TimeUnit.MILLISECONDS;
        private boolean kj = false;
        private BlockingQueue<Runnable> vy = new PriorityBlockingQueue();
        private ThreadFactory ork = null;

        public pcc oo(int i) {
            return this;
        }

        public pcc vj(int i) {
            return this;
        }

        public pcc pcc(String str) {
            this.pcc = str;
            return this;
        }

        public pcc pcc(int i) {
            this.sf = i;
            return this;
        }

        public pcc sf(int i) {
            this.gm = i;
            return this;
        }

        public pcc gm(int i) {
            this.oo = i;
            return this;
        }

        public pcc pcc(long j) {
            this.vj = j;
            return this;
        }

        public pcc pcc(boolean z) {
            this.wh = z;
            return this;
        }

        public pcc pcc(BlockingQueue<Runnable> blockingQueue) {
            this.vy = blockingQueue;
            return this;
        }

        public pcc sf(boolean z) {
            this.kj = z;
            return this;
        }

        public qf pcc() {
            if (this.ork == null) {
                this.ork = new vj(this.pcc);
            }
            if (this.sf < 0) {
                this.sf = 8;
            }
            if (this.sf == 0) {
                this.vy = new SynchronousQueue();
            }
            if (this.vy == null) {
                this.vy = new LinkedBlockingQueue();
            }
            if (this.gm > 100) {
                this.gm = 100;
            }
            int i = this.gm;
            int i2 = this.sf;
            if (i < i2) {
                this.gm = i2;
            }
            return new qf(this);
        }
    }
}
