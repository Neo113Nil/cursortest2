package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1836yg implements S5 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f16447a;

    /* renamed from: b, reason: collision with root package name */
    public final C2308a f16448b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f16449c;

    /* renamed from: d, reason: collision with root package name */
    public long f16450d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f16451e = -1;
    public RunnableC0994fq f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16452g = false;

    public C1836yg(ScheduledExecutorService scheduledExecutorService, C2308a c2308a) {
        this.f16447a = scheduledExecutorService;
        this.f16448b = c2308a;
        P2.o.f4767B.f.i(this);
    }

    @Override // com.google.android.gms.internal.ads.S5
    public final void A(boolean z3) {
        ScheduledFuture scheduledFuture;
        if (!z3) {
            a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f16452g) {
                    if (this.f16451e > 0 && (scheduledFuture = this.f16449c) != null && scheduledFuture.isCancelled()) {
                        this.f16449c = this.f16447a.schedule(this.f, this.f16451e, TimeUnit.MILLISECONDS);
                    }
                    this.f16452g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void a() {
        try {
            if (this.f16452g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16449c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f16451e = -1L;
            } else {
                this.f16449c.cancel(true);
                long j5 = this.f16450d;
                this.f16448b.getClass();
                this.f16451e = j5 - SystemClock.elapsedRealtime();
            }
            this.f16452g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(int i, RunnableC0994fq runnableC0994fq) {
        this.f = runnableC0994fq;
        this.f16448b.getClass();
        long j5 = i;
        this.f16450d = SystemClock.elapsedRealtime() + j5;
        this.f16449c = this.f16447a.schedule(runnableC0994fq, j5, TimeUnit.MILLISECONDS);
    }
}
