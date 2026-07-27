package com.ironsource;

import com.ironsource.M0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes6.dex */
public class O0 {

    /* renamed from: a, reason: collision with root package name */
    private final M0 f7819a;
    private final Db b;
    private final C4677ub c = c();
    private Timer d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    public O0(M0 m0, Db db) {
        this.f7819a = m0;
        this.b = db;
    }

    private synchronized void b(long j) {
        j();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    private C4677ub c() {
        return new C4677ub(new a(), com.ironsource.lifecycle.b.d(), new C4450hg());
    }

    private synchronized void j() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.f7819a.a() == M0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    protected boolean d() {
        return this.f7819a.c() > 0;
    }

    public void e() {
        if (this.f7819a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f7819a.c());
        }
    }

    public void f() {
        if (this.f7819a.a() == M0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f7819a.d());
        }
    }

    public void g() {
        if (this.f7819a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f7819a.a() != M0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f7819a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f7819a.d());
    }

    protected void i() {
        C4677ub c4677ub = this.c;
        if (c4677ub != null) {
            c4677ub.b();
        }
    }

    public void k() {
        if (this.f7819a.a() != M0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f7819a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f7819a.b());
    }

    protected M0 b() {
        return this.f7819a;
    }

    protected void a(long j) {
        C4677ub c4677ub = this.c;
        if (c4677ub != null) {
            c4677ub.a(j);
        }
    }
}
