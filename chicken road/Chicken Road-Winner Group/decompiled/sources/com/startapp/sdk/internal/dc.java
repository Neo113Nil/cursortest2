package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dc {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f3582g = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3583a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3584b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f3585c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f3586d;

    /* renamed from: e, reason: collision with root package name */
    public long f3587e;
    public int f;

    public dc(Looper looper) {
        this.f3583a = new Handler(looper, new bc(this));
        this.f3584b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z3;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j3 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f3586d = false;
                    this.f3583a.sendEmptyMessage(0);
                    wait(2000L);
                    z3 = this.f3586d;
                }
                long elapsedRealtime = j3 + SystemClock.elapsedRealtime();
                int i3 = this.f;
                if (i3 < 8) {
                    this.f = i3 + 1;
                    this.f3587e += elapsedRealtime;
                } else {
                    long j4 = this.f3587e;
                    this.f3587e = (elapsedRealtime - (j4 / i3)) + j4;
                }
                if (!z3) {
                    this.f3587e = 0L;
                    this.f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f3587e < 160) {
                        this.f3584b.post(runnable);
                        this.f3587e = 0L;
                        this.f = 0;
                        return;
                    }
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
    }
}
