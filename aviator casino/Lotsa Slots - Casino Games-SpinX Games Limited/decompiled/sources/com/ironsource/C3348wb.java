package com.ironsource;

/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3348wb implements com.ironsource.InterfaceC3097ia {
    private java.util.Timer b;
    private long e;
    private java.lang.Runnable f;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6803a = "INTERNAL";
    private boolean c = false;
    private java.lang.Long d = null;

    /* renamed from: com.ironsource.wb$a */
    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.C3348wb.this.f.run();
        }
    }

    public C3348wb(long j, java.lang.Runnable runnable, boolean z) {
        this.e = j;
        this.f = runnable;
        if (z) {
            g();
        }
    }

    private synchronized void f() {
        java.util.Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    private synchronized void h() {
        if (this.b == null) {
            java.util.Timer timer = new java.util.Timer();
            this.b = timer;
            timer.schedule(new com.ironsource.C3348wb.a(), this.e);
            java.util.Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void a() {
        if (this.b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void b() {
        java.lang.Long l;
        if (this.b == null && (l = this.d) != null) {
            long longValue = l.longValue() - java.lang.System.currentTimeMillis();
            this.e = longValue;
            if (longValue > 0) {
                h();
            } else {
                e();
                this.f.run();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3097ia
    public void d() {
    }

    public void e() {
        f();
        this.c = false;
        this.d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.d = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + this.e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }
}
