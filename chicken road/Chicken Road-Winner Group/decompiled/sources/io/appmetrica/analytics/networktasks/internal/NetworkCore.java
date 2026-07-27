package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f8898a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8899b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8900c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f8901d;

    /* renamed from: e, reason: collision with root package name */
    private final g f8902e;
    private final IExecutionPolicy f;

    public NetworkCore(IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f8900c) {
                }
                this.f8901d = (d) this.f8898a.take();
                networkTask = this.f8901d.f8870a;
                Executor executor = networkTask.getExecutor();
                this.f8902e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f8900c) {
                    this.f8901d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f8900c) {
                        this.f8901d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f8900c) {
                        this.f8901d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f.canBeExecuted()) {
            synchronized (this.f8899b) {
                try {
                    d dVar = new d(networkTask);
                    if (isRunning() && !this.f8898a.contains(dVar) && !dVar.equals(this.f8901d) && networkTask.onTaskAdded()) {
                        this.f8898a.offer(dVar);
                    }
                } finally {
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f8900c) {
            try {
                ArrayList arrayList = new ArrayList(this.f8898a.size());
                this.f8898a.drainTo(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f8870a.onTaskRemoved();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f8898a = new LinkedBlockingQueue();
        this.f8899b = new Object();
        this.f8900c = new Object();
        this.f = iExecutionPolicy;
        this.f8902e = gVar;
    }
}
