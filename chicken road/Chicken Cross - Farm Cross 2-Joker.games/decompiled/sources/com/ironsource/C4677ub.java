package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4677ub {
    private static final String g = "ub";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f8702a;
    private final Runnable b;
    private final C4450hg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC4462ia f = new a();

    /* renamed from: com.ironsource.ub$a */
    class a implements InterfaceC4462ia {
        a() {
        }

        @Override // com.ironsource.InterfaceC4462ia
        public void a() {
            C4677ub.this.c.c(System.currentTimeMillis());
            C4677ub.this.c();
        }

        @Override // com.ironsource.InterfaceC4462ia
        public void b() {
            C4677ub.this.c.b(System.currentTimeMillis());
            C4677ub c4677ub = C4677ub.this;
            c4677ub.b(c4677ub.c.a());
        }

        @Override // com.ironsource.InterfaceC4462ia
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4462ia
        public void d() {
        }
    }

    /* renamed from: com.ironsource.ub$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4677ub c4677ub = C4677ub.this;
            c4677ub.f8702a.b(c4677ub.f);
            C4677ub.this.c.b();
            C4677ub.this.b.run();
        }
    }

    public C4677ub(Runnable runnable, com.ironsource.lifecycle.b bVar, C4450hg c4450hg) {
        this.b = runnable;
        this.f8702a = bVar;
        this.c = c4450hg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f8702a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.f8702a.a(this.f);
        this.c.a(j);
        if (this.f8702a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }
}
