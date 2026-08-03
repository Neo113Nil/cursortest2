package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class NetworkCore extends io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.LinkedBlockingQueue f7399a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Object f7400b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.Object f7401c;

    /* renamed from: d, reason: collision with root package name */
    private volatile io.appmetrica.analytics.networktasks.impl.d f7402d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.impl.g f7403e;

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy f7404f;

    public NetworkCore(io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new io.appmetrica.analytics.networktasks.impl.g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f7401c) {
                }
                this.f7402d = (io.appmetrica.analytics.networktasks.impl.d) this.f7399a.take();
                networkTask = this.f7402d.f7370a;
                java.util.concurrent.Executor executor = networkTask.getExecutor();
                this.f7403e.getClass();
                executor.execute(new io.appmetrica.analytics.networktasks.impl.h(networkTask, this, new io.appmetrica.analytics.networktasks.impl.f()));
                networkTask.onTaskFinished();
                synchronized (this.f7401c) {
                    this.f7402d = null;
                }
            } catch (java.lang.InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f7401c) {
                        this.f7402d = null;
                    }
                } else {
                    continue;
                }
            } catch (java.lang.Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f7401c) {
                        this.f7402d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask) {
        if (this.f7404f.canBeExecuted()) {
            synchronized (this.f7400b) {
                try {
                    io.appmetrica.analytics.networktasks.impl.d dVar = new io.appmetrica.analytics.networktasks.impl.d(networkTask);
                    if (isRunning() && !this.f7399a.contains(dVar) && !dVar.equals(this.f7402d) && networkTask.onTaskAdded()) {
                        this.f7399a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f7401c) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f7399a.size());
                this.f7399a.drainTo(arrayList);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((io.appmetrica.analytics.networktasks.impl.d) it.next()).f7370a.onTaskRemoved();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy, io.appmetrica.analytics.networktasks.impl.g gVar) {
        this.f7399a = new java.util.concurrent.LinkedBlockingQueue();
        this.f7400b = new java.lang.Object();
        this.f7401c = new java.lang.Object();
        this.f7404f = iExecutionPolicy;
        this.f7403e = gVar;
    }
}
