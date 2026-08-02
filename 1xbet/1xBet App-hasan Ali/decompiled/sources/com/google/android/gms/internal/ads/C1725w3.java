package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725w3 extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final PriorityBlockingQueue f16090k;

    /* renamed from: l, reason: collision with root package name */
    public final C1390oj f16091l;

    /* renamed from: m, reason: collision with root package name */
    public final K3 f16092m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f16093n = false;

    /* renamed from: o, reason: collision with root package name */
    public final U4 f16094o;

    public C1725w3(PriorityBlockingQueue priorityBlockingQueue, C1390oj c1390oj, K3 k32, U4 u42) {
        this.f16090k = priorityBlockingQueue;
        this.f16091l = c1390oj;
        this.f16092m = k32;
        this.f16094o = u42;
    }

    public final void a() {
        int i = 1;
        U4 u42 = this.f16094o;
        A3 a32 = (A3) this.f16090k.take();
        SystemClock.elapsedRealtime();
        a32.i();
        Object obj = null;
        try {
            try {
                a32.d("network-queue-take");
                a32.l();
                TrafficStats.setThreadStatsTag(a32.f7522n);
                C1815y3 d5 = this.f16091l.d(a32);
                a32.d("network-http-complete");
                if (d5.f16390e && a32.k()) {
                    a32.f("not-modified");
                    a32.g();
                } else {
                    P.W a5 = a32.a(d5);
                    a32.d("network-parse-complete");
                    if (((C1456q3) a5.f4413m) != null) {
                        this.f16092m.c(a32.b(), (C1456q3) a5.f4413m);
                        a32.d("network-cache-written");
                    }
                    synchronized (a32.f7523o) {
                        a32.f7527s = true;
                    }
                    u42.j(a32, a5, null);
                    a32.h(a5);
                }
            } catch (C3 e3) {
                SystemClock.elapsedRealtime();
                u42.getClass();
                a32.d("post-error");
                ((ExecutorC1590t3) u42.f11722l).f15631l.post(new RunnableC1362o(a32, new P.W(e3), obj, i));
                a32.g();
            } catch (Exception e5) {
                Log.e("Volley", F3.d("Unhandled exception %s", e5.toString()), e5);
                C3 c32 = new C3(e5);
                SystemClock.elapsedRealtime();
                u42.getClass();
                a32.d("post-error");
                ((ExecutorC1590t3) u42.f11722l).f15631l.post(new RunnableC1362o(a32, new P.W(c32), obj, i));
                a32.g();
            }
            a32.i();
        } catch (Throwable th) {
            a32.i();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f16093n) {
                    Thread.currentThread().interrupt();
                    return;
                }
                F3.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
