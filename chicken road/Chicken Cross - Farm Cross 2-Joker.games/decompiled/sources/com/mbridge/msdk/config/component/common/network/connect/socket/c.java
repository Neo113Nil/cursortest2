package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SocketThreadPoolManager.java */
/* loaded from: classes6.dex */
public class c {
    private static volatile c d;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f8958a = new ConcurrentLinkedQueue<>();
    private ThreadPoolExecutor b;
    private final AtomicBoolean c;

    /* compiled from: SocketThreadPoolManager.java */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f8959a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f8959a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = new AtomicBoolean(false);
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    private boolean b() {
        try {
            int h = m0.h();
            if (h > 0) {
                int x = m0.x();
                return x > 0 && (((double) h) / ((double) x)) * 100.0d <= 5.0d;
            }
        } catch (Exception e) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (true) {
            try {
                if (this.f8958a.isEmpty()) {
                    break;
                }
                Runnable poll = this.f8958a.poll();
                if (poll != null) {
                    if ((poll instanceof b) && ((b) poll).e() != null) {
                        ((b) poll).e().callStart();
                    }
                    poll.run();
                }
            } finally {
                this.c.set(false);
                if (!this.f8958a.isEmpty()) {
                    d();
                }
            }
        }
    }

    private void d() {
        if (this.c.compareAndSet(false, true)) {
            this.b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.c();
                }
            });
        }
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f8958a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.b.getActiveCount(), this.b.getQueue().size());
    }
}
