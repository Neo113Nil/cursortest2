package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500r3 extends Thread {

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f15258q = F3.f8650a;

    /* renamed from: k, reason: collision with root package name */
    public final PriorityBlockingQueue f15259k;

    /* renamed from: l, reason: collision with root package name */
    public final PriorityBlockingQueue f15260l;

    /* renamed from: m, reason: collision with root package name */
    public final K3 f15261m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f15262n = false;

    /* renamed from: o, reason: collision with root package name */
    public final m2.g f15263o;

    /* renamed from: p, reason: collision with root package name */
    public final U4 f15264p;

    public C1500r3(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, K3 k32, U4 u42) {
        this.f15259k = priorityBlockingQueue;
        this.f15260l = priorityBlockingQueue2;
        this.f15261m = k32;
        this.f15264p = u42;
        this.f15263o = new m2.g(this, priorityBlockingQueue2, u42);
    }

    public final void a() {
        A3 a32 = (A3) this.f15259k.take();
        a32.d("cache-queue-take");
        a32.i();
        try {
            a32.l();
            C1456q3 a5 = this.f15261m.a(a32.b());
            if (a5 == null) {
                a32.d("cache-miss");
                if (!this.f15263o.y(a32)) {
                    this.f15260l.put(a32);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (a5.f15091e < currentTimeMillis) {
                    a32.d("cache-hit-expired");
                    a32.f7528t = a5;
                    if (!this.f15263o.y(a32)) {
                        this.f15260l.put(a32);
                    }
                } else {
                    a32.d("cache-hit");
                    byte[] bArr = a5.f15087a;
                    Map map = a5.f15092g;
                    P.W a6 = a32.a(new C1815y3(200, bArr, map, C1815y3.a(map), false));
                    a32.d("cache-hit-parsed");
                    if (!(((C3) a6.f4414n) == null)) {
                        a32.d("cache-parsing-failed");
                        K3 k32 = this.f15261m;
                        String b3 = a32.b();
                        synchronized (k32) {
                            try {
                                C1456q3 a7 = k32.a(b3);
                                if (a7 != null) {
                                    a7.f = 0L;
                                    a7.f15091e = 0L;
                                    k32.c(b3, a7);
                                }
                            } finally {
                            }
                        }
                        a32.f7528t = null;
                        if (!this.f15263o.y(a32)) {
                            this.f15260l.put(a32);
                        }
                    } else if (a5.f < currentTimeMillis) {
                        a32.d("cache-hit-refresh-needed");
                        a32.f7528t = a5;
                        a6.f4411k = true;
                        if (this.f15263o.y(a32)) {
                            this.f15264p.j(a32, a6, null);
                        } else {
                            this.f15264p.j(a32, a6, new Kw(3, this, a32, false));
                        }
                    } else {
                        this.f15264p.j(a32, a6, null);
                    }
                }
            }
            a32.i();
        } catch (Throwable th) {
            a32.i();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f15258q) {
            F3.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f15261m.b();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f15262n) {
                    Thread.currentThread().interrupt();
                    return;
                }
                F3.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
