package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344ni extends BC {

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f14682m;

    /* renamed from: n, reason: collision with root package name */
    public final C2308a f14683n;

    /* renamed from: o, reason: collision with root package name */
    public long f14684o;

    /* renamed from: p, reason: collision with root package name */
    public long f14685p;

    /* renamed from: q, reason: collision with root package name */
    public long f14686q;

    /* renamed from: r, reason: collision with root package name */
    public long f14687r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14688s;

    /* renamed from: t, reason: collision with root package name */
    public ScheduledFuture f14689t;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledFuture f14690u;

    public C1344ni(ScheduledExecutorService scheduledExecutorService, C2308a c2308a) {
        super(Collections.EMPTY_SET);
        this.f14684o = -1L;
        this.f14685p = -1L;
        this.f14686q = -1L;
        this.f14687r = -1L;
        this.f14688s = false;
        this.f14682m = scheduledExecutorService;
        this.f14683n = c2308a;
    }

    public final synchronized void i() {
        this.f14688s = false;
        r1(0L);
    }

    public final synchronized void p1(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f14688s) {
                long j5 = this.f14686q;
                if (j5 <= 0 || millis >= j5) {
                    millis = j5;
                }
                this.f14686q = millis;
                return;
            }
            this.f14683n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = this.f14684o;
            if (elapsedRealtime > j6 || j6 - elapsedRealtime > millis) {
                r1(millis);
            }
        }
    }

    public final synchronized void q1(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f14688s) {
                long j5 = this.f14687r;
                if (j5 <= 0 || millis >= j5) {
                    millis = j5;
                }
                this.f14687r = millis;
                return;
            }
            this.f14683n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = this.f14685p;
            if (elapsedRealtime > j6 || j6 - elapsedRealtime > millis) {
                s1(millis);
            }
        }
    }

    public final synchronized void r1(long j5) {
        try {
            ScheduledFuture scheduledFuture = this.f14689t;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f14689t.cancel(false);
            }
            this.f14683n.getClass();
            this.f14684o = SystemClock.elapsedRealtime() + j5;
            this.f14689t = this.f14682m.schedule(new RunnableC1299mi(this, 0), j5, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void s1(long j5) {
        try {
            ScheduledFuture scheduledFuture = this.f14690u;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f14690u.cancel(false);
            }
            this.f14683n.getClass();
            this.f14685p = SystemClock.elapsedRealtime() + j5;
            this.f14690u = this.f14682m.schedule(new RunnableC1299mi(this, 1), j5, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
