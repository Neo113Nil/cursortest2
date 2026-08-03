package com.ironsource;

/* loaded from: classes5.dex */
public class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.O0 f5928a;
    private final com.ironsource.Eb b;
    private final com.ironsource.C3330vb c = c();
    private java.util.Timer d;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.Q0.this.b.b();
        }
    }

    class b extends java.util.TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.Q0.this.b.b();
        }
    }

    public Q0(com.ironsource.O0 o0, com.ironsource.Eb eb) {
        this.f5928a = o0;
        this.b = eb;
    }

    private synchronized void b(long j) {
        j();
        java.util.Timer timer = new java.util.Timer();
        this.d = timer;
        timer.schedule(new com.ironsource.Q0.b(), j);
    }

    private com.ironsource.C3330vb c() {
        return new com.ironsource.C3330vb(new com.ironsource.Q0.a(), com.ironsource.lifecycle.b.d(), new com.ironsource.C3031eg());
    }

    private synchronized void j() {
        java.util.Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.f5928a.a() == com.ironsource.O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected boolean d() {
        return this.f5928a.c() > 0;
    }

    public void e() {
        if (this.f5928a.e()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(this.f5928a.c());
        }
    }

    public void f() {
        if (this.f5928a.a() == com.ironsource.O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(this.f5928a.d());
        }
    }

    public void g() {
        if (this.f5928a.e()) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f5928a.a() != com.ironsource.O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f5928a.d() < 0) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        b(this.f5928a.d());
    }

    protected void i() {
        com.ironsource.C3330vb c3330vb = this.c;
        if (c3330vb != null) {
            c3330vb.b();
        }
    }

    public void k() {
        if (this.f5928a.a() != com.ironsource.O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f5928a.b() <= 0) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        a(this.f5928a.b());
    }

    protected com.ironsource.O0 b() {
        return this.f5928a;
    }

    protected void a(long j) {
        com.ironsource.C3330vb c3330vb = this.c;
        if (c3330vb != null) {
            c3330vb.a(j);
        }
    }
}
