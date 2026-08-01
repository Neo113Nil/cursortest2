package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public class m7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4293a;
    private Timer b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private final Runnable g;
    private long h;
    private final Object i = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                m7.this.g.run();
                synchronized (m7.this.i) {
                    if (m7.this.f) {
                        m7.this.c = System.currentTimeMillis();
                        m7 m7Var = m7.this;
                        m7Var.d = m7Var.e;
                    } else {
                        m7.this.b = null;
                    }
                }
            } catch (Throwable th) {
                try {
                    if (m7.this.f4293a != null) {
                        m7.this.f4293a.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            m7.this.f4293a.Q().a("Timer", "Encountered error while executing timed task", th);
                        }
                        m7.this.f4293a.E().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (m7.this.i) {
                        if (m7.this.f) {
                            m7.this.c = System.currentTimeMillis();
                            m7 m7Var2 = m7.this;
                            m7Var2.d = m7Var2.e;
                        } else {
                            m7.this.b = null;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (m7.this.i) {
                        if (m7.this.f) {
                            m7.this.c = System.currentTimeMillis();
                            m7 m7Var3 = m7.this;
                            m7Var3.d = m7Var3.e;
                        } else {
                            m7.this.b = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    private m7(com.applovin.impl.sdk.l lVar, Runnable runnable) {
        this.f4293a = lVar;
        this.g = runnable;
    }

    public long c() {
        if (this.b == null) {
            return this.d - this.h;
        }
        return this.d - (System.currentTimeMillis() - this.c);
    }

    public void d() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.h = Math.max(1L, System.currentTimeMillis() - this.c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f4293a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f4293a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f4293a.Q().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.i) {
            long j = this.h;
            if (j > 0) {
                try {
                    long j2 = this.d - j;
                    this.d = j2;
                    if (j2 < 0) {
                        this.d = 0L;
                    }
                    this.b = new Timer();
                    a(b(), this.d, this.f, this.e);
                    this.c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f4293a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f4293a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f4293a.Q().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.h = 0L;
                    } finally {
                        this.h = 0L;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static m7 a(long j, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j, false, lVar, runnable);
    }

    public static m7 a(long j, boolean z, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            m7 m7Var = new m7(lVar, runnable);
            m7Var.c = System.currentTimeMillis();
            m7Var.d = j;
            m7Var.f = z;
            m7Var.e = j;
            try {
                m7Var.b = new Timer();
                m7Var.a(m7Var.b(), j, z, m7Var.e);
            } catch (OutOfMemoryError e) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return m7Var;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.l lVar = this.f4293a;
                        if (lVar != null) {
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f4293a.Q();
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f4293a.Q().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.h = 0L;
                        throw th2;
                    }
                }
                this.h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.b.schedule(timerTask, j, j2);
        } else {
            this.b.schedule(timerTask, j);
        }
    }
}
